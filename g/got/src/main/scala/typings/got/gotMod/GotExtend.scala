package typings.got.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotExtend extends js.Object {
  def apply(options: GotBodyOptions[Null | String]): GotInstance[GotBodyFn[String]] = js.native
  def apply(options: GotFormOptions[Null | String]): GotInstance[GotFormFn[String]] = js.native
  def apply(options: GotJSONOptions): GotInstance[GotJSONFn] = js.native
}

