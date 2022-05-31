package typings.jupyterlabOutputarea

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabOutputarea.widgetMod.OutputArea.IOptions
import typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/outputarea", "OutputArea")
  @js.native
  class OutputArea protected ()
    extends typings.jupyterlabOutputarea.widgetMod.OutputArea {
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
    class ContentFactory ()
      extends typings.jupyterlabOutputarea.widgetMod.OutputArea.ContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/outputarea", "OutputArea.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabOutputarea.widgetMod.OutputArea.ContentFactory = js.native
    
    /**
      * Execute code on an output area.
      */
    inline def execute(
      code: String,
      output: typings.jupyterlabOutputarea.widgetMod.OutputArea,
      sessionContext: ISessionContext
    ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(code.asInstanceOf[js.Any], output.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[IExecuteReplyMsg]]]
    inline def execute(
      code: String,
      output: typings.jupyterlabOutputarea.widgetMod.OutputArea,
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
  class OutputAreaModel ()
    extends typings.jupyterlabOutputarea.modelMod.OutputAreaModel {
    def this(options: typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions) = this()
  }
  object OutputAreaModel {
    
    /**
      * The default implementation of a `IModelOutputFactory`.
      */
    @JSImport("@jupyterlab/outputarea", "OutputAreaModel.ContentFactory")
    @js.native
    class ContentFactory ()
      extends typings.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory
    
    /**
      * The default output model factory.
      */
    @JSImport("@jupyterlab/outputarea", "OutputAreaModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/outputarea", "OutputPrompt")
  @js.native
  class OutputPrompt ()
    extends typings.jupyterlabOutputarea.widgetMod.OutputPrompt
  
  @JSImport("@jupyterlab/outputarea", "SimplifiedOutputArea")
  @js.native
  class SimplifiedOutputArea protected ()
    extends typings.jupyterlabOutputarea.widgetMod.SimplifiedOutputArea {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/outputarea", "Stdin")
  @js.native
  class Stdin protected ()
    extends typings.jupyterlabOutputarea.widgetMod.Stdin {
    /**
      * Construct a new input widget.
      */
    def this(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions) = this()
  }
}
