package typings.jupyterlabOutputarea

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabOutputarea.widgetMod.OutputArea.IOptions
import typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class OutputArea protected ()
    extends typings.jupyterlabOutputarea.widgetMod.OutputArea {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class OutputAreaModel ()
    extends typings.jupyterlabOutputarea.modelMod.OutputAreaModel {
    def this(options: typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions) = this()
  }
  
  @js.native
  class OutputPrompt ()
    extends typings.jupyterlabOutputarea.widgetMod.OutputPrompt
  
  @js.native
  class SimplifiedOutputArea ()
    extends typings.jupyterlabOutputarea.widgetMod.SimplifiedOutputArea
  
  @js.native
  class Stdin protected ()
    extends typings.jupyterlabOutputarea.widgetMod.Stdin {
    /**
      * Construct a new input widget.
      */
    def this(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions) = this()
  }
  
  @js.native
  object OutputArea extends js.Object {
    /**
      * The default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typings.jupyterlabOutputarea.widgetMod.OutputArea.ContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    val defaultContentFactory: typings.jupyterlabOutputarea.widgetMod.OutputArea.ContentFactory = js.native
    /**
      * Execute code on an output area.
      */
    def execute(
      code: String,
      output: typings.jupyterlabOutputarea.widgetMod.OutputArea,
      sessionContext: ISessionContext
    ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
    def execute(
      code: String,
      output: typings.jupyterlabOutputarea.widgetMod.OutputArea,
      sessionContext: ISessionContext,
      metadata: JSONObject
    ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
    def isIsolated(mimeType: String, metadata: ReadonlyPartialJSONObject): Boolean = js.native
  }
  
  @js.native
  object OutputAreaModel extends js.Object {
    /**
      * The default implementation of a `IModelOutputFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typings.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory
    
    /**
      * The default output model factory.
      */
    val defaultContentFactory: typings.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory = js.native
  }
  
}

