package typings.ionicAngular

import typings.angularCore.mod.NgZone
import typings.ionicCore.mod.BackButtonEventDetail
import typings.ionicCore.platformMod.Platforms
import typings.rxjs.mod.Subject
import typings.rxjs.mod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  @JSImport("@ionic/angular/providers/platform", "Platform")
  @js.native
  class Platform protected () extends StObject {
    def this(doc: js.Any, zone: NgZone) = this()
    
    var _readyPromise: js.Any = js.native
    
    /**
      * @hidden
      */
    var backButton: BackButtonEmitter = js.native
    
    var doc: js.Any = js.native
    
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
      * Returns if this app is using right-to-left language direction or not.
      * We recommend the app's `index.html` file already has the correct `dir`
      * attribute value set, such as `<html dir="ltr">` or `<html dir="rtl">`.
      * [W3C: Structural markup and right-to-left text in HTML](http://www.w3.org/International/questions/qa-html-dir)
      */
    val isRTL: Boolean = js.native
    
    /**
      * The keyboardDidHide event emits when the
      * on-screen keyboard is hidden.
      */
    var keyboardDidHide: Subject[Unit] = js.native
    
    /**
      * The keyboardDidShow event emits when the
      * on-screen keyboard is presented.
      */
    var keyboardDidShow: js.Any = js.native
    
    /**
      * The pause event emits when the native platform puts the application
      * into the background, typically when the user switches to a different
      * application. This event would emit when a Cordova app is put into
      * the background, however, it would not fire on a standard web browser.
      */
    var pause: Subject[Unit] = js.native
    
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
    
    /**
      * Returns a promise when the platform is ready and native functionality
      * can be called. If the app is running from within a web browser, then
      * the promise will resolve when the DOM is ready. When the app is running
      * from an application engine such as Cordova, then the promise will
      * resolve when Cordova triggers the `deviceready` event.
      *
      * The resolved value is the `readySource`, which states which platform
      * ready was used. For example, when Cordova is ready, the resolved ready
      * source is `cordova`. The default ready source value will be `dom`. The
      * `readySource` is useful if different logic should run depending on the
      * platform the app is running from. For example, only Cordova can execute
      * the status bar plugin, so the web should not run status bar plugin logic.
      *
      * ```
      * import { Component } from '@angular/core';
      * import { Platform } from 'ionic-angular';
      *
      * @Component({...})
      * export MyApp {
      *   constructor(public platform: Platform) {
      *     this.platform.ready().then((readySource) => {
      *       console.log('Platform ready from', readySource);
      *       // Platform now ready, execute any required native code
      *     });
      *   }
      * }
      * ```
      */
    def ready(): js.Promise[String] = js.native
    
    /**
      * The resize event emits when the browser window has changed dimensions. This
      * could be from a browser window being physically resized, or from a device
      * changing orientation.
      */
    var resize: Subject[Unit] = js.native
    
    /**
      * The resume event emits when the native platform pulls the application
      * out from the background. This event would emit when a Cordova app comes
      * out from the background, however, it would not fire on a standard web browser.
      */
    var resume: Subject[Unit] = js.native
    
    def testUserAgent(expression: String): Boolean = js.native
    
    /**
      * Get the current url.
      */
    def url(): js.Any = js.native
    
    /**
      * Gets the width of the platform's viewport using `window.innerWidth`.
      */
    def width(): js.Any = js.native
    
    var win: js.Any = js.native
  }
  
  @js.native
  trait BackButtonEmitter extends Subject[BackButtonEventDetail] {
    
    def subscribeWithPriority(
      priority: Double,
      callback: js.Function1[/* processNextHandler */ js.Function0[Unit], js.Promise[js.Any] | Unit]
    ): Subscription = js.native
  }
}
