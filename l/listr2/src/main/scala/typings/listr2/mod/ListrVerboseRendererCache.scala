package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListrVerboseRendererCache extends StObject {
  
  var rendererOptions: ListrRendererCacheMap[ListrVerboseRendererOptions]
  
  var rendererTaskOptions: ListrRendererCacheMap[ListrVerboseRendererTaskOptions]
}
object ListrVerboseRendererCache {
  
  inline def apply(
    rendererOptions: ListrRendererCacheMap[ListrVerboseRendererOptions],
    rendererTaskOptions: ListrRendererCacheMap[ListrVerboseRendererTaskOptions]
  ): ListrVerboseRendererCache = {
    val __obj = js.Dynamic.literal(rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrVerboseRendererCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrVerboseRendererCache] (val x: Self) extends AnyVal {
    
    inline def setRendererOptions(value: ListrRendererCacheMap[ListrVerboseRendererOptions]): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: ListrRendererCacheMap[ListrVerboseRendererTaskOptions]): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
