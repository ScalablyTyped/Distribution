package typings.hermesProfileTransformer

import typings.hermesProfileTransformer.anon.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cpuprofileMod {
  
  trait CPUProfileChunk extends StObject {
    
    var id: String
    
    var nodes: js.Array[CPUProfileChunkNode]
    
    var pid: Double
    
    var samples: js.Array[Double]
    
    var startTime: Double
    
    var tid: String
    
    var timeDeltas: js.Array[Double]
  }
  object CPUProfileChunk {
    
    inline def apply(
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
    
    extension [Self <: CPUProfileChunk](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[CPUProfileChunkNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: CPUProfileChunkNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setSamples(value: js.Array[Double]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesVarargs(value: Double*): Self = StObject.set(x, "samples", js.Array(value :_*))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      inline def setTimeDeltas(value: js.Array[Double]): Self = StObject.set(x, "timeDeltas", value.asInstanceOf[js.Any])
      
      inline def setTimeDeltasVarargs(value: Double*): Self = StObject.set(x, "timeDeltas", js.Array(value :_*))
    }
  }
  
  trait CPUProfileChunkNode extends StObject {
    
    var callFrame: Category
    
    var id: Double
    
    var parent: js.UndefOr[Double] = js.undefined
  }
  object CPUProfileChunkNode {
    
    inline def apply(callFrame: Category, id: Double): CPUProfileChunkNode = {
      val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPUProfileChunkNode]
    }
    
    extension [Self <: CPUProfileChunkNode](x: Self) {
      
      inline def setCallFrame(value: Category): Self = StObject.set(x, "callFrame", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  trait CPUProfileChunker extends StObject {
    
    var nodes: js.Array[CPUProfileChunkNode]
    
    var sampleNumbers: js.Array[Double]
    
    var timeDeltas: js.Array[Double]
  }
  object CPUProfileChunker {
    
    inline def apply(
      nodes: js.Array[CPUProfileChunkNode],
      sampleNumbers: js.Array[Double],
      timeDeltas: js.Array[Double]
    ): CPUProfileChunker = {
      val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], sampleNumbers = sampleNumbers.asInstanceOf[js.Any], timeDeltas = timeDeltas.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPUProfileChunker]
    }
    
    extension [Self <: CPUProfileChunker](x: Self) {
      
      inline def setNodes(value: js.Array[CPUProfileChunkNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: CPUProfileChunkNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      inline def setSampleNumbers(value: js.Array[Double]): Self = StObject.set(x, "sampleNumbers", value.asInstanceOf[js.Any])
      
      inline def setSampleNumbersVarargs(value: Double*): Self = StObject.set(x, "sampleNumbers", js.Array(value :_*))
      
      inline def setTimeDeltas(value: js.Array[Double]): Self = StObject.set(x, "timeDeltas", value.asInstanceOf[js.Any])
      
      inline def setTimeDeltasVarargs(value: Double*): Self = StObject.set(x, "timeDeltas", js.Array(value :_*))
    }
  }
}
