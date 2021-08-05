package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Desktop related attributes to the Dynamic Link.
  */
trait SchemaDesktopInfo extends StObject {
  
  /**
    * Link to open on desktop.
    */
  var desktopFallbackLink: js.UndefOr[String] = js.undefined
}
object SchemaDesktopInfo {
  
  inline def apply(): SchemaDesktopInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDesktopInfo]
  }
  
  extension [Self <: SchemaDesktopInfo](x: Self) {
    
    inline def setDesktopFallbackLink(value: String): Self = StObject.set(x, "desktopFallbackLink", value.asInstanceOf[js.Any])
    
    inline def setDesktopFallbackLinkUndefined: Self = StObject.set(x, "desktopFallbackLink", js.undefined)
  }
}
