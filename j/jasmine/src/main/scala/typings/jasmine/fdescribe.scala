package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("fdescribe")
@js.native
object fdescribe extends js.Object {
  /**
    * A focused `describe`. If suites or specs are focused, only those that are focused will be executed.
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  def apply(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
}

