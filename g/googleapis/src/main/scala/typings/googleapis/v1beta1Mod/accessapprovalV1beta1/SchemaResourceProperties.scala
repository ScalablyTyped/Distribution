package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceProperties extends StObject {
  
  /**
    * Whether an approval will exclude the descendants of the resource being requested.
    */
  var excludesDescendants: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaResourceProperties {
  
  inline def apply(): SchemaResourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceProperties]
  }
  
  extension [Self <: SchemaResourceProperties](x: Self) {
    
    inline def setExcludesDescendants(value: Boolean): Self = StObject.set(x, "excludesDescendants", value.asInstanceOf[js.Any])
    
    inline def setExcludesDescendantsNull: Self = StObject.set(x, "excludesDescendants", null)
    
    inline def setExcludesDescendantsUndefined: Self = StObject.set(x, "excludesDescendants", js.undefined)
  }
}
