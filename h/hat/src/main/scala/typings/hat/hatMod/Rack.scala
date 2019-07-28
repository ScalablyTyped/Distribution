package typings.hat.hatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rack extends js.Object {
  var base: Double = js.native
  var bits: Double = js.native
  var hats: HatsList = js.native
  def apply(data: js.Any): String = js.native
  def get(id: String): js.Any = js.native
  def set(id: String, value: js.Any): Rack = js.native
}

