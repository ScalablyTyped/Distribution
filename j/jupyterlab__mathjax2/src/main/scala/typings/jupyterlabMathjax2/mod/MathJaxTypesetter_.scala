package typings.jupyterlabMathjax2.mod

import typings.jupyterlabMathjax2.mod.MathJaxTypesetter.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/mathjax2", "MathJaxTypesetter")
@js.native
class MathJaxTypesetter_ protected () extends ILatexTypesetter {
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
