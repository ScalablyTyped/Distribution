package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlMapsScopedList extends StObject {
  
  /**
    * A list of UrlMaps contained in this scope.
    */
  var urlMaps: js.UndefOr[js.Array[SchemaUrlMap]] = js.undefined
  
  /**
    * Informational warning which replaces the list of backend services when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaUrlMapsScopedList {
  
  inline def apply(): SchemaUrlMapsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsScopedList]
  }
  
  extension [Self <: SchemaUrlMapsScopedList](x: Self) {
    
    inline def setUrlMaps(value: js.Array[SchemaUrlMap]): Self = StObject.set(x, "urlMaps", value.asInstanceOf[js.Any])
    
    inline def setUrlMapsUndefined: Self = StObject.set(x, "urlMaps", js.undefined)
    
    inline def setUrlMapsVarargs(value: SchemaUrlMap*): Self = StObject.set(x, "urlMaps", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
