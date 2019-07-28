package typings.inquirer.inquirerMod.uiNs

import org.scalablytyped.runtime.Instantiable0
import typings.through.throughMod.ThroughStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky bottom bar user interface
  */
@js.native
trait BottomBar
  extends BaseUI
     with Instantiable0[BottomBar] {
  var log: ThroughStream = js.native
  def clean(): BottomBar = js.native
  /**
    * Make sure line end on a line feed
    * @param str Input string
    * @return The input string with a final line feed
    */
  def enforceLF(str: String): String = js.native
  /**
    * Render the prompt to screen
    * @return self
    */
  def render(): BottomBar = js.native
  /**
    * Update the bottom bar content and rerender
    * @param bottomBar Bottom bar content
    * @return self
    */
  def updateBottomBar(bottomBar: String): BottomBar = js.native
  /**
    * Helper for writing message in Prompt
    * @param message The message to be output
    */
  def write(message: String): Unit = js.native
  /**
    * Write out log data
    * @param {String} data - The log data to be output
    * @return self
    */
  def writeLog(data: String): BottomBar = js.native
}

