package typings.hermesProfileTransformer

import org.scalablytyped.runtime.TopLevel
import typings.hermesProfileTransformer.cpuprofileMod.CPUProfileChunk
import typings.hermesProfileTransformer.cpuprofileMod.CPUProfileChunkNode
import typings.hermesProfileTransformer.cpuprofileMod.CPUProfileChunker
import typings.hermesProfileTransformer.eventInterfacesMod.DurationEvent
import typings.hermesProfileTransformer.hermesProfileMod.HermesCPUProfile
import typings.hermesProfileTransformer.hermesProfileMod.HermesSample
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cpuProfilerModelMod {
  
  @JSImport("hermes-profile-transformer/dist/profiler/cpuProfilerModel", "CpuProfilerModel")
  @js.native
  class CpuProfilerModel protected () extends StObject {
    def this(profile: CPUProfileChunk) = this()
    
    var _activeNodeArraysById: Map[Double, js.Array[Double]] = js.native
    
    /**
      * Initialization function to enable O(1) access to the set of active nodes in the stack by node ID.
      * @return Map<number, number[]>
      */
    def _createActiveNodeArrays(): Map[Double, js.Array[Double]] = js.native
    
    /**
      * Initialization function to enable O(1) access to nodes by node ID.
      * @return {Map<number, CPUProfileChunkNode}
      */
    def _createNodeMap(): Map[Double, CPUProfileChunkNode] = js.native
    
    /**
      * Generates the necessary B/E-style trace events for a single transition from stack A to stack B
      * at the given timestamp.
      *
      * Example:
      *
      *    timestamp 1234
      *    previousNodeIds 1,2,3
      *    currentNodeIds 1,2,4
      *
      *    yields [end 3 at ts 1234, begin 4 at ts 1234]
      *
      * @param {number} timestamp
      * @param {Array<number>} previousNodeIds
      * @param {Array<number>} currentNodeIds
      * @returns {Array<DurationEvent>}
      */
    def _createStartEndEventsForTransition(timestamp: Double, previousNodeIds: js.Array[Double], currentNodeIds: js.Array[Double]): js.Array[DurationEvent] = js.native
    
    /**
      * Returns all the node IDs in a stack when a specific nodeId is at the top of the stack
      * (i.e. a stack's node ID and the node ID of all of its parents).
      */
    def _getActiveNodeIds(nodeId: Double): js.Array[Double] = js.native
    
    var _nodesById: Map[Double, CPUProfileChunkNode] = js.native
    
    var _profile: CPUProfileChunk = js.native
    
    /**
      * Creates B/E-style trace events from a CpuProfile object created by `collectProfileEvents()`
      * @return {DurationEvent}
      * @throws If the length of timeDeltas array or the samples array does not match with the length of samples in Hermes Profile
      */
    def createStartEndEvents(): js.Array[DurationEvent] = js.native
  }
  /* static members */
  object CpuProfilerModel {
    
    @JSImport("hermes-profile-transformer/dist/profiler/cpuProfilerModel", "CpuProfilerModel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts the Hermes Sample into a single CpuProfileChunk object for consumption
      * by `createStartEndEvents()`.
      *
      * @param {HermesCPUProfile} profile
      * @throws Profile must have at least one sample
      * @return {CPUProfileChunk}
      */
    @scala.inline
    def collectProfileEvents(profile: HermesCPUProfile): CPUProfileChunk = ^.asInstanceOf[js.Dynamic].applyDynamic("collectProfileEvents")(profile.asInstanceOf[js.Any]).asInstanceOf[CPUProfileChunk]
    
    /**
      * Constructs CPUProfileChunk Nodes and the resultant samples and time deltas to be inputted into the
      * CPUProfileChunk object which will be processed to give createStartEndEvents()
      *
      * @param {HermesSample} samples
      * @param {<string, HermesStackFrame>} stackFrames
      * @return {CPUProfileChunker}
      */
    @scala.inline
    def constructNodes(
      samples: js.Array[HermesSample],
      stackFrames: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in string ]: hermes-profile-transformer.hermes-profile-transformer/dist/types/HermesProfile.HermesStackFrame}
      */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.constructNodes & TopLevel[js.Any]
    ): CPUProfileChunker = (^.asInstanceOf[js.Dynamic].applyDynamic("constructNodes")(samples.asInstanceOf[js.Any], stackFrames.asInstanceOf[js.Any])).asInstanceOf[CPUProfileChunker]
    
    /**
      * Creates B/E-style trace events from a CpuProfile object created by `collectProfileEvents()`
      * @param {CPUProfileChunk} profile
      */
    @scala.inline
    def createStartEndEvents(profile: CPUProfileChunk): js.Array[DurationEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStartEndEvents")(profile.asInstanceOf[js.Any]).asInstanceOf[js.Array[DurationEvent]]
  }
}
