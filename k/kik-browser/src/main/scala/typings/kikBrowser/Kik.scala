package typings.kikBrowser

import typings.kikBrowser.anon.Back
import typings.kikBrowser.anon.Call
import typings.kikBrowser.anon.EnableGoogleAnalytics
import typings.kikBrowser.anon.Get
import typings.kikBrowser.anon.Hide
import typings.kikBrowser.anon.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kik extends StObject {
  
  def anonymousSign(
    data: String,
    callback: js.Function3[/* signedData */ String, /* anonToken */ String, /* host */ String, Unit]
  ): Unit = js.native
  
  var browser: Back = js.native
  
  var enabled: Boolean = js.native
  
  var formHelpers: Hide = js.native
  
  def getAnonymousUser(callback: js.Function1[/* token */ String, Unit]): Unit = js.native
  
  def getUser(callback: js.Function1[/* user */ KikUser, Unit]): Unit = js.native
  
  def hasPermission(): Boolean = js.native
  
  var linkData: String = js.native
  
  var message: KikMessage = js.native
  
  var metrics: EnableGoogleAnalytics = js.native
  
  def off(property: String, eventHandler: js.Function0[Unit]): Unit = js.native
  
  def on(property: String, eventHandler: js.Function0[Unit]): Unit = js.native
  
  def once(property: String, eventHandler: js.Function0[Unit]): Unit = js.native
  
  def open(url: String): Unit = js.native
  def open(url: String, popupMode: Boolean): Unit = js.native
  
  def openConversation(username: String): Unit = js.native
  
  var photo: Get = js.native
  
  def pickUsers(callback: js.Function1[/* users */ js.Array[KikUser], Unit]): Unit = js.native
  def pickUsers(options: KikPickUsersOptions, callback: js.Function1[/* users */ js.Array[KikUser], Unit]): Unit = js.native
  
  def picker(url: String, data: js.Any, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  @JSName("picker")
  var picker_Original: Call = js.native
  
  def ready(callback: js.Function0[Unit]): Unit = js.native
  
  def send(message: KikMessage): Unit = js.native
  def send(user: String, message: KikMessage): Unit = js.native
  
  def showProfile(username: String): Unit = js.native
  
  def sign(
    data: String,
    callback: js.Function3[/* signedData */ String, /* username */ String, /* host */ String, Unit]
  ): Unit = js.native
  
  def trigger(property: String): Unit = js.native
  def trigger(property: String, data: js.Any): Unit = js.native
  
  var utils: Platform = js.native
}
