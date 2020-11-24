package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflcr extends js.Object {
  
  def defunct_gw(defunct_period: Double): Double = js.native
  
  def from_any_gw(): Double = js.native
  
  def from_any_gw_addr(addr_str: String, transport: Double): Double = js.native
  
  def from_gw(lcr_id: Double): Double = js.native
  
  def from_gw_addr(lcr_id: Double, addr_str: String, transport: Double): Double = js.native
  
  def inactivate_gw(): Double = js.native
  
  def load_gws(lcr_id: Double): Double = js.native
  
  def load_gws_furi(lcr_id: Double, ruri_user: String, from_uri: String): Double = js.native
  
  def load_gws_ruser(lcr_id: Double, ruri_user: String): Double = js.native
  
  def next_gw(): Double = js.native
  
  def to_any_gw(): Double = js.native
  
  def to_any_gw_addr(addr_str: String, transport: Double): Double = js.native
  
  def to_gw(lcr_id: Double): Double = js.native
  
  def to_gw_addr(lcr_id: Double, addr_str: String, transport: Double): Double = js.native
}
object Typeoflcr {
  
  @scala.inline
  def apply(
    defunct_gw: Double => Double,
    from_any_gw: () => Double,
    from_any_gw_addr: (String, Double) => Double,
    from_gw: Double => Double,
    from_gw_addr: (Double, String, Double) => Double,
    inactivate_gw: () => Double,
    load_gws: Double => Double,
    load_gws_furi: (Double, String, String) => Double,
    load_gws_ruser: (Double, String) => Double,
    next_gw: () => Double,
    to_any_gw: () => Double,
    to_any_gw_addr: (String, Double) => Double,
    to_gw: Double => Double,
    to_gw_addr: (Double, String, Double) => Double
  ): Typeoflcr = {
    val __obj = js.Dynamic.literal(defunct_gw = js.Any.fromFunction1(defunct_gw), from_any_gw = js.Any.fromFunction0(from_any_gw), from_any_gw_addr = js.Any.fromFunction2(from_any_gw_addr), from_gw = js.Any.fromFunction1(from_gw), from_gw_addr = js.Any.fromFunction3(from_gw_addr), inactivate_gw = js.Any.fromFunction0(inactivate_gw), load_gws = js.Any.fromFunction1(load_gws), load_gws_furi = js.Any.fromFunction3(load_gws_furi), load_gws_ruser = js.Any.fromFunction2(load_gws_ruser), next_gw = js.Any.fromFunction0(next_gw), to_any_gw = js.Any.fromFunction0(to_any_gw), to_any_gw_addr = js.Any.fromFunction2(to_any_gw_addr), to_gw = js.Any.fromFunction1(to_gw), to_gw_addr = js.Any.fromFunction3(to_gw_addr))
    __obj.asInstanceOf[Typeoflcr]
  }
  
  @scala.inline
  implicit class TypeoflcrOps[Self <: Typeoflcr] (val x: Self) extends AnyVal {
    
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
    def setDefunct_gw(value: Double => Double): Self = this.set("defunct_gw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFrom_any_gw(value: () => Double): Self = this.set("from_any_gw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFrom_any_gw_addr(value: (String, Double) => Double): Self = this.set("from_any_gw_addr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFrom_gw(value: Double => Double): Self = this.set("from_gw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFrom_gw_addr(value: (Double, String, Double) => Double): Self = this.set("from_gw_addr", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInactivate_gw(value: () => Double): Self = this.set("inactivate_gw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad_gws(value: Double => Double): Self = this.set("load_gws", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoad_gws_furi(value: (Double, String, String) => Double): Self = this.set("load_gws_furi", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLoad_gws_ruser(value: (Double, String) => Double): Self = this.set("load_gws_ruser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNext_gw(value: () => Double): Self = this.set("next_gw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTo_any_gw(value: () => Double): Self = this.set("to_any_gw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTo_any_gw_addr(value: (String, Double) => Double): Self = this.set("to_any_gw_addr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTo_gw(value: Double => Double): Self = this.set("to_gw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo_gw_addr(value: (Double, String, Double) => Double): Self = this.set("to_gw_addr", js.Any.fromFunction3(value))
  }
}
