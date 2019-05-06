package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Android extends js.Object {
  def android(win: stdLib.Window): scala.Boolean
  def capacitor(win: js.Any): scala.Boolean
  def cordova(win: js.Any): scala.Boolean
  def desktop(win: stdLib.Window): scala.Boolean
  def electron(win: stdLib.Window): scala.Boolean
  def hybrid(win: stdLib.Window): scala.Boolean
  def ios(win: stdLib.Window): scala.Boolean
  def ipad(win: stdLib.Window): scala.Boolean
  def iphone(win: stdLib.Window): scala.Boolean
  def mobile(win: stdLib.Window): scala.Boolean
  def mobileweb(win: stdLib.Window): scala.Boolean
  def phablet(win: stdLib.Window): scala.Boolean
  def pwa(win: stdLib.Window): scala.Boolean
  def tablet(win: stdLib.Window): scala.Boolean
}

object Anon_Android {
  @scala.inline
  def apply(
    android: stdLib.Window => scala.Boolean,
    capacitor: js.Any => scala.Boolean,
    cordova: js.Any => scala.Boolean,
    desktop: stdLib.Window => scala.Boolean,
    electron: stdLib.Window => scala.Boolean,
    hybrid: stdLib.Window => scala.Boolean,
    ios: stdLib.Window => scala.Boolean,
    ipad: stdLib.Window => scala.Boolean,
    iphone: stdLib.Window => scala.Boolean,
    mobile: stdLib.Window => scala.Boolean,
    mobileweb: stdLib.Window => scala.Boolean,
    phablet: stdLib.Window => scala.Boolean,
    pwa: stdLib.Window => scala.Boolean,
    tablet: stdLib.Window => scala.Boolean
  ): Anon_Android = {
    val __obj = js.Dynamic.literal(android = js.Any.fromFunction1(android), capacitor = js.Any.fromFunction1(capacitor), cordova = js.Any.fromFunction1(cordova), desktop = js.Any.fromFunction1(desktop), electron = js.Any.fromFunction1(electron), hybrid = js.Any.fromFunction1(hybrid), ios = js.Any.fromFunction1(ios), ipad = js.Any.fromFunction1(ipad), iphone = js.Any.fromFunction1(iphone), mobile = js.Any.fromFunction1(mobile), mobileweb = js.Any.fromFunction1(mobileweb), phablet = js.Any.fromFunction1(phablet), pwa = js.Any.fromFunction1(pwa), tablet = js.Any.fromFunction1(tablet))
  
    __obj.asInstanceOf[Anon_Android]
  }
}

