package typings.jupyterlabOutputarea

import typings.jupyterlabApputils.clientsessionMod.IClientSession
import typings.jupyterlabOutputarea.widgetMod.OutputArea.IOptions
import typings.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
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
    def execute(code: String, output: typings.jupyterlabOutputarea.widgetMod.OutputArea, session: IClientSession): js.Promise[IExecuteReplyMsg] = js.native
    def execute(
      code: String,
      output: typings.jupyterlabOutputarea.widgetMod.OutputArea,
      session: IClientSession,
      metadata: JSONObject
    ): js.Promise[IExecuteReplyMsg] = js.native
    def isIsolated(mimeType: String, metadata: ReadonlyJSONObject): Boolean = js.native
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

