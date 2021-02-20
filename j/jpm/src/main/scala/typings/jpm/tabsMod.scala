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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Open, manipulate, and access tabs, and receive tab events
  */
object tabsMod {
  
  @JSImport("sdk/tabs", "activeTab")
  @js.native
  val activeTab: Tab = js.native
  
  @JSImport("sdk/tabs", "length")
  @js.native
  val length: Double = js.native
  
  @JSImport("sdk/tabs", "on")
  @js.native
  def on_activate(event: activate, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSImport("sdk/tabs", "on")
  @js.native
  def on_close(event: close, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSImport("sdk/tabs", "on")
  @js.native
  def on_deactivate(event: deactivate, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSImport("sdk/tabs", "on")
  @js.native
  def on_load(event: load, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSImport("sdk/tabs", "on")
  @js.native
  def on_open(event: open, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSImport("sdk/tabs", "on")
  @js.native
  def on_pageshow(event: pageshow, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  @JSImport("sdk/tabs", "on")
  @js.native
  def on_ready(event: ready, handler: js.Function1[/* tab */ Tab, _]): Unit = js.native
  
  @JSImport("sdk/tabs", "open")
  @js.native
  def open(options: String): Unit = js.native
  @JSImport("sdk/tabs", "open")
  @js.native
  def open(options: InBackground): Unit = js.native
}
