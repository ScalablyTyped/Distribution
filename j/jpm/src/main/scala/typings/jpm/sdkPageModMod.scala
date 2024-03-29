package typings.jpm

import typings.jpm.anon.AttachTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Run scripts in the context of web pages whose URL matches a given pattern
  */
object sdkPageModMod {
  
  trait PageMod extends StObject {
    
    def destroy(): Unit
    
    var include: String | (js.Array[js.RegExp | String]) | js.RegExp
  }
  object PageMod {
    
    @JSImport("sdk/page-mod", "PageMod")
    @js.native
    def apply(options: AttachTo): PageMod = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageMod] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setInclude(value: String | (js.Array[js.RegExp | String]) | js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jpm.jpmStrings.existing
    - typings.jpm.jpmStrings.top
    - typings.jpm.jpmStrings.frame
  */
  trait attachmentMode extends StObject
  object attachmentMode {
    
    inline def existing: typings.jpm.jpmStrings.existing = "existing".asInstanceOf[typings.jpm.jpmStrings.existing]
    
    inline def frame: typings.jpm.jpmStrings.frame = "frame".asInstanceOf[typings.jpm.jpmStrings.frame]
    
    inline def top: typings.jpm.jpmStrings.top = "top".asInstanceOf[typings.jpm.jpmStrings.top]
  }
}
