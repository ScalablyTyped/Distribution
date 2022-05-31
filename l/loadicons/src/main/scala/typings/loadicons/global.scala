package typings.loadicons

import typings.loadicons.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Load SVG icon sprites safely and asynchronously
    */
  inline def loadIcons(svgURL: String, callback: Callback): Unit = (js.Dynamic.global.applyDynamic("loadIcons")(svgURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
