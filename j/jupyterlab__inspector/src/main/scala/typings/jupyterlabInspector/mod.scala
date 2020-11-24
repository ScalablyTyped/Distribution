package typings.jupyterlabInspector

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabInspector.handlerMod.InspectionHandler.IOptions
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/inspector", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object IInspector
    extends TopLevel[Token[typings.jupyterlabInspector.tokensMod.IInspector]]
  
  @js.native
  class InspectionHandler protected ()
    extends typings.jupyterlabInspector.handlerMod.InspectionHandler {
    /**
      * Construct a new inspection handler for a widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct an inspector.
    */
  class InspectorPanel ()
    extends typings.jupyterlabInspector.inspectorMod.InspectorPanel {
    def this(options: typings.jupyterlabInspector.inspectorMod.InspectorPanel.IOptions) = this()
  }
  /* static members */
  @js.native
  object InspectorPanel extends js.Object {
    
    /**
      * Generate content widget from string
      */
    var _generateContentWidget: js.Any = js.native
  }
  
  @js.native
  class KernelConnector protected ()
    extends typings.jupyterlabInspector.kernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for inspection requests.
      *
      * @param options - The instatiation options for the kernel connector.
      */
    def this(options: typings.jupyterlabInspector.kernelconnectorMod.KernelConnector.IOptions) = this()
  }
}
