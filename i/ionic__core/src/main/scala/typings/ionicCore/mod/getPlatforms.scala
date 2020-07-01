package typings.ionicCore.mod

import typings.ionicCore.ionicCoreStrings.android
import typings.ionicCore.ionicCoreStrings.capacitor
import typings.ionicCore.ionicCoreStrings.cordova
import typings.ionicCore.ionicCoreStrings.desktop
import typings.ionicCore.ionicCoreStrings.electron
import typings.ionicCore.ionicCoreStrings.hybrid
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.ipad
import typings.ionicCore.ionicCoreStrings.iphone
import typings.ionicCore.ionicCoreStrings.mobile
import typings.ionicCore.ionicCoreStrings.mobileweb
import typings.ionicCore.ionicCoreStrings.phablet
import typings.ionicCore.ionicCoreStrings.pwa
import typings.ionicCore.ionicCoreStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core", "getPlatforms")
@js.native
object getPlatforms extends js.Object {
  def apply(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def apply(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
}

