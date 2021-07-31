package typings.jcanvas

import typings.jquery.JQueryStatic
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// note this declare module is necessary to tell TypeScript not to interpret the whole file as one module;
// the JQuery interface below should extend the existing jquery module interface
object mod {
  
  @scala.inline
  def apply(jquery: JQueryStatic, window: Window): Unit = (^.asInstanceOf[js.Dynamic].apply(jquery.asInstanceOf[js.Any], window.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("jcanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
