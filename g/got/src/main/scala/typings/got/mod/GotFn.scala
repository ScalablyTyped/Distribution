package typings.got.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotFn extends StObject {
  
  def apply(url: GotUrl): GotPromise[String] = js.native
  def apply(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
  def apply(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
  def apply(url: GotUrl, options: GotJSONOptions): GotPromise[js.Any] = js.native
}
