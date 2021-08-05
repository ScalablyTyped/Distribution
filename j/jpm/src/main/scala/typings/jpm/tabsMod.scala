package typings.jpm

import typings.jpm.FFAddonSDK.Tab
import typings.jpm.anon.InBackground
import typings.jpm.jpmStrings.activate
import typings.jpm.jpmStrings.close
import typings.jpm.jpmStrings.deactivate
import typings.jpm.jpmStrings.load
import typings.jpm.jpmStrings.open
import typings.jpm.jpmStrings.pageshow
import typings.jpm.jpmStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Open, manipulate, and access tabs, and receive tab events
  */
object tabsMod {
  
  @JSImport("sdk/tabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sdk/tabs", "activeTab")
  @js.native
  val activeTab: Tab = js.native
  
  @JSImport("sdk/tabs", "length")
  @js.native
  val length: Double = js.native
  
  inline def on_activate(event: activate, handler: js.Function1[/* tab */ Tab, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_close(event: close, handler: js.Function1[/* tab */ Tab, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_deactivate(event: deactivate, handler: js.Function1[/* tab */ Tab, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_load(event: load, handler: js.Function1[/* tab */ Tab, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_open(event: open, handler: js.Function1[/* tab */ Tab, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pageshow(event: pageshow, handler: js.Function1[/* tab */ Tab, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_ready(event: ready, handler: js.Function1[/* tab */ Tab, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def open(options: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def open(options: InBackground): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
