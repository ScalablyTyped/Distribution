package typings.marko

import typings.marko.srcRuntimeHtmlMod.AsyncStream
import typings.marko.srcRuntimeHtmlMod.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("marko", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOut(globalData: Any): AsyncStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createOut")(globalData.asInstanceOf[js.Any]).asInstanceOf[AsyncStream]
  
  inline def load(templatePath: String): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(templatePath.asInstanceOf[js.Any]).asInstanceOf[Template]
  inline def load(templatePath: String, options: TemplateOptions): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(templatePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Template]
  inline def load(templatePath: String, templateSrc: String): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(templatePath.asInstanceOf[js.Any], templateSrc.asInstanceOf[js.Any])).asInstanceOf[Template]
  inline def load(templatePath: String, templateSrc: String, options: TemplateOptions): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(templatePath.asInstanceOf[js.Any], templateSrc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Template]
  
  trait TemplateOptions extends StObject {
    
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    var writeToDisk: js.UndefOr[Boolean] = js.undefined
  }
  object TemplateOptions {
    
    inline def apply(): TemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setWriteToDisk(value: Boolean): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      inline def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
}
