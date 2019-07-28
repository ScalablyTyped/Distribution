package typings.inquirer.inquirerMod.promptsNs

import org.scalablytyped.runtime.Instantiable3
import typings.inquirer.inquirerMod.Question
import typings.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base prompt implementation
  * Should be extended by prompt types.
  *
  * @interface Base
  */
@js.native
trait Base
  extends Instantiable3[/* question */ Question[js.Object], /* rl */ Interface, /* answers */ js.Object, Base] {
  /**
    * Called when the UI closes. Override to do any specific cleanup necessary
    */
  def close(): Unit = js.native
  /**
    * Generate the prompt question string
    */
  def getQuestion(): String = js.native
  /**
    * Start the Inquiry session and manage output value filtering
    *
    * @returns {Promise<any>}
    * @memberof Base
    */
  def run(): js.Promise[_] = js.native
}

