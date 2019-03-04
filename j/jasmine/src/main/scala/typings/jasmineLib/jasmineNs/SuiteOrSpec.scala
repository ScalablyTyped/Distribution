package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteOrSpec extends js.Object {
  var description: java.lang.String
  var env: Env
  var id: scala.Double
  var queue: Queue
}

object SuiteOrSpec {
  @scala.inline
  def apply(description: java.lang.String, env: Env, id: scala.Double, queue: Queue): SuiteOrSpec = {
    val __obj = js.Dynamic.literal(description = description, env = env, id = id, queue = queue)
  
    __obj.asInstanceOf[SuiteOrSpec]
  }
}

