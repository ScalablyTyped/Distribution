package typings.atJupyterlabOutputarea.libWidgetMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModel
import typings.atJupyterlabOutputarea.libWidgetMod.OutputAreaNs.ContentFactory
import typings.atJupyterlabOutputarea.libWidgetMod.OutputAreaNs.IContentFactory
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
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
    override def createOutputPrompt(): IOutputPrompt = js.native
    /**
      * Create an stdin widget.
      */
    /* CompleteClass */
    override def createStdin(options: typings.atJupyterlabOutputarea.libWidgetMod.StdinNs.IOptions): IStdin = js.native
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
    def createOutputPrompt(): IOutputPrompt
    /**
      * Create an stdin widget.
      */
    def createStdin(options: typings.atJupyterlabOutputarea.libWidgetMod.StdinNs.IOptions): IStdin
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
    var model: IOutputAreaModel
    /**
      * The rendermime instance used by the widget.
      */
    var rendermime: IRenderMimeRegistry
  }
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: ContentFactory = js.native
  /**
    * Execute code on an output area.
    */
  def execute(code: String, output: OutputArea, session: IClientSession): js.Promise[IExecuteReplyMsg] = js.native
  def execute(code: String, output: OutputArea, session: IClientSession, metadata: JSONObject): js.Promise[IExecuteReplyMsg] = js.native
  def isIsolated(mimeType: String, metadata: ReadonlyJSONObject): Boolean = js.native
}

