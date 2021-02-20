package typings.jupyterlabMathjax2

import typings.jupyterlabMathjax2.mod.MathJaxTypesetter.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/mathjax2", "MathJaxTypesetter")
  @js.native
  class MathJaxTypesetter protected () extends ILatexTypesetter {
    /**
      * Create a new MathJax typesetter.
      */
    def this(options: IOptions) = this()
    
    var _config: js.Any = js.native
    
    /**
      * Initialize MathJax.
      */
    var _init: js.Any = js.native
    
    var _initPromise: js.Any = js.native
    
    var _initialized: js.Any = js.native
    
    /**
      * Handle MathJax loading.
      */
    var _onLoad: js.Any = js.native
    
    var _url: js.Any = js.native
  }
  object MathJaxTypesetter {
    
    /**
      * MathJaxTypesetter constructor options.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A configuration string to compose into the MathJax URL.
        */
      var config: String = js.native
      
      /**
        * The url to load MathJax from.
        */
      var url: String = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(config: String, url: String): IOptions = {
        val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
