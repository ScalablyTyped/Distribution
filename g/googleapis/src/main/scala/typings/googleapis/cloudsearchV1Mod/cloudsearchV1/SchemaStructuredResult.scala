package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structured results that are returned as part of search request.
  */
trait SchemaStructuredResult extends StObject {
  
  /**
    * Representation of a person
    */
  var person: js.UndefOr[SchemaPerson] = js.undefined
}
object SchemaStructuredResult {
  
  @scala.inline
  def apply(): SchemaStructuredResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredResult]
  }
  
  @scala.inline
  implicit class SchemaStructuredResultMutableBuilder[Self <: SchemaStructuredResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerson(value: SchemaPerson): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
