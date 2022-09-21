package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaITunesConnectAnalytics extends StObject {
  
  /**
    * Affiliate token used to create affiliate-coded links.
    */
  var at: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Campaign text that developers can optionally add to any link in order to track sales from a specific marketing campaign.
    */
  var ct: js.UndefOr[String | Null] = js.undefined
  
  /**
    * iTune media types, including music, podcasts, audiobooks and so on.
    */
  var mt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Provider token that enables analytics for Dynamic Links from within iTunes Connect.
    */
  var pt: js.UndefOr[String | Null] = js.undefined
}
object SchemaITunesConnectAnalytics {
  
  inline def apply(): SchemaITunesConnectAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaITunesConnectAnalytics]
  }
  
  extension [Self <: SchemaITunesConnectAnalytics](x: Self) {
    
    inline def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtNull: Self = StObject.set(x, "at", null)
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setCt(value: String): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
    
    inline def setCtNull: Self = StObject.set(x, "ct", null)
    
    inline def setCtUndefined: Self = StObject.set(x, "ct", js.undefined)
    
    inline def setMt(value: String): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    inline def setMtNull: Self = StObject.set(x, "mt", null)
    
    inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
    
    inline def setPt(value: String): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    inline def setPtNull: Self = StObject.set(x, "pt", null)
    
    inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
  }
}
