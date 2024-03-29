package typings.ionicCore

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
import typings.std.RegExp
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  @JSImport("@ionic/core/dist/types/utils/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")().asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  inline def getPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  
  @JSImport("@ionic/core/dist/types/utils/platform", "isPlatform")
  @js.native
  val isPlatform: IsPlatformSignature = js.native
  
  inline def setupPlatforms(): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupPlatforms")().asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  inline def setupPlatforms(win: js.Any): js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setupPlatforms")(win.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ios | ipad | iphone | android | phablet | tablet | cordova | capacitor | electron | pwa | mobile | mobileweb | desktop | hybrid
  ]]
  
  inline def testUserAgent(win: Window, expr: RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testUserAgent")(win.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait IsPlatformSignature extends StObject {
    
    def apply(plt: Platforms): Boolean = js.native
    def apply(win: Window, plt: Platforms): Boolean = js.native
  }
  
  /* keyof @ionic/core.anon.Android */ /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.ipad
    - typings.ionicCore.ionicCoreStrings.iphone
    - typings.ionicCore.ionicCoreStrings.ios
    - typings.ionicCore.ionicCoreStrings.android
    - typings.ionicCore.ionicCoreStrings.phablet
    - typings.ionicCore.ionicCoreStrings.tablet
    - typings.ionicCore.ionicCoreStrings.cordova
    - typings.ionicCore.ionicCoreStrings.capacitor
    - typings.ionicCore.ionicCoreStrings.electron
    - typings.ionicCore.ionicCoreStrings.pwa
    - typings.ionicCore.ionicCoreStrings.mobile
    - typings.ionicCore.ionicCoreStrings.mobileweb
    - typings.ionicCore.ionicCoreStrings.desktop
    - typings.ionicCore.ionicCoreStrings.hybrid
  */
  trait Platforms extends StObject
}
