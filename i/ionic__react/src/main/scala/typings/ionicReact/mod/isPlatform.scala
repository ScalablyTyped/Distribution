package typings.ionicReact.mod

import typings.ionicReact.ionicReactStrings.android
import typings.ionicReact.ionicReactStrings.capacitor
import typings.ionicReact.ionicReactStrings.cordova
import typings.ionicReact.ionicReactStrings.desktop
import typings.ionicReact.ionicReactStrings.electron
import typings.ionicReact.ionicReactStrings.hybrid
import typings.ionicReact.ionicReactStrings.ios
import typings.ionicReact.ionicReactStrings.ipad
import typings.ionicReact.ionicReactStrings.iphone
import typings.ionicReact.ionicReactStrings.mobile
import typings.ionicReact.ionicReactStrings.mobileweb
import typings.ionicReact.ionicReactStrings.phablet
import typings.ionicReact.ionicReactStrings.pwa
import typings.ionicReact.ionicReactStrings.tablet
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

