package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofspeeddial extends js.Object {
  
  def lookup(stable: String): Double = js.native
  
  def lookup_owner(stable: String, sowner: String): Double = js.native
}
object Typeofspeeddial {
  
  @scala.inline
  def apply(lookup: String => Double, lookup_owner: (String, String) => Double): Typeofspeeddial = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), lookup_owner = js.Any.fromFunction2(lookup_owner))
    __obj.asInstanceOf[Typeofspeeddial]
  }
  
  @scala.inline
  implicit class TypeofspeeddialOps[Self <: Typeofspeeddial] (val x: Self) extends AnyVal {
    
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
    def setLookup(value: String => Double): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLookup_owner(value: (String, String) => Double): Self = this.set("lookup_owner", js.Any.fromFunction2(value))
  }
}
