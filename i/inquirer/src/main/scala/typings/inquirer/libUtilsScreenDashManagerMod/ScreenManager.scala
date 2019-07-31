package typings.inquirer.libUtilsScreenDashManagerMod

import typings.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to manage the content of a console-screen.
  */
trait ScreenManager extends js.Object {
  /**
    * Gets or sets the number of extra-lines below the prompt.
    */
  var extraLinesUnderPrompt: Double
  /**
    * Gets or sets the height of the screen.
    */
  var height: Double
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface
  /**
    * Splits the `text` into multiple lines with the specified max `width`.
    *
    * @param text
    * The text to process.
    *
    * @param width
    * The max width of each line.
    */
  /* protected */ def breakLines(text: String, width: Double): js.Array[String]
  /**
    * Cleans all lines expect the first `extraLines`.
    *
    * @param extraLines
    * The number of lines at the begin to skip.
    */
  def clean(extraLines: Double): Unit
  /**
    * Releases all unmanaged resources.
    */
  def done(): Unit
  /**
    * Adds line-breaks to the specified `text` with the specified max `width`.
    *
    * @param text
    * The text to process.
    *
    * @param width
    * The max width of each line.
    */
  /* protected */ def forceLineReturn(text: String, width: Double): String
  /**
    * Identifies the width of the screen.
    *
    * @returns
    * The width of the screen.
    */
  /* protected */ def normalizedCliWidth(): Double
  /**
    * Releases the cursor.
    */
  def releaseCursor(): Unit
  /**
    * Renders content to the screen.
    *
    * @param content
    * The content to render.
    *
    * @param bottomContent
    * The content to render to the bottom of the screen.
    */
  def render(content: String, bottomContent: String): Unit
}

object ScreenManager {
  @scala.inline
  def apply(
    breakLines: (String, Double) => js.Array[String],
    clean: Double => Unit,
    done: () => Unit,
    extraLinesUnderPrompt: Double,
    forceLineReturn: (String, Double) => String,
    height: Double,
    normalizedCliWidth: () => Double,
    releaseCursor: () => Unit,
    render: (String, String) => Unit,
    rl: Interface
  ): ScreenManager = {
    val __obj = js.Dynamic.literal(breakLines = js.Any.fromFunction2(breakLines), clean = js.Any.fromFunction1(clean), done = js.Any.fromFunction0(done), extraLinesUnderPrompt = extraLinesUnderPrompt, forceLineReturn = js.Any.fromFunction2(forceLineReturn), height = height, normalizedCliWidth = js.Any.fromFunction0(normalizedCliWidth), releaseCursor = js.Any.fromFunction0(releaseCursor), render = js.Any.fromFunction2(render), rl = rl)
  
    __obj.asInstanceOf[ScreenManager]
  }
}

