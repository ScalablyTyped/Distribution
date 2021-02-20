package typings.hermesProfileTransformer

import typings.hermesProfileTransformer.anon.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cpuprofileMod {
  
  @js.native
  trait CPUProfileChunk extends StObject {
    
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
    implicit class CPUProfileChunkMutableBuilder[Self <: CPUProfileChunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[CPUProfileChunkNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: CPUProfileChunkNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamples(value: js.Array[Double]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplesVarargs(value: Double*): Self = StObject.set(x, "samples", js.Array(value :_*))
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDeltas(value: js.Array[Double]): Self = StObject.set(x, "timeDeltas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDeltasVarargs(value: Double*): Self = StObject.set(x, "timeDeltas", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CPUProfileChunkNode extends StObject {
    
    var callFrame: Category = js.native
    
    var id: Double = js.native
    
    var parent: js.UndefOr[Double] = js.native
  }
  object CPUProfileChunkNode {
    
    @scala.inline
    def apply(callFrame: Category, id: Double): CPUProfileChunkNode = {
      val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPUProfileChunkNode]
    }
    
    @scala.inline
    implicit class CPUProfileChunkNodeMutableBuilder[Self <: CPUProfileChunkNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallFrame(value: Category): Self = StObject.set(x, "callFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  @js.native
  trait CPUProfileChunker extends StObject {
    
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
    implicit class CPUProfileChunkerMutableBuilder[Self <: CPUProfileChunker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: js.Array[CPUProfileChunkNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: CPUProfileChunkNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setSampleNumbers(value: js.Array[Double]): Self = StObject.set(x, "sampleNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleNumbersVarargs(value: Double*): Self = StObject.set(x, "sampleNumbers", js.Array(value :_*))
      
      @scala.inline
      def setTimeDeltas(value: js.Array[Double]): Self = StObject.set(x, "timeDeltas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDeltasVarargs(value: Double*): Self = StObject.set(x, "timeDeltas", js.Array(value :_*))
    }
  }
}
