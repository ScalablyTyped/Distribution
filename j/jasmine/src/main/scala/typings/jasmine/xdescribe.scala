package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("xdescribe")
@js.native
object xdescribe extends js.Object {
  /**
    * A temporarily disabled `describe`. Specs within an xdescribe will be marked pending and not executed.
    * @param description Textual description of the group
    * @param specDefinitions Function for Jasmine to invoke that will define inner suites a specs
    */
  def apply(description: String, specDefinitions: js.Function0[Unit]): Unit = js.native
}

