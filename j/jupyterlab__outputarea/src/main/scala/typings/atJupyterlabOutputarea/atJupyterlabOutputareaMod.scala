package typings.atJupyterlabOutputarea

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabOutputarea.libWidgetMod.OutputArea.IOptions
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteReplyMsg
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea", JSImport.Namespace)
@js.native
object atJupyterlabOutputareaMod extends js.Object {
  @js.native
  class OutputArea protected ()
    extends typings.atJupyterlabOutputarea.libWidgetMod.OutputArea {
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
    extends typings.atJupyterlabOutputarea.libModelMod.OutputAreaModel {
    def this(options: typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModel.IOptions) = this()
  }
  
  @js.native
  class OutputPrompt ()
    extends typings.atJupyterlabOutputarea.libWidgetMod.OutputPrompt
  
  @js.native
  class SimplifiedOutputArea ()
    extends typings.atJupyterlabOutputarea.libWidgetMod.SimplifiedOutputArea
  
  @js.native
  class Stdin protected ()
    extends typings.atJupyterlabOutputarea.libWidgetMod.Stdin {
    /**
      * Construct a new input widget.
      */
    def this(options: typings.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions) = this()
  }
  
  @js.native
  object OutputArea extends js.Object {
    /**
      * The default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typings.atJupyterlabOutputarea.libWidgetMod.OutputArea.ContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    val defaultContentFactory: typings.atJupyterlabOutputarea.libWidgetMod.OutputArea.ContentFactory = js.native
    /**
      * Execute code on an output area.
      */
    def execute(
      code: String,
      output: typings.atJupyterlabOutputarea.libWidgetMod.OutputArea,
      session: IClientSession
    ): js.Promise[IExecuteReplyMsg] = js.native
    def execute(
      code: String,
      output: typings.atJupyterlabOutputarea.libWidgetMod.OutputArea,
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
      extends typings.atJupyterlabOutputarea.libModelMod.OutputAreaModel.ContentFactory
    
    /**
      * The default output model factory.
      */
    val defaultContentFactory: typings.atJupyterlabOutputarea.libModelMod.OutputAreaModel.ContentFactory = js.native
  }
  
}

