package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlossaryEntry extends StObject {
  
  /**
    * Describes the glossary entry.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The resource name of the entry. Format: "projects/x/locations/x/glossaries/x/glossaryEntries/x"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used for an unidirectional glossary.
    */
  var termsPair: js.UndefOr[SchemaGlossaryTermsPair] = js.undefined
  
  /**
    * Used for an equivalent term sets glossary.
    */
  var termsSet: js.UndefOr[SchemaGlossaryTermsSet] = js.undefined
}
object SchemaGlossaryEntry {
  
  inline def apply(): SchemaGlossaryEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlossaryEntry]
  }
  
  extension [Self <: SchemaGlossaryEntry](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTermsPair(value: SchemaGlossaryTermsPair): Self = StObject.set(x, "termsPair", value.asInstanceOf[js.Any])
    
    inline def setTermsPairUndefined: Self = StObject.set(x, "termsPair", js.undefined)
    
    inline def setTermsSet(value: SchemaGlossaryTermsSet): Self = StObject.set(x, "termsSet", value.asInstanceOf[js.Any])
    
    inline def setTermsSetUndefined: Self = StObject.set(x, "termsSet", js.undefined)
  }
}
