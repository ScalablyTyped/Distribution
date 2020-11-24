package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsipcapture extends js.Object {
  
  def float2int(_val: String, _coof: String): Double = js.native
  
  def report_capture(_table: String): Double = js.native
  
  def report_capture_cid(_table: String, _cid: String): Double = js.native
  
  def report_capture_data(_table: String, _cid: String, _data: String): Double = js.native
  
  def sip_capture(): Double = js.native
  
  def sip_capture_forward(puri: String): Double = js.native
  
  def sip_capture_mode(_table: String, _cmdata: String): Double = js.native
  
  def sip_capture_table(_table: String): Double = js.native
}
object Typeofsipcapture {
  
  @scala.inline
  def apply(
    float2int: (String, String) => Double,
    report_capture: String => Double,
    report_capture_cid: (String, String) => Double,
    report_capture_data: (String, String, String) => Double,
    sip_capture: () => Double,
    sip_capture_forward: String => Double,
    sip_capture_mode: (String, String) => Double,
    sip_capture_table: String => Double
  ): Typeofsipcapture = {
    val __obj = js.Dynamic.literal(float2int = js.Any.fromFunction2(float2int), report_capture = js.Any.fromFunction1(report_capture), report_capture_cid = js.Any.fromFunction2(report_capture_cid), report_capture_data = js.Any.fromFunction3(report_capture_data), sip_capture = js.Any.fromFunction0(sip_capture), sip_capture_forward = js.Any.fromFunction1(sip_capture_forward), sip_capture_mode = js.Any.fromFunction2(sip_capture_mode), sip_capture_table = js.Any.fromFunction1(sip_capture_table))
    __obj.asInstanceOf[Typeofsipcapture]
  }
  
  @scala.inline
  implicit class TypeofsipcaptureOps[Self <: Typeofsipcapture] (val x: Self) extends AnyVal {
    
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
    def setFloat2int(value: (String, String) => Double): Self = this.set("float2int", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReport_capture(value: String => Double): Self = this.set("report_capture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReport_capture_cid(value: (String, String) => Double): Self = this.set("report_capture_cid", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReport_capture_data(value: (String, String, String) => Double): Self = this.set("report_capture_data", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSip_capture(value: () => Double): Self = this.set("sip_capture", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSip_capture_forward(value: String => Double): Self = this.set("sip_capture_forward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSip_capture_mode(value: (String, String) => Double): Self = this.set("sip_capture_mode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSip_capture_table(value: String => Double): Self = this.set("sip_capture_table", js.Any.fromFunction1(value))
  }
}
