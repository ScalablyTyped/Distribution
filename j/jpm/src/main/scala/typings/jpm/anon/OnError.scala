package typings.jpm.anon

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnError extends StObject {
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  
  def onError(): js.Any = js.native
  def onError(data: js.Any): js.Any = js.native
  
  def onMessage(): js.Any = js.native
  def onMessage(data: js.Any): js.Any = js.native
  
  var window: Window = js.native
}
