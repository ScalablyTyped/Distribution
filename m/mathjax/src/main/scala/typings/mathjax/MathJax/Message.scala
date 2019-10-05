package typings.mathjax.MathJax

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /*This causes the message with id n to be removed after the given delay, in milliseconds. The default delay is
    * 600 milliseconds.*/
  def Clear(n: Double, delay: Double): Unit
  /*This sets the message area to a “Loading file” message, where file is the name of the file (with [MathJax]
    * representing the root directory).
    */
  def File(file: String): Double
  /*Returns a string of all the messages issued so far, separated by newlines. This is used in debugging MathJax
    * operations.
    */
  def Log(): String
  /*This removes the message frame from the window (it will reappear when future messages are set, however).*/
  def Remove(): Unit
  /*This sets the message being displayed to the given message string. If n is not null, it represents a message
    * id number and the text is set for that message id, otherwise a new id number is created for this message. If
    * delay is provided, it is the time (in milliseconds) to display the message before it is cleared. If delay is
    * not provided, the message will not be removed automatically; you must call the MathJax.Messsage.Clear() method
    * by hand to remove it. If message is an array, then it represents a localizable string, as described in the
    * Localization strings documentation.
    */
  def Set(message: String, n: Double, delay: Double): Double
  /*This method is called on each message before it is displayed. It can be used to modify (e.g., shorten) the
    * various messages before they are displayed. The default action is to check if the messageStyle configuration
    * parameter is simple, and if so, convert loading and processing messages to a simpler form. This method can be
    * overridden to perform other sanitization of the message strings.
    */
  def filterText(text: String, n: Double): String
}

@JSGlobal("MathJax.Message")
@js.native
object Message extends TopLevel[Message]

