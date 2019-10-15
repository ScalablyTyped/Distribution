package typings.atIonicReact.atIonicReactMod

import typings.atIonicReact.atIonicReactStrings.android
import typings.atIonicReact.atIonicReactStrings.capacitor
import typings.atIonicReact.atIonicReactStrings.cordova
import typings.atIonicReact.atIonicReactStrings.desktop
import typings.atIonicReact.atIonicReactStrings.electron
import typings.atIonicReact.atIonicReactStrings.hybrid
import typings.atIonicReact.atIonicReactStrings.ios
import typings.atIonicReact.atIonicReactStrings.ipad
import typings.atIonicReact.atIonicReactStrings.iphone
import typings.atIonicReact.atIonicReactStrings.mobile
import typings.atIonicReact.atIonicReactStrings.mobileweb
import typings.atIonicReact.atIonicReactStrings.phablet
import typings.atIonicReact.atIonicReactStrings.pwa
import typings.atIonicReact.atIonicReactStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "isPlatform")
@js.native
object isPlatform extends js.Object {
  def apply(
    platform: ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ): Boolean = js.native
}

