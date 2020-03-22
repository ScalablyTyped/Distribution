package typings.got.mod

import typings.got.GotInstanceGotBodyFnstrin
import typings.got.GotInstanceGotFormFnstrin
import typings.got.GotInstanceGotJSONFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotExtend extends js.Object {
  def apply(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
  def apply(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
  def apply(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
}

