package typings.karmaParallel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShardStrategOptions extends js.Object {
  
  /**
    * the string passed to the describe block (useful for gaining context of the current description)
    */
  val description: String = js.native
  
  /**
    * the total number of executors
    */
  val executors: Double = js.native
  
  /**
    * the 0-based index of the current executor
    */
  val shardIndex: Double = js.native
}
object ShardStrategOptions {
  
  @scala.inline
  def apply(description: String, executors: Double, shardIndex: Double): ShardStrategOptions = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executors = executors.asInstanceOf[js.Any], shardIndex = shardIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardStrategOptions]
  }
  
  @scala.inline
  implicit class ShardStrategOptionsOps[Self <: ShardStrategOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutors(value: Double): Self = this.set("executors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardIndex(value: Double): Self = this.set("shardIndex", value.asInstanceOf[js.Any])
  }
}
