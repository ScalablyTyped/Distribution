package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metaline extends StObject {
  
  /** The list of displayed properties for the metaline. The maximum number of properties is 5. */
  var properties: js.UndefOr[js.Array[DisplayedProperty]] = js.native
}
object Metaline {
  
  @scala.inline
  def apply(): Metaline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metaline]
  }
  
  @scala.inline
  implicit class MetalineMutableBuilder[Self <: Metaline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[DisplayedProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: DisplayedProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
