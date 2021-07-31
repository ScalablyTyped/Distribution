package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoization {
  
  @JSImport("knockout", "memoization")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def memoize(callback: js.Function1[/* val */ js.Any, Unit]): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  
  @scala.inline
  def parseMemoText(memoText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMemoText")(memoText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unmemoize(memoId: String, callbackParams: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmemoize")(memoId.asInstanceOf[js.Any], callbackParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unmemoizeDomNodeAndDescendants(domNode: Node, extraCallbackParamsArray: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unmemoizeDomNodeAndDescendants")(domNode.asInstanceOf[js.Any], extraCallbackParamsArray.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
