package typings.jpm.anon

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnError extends StObject {
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  
  def onError(): Any = js.native
  def onError(data: Any): Any = js.native
  
  def onMessage(): Any = js.native
  def onMessage(data: Any): Any = js.native
  
  var window: Window = js.native
}
