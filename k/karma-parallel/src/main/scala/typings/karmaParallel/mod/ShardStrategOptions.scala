package typings.karmaParallel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShardStrategOptions extends js.Object {
  /**
    * the string passed to the describe block (useful for gaining context of the current description)
    */
  val description: String
  /**
    * the total number of executors
    */
  val executors: Double
  /**
    * the 0-based index of the current executor
    */
  val shardIndex: Double
}

object ShardStrategOptions {
  @scala.inline
  def apply(description: String, executors: Double, shardIndex: Double): ShardStrategOptions = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executors = executors.asInstanceOf[js.Any], shardIndex = shardIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShardStrategOptions]
  }
}

