package typings.hermesProfileTransformer.hermesProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HermesSample extends js.Object {
  
  var cpu: String = js.native
  
  var name: String = js.native
  
  var pid: Double = js.native
  
  /**
    * Will refer to an element in the stackFrames object of the Hermes Profile
    */
  var sf: Double = js.native
  
  var stackFrameData: js.UndefOr[HermesStackFrame] = js.native
  
  var tid: String = js.native
  
  var ts: String = js.native
  
  var weight: String = js.native
}
object HermesSample {
  
  @scala.inline
  def apply(cpu: String, name: String, pid: Double, sf: Double, tid: String, ts: String, weight: String): HermesSample = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], sf = sf.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HermesSample]
  }
  
  @scala.inline
  implicit class HermesSampleOps[Self <: HermesSample] (val x: Self) extends AnyVal {
    
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
    def setCpu(value: String): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSf(value: Double): Self = this.set("sf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTid(value: String): Self = this.set("tid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: String): Self = this.set("ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: String): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackFrameData(value: HermesStackFrame): Self = this.set("stackFrameData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackFrameData: Self = this.set("stackFrameData", js.undefined)
  }
}
