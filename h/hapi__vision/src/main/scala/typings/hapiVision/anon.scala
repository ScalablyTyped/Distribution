package typings.hapiVision

import typings.hapiVision.mod.ViewHandlerOrReplyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Context extends StObject {
    
    /** optional object used by the template to render context-specific result. Defaults to no context {}. */
    var context: js.UndefOr[js.Object] = js.undefined
    
    /**
      * optional object used to override the server's views manager configuration for this response.
      * Cannot override isCached, partialsPath, or helpersPath which are only loaded at initialization.
      * TODO check if it can have `defaultExtension`.
      */
    var options: js.UndefOr[ViewHandlerOrReplyOptions] = js.undefined
    
    /** the template filename and path, relative to the templates path configured via the server views manager. */
    var template: String
  }
  object Context {
    
    inline def apply(template: String): Context = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setOptions(value: ViewHandlerOrReplyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
