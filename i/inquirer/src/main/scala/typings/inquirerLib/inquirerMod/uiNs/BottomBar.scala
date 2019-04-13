package typings
package inquirerLib.inquirerMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky bottom bar user interface
  */
@js.native
trait BottomBar
  extends BaseUI
     with org.scalablytyped.runtime.Instantiable0[BottomBar] {
  var log: throughLib.throughMod.ThroughStream = js.native
  def clean(): BottomBar = js.native
  /**
    * Make sure line end on a line feed
    * @param str Input string
    * @return The input string with a final line feed
    */
  def enforceLF(str: java.lang.String): java.lang.String = js.native
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
  def updateBottomBar(bottomBar: java.lang.String): BottomBar = js.native
  /**
    * Helper for writing message in Prompt
    * @param message The message to be output
    */
  def write(message: java.lang.String): scala.Unit = js.native
  /**
    * Write out log data
    * @param {String} data - The log data to be output
    * @return self
    */
  def writeLog(data: java.lang.String): BottomBar = js.native
}

