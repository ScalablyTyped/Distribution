package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A people suggestion.
  */
trait SchemaPeopleSuggestion extends StObject {
  
  /**
    * Suggested person. All fields of the person object might not be populated.
    */
  var person: js.UndefOr[SchemaPerson] = js.undefined
}
object SchemaPeopleSuggestion {
  
  @scala.inline
  def apply(): SchemaPeopleSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeopleSuggestion]
  }
  
  @scala.inline
  implicit class SchemaPeopleSuggestionMutableBuilder[Self <: SchemaPeopleSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerson(value: SchemaPerson): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
