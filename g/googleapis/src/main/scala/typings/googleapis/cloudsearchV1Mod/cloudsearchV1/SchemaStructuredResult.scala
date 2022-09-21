package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStructuredResult extends StObject {
  
  /**
    * Representation of a person
    */
  var person: js.UndefOr[SchemaPerson] = js.undefined
}
object SchemaStructuredResult {
  
  inline def apply(): SchemaStructuredResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredResult]
  }
  
  extension [Self <: SchemaStructuredResult](x: Self) {
    
    inline def setPerson(value: SchemaPerson): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
