package typings
package jsenLib.jsenMod.JsenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsenValidator extends js.Object {
  var errors: js.Array[JsenValidateError] = js.native
  def apply(): scala.Boolean = js.native
  def apply(data: js.Any): scala.Boolean = js.native
  def build(): js.Any = js.native
  def build(initial: js.Any): js.Any = js.native
  def build(initial: js.Any, options: JsenBuildSettings): js.Any = js.native
}

