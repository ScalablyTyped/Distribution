package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s occupation.
  */
trait SchemaOccupation extends StObject {
  
  /**
    * Metadata about the occupation.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The occupation; for example, `carpenter`.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaOccupation {
  
  inline def apply(): SchemaOccupation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOccupation]
  }
  
  extension [Self <: SchemaOccupation](x: Self) {
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
