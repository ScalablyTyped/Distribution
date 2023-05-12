package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListrSimpleRendererCache extends StObject {
  
  var rendererOptions: ListrRendererCacheMap[ListrSimpleRendererOptions]
  
  var rendererTaskOptions: ListrRendererCacheMap[ListrSimpleRendererTaskOptions]
}
object ListrSimpleRendererCache {
  
  inline def apply(
    rendererOptions: ListrRendererCacheMap[ListrSimpleRendererOptions],
    rendererTaskOptions: ListrRendererCacheMap[ListrSimpleRendererTaskOptions]
  ): ListrSimpleRendererCache = {
    val __obj = js.Dynamic.literal(rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrSimpleRendererCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrSimpleRendererCache] (val x: Self) extends AnyVal {
    
    inline def setRendererOptions(value: ListrRendererCacheMap[ListrSimpleRendererOptions]): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: ListrRendererCacheMap[ListrSimpleRendererTaskOptions]): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
