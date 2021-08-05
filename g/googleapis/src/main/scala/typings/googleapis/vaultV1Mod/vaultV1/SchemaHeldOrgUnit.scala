package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A organizational unit being held in a particular hold. This structure is
  * immutable.
  */
trait SchemaHeldOrgUnit extends StObject {
  
  /**
    * When the org unit was put on hold. This property is immutable.
    */
  var holdTime: js.UndefOr[String] = js.undefined
  
  /**
    * The org unit&#39;s immutable ID as provided by the Admin SDK.
    */
  var orgUnitId: js.UndefOr[String] = js.undefined
}
object SchemaHeldOrgUnit {
  
  inline def apply(): SchemaHeldOrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldOrgUnit]
  }
  
  extension [Self <: SchemaHeldOrgUnit](x: Self) {
    
    inline def setHoldTime(value: String): Self = StObject.set(x, "holdTime", value.asInstanceOf[js.Any])
    
    inline def setHoldTimeUndefined: Self = StObject.set(x, "holdTime", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
  }
}
