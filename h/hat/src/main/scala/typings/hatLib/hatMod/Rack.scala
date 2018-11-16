package typings
package hatLib.hatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rack extends js.Object {
  var base: scala.Double = js.native
  var bits: scala.Double = js.native
  var hats: HatsList = js.native
  def apply(data: js.Any): java.lang.String = js.native
  def get(id: java.lang.String): js.Any = js.native
  def set(id: java.lang.String, value: js.Any): Rack = js.native
}

