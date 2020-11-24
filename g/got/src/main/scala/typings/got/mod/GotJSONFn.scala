package typings.got.mod

import typings.got.anon.PartialGotJSONOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotJSONFn extends js.Object {
  
  def apply(url: GotUrl): GotPromise[_] = js.native
  def apply(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
}
