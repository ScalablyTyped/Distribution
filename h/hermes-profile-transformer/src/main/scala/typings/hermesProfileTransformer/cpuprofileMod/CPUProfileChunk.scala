package typings.hermesProfileTransformer.cpuprofileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPUProfileChunk extends js.Object {
  
  var id: String = js.native
  
  var nodes: js.Array[CPUProfileChunkNode] = js.native
  
  var pid: Double = js.native
  
  var samples: js.Array[Double] = js.native
  
  var startTime: Double = js.native
  
  var tid: String = js.native
  
  var timeDeltas: js.Array[Double] = js.native
}
object CPUProfileChunk {
  
  @scala.inline
  def apply(
    id: String,
    nodes: js.Array[CPUProfileChunkNode],
    pid: Double,
    samples: js.Array[Double],
    startTime: Double,
    tid: String,
    timeDeltas: js.Array[Double]
  ): CPUProfileChunk = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], timeDeltas = timeDeltas.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUProfileChunk]
  }
  
  @scala.inline
  implicit class CPUProfileChunkOps[Self <: CPUProfileChunk] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: CPUProfileChunkNode*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[CPUProfileChunkNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplesVarargs(value: Double*): Self = this.set("samples", js.Array(value :_*))
    
    @scala.inline
    def setSamples(value: js.Array[Double]): Self = this.set("samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTid(value: String): Self = this.set("tid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDeltasVarargs(value: Double*): Self = this.set("timeDeltas", js.Array(value :_*))
    
    @scala.inline
    def setTimeDeltas(value: js.Array[Double]): Self = this.set("timeDeltas", value.asInstanceOf[js.Any])
  }
}
