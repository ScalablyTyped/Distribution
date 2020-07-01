package typings.ionicAngular.mod

import typings.ionicAngular.ionicAngularStrings.android
import typings.ionicAngular.ionicAngularStrings.capacitor
import typings.ionicAngular.ionicAngularStrings.cordova
import typings.ionicAngular.ionicAngularStrings.desktop
import typings.ionicAngular.ionicAngularStrings.electron
import typings.ionicAngular.ionicAngularStrings.hybrid
import typings.ionicAngular.ionicAngularStrings.ios
import typings.ionicAngular.ionicAngularStrings.ipad
import typings.ionicAngular.ionicAngularStrings.iphone
import typings.ionicAngular.ionicAngularStrings.mobile
import typings.ionicAngular.ionicAngularStrings.mobileweb
import typings.ionicAngular.ionicAngularStrings.phablet
import typings.ionicAngular.ionicAngularStrings.pwa
import typings.ionicAngular.ionicAngularStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "getPlatforms")
@js.native
object getPlatforms extends js.Object {
  def apply(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
  def apply(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
}

