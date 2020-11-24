package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstatistics extends js.Object {
  
  def reset_stat(sname: String): Double = js.native
  
  def update_stat(sname: String, sval: Double): Double = js.native
}
object Typeofstatistics {
  
  @scala.inline
  def apply(reset_stat: String => Double, update_stat: (String, Double) => Double): Typeofstatistics = {
    val __obj = js.Dynamic.literal(reset_stat = js.Any.fromFunction1(reset_stat), update_stat = js.Any.fromFunction2(update_stat))
    __obj.asInstanceOf[Typeofstatistics]
  }
  
  @scala.inline
  implicit class TypeofstatisticsOps[Self <: Typeofstatistics] (val x: Self) extends AnyVal {
    
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
    def setReset_stat(value: String => Double): Self = this.set("reset_stat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate_stat(value: (String, Double) => Double): Self = this.set("update_stat", js.Any.fromFunction2(value))
  }
}
