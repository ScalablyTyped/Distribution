package typings.jasmine.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteOrSpec extends js.Object {
  var description: String
  var env: Env
  var id: Double
  var queue: Queue
}

object SuiteOrSpec {
  @scala.inline
  def apply(description: String, env: Env, id: Double, queue: Queue): SuiteOrSpec = {
    val __obj = js.Dynamic.literal(description = description, env = env, id = id, queue = queue)
  
    __obj.asInstanceOf[SuiteOrSpec]
  }
}

