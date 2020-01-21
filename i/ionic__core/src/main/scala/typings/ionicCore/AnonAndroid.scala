package typings.ionicCore

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAndroid extends js.Object {
  def android(win: Window_): Boolean
  def capacitor(win: js.Any): Boolean
  def cordova(win: js.Any): Boolean
  def desktop(win: Window_): Boolean
  def electron(win: Window_): Boolean
  def hybrid(win: Window_): Boolean
  def ios(win: Window_): Boolean
  def ipad(win: Window_): Boolean
  def iphone(win: Window_): Boolean
  def mobile(win: Window_): Boolean
  def mobileweb(win: Window_): Boolean
  def phablet(win: Window_): Boolean
  def pwa(win: Window_): Boolean
  def tablet(win: Window_): Boolean
}

object AnonAndroid {
  @scala.inline
  def apply(
    android: Window_ => Boolean,
    capacitor: js.Any => Boolean,
    cordova: js.Any => Boolean,
    desktop: Window_ => Boolean,
    electron: Window_ => Boolean,
    hybrid: Window_ => Boolean,
    ios: Window_ => Boolean,
    ipad: Window_ => Boolean,
    iphone: Window_ => Boolean,
    mobile: Window_ => Boolean,
    mobileweb: Window_ => Boolean,
    phablet: Window_ => Boolean,
    pwa: Window_ => Boolean,
    tablet: Window_ => Boolean
  ): AnonAndroid = {
    val __obj = js.Dynamic.literal(android = js.Any.fromFunction1(android), capacitor = js.Any.fromFunction1(capacitor), cordova = js.Any.fromFunction1(cordova), desktop = js.Any.fromFunction1(desktop), electron = js.Any.fromFunction1(electron), hybrid = js.Any.fromFunction1(hybrid), ios = js.Any.fromFunction1(ios), ipad = js.Any.fromFunction1(ipad), iphone = js.Any.fromFunction1(iphone), mobile = js.Any.fromFunction1(mobile), mobileweb = js.Any.fromFunction1(mobileweb), phablet = js.Any.fromFunction1(phablet), pwa = js.Any.fromFunction1(pwa), tablet = js.Any.fromFunction1(tablet))
  
    __obj.asInstanceOf[AnonAndroid]
  }
}

