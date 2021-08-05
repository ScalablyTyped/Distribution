package typings.jupyterlabMathjax2

import typings.jupyterlabMathjax2.mod.MathJaxTypesetter.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/mathjax2", "MathJaxTypesetter")
  @js.native
  class MathJaxTypesetter protected ()
    extends StObject
       with ILatexTypesetter {
    /**
      * Create a new MathJax typesetter.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _config: js.Any = js.native
    
    /**
      * Initialize MathJax.
      */
    /* private */ var _init: js.Any = js.native
    
    /* private */ var _initPromise: js.Any = js.native
    
    /* private */ var _initialized: js.Any = js.native
    
    /**
      * Handle MathJax loading.
      */
    /* private */ var _onLoad: js.Any = js.native
    
    /* private */ var _url: js.Any = js.native
    
    /**
      * Typeset a DOM element.
      *
      * @param element - the DOM element to typeset. The typesetting may
      *   happen synchronously or asynchronously.
      *
      * #### Notes
      * The application-wide rendermime object has a settable
      * `latexTypesetter` property which is used wherever LaTeX
      * typesetting is required. Extensions wishing to provide their
      * own typesetter may replace that on the global `lab.rendermime`.
      */
    /* CompleteClass */
    override def typeset(element: HTMLElement): Unit = js.native
  }
  object MathJaxTypesetter {
    
    /**
      * MathJaxTypesetter constructor options.
      */
    trait IOptions extends StObject {
      
      /**
        * A configuration string to compose into the MathJax URL.
        */
      var config: String
      
      /**
        * The url to load MathJax from.
        */
      var url: String
    }
    object IOptions {
      
      inline def apply(config: String, url: String): IOptions = {
        val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
