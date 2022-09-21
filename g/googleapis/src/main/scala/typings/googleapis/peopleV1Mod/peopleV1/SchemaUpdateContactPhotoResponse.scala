package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateContactPhotoResponse extends StObject {
  
  /**
    * The updated person, if person_fields is set in the UpdateContactPhotoRequest; otherwise this will be unset.
    */
  var person: js.UndefOr[SchemaPerson] = js.undefined
}
object SchemaUpdateContactPhotoResponse {
  
  inline def apply(): SchemaUpdateContactPhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateContactPhotoResponse]
  }
  
  extension [Self <: SchemaUpdateContactPhotoResponse](x: Self) {
    
    inline def setPerson(value: SchemaPerson): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
