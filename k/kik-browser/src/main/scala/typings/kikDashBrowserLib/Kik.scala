package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kik extends js.Object {
  var browser: Anon_Back = js.native
  var enabled: scala.Boolean = js.native
  var formHelpers: Anon_Hide = js.native
  var linkData: java.lang.String = js.native
  var message: KikMessage = js.native
  var metrics: Anon_Domain = js.native
  var photo: Anon_Callback = js.native
  @JSName("picker")
  var picker_Original: Anon_CallbackData = js.native
  var utils: Anon_Platform = js.native
  def anonymousSign(
    data: java.lang.String,
    callback: js.Function3[
      /* signedData */ java.lang.String, 
      /* anonToken */ java.lang.String, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getAnonymousUser(callback: js.Function1[/* token */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getUser(callback: js.Function1[/* user */ KikUser, scala.Unit]): scala.Unit = js.native
  def hasPermission(): scala.Boolean = js.native
  def off(property: java.lang.String, eventHandler: js.Function0[scala.Unit]): scala.Unit = js.native
  def on(property: java.lang.String, eventHandler: js.Function0[scala.Unit]): scala.Unit = js.native
  def once(property: java.lang.String, eventHandler: js.Function0[scala.Unit]): scala.Unit = js.native
  def open(url: java.lang.String): scala.Unit = js.native
  def open(url: java.lang.String, popupMode: scala.Boolean): scala.Unit = js.native
  def openConversation(username: java.lang.String): scala.Unit = js.native
  def pickUsers(callback: js.Function1[/* users */ js.Array[KikUser], scala.Unit]): scala.Unit = js.native
  def pickUsers(options: KikPickUsersOptions, callback: js.Function1[/* users */ js.Array[KikUser], scala.Unit]): scala.Unit = js.native
  def picker(url: java.lang.String, data: js.Any, callback: js.Function1[/* response */ js.Any, scala.Unit]): scala.Unit = js.native
  def ready(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def send(message: KikMessage): scala.Unit = js.native
  def send(user: java.lang.String, message: KikMessage): scala.Unit = js.native
  def showProfile(username: java.lang.String): scala.Unit = js.native
  def sign(
    data: java.lang.String,
    callback: js.Function3[
      /* signedData */ java.lang.String, 
      /* username */ java.lang.String, 
      /* host */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def trigger(property: java.lang.String): scala.Unit = js.native
  def trigger(property: java.lang.String, data: js.Any): scala.Unit = js.native
}

