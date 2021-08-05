package typings.jpm

import typings.jpm.jpmStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get and set text and HTML selections in the current web page
  */
object selectionMod {
  
  @JSImport("sdk/selection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sdk/selection", "html")
  @js.native
  def html: String = js.native
  inline def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
  
  @JSImport("sdk/selection", "isContiguous")
  @js.native
  val isContiguous: Boolean = js.native
  
  inline def on_select(event: select, handler: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeListener_select(event: select, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sdk/selection", "text")
  @js.native
  def text: String = js.native
  inline def text_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
}
