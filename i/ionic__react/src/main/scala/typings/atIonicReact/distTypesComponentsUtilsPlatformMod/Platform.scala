package typings.atIonicReact.distTypesComponentsUtilsPlatformMod

import typings.atIonicCore.distTypesUtilsPlatformMod.Platforms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/utils/platform", "Platform")
@js.native
class Platform () extends js.Object {
  /**
    * Returns if this app is using right-to-left language direction or not.
    * We recommend the app's `index.html` file already has the correct `dir`
    * attribute value set, such as `<html dir="ltr">` or `<html dir="rtl">`.
    * [W3C: Structural markup and right-to-left text in HTML](http://www.w3.org/International/questions/qa-html-dir)
    */
  val isRTL: Boolean = js.native
  /**
    * Get the query string parameter
    */
  def getQueryParam(key: String): String | Null = js.native
  /**
    * Gets the height of the platform's viewport using `window.innerHeight`.
    */
  def height(): Double = js.native
  /**
    * @returns returns true/false based on platform.
    * @description
    * Depending on the platform the user is on, `is(platformName)` will
    * return `true` or `false`. Note that the same app can return `true`
    * for more than one platform name. For example, an app running from
    * an iPad would return `true` for the platform names: `mobile`,
    * `ios`, `ipad`, and `tablet`. Additionally, if the app was running
    * from Cordova then `cordova` would be true, and if it was running
    * from a web browser on the iPad then `mobileweb` would be `true`.
    *
    * ```
    * import { Platform } from 'ionic-angular';
    *
    * @Component({...})
    * export MyPage {
    *   constructor(public platform: Platform) {
    *     if (this.platform.is('ios')) {
    *       // This will only print when on iOS
    *       console.log('I am an iOS device!');
    *     }
    *   }
    * }
    * ```
    *
    * | Platform Name   | Description                        |
    * |-----------------|------------------------------------|
    * | android         | on a device running Android.       |
    * | cordova         | on a device running Cordova.       |
    * | ios             | on a device running iOS.           |
    * | ipad            | on an iPad device.                 |
    * | iphone          | on an iPhone device.               |
    * | phablet         | on a phablet device.               |
    * | tablet          | on a tablet device.                |
    * | electron        | in Electron on a desktop device.   |
    * | pwa             | as a PWA app.                      |
    * | mobile          | on a mobile device.                |
    * | mobileweb       | on a mobile device in a browser.   |
    * | desktop         | on a desktop device.               |
    * | hybrid          | is a cordova or capacitor app.     |
    *
    */
  def is(platformName: Platforms): Boolean = js.native
  /**
    * Returns `true` if the app is in landscape mode.
    */
  def isLandscape(): Boolean = js.native
  /**
    * Returns `true` if the app is in portait mode.
    */
  def isPortrait(): Boolean = js.native
  /**
    * @returns the array of platforms
    * @description
    * Depending on what device you are on, `platforms` can return multiple values.
    * Each possible value is a hierarchy of platforms. For example, on an iPhone,
    * it would return `mobile`, `ios`, and `iphone`.
    *
    * ```
    * import { Platform } from 'ionic-angular';
    *
    * @Component({...})
    * export MyPage {
    *   constructor(public platform: Platform) {
    *     // This will print an array of the current platforms
    *     console.log(this.platform.platforms());
    *   }
    * }
    * ```
    */
  def platforms(): js.Array[String] = js.native
  def testUserAgent(expression: String): Boolean = js.native
  /**
    * Get the current url.
    */
  def url(): String = js.native
  /**
    * Gets the width of the platform's viewport using `window.innerWidth`.
    */
  def width(): Double = js.native
}

