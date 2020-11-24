package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcnxcc extends js.Object {
  
  def get_channel_count(sclient: String, pvname: String): Double = js.native
  
  def set_max_channels(sclient: String, max_chan: Double): Double = js.native
  
  def set_max_credit(sclient: String, scredit: String, scps: String, initp: Double, finishp: Double): Double = js.native
  
  def set_max_time(sclient: String, max_secs: Double): Double = js.native
  
  def terminate_all(sclient: String): Double = js.native
  
  def update_max_time(sclient: String, secs: Double): Double = js.native
}
object Typeofcnxcc {
  
  @scala.inline
  def apply(
    get_channel_count: (String, String) => Double,
    set_max_channels: (String, Double) => Double,
    set_max_credit: (String, String, String, Double, Double) => Double,
    set_max_time: (String, Double) => Double,
    terminate_all: String => Double,
    update_max_time: (String, Double) => Double
  ): Typeofcnxcc = {
    val __obj = js.Dynamic.literal(get_channel_count = js.Any.fromFunction2(get_channel_count), set_max_channels = js.Any.fromFunction2(set_max_channels), set_max_credit = js.Any.fromFunction5(set_max_credit), set_max_time = js.Any.fromFunction2(set_max_time), terminate_all = js.Any.fromFunction1(terminate_all), update_max_time = js.Any.fromFunction2(update_max_time))
    __obj.asInstanceOf[Typeofcnxcc]
  }
  
  @scala.inline
  implicit class TypeofcnxccOps[Self <: Typeofcnxcc] (val x: Self) extends AnyVal {
    
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
    def setGet_channel_count(value: (String, String) => Double): Self = this.set("get_channel_count", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet_max_channels(value: (String, Double) => Double): Self = this.set("set_max_channels", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet_max_credit(value: (String, String, String, Double, Double) => Double): Self = this.set("set_max_credit", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSet_max_time(value: (String, Double) => Double): Self = this.set("set_max_time", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTerminate_all(value: String => Double): Self = this.set("terminate_all", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate_max_time(value: (String, Double) => Double): Self = this.set("update_max_time", js.Any.fromFunction2(value))
  }
}
