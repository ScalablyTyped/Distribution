package typings.hermesProfileTransformer.cpuprofileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPUProfileChunker extends js.Object {
  
  var nodes: js.Array[CPUProfileChunkNode] = js.native
  
  var sampleNumbers: js.Array[Double] = js.native
  
  var timeDeltas: js.Array[Double] = js.native
}
object CPUProfileChunker {
  
  @scala.inline
  def apply(
    nodes: js.Array[CPUProfileChunkNode],
    sampleNumbers: js.Array[Double],
    timeDeltas: js.Array[Double]
  ): CPUProfileChunker = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], sampleNumbers = sampleNumbers.asInstanceOf[js.Any], timeDeltas = timeDeltas.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUProfileChunker]
  }
  
  @scala.inline
  implicit class CPUProfileChunkerOps[Self <: CPUProfileChunker] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: CPUProfileChunkNode*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[CPUProfileChunkNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleNumbersVarargs(value: Double*): Self = this.set("sampleNumbers", js.Array(value :_*))
    
    @scala.inline
    def setSampleNumbers(value: js.Array[Double]): Self = this.set("sampleNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDeltasVarargs(value: Double*): Self = this.set("timeDeltas", js.Array(value :_*))
    
    @scala.inline
    def setTimeDeltas(value: js.Array[Double]): Self = this.set("timeDeltas", value.asInstanceOf[js.Any])
  }
}
