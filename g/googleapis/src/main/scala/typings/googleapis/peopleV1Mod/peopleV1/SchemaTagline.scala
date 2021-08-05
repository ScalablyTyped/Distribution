package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A read-only brief one-line description of the person.
  */
trait SchemaTagline extends StObject {
  
  /**
    * Metadata about the tagline.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The tagline.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaTagline {
  
  inline def apply(): SchemaTagline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagline]
  }
  
  extension [Self <: SchemaTagline](x: Self) {
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
