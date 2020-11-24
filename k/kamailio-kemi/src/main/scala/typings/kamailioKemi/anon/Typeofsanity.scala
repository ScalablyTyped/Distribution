package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsanity extends js.Object {
  
  def sanity_check(mflags: Double, uflags: Double): Double = js.native
  
  def sanity_check_defaults(): Double = js.native
  
  def sanity_reply(): Double = js.native
}
object Typeofsanity {
  
  @scala.inline
  def apply(
    sanity_check: (Double, Double) => Double,
    sanity_check_defaults: () => Double,
    sanity_reply: () => Double
  ): Typeofsanity = {
    val __obj = js.Dynamic.literal(sanity_check = js.Any.fromFunction2(sanity_check), sanity_check_defaults = js.Any.fromFunction0(sanity_check_defaults), sanity_reply = js.Any.fromFunction0(sanity_reply))
    __obj.asInstanceOf[Typeofsanity]
  }
  
  @scala.inline
  implicit class TypeofsanityOps[Self <: Typeofsanity] (val x: Self) extends AnyVal {
    
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
    def setSanity_check(value: (Double, Double) => Double): Self = this.set("sanity_check", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSanity_check_defaults(value: () => Double): Self = this.set("sanity_check_defaults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSanity_reply(value: () => Double): Self = this.set("sanity_reply", js.Any.fromFunction0(value))
  }
}
