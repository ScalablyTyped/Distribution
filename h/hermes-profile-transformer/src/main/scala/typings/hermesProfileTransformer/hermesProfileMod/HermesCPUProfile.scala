package typings.hermesProfileTransformer.hermesProfileMod

import org.scalablytyped.runtime.TopLevel
import typings.hermesProfileTransformer.eventInterfacesMod.SharedEventProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HermesCPUProfile extends js.Object {
  
  var samples: js.Array[HermesSample] = js.native
  
  var stackFrames: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]: hermes-profile-transformer.hermes-profile-transformer/dist/types/HermesProfile.HermesStackFrame}
    */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.HermesCPUProfile with TopLevel[js.Any] = js.native
  
  var traceEvents: js.Array[SharedEventProperties] = js.native
}
object HermesCPUProfile {
  
  @scala.inline
  def apply(
    samples: js.Array[HermesSample],
    stackFrames: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]: hermes-profile-transformer.hermes-profile-transformer/dist/types/HermesProfile.HermesStackFrame}
    */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.HermesCPUProfile with TopLevel[js.Any],
    traceEvents: js.Array[SharedEventProperties]
  ): HermesCPUProfile = {
    val __obj = js.Dynamic.literal(samples = samples.asInstanceOf[js.Any], stackFrames = stackFrames.asInstanceOf[js.Any], traceEvents = traceEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[HermesCPUProfile]
  }
  
  @scala.inline
  implicit class HermesCPUProfileOps[Self <: HermesCPUProfile] (val x: Self) extends AnyVal {
    
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
    def setSamplesVarargs(value: HermesSample*): Self = this.set("samples", js.Array(value :_*))
    
    @scala.inline
    def setSamples(value: js.Array[HermesSample]): Self = this.set("samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackFrames(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in string ]: hermes-profile-transformer.hermes-profile-transformer/dist/types/HermesProfile.HermesStackFrame}
      */ typings.hermesProfileTransformer.hermesProfileTransformerStrings.HermesCPUProfile with TopLevel[js.Any]
    ): Self = this.set("stackFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceEventsVarargs(value: SharedEventProperties*): Self = this.set("traceEvents", js.Array(value :_*))
    
    @scala.inline
    def setTraceEvents(value: js.Array[SharedEventProperties]): Self = this.set("traceEvents", value.asInstanceOf[js.Any])
  }
}
