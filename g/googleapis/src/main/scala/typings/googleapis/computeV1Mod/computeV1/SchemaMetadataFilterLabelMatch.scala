package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadataFilterLabelMatch extends StObject {
  
  /**
    * Name of metadata label. The name can have a maximum length of 1024 characters and must be at least 1 character long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the label must match the specified value. value can have a maximum length of 1024 characters.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetadataFilterLabelMatch {
  
  inline def apply(): SchemaMetadataFilterLabelMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataFilterLabelMatch]
  }
  
  extension [Self <: SchemaMetadataFilterLabelMatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
