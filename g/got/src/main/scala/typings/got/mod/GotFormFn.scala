package typings.got.mod

import typings.node.Buffer
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotFormFn[T /* <: String | Null */] extends StObject {
  
  def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
  def apply(url: GotUrl, options: Partial[GotFormOptions[T]]): GotPromise[String | Buffer] = js.native
}
