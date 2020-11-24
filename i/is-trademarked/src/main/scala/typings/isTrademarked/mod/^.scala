package typings.isTrademarked.mod

import typings.isTrademarked.isTrademarkedBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-trademarked", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(searchTerm: String): js.Promise[`false` | js.Array[TrademarkedData]] = js.native
  def apply(searchTerm: String, opts: Options): js.Promise[`false` | js.Array[TrademarkedData]] = js.native
}
