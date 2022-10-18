package typings.jupyterlabInspector

import typings.jupyterlabInspector.libHandlerMod.InspectionHandler.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/inspector", "IInspector")
  @js.native
  val IInspector: Token[typings.jupyterlabInspector.libTokensMod.IInspector] = js.native
  
  @JSImport("@jupyterlab/inspector", "InspectionHandler")
  @js.native
  open class InspectionHandler protected ()
    extends typings.jupyterlabInspector.libHandlerMod.InspectionHandler {
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
  open class InspectorPanel ()
    extends typings.jupyterlabInspector.libInspectorMod.InspectorPanel {
    def this(options: typings.jupyterlabInspector.libInspectorMod.InspectorPanel.IOptions) = this()
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
    def _generateContentWidget: Any = js.native
    inline def _generateContentWidget_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_generateContentWidget")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@jupyterlab/inspector", "KernelConnector")
  @js.native
  open class KernelConnector protected ()
    extends typings.jupyterlabInspector.libKernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for inspection requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: typings.jupyterlabInspector.libKernelconnectorMod.KernelConnector.IOptions) = this()
  }
}
