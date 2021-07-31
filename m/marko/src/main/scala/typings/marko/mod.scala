package typings.marko

import typings.marko.htmlMod.AsyncStream
import typings.marko.htmlMod.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("marko", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createOut(globalData: js.Any): AsyncStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createOut")(globalData.asInstanceOf[js.Any]).asInstanceOf[AsyncStream]
  
  @scala.inline
  def load(templatePath: String): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(templatePath.asInstanceOf[js.Any]).asInstanceOf[Template]
  @scala.inline
  def load(templatePath: String, options: TemplateOptions): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(templatePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Template]
  @scala.inline
  def load(templatePath: String, templateSrc: String): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(templatePath.asInstanceOf[js.Any], templateSrc.asInstanceOf[js.Any])).asInstanceOf[Template]
  @scala.inline
  def load(templatePath: String, templateSrc: String, options: TemplateOptions): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(templatePath.asInstanceOf[js.Any], templateSrc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Template]
  
  trait TemplateOptions extends StObject {
    
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    var writeToDisk: js.UndefOr[Boolean] = js.undefined
  }
  object TemplateOptions {
    
    @scala.inline
    def apply(): TemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateOptions]
    }
    
    @scala.inline
    implicit class TemplateOptionsMutableBuilder[Self <: TemplateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setWriteToDisk(value: Boolean): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
}
