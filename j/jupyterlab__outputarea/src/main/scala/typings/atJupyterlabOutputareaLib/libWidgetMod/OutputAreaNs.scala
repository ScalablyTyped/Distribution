package typings
package atJupyterlabOutputareaLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea")
@js.native
object OutputAreaNs extends js.Object {
  /**
    * The default implementation of `IContentFactory`.
    */
  @js.native
  class ContentFactory () extends IContentFactory {
    /**
      * Create an output prompt.
      */
    /* CompleteClass */
    override def createOutputPrompt(): atJupyterlabOutputareaLib.libWidgetMod.IOutputPrompt = js.native
    /**
      * Create an stdin widget.
      */
    /* CompleteClass */
    override def createStdin(options: atJupyterlabOutputareaLib.libWidgetMod.StdinNs.IOptions): atJupyterlabOutputareaLib.libWidgetMod.IStdin = js.native
  }
  
  /**
    * An output area widget content factory.
    *
    * The content factory is used to create children in a way
    * that can be customized.
    */
  trait IContentFactory extends js.Object {
    /**
      * Create an output prompt.
      */
    def createOutputPrompt(): atJupyterlabOutputareaLib.libWidgetMod.IOutputPrompt
    /**
      * Create an stdin widget.
      */
    def createStdin(options: atJupyterlabOutputareaLib.libWidgetMod.StdinNs.IOptions): atJupyterlabOutputareaLib.libWidgetMod.IStdin
  }
  
  /**
    * The options to create an `OutputArea`.
    */
  trait IOptions extends js.Object {
    /**
      * The content factory used by the widget to create children.
      */
    var contentFactory: js.UndefOr[IContentFactory] = js.undefined
    /**
      * The model used by the widget.
      */
    var model: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModel
    /**
      * The rendermime instance used by the widget.
      */
    var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: ContentFactory = js.native
  /**
    * Execute code on an output area.
    */
  def execute(
    code: java.lang.String,
    output: atJupyterlabOutputareaLib.libWidgetMod.OutputArea,
    session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession
  ): js.Promise[atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg] = js.native
  def execute(
    code: java.lang.String,
    output: atJupyterlabOutputareaLib.libWidgetMod.OutputArea,
    session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): js.Promise[atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg] = js.native
}

