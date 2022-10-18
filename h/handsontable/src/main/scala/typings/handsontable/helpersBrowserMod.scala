package typings.handsontable

import typings.handsontable.anon.MaxTouchPoints
import typings.handsontable.anon.Platform
import typings.handsontable.anon.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersBrowserMod {
  
  @JSImport("handsontable/helpers/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isChrome(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrome")().asInstanceOf[Boolean]
  
  inline def isChromeWebKit(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChromeWebKit")().asInstanceOf[Boolean]
  
  inline def isEdge(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdge")().asInstanceOf[Boolean]
  
  inline def isEdgeWebKit(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEdgeWebKit")().asInstanceOf[Boolean]
  
  inline def isFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefox")().asInstanceOf[Boolean]
  
  inline def isFirefoxWebKit(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefoxWebKit")().asInstanceOf[Boolean]
  
  inline def isIE(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE")().asInstanceOf[Boolean]
  
  inline def isIE9(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIE9")().asInstanceOf[Boolean]
  
  inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  inline def isIpadOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIpadOS")().asInstanceOf[Boolean]
  inline def isIpadOS(hasMaxTouchPoints: MaxTouchPoints): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIpadOS")(hasMaxTouchPoints.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLinuxOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinuxOS")().asInstanceOf[Boolean]
  
  inline def isMSBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMSBrowser")().asInstanceOf[Boolean]
  
  inline def isMacOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOS")().asInstanceOf[Boolean]
  
  inline def isMobileBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobileBrowser")().asInstanceOf[Boolean]
  
  inline def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
  
  inline def isWindowsOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindowsOS")().asInstanceOf[Boolean]
  
  inline def setBrowserMeta(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBrowserMeta")().asInstanceOf[Unit]
  inline def setBrowserMeta(hasUserAgentVendor: UserAgent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBrowserMeta")(hasUserAgentVendor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPlatformMeta(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlatformMeta")().asInstanceOf[Unit]
  inline def setPlatformMeta(hasPlatform: Platform): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlatformMeta")(hasPlatform.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
