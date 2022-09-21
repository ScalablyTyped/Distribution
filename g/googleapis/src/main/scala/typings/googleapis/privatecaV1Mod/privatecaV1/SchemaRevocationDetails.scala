package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevocationDetails extends StObject {
  
  /**
    * Indicates why a Certificate was revoked.
    */
  var revocationState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which this Certificate was revoked.
    */
  var revocationTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaRevocationDetails {
  
  inline def apply(): SchemaRevocationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevocationDetails]
  }
  
  extension [Self <: SchemaRevocationDetails](x: Self) {
    
    inline def setRevocationState(value: String): Self = StObject.set(x, "revocationState", value.asInstanceOf[js.Any])
    
    inline def setRevocationStateNull: Self = StObject.set(x, "revocationState", null)
    
    inline def setRevocationStateUndefined: Self = StObject.set(x, "revocationState", js.undefined)
    
    inline def setRevocationTime(value: String): Self = StObject.set(x, "revocationTime", value.asInstanceOf[js.Any])
    
    inline def setRevocationTimeNull: Self = StObject.set(x, "revocationTime", null)
    
    inline def setRevocationTimeUndefined: Self = StObject.set(x, "revocationTime", js.undefined)
  }
}
