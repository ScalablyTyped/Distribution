package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s nickname.
  */
trait SchemaNickname extends StObject {
  
  /**
    * Metadata about the nickname.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The type of the nickname.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The nickname.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaNickname {
  
  inline def apply(): SchemaNickname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNickname]
  }
  
  extension [Self <: SchemaNickname](x: Self) {
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
