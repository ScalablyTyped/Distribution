package typings.jupyterlabOutputarea

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabOutputarea.libWidgetMod.OutputArea.IOptions
import typings.jupyterlabServices.libKernelMessagesMod.IExecuteReplyMsg
import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/outputarea", "OutputArea")
  @js.native
  open class OutputArea protected ()
    extends typings.jupyterlabOutputarea.libWidgetMod.OutputArea {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
  }
  object OutputArea {
    
    @JSImport("@jupyterlab/outputarea", "OutputArea")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default implementation of `IContentFactory`.
      */
    @JSImport("@jupyterlab/outputarea", "OutputArea.ContentFactory")
    @js.native
    open class ContentFactory ()
      extends typings.jupyterlabOutputarea.libWidgetMod.OutputArea.ContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/outputarea", "OutputArea.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabOutputarea.libWidgetMod.OutputArea.ContentFactory = js.native
    
    /**
      * Execute code on an output area.
      */
    inline def execute(
      code: String,
      output: typings.jupyterlabOutputarea.libWidgetMod.OutputArea,
      sessionContext: ISessionContext
    ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(code.asInstanceOf[js.Any], output.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[IExecuteReplyMsg]]]
    inline def execute(
      code: String,
      output: typings.jupyterlabOutputarea.libWidgetMod.OutputArea,
      sessionContext: ISessionContext,
      metadata: JSONObject
    ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(code.asInstanceOf[js.Any], output.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[IExecuteReplyMsg]]]
    
    inline def isIsolated(mimeType: String, metadata: ReadonlyPartialJSONObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIsolated")(mimeType.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("@jupyterlab/outputarea", "OutputAreaModel")
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  open class OutputAreaModel ()
    extends typings.jupyterlabOutputarea.libModelMod.OutputAreaModel {
    def this(options: typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel.IOptions) = this()
  }
  object OutputAreaModel {
    
    /**
      * The default implementation of a `IModelOutputFactory`.
      */
    @JSImport("@jupyterlab/outputarea", "OutputAreaModel.ContentFactory")
    @js.native
    open class ContentFactory ()
      extends typings.jupyterlabOutputarea.libModelMod.OutputAreaModel.ContentFactory
    
    /**
      * The default output model factory.
      */
    @JSImport("@jupyterlab/outputarea", "OutputAreaModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabOutputarea.libModelMod.OutputAreaModel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/outputarea", "OutputPrompt")
  @js.native
  open class OutputPrompt ()
    extends typings.jupyterlabOutputarea.libWidgetMod.OutputPrompt
  
  @JSImport("@jupyterlab/outputarea", "SimplifiedOutputArea")
  @js.native
  open class SimplifiedOutputArea protected ()
    extends typings.jupyterlabOutputarea.libWidgetMod.SimplifiedOutputArea {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/outputarea", "Stdin")
  @js.native
  open class Stdin protected ()
    extends typings.jupyterlabOutputarea.libWidgetMod.Stdin {
    /**
      * Construct a new input widget.
      */
    def this(options: typings.jupyterlabOutputarea.libWidgetMod.Stdin.IOptions) = this()
  }
}
