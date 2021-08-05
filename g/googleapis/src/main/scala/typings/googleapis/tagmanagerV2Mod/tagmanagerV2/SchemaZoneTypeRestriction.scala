package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Zone&#39;s type restrictions.
  */
trait SchemaZoneTypeRestriction extends StObject {
  
  /**
    * True if type restrictions have been enabled for this Zone.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of type public ids that have been whitelisted for use in this Zone.
    */
  var whitelistedTypeId: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaZoneTypeRestriction {
  
  inline def apply(): SchemaZoneTypeRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneTypeRestriction]
  }
  
  extension [Self <: SchemaZoneTypeRestriction](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setWhitelistedTypeId(value: js.Array[String]): Self = StObject.set(x, "whitelistedTypeId", value.asInstanceOf[js.Any])
    
    inline def setWhitelistedTypeIdUndefined: Self = StObject.set(x, "whitelistedTypeId", js.undefined)
    
    inline def setWhitelistedTypeIdVarargs(value: String*): Self = StObject.set(x, "whitelistedTypeId", js.Array(value :_*))
  }
}
