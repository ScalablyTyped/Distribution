package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlMapReference extends StObject {
  
  var urlMap: js.UndefOr[String | Null] = js.undefined
}
object SchemaUrlMapReference {
  
  inline def apply(): SchemaUrlMapReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapReference]
  }
  
  extension [Self <: SchemaUrlMapReference](x: Self) {
    
    inline def setUrlMap(value: String): Self = StObject.set(x, "urlMap", value.asInstanceOf[js.Any])
    
    inline def setUrlMapNull: Self = StObject.set(x, "urlMap", null)
    
    inline def setUrlMapUndefined: Self = StObject.set(x, "urlMap", js.undefined)
  }
}
