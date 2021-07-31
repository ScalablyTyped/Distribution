package typings.hermesProfileTransformer

import org.scalablytyped.runtime.TopLevel
import typings.hermesProfileTransformer.eventInterfacesMod.SharedEventProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hermesProfileMod {
  
  trait HermesCPUProfile extends StObject {
    
    var samples: js.Array[HermesSample]
    
    var stackFrames: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in string ]: hermes-profile-transformer.hermes-profile-transformer/dist/types/HermesProfile.HermesStackFrame}
      */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.HermesCPUProfile & TopLevel[js.Any]
    
    var traceEvents: js.Array[SharedEventProperties]
  }
  object HermesCPUProfile {
    
    @scala.inline
    def apply(
      samples: js.Array[HermesSample],
      stackFrames: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in string ]: hermes-profile-transformer.hermes-profile-transformer/dist/types/HermesProfile.HermesStackFrame}
      */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.HermesCPUProfile & TopLevel[js.Any],
      traceEvents: js.Array[SharedEventProperties]
    ): HermesCPUProfile = {
      val __obj = js.Dynamic.literal(samples = samples.asInstanceOf[js.Any], stackFrames = stackFrames.asInstanceOf[js.Any], traceEvents = traceEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[HermesCPUProfile]
    }
    
    @scala.inline
    implicit class HermesCPUProfileMutableBuilder[Self <: HermesCPUProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSamples(value: js.Array[HermesSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplesVarargs(value: HermesSample*): Self = StObject.set(x, "samples", js.Array(value :_*))
      
      @scala.inline
      def setStackFrames(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ key in string ]: hermes-profile-transformer.hermes-profile-transformer/dist/types/HermesProfile.HermesStackFrame}
        */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.HermesCPUProfile & TopLevel[js.Any]
      ): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceEvents(value: js.Array[SharedEventProperties]): Self = StObject.set(x, "traceEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceEventsVarargs(value: SharedEventProperties*): Self = StObject.set(x, "traceEvents", js.Array(value :_*))
    }
  }
  
  trait HermesSample extends StObject {
    
    var cpu: String
    
    var name: String
    
    var pid: Double
    
    /**
      * Will refer to an element in the stackFrames object of the Hermes Profile
      */
    var sf: Double
    
    var stackFrameData: js.UndefOr[HermesStackFrame] = js.undefined
    
    var tid: String
    
    var ts: String
    
    var weight: String
  }
  object HermesSample {
    
    @scala.inline
    def apply(cpu: String, name: String, pid: Double, sf: Double, tid: String, ts: String, weight: String): HermesSample = {
      val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], sf = sf.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[HermesSample]
    }
    
    @scala.inline
    implicit class HermesSampleMutableBuilder[Self <: HermesSample] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSf(value: Double): Self = StObject.set(x, "sf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackFrameData(value: HermesStackFrame): Self = StObject.set(x, "stackFrameData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackFrameDataUndefined: Self = StObject.set(x, "stackFrameData", js.undefined)
      
      @scala.inline
      def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTs(value: String): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait HermesStackFrame extends StObject {
    
    var category: String
    
    var column: String
    
    var funcColumn: String
    
    var funcLine: String
    
    var line: String
    
    var name: String
    
    /**
      * A parent function may or may not exist
      */
    var parent: js.UndefOr[Double] = js.undefined
  }
  object HermesStackFrame {
    
    @scala.inline
    def apply(category: String, column: String, funcColumn: String, funcLine: String, line: String, name: String): HermesStackFrame = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], funcColumn = funcColumn.asInstanceOf[js.Any], funcLine = funcLine.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HermesStackFrame]
    }
    
    @scala.inline
    implicit class HermesStackFrameMutableBuilder[Self <: HermesStackFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncColumn(value: String): Self = StObject.set(x, "funcColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncLine(value: String): Self = StObject.set(x, "funcLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
}
