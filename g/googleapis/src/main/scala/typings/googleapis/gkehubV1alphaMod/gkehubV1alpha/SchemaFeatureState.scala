package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeatureState extends StObject {
  
  /**
    * The high-level, machine-readable status of this Feature.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A human-readable description of the current status.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time this status and any related Feature-specific details were updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaFeatureState {
  
  inline def apply(): SchemaFeatureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureState]
  }
  
  extension [Self <: SchemaFeatureState](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
