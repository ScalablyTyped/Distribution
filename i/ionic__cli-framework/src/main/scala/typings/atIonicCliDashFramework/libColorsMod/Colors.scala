package typings.atIonicCliDashFramework.libColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colors extends js.Object {
  /**
    * Used to mark text as ancillary or supportive.
    */
  @JSName("ancillary")
  var ancillary_Original: ColorFunction = js.native
  /**
    * Used to mark text as failed.
    */
  @JSName("failure")
  var failure_Original: ColorFunction = js.native
  var help: HelpColors = js.native
  /**
    * Used to mark text as input such as commands, inputs, options, etc.
    */
  @JSName("input")
  var input_Original: ColorFunction = js.native
  var log: LoggerColors = js.native
  /**
    * Used to mark text as important. Comparable to HTML's <strong>.
    */
  @JSName("strong")
  var strong_Original: ColorFunction = js.native
  /**
    * Used to mark text as successful.
    */
  @JSName("success")
  var success_Original: ColorFunction = js.native
  /**
    * Used to mark text as less important.
    */
  @JSName("weak")
  var weak_Original: ColorFunction = js.native
  /**
    * Used to mark text as ancillary or supportive.
    */
  def ancillary(text: String*): String = js.native
  /**
    * Used to mark text as failed.
    */
  def failure(text: String*): String = js.native
  /**
    * Used to mark text as input such as commands, inputs, options, etc.
    */
  def input(text: String*): String = js.native
  /**
    * Used to mark text as important. Comparable to HTML's <strong>.
    */
  def strong(text: String*): String = js.native
  /**
    * Used to mark text as successful.
    */
  def success(text: String*): String = js.native
  /**
    * Used to mark text as less important.
    */
  def weak(text: String*): String = js.native
}

