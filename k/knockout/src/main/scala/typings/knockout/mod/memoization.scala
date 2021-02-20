package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoization {
  
  @JSImport("knockout", "memoization.memoize")
  @js.native
  def memoize(callback: js.Function1[/* val */ js.Any, Unit]): js.Array[Node] = js.native
  
  @JSImport("knockout", "memoization.parseMemoText")
  @js.native
  def parseMemoText(memoText: String): String = js.native
  
  @JSImport("knockout", "memoization.unmemoize")
  @js.native
  def unmemoize(memoId: String, callbackParams: js.Array[_]): Unit = js.native
  
  @JSImport("knockout", "memoization.unmemoizeDomNodeAndDescendants")
  @js.native
  def unmemoizeDomNodeAndDescendants(domNode: Node, extraCallbackParamsArray: js.Array[_]): Unit = js.native
}
