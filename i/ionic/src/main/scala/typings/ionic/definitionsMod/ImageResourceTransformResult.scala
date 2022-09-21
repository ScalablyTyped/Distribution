package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageResourceTransformResult extends StObject {
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var resource: ImageResource
  
  var tmpDest: String
}
object ImageResourceTransformResult {
  
  inline def apply(resource: ImageResource, tmpDest: String): ImageResourceTransformResult = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tmpDest = tmpDest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResourceTransformResult]
  }
  
  extension [Self <: ImageResourceTransformResult](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setResource(value: ImageResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setTmpDest(value: String): Self = StObject.set(x, "tmpDest", value.asInstanceOf[js.Any])
  }
}
