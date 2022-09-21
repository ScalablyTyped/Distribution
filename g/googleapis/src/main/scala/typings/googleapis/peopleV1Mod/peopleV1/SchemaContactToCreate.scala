package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactToCreate extends StObject {
  
  /**
    * Required. The person data to populate a newly created source.
    */
  var contactPerson: js.UndefOr[SchemaPerson] = js.undefined
}
object SchemaContactToCreate {
  
  inline def apply(): SchemaContactToCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactToCreate]
  }
  
  extension [Self <: SchemaContactToCreate](x: Self) {
    
    inline def setContactPerson(value: SchemaPerson): Self = StObject.set(x, "contactPerson", value.asInstanceOf[js.Any])
    
    inline def setContactPersonUndefined: Self = StObject.set(x, "contactPerson", js.undefined)
  }
}
