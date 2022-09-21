package typings.i18next.mod

import typings.i18next.i18nextStrings.postProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostProcessorModule
  extends StObject
     with Module {
  
  /** Unique name */
  var name: String
  
  def process(value: String, key: String, options: TOptions[StringMap], translator: Any): String
  
  @JSName("type")
  var type_PostProcessorModule: postProcessor
}
object PostProcessorModule {
  
  inline def apply(name: String, process: (String, String, TOptions[StringMap], Any) => String): PostProcessorModule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], process = js.Any.fromFunction4(process))
    __obj.updateDynamic("type")("postProcessor")
    __obj.asInstanceOf[PostProcessorModule]
  }
  
  extension [Self <: PostProcessorModule](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProcess(value: (String, String, TOptions[StringMap], Any) => String): Self = StObject.set(x, "process", js.Any.fromFunction4(value))
    
    inline def setType(value: postProcessor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
