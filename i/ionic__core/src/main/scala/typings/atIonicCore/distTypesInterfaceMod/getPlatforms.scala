package typings.atIonicCore.distTypesInterfaceMod

import typings.atIonicCore.atIonicCoreStrings.android
import typings.atIonicCore.atIonicCoreStrings.capacitor
import typings.atIonicCore.atIonicCoreStrings.cordova
import typings.atIonicCore.atIonicCoreStrings.desktop
import typings.atIonicCore.atIonicCoreStrings.electron
import typings.atIonicCore.atIonicCoreStrings.hybrid
import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.ipad
import typings.atIonicCore.atIonicCoreStrings.iphone
import typings.atIonicCore.atIonicCoreStrings.mobile
import typings.atIonicCore.atIonicCoreStrings.mobileweb
import typings.atIonicCore.atIonicCoreStrings.phablet
import typings.atIonicCore.atIonicCoreStrings.pwa
import typings.atIonicCore.atIonicCoreStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/interface", "getPlatforms")
@js.native
object getPlatforms extends js.Object {
  def apply(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = js.native
}

