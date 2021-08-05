package typings.jpm

import typings.jpm.FFAddonSDK.BrowserWindow
import typings.jpm.FFAddonSDK.ContentWorker
import typings.jpm.FFAddonSDK.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Check whether a given object is private, so an add-on can respect private browsing
  */
object privateBrowsingMod {
  
  @JSImport("sdk/private-browsing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPrivate(`object`: BrowserWindow): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPrivate(`object`: ContentWorker): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPrivate(`object`: Tab): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivate")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
