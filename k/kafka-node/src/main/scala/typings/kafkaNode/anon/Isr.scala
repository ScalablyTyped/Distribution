package typings.kafkaNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Isr extends js.Object {
  
  var isr: js.Array[Double] = js.native
  
  var leader: Double = js.native
  
  var partition: Double = js.native
  
  var replicas: js.Array[Double] = js.native
  
  var topic: String = js.native
}
object Isr {
  
  @scala.inline
  def apply(
    isr: js.Array[Double],
    leader: Double,
    partition: Double,
    replicas: js.Array[Double],
    topic: String
  ): Isr = {
    val __obj = js.Dynamic.literal(isr = isr.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Isr]
  }
  
  @scala.inline
  implicit class IsrOps[Self <: Isr] (val x: Self) extends AnyVal {
    
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
    def setIsrVarargs(value: Double*): Self = this.set("isr", js.Array(value :_*))
    
    @scala.inline
    def setIsr(value: js.Array[Double]): Self = this.set("isr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeader(value: Double): Self = this.set("leader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: Double): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasVarargs(value: Double*): Self = this.set("replicas", js.Array(value :_*))
    
    @scala.inline
    def setReplicas(value: js.Array[Double]): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
  }
}
