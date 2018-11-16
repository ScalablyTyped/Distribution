package typings
package jqueryDotUniformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uniform extends js.Object {
  var defaults: UniformOptions = js.native
  var elements: js.Array[JQuery] = js.native
  def apply(): JQuery = js.native
  def apply(options: UniformOptions): JQuery = js.native
  def restore(): scala.Unit = js.native
  def restore(elemOrSelector: js.Any): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(elemOrSelector: js.Any): scala.Unit = js.native
}

