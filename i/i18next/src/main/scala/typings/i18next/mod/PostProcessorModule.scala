package typings.i18next.mod

import typings.i18next.i18nextStrings.postProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostProcessorModule extends Module {
  
  /** Unique name */
  var name: String = js.native
  
  def process(value: String, key: String, options: TOptions[StringMap], translator: js.Any): String = js.native
  
  @JSName("type")
  var type_PostProcessorModule: postProcessor = js.native
}
object PostProcessorModule {
  
  @scala.inline
  def apply(
    name: String,
    process: (String, String, TOptions[StringMap], js.Any) => String,
    `type`: postProcessor
  ): PostProcessorModule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], process = js.Any.fromFunction4(process))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostProcessorModule]
  }
  
  @scala.inline
  implicit class PostProcessorModuleMutableBuilder[Self <: PostProcessorModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcess(value: (String, String, TOptions[StringMap], js.Any) => String): Self = StObject.set(x, "process", js.Any.fromFunction4(value))
    
    @scala.inline
    def setType(value: postProcessor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
