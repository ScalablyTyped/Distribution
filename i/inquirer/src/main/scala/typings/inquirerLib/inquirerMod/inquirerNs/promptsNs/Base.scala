package typings
package inquirerLib.inquirerMod.inquirerNs.promptsNs

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
  extends org.scalablytyped.runtime.Instantiable3[
      /* question */ inquirerLib.inquirerMod.inquirerNs.Question[js.Object], 
      /* rl */ nodeLib.readlineMod.Interface, 
      /* answers */ inquirerLib.inquirerMod.inquirerNs.Answers, 
      Base
    ] {
  /**
    * Called when the UI closes. Override to do any specific cleanup necessary
    */
  def close(): scala.Unit = js.native
  /**
    * Generate the prompt question string
    */
  def getQuestion(): java.lang.String = js.native
  /**
    * Start the Inquiry session and manage output value filtering
    *
    * @returns {Promise<any>}
    * @memberof Base
    */
  def run(): js.Promise[_] = js.native
}

