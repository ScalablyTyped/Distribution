package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeopleSuggestion extends StObject {
  
  /** Suggested person. All fields of the person object might not be populated. */
  var person: js.UndefOr[Person] = js.undefined
}
object PeopleSuggestion {
  
  inline def apply(): PeopleSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeopleSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeopleSuggestion] (val x: Self) extends AnyVal {
    
    inline def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
