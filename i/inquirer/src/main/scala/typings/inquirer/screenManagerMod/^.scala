package typings.inquirer.screenManagerMod

import typings.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to manage the content of a console-screen.
  */
@JSImport("inquirer/lib/utils/screen-manager", JSImport.Namespace)
@js.native
class ^ protected () extends ScreenManager {
  /**
    * Initializes a new instance of the `ScreenManager` class.
    *
    * @param readLine
    * An object for performing read from and write to the console.
    */
  def this(readLine: Interface) = this()
  /**
    * Gets or sets the number of extra-lines below the prompt.
    */
  /* CompleteClass */
  override var extraLinesUnderPrompt: Double = js.native
  /**
    * Gets or sets the height of the screen.
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  /* CompleteClass */
  override var rl: Interface = js.native
  /**
    * Splits the `text` into multiple lines with the specified max `width`.
    *
    * @param text
    * The text to process.
    *
    * @param width
    * The max width of each line.
    */
  /* CompleteClass */
  /* protected */ override def breakLines(text: String, width: Double): js.Array[String] = js.native
  /**
    * Cleans all lines expect the first `extraLines`.
    *
    * @param extraLines
    * The number of lines at the begin to skip.
    */
  /* CompleteClass */
  override def clean(extraLines: Double): Unit = js.native
  /**
    * Releases all unmanaged resources.
    */
  /* CompleteClass */
  override def done(): Unit = js.native
  /**
    * Adds line-breaks to the specified `text` with the specified max `width`.
    *
    * @param text
    * The text to process.
    *
    * @param width
    * The max width of each line.
    */
  /* CompleteClass */
  /* protected */ override def forceLineReturn(text: String, width: Double): String = js.native
  /**
    * Identifies the width of the screen.
    *
    * @returns
    * The width of the screen.
    */
  /* CompleteClass */
  /* protected */ override def normalizedCliWidth(): Double = js.native
  /**
    * Releases the cursor.
    */
  /* CompleteClass */
  override def releaseCursor(): Unit = js.native
  /**
    * Renders content to the screen.
    *
    * @param content
    * The content to render.
    *
    * @param bottomContent
    * The content to render to the bottom of the screen.
    */
  /* CompleteClass */
  override def render(content: String, bottomContent: String): Unit = js.native
}

