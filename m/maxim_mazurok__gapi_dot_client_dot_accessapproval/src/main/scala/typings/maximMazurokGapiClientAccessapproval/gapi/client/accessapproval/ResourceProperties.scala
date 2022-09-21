package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceProperties extends StObject {
  
  /** Whether an approval will exclude the descendants of the resource being requested. */
  var excludesDescendants: js.UndefOr[Boolean] = js.undefined
}
object ResourceProperties {
  
  inline def apply(): ResourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceProperties]
  }
  
  extension [Self <: ResourceProperties](x: Self) {
    
    inline def setExcludesDescendants(value: Boolean): Self = StObject.set(x, "excludesDescendants", value.asInstanceOf[js.Any])
    
    inline def setExcludesDescendantsUndefined: Self = StObject.set(x, "excludesDescendants", js.undefined)
  }
}
