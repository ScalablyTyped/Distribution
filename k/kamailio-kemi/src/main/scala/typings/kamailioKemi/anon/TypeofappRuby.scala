package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofappRuby extends js.Object {
  
  def run(func: String): Double = js.native
  
  def run_p1(func: String, p1: String): Double = js.native
  
  def run_p2(func: String, p1: String, p2: String): Double = js.native
  
  def run_p3(func: String, p1: String, p2: String, p3: String): Double = js.native
}
object TypeofappRuby {
  
  @scala.inline
  def apply(
    run: String => Double,
    run_p1: (String, String) => Double,
    run_p2: (String, String, String) => Double,
    run_p3: (String, String, String, String) => Double
  ): TypeofappRuby = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run), run_p1 = js.Any.fromFunction2(run_p1), run_p2 = js.Any.fromFunction3(run_p2), run_p3 = js.Any.fromFunction4(run_p3))
    __obj.asInstanceOf[TypeofappRuby]
  }
  
  @scala.inline
  implicit class TypeofappRubyOps[Self <: TypeofappRuby] (val x: Self) extends AnyVal {
    
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
    def setRun(value: String => Double): Self = this.set("run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun_p1(value: (String, String) => Double): Self = this.set("run_p1", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRun_p2(value: (String, String, String) => Double): Self = this.set("run_p2", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRun_p3(value: (String, String, String, String) => Double): Self = this.set("run_p3", js.Any.fromFunction4(value))
  }
}
