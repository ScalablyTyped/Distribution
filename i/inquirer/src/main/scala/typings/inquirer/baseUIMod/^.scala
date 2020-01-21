package typings.inquirer.baseUIMod

import typings.inquirer.mod.StreamOptions
import typings.inquirer.mod.prompts.PromptBase
import typings.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a ui.
  */
@JSImport("inquirer/lib/ui/baseUI", JSImport.Namespace)
@js.native
/**
  * Initializes a new instance of the `UI` class.
  *
  * @param options
  * The input- and output-stream of the ui.
  */
class ^ () extends UI {
  def this(options: StreamOptions) = this()
  /**
    * Gets or sets the currently active prompt.
    */
  /* CompleteClass */
  override var activePrompt: PromptBase = js.native
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  /* CompleteClass */
  override var rl: Interface = js.native
  /**
    * Releases all unmanaged resources.
    */
  /* CompleteClass */
  /* protected */ override def close(): Unit = js.native
  /**
    * Handles a forced exit of the application.
    */
  /* CompleteClass */
  /* protected */ override def onForceClose(): Unit = js.native
}

