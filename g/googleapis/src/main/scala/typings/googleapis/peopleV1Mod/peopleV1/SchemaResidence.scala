package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResidence extends StObject {
  
  /**
    * True if the residence is the person's current residence; false if the residence is a past residence.
    */
  var current: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Metadata about the residence.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The address of the residence.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaResidence {
  
  inline def apply(): SchemaResidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResidence]
  }
  
  extension [Self <: SchemaResidence](x: Self) {
    
    inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
