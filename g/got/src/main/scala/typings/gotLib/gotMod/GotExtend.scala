package typings
package gotLib.gotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GotExtend extends js.Object {
  def apply(options: GotBodyOptions[scala.Null | java.lang.String]): GotInstance[GotBodyFn[java.lang.String]] = js.native
  def apply(options: GotFormOptions[scala.Null | java.lang.String]): GotInstance[GotFormFn[java.lang.String]] = js.native
  def apply(options: GotJSONOptions): GotInstance[GotJSONFn] = js.native
}

