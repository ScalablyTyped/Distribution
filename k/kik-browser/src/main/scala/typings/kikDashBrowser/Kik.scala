package typings.kikDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kik extends js.Object {
  var browser: Anon_Back = js.native
  var enabled: Boolean = js.native
  var formHelpers: Anon_Hide = js.native
  var linkData: String = js.native
  var message: KikMessage = js.native
  var metrics: Anon_Domain = js.native
  var photo: Anon_Callback = js.native
  @JSName("picker")
  var picker_Original: Anon_CallbackData = js.native
  var utils: Anon_Platform = js.native
  def anonymousSign(
    data: String,
    callback: js.Function3[/* signedData */ String, /* anonToken */ String, /* host */ String, Unit]
  ): Unit = js.native
  def getAnonymousUser(callback: js.Function1[/* token */ String, Unit]): Unit = js.native
  def getUser(callback: js.Function1[/* user */ KikUser, Unit]): Unit = js.native
  def hasPermission(): Boolean = js.native
  def off(property: String, eventHandler: js.Function0[Unit]): Unit = js.native
  def on(property: String, eventHandler: js.Function0[Unit]): Unit = js.native
  def once(property: String, eventHandler: js.Function0[Unit]): Unit = js.native
  def open(url: String): Unit = js.native
  def open(url: String, popupMode: Boolean): Unit = js.native
  def openConversation(username: String): Unit = js.native
  def pickUsers(callback: js.Function1[/* users */ js.Array[KikUser], Unit]): Unit = js.native
  def pickUsers(options: KikPickUsersOptions, callback: js.Function1[/* users */ js.Array[KikUser], Unit]): Unit = js.native
  def picker(url: String, data: js.Any, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
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
}

