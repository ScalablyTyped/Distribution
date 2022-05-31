package typings.jupyterlabInspector

import typings.jupyterlabInspector.handlerMod.InspectionHandler.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/inspector", "IInspector")
  @js.native
  val IInspector: Token[typings.jupyterlabInspector.tokensMod.IInspector] = js.native
  
  @JSImport("@jupyterlab/inspector", "InspectionHandler")
  @js.native
  class InspectionHandler protected ()
    extends typings.jupyterlabInspector.handlerMod.InspectionHandler {
    /**
      * Construct a new inspection handler for a widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/inspector", "InspectorPanel")
  @js.native
  /**
    * Construct an inspector.
    */
  class InspectorPanel ()
    extends typings.jupyterlabInspector.inspectorMod.InspectorPanel {
    def this(options: typings.jupyterlabInspector.inspectorMod.InspectorPanel.IOptions) = this()
  }
  /* static members */
  object InspectorPanel {
    
    @JSImport("@jupyterlab/inspector", "InspectorPanel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generate content widget from string
      */
    @JSImport("@jupyterlab/inspector", "InspectorPanel._generateContentWidget")
    @js.native
    def _generateContentWidget: js.Any = js.native
    inline def _generateContentWidget_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_generateContentWidget")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@jupyterlab/inspector", "KernelConnector")
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
