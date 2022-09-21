package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStoredParticipantId extends StObject {
  
  var gaiaId: js.UndefOr[String | Null] = js.undefined
}
object SchemaStoredParticipantId {
  
  inline def apply(): SchemaStoredParticipantId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoredParticipantId]
  }
  
  extension [Self <: SchemaStoredParticipantId](x: Self) {
    
    inline def setGaiaId(value: String): Self = StObject.set(x, "gaiaId", value.asInstanceOf[js.Any])
    
    inline def setGaiaIdNull: Self = StObject.set(x, "gaiaId", null)
    
    inline def setGaiaIdUndefined: Self = StObject.set(x, "gaiaId", js.undefined)
  }
}
