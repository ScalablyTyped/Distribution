package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("describe")
@js.native
object describe extends js.Object {
  /**
    * Create a group of specs (often called a suite).
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  def apply(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
}

