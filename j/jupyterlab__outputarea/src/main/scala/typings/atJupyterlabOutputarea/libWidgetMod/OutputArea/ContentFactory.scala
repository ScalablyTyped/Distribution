package typings.atJupyterlabOutputarea.libWidgetMod.OutputArea

import typings.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.ContentFactory")
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
  override def createStdin(options: typings.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin = js.native
}

