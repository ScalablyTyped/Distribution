package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListrDefaultRendererCache extends StObject {
  
  var output: ListrRendererCacheMap[js.Array[String]]
  
  var rendererOptions: ListrRendererCacheMap[ListrDefaultRendererOptions]
  
  var rendererTaskOptions: ListrRendererCacheMap[ListrDefaultRendererTaskOptions]
}
object ListrDefaultRendererCache {
  
  inline def apply(
    output: ListrRendererCacheMap[js.Array[String]],
    rendererOptions: ListrRendererCacheMap[ListrDefaultRendererOptions],
    rendererTaskOptions: ListrRendererCacheMap[ListrDefaultRendererTaskOptions]
  ): ListrDefaultRendererCache = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrDefaultRendererCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrDefaultRendererCache] (val x: Self) extends AnyVal {
    
    inline def setOutput(value: ListrRendererCacheMap[js.Array[String]]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: ListrRendererCacheMap[ListrDefaultRendererOptions]): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: ListrRendererCacheMap[ListrDefaultRendererTaskOptions]): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
