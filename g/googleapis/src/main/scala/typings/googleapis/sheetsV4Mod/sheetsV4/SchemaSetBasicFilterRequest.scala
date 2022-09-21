package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetBasicFilterRequest extends StObject {
  
  /**
    * The filter to set.
    */
  var filter: js.UndefOr[SchemaBasicFilter] = js.undefined
}
object SchemaSetBasicFilterRequest {
  
  inline def apply(): SchemaSetBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetBasicFilterRequest]
  }
  
  extension [Self <: SchemaSetBasicFilterRequest](x: Self) {
    
    inline def setFilter(value: SchemaBasicFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
