package typings.atIonicCore

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Android extends js.Object {
  def android(win: Window): Boolean
  def capacitor(win: js.Any): Boolean
  def cordova(win: js.Any): Boolean
  def desktop(win: Window): Boolean
  def electron(win: Window): Boolean
  def hybrid(win: Window): Boolean
  def ios(win: Window): Boolean
  def ipad(win: Window): Boolean
  def iphone(win: Window): Boolean
  def mobile(win: Window): Boolean
  def mobileweb(win: Window): Boolean
  def phablet(win: Window): Boolean
  def pwa(win: Window): Boolean
  def tablet(win: Window): Boolean
}

object Anon_Android {
  @scala.inline
  def apply(
    android: Window => Boolean,
    capacitor: js.Any => Boolean,
    cordova: js.Any => Boolean,
    desktop: Window => Boolean,
    electron: Window => Boolean,
    hybrid: Window => Boolean,
    ios: Window => Boolean,
    ipad: Window => Boolean,
    iphone: Window => Boolean,
    mobile: Window => Boolean,
    mobileweb: Window => Boolean,
    phablet: Window => Boolean,
    pwa: Window => Boolean,
    tablet: Window => Boolean
  ): Anon_Android = {
    val __obj = js.Dynamic.literal(android = js.Any.fromFunction1(android), capacitor = js.Any.fromFunction1(capacitor), cordova = js.Any.fromFunction1(cordova), desktop = js.Any.fromFunction1(desktop), electron = js.Any.fromFunction1(electron), hybrid = js.Any.fromFunction1(hybrid), ios = js.Any.fromFunction1(ios), ipad = js.Any.fromFunction1(ipad), iphone = js.Any.fromFunction1(iphone), mobile = js.Any.fromFunction1(mobile), mobileweb = js.Any.fromFunction1(mobileweb), phablet = js.Any.fromFunction1(phablet), pwa = js.Any.fromFunction1(pwa), tablet = js.Any.fromFunction1(tablet))
  
    __obj.asInstanceOf[Anon_Android]
  }
}

