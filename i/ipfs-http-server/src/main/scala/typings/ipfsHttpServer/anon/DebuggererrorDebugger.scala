package typings.ipfsHttpServer.anon

import typings.debug.mod.Debugger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined debug.debug.Debugger & {  error :debug.debug.Debugger} */
@js.native
trait DebuggererrorDebugger extends StObject {
  
  def apply(formatter: js.Any, args: js.Any*): Unit = js.native
  
  var color: String = js.native
  
  def destroy(): Boolean = js.native
  
  var enabled: Boolean = js.native
  
  def error(formatter: js.Any, args: js.Any*): Unit = js.native
  @JSName("error")
  var error_Original: Debugger = js.native
  
  def extend(namespace: String): Debugger = js.native
  def extend(namespace: String, delimiter: String): Debugger = js.native
  
  def log(args: js.Any*): js.Any = js.native
  
  var namespace: String = js.native
}
