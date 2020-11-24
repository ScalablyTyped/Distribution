package typings.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotFn extends js.Object {
  
  def apply(url: GotUrl): GotPromise[String] = js.native
  def apply(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
  def apply(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
  def apply(url: GotUrl, options: GotJSONOptions): GotPromise[_] = js.native
}
