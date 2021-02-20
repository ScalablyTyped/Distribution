package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructuredResult extends StObject {
  
  /** Representation of a person */
  var person: js.UndefOr[Person] = js.native
}
object StructuredResult {
  
  @scala.inline
  def apply(): StructuredResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredResult]
  }
  
  @scala.inline
  implicit class StructuredResultMutableBuilder[Self <: StructuredResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
