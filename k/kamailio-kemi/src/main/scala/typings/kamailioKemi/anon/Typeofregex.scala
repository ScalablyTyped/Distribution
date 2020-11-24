package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofregex extends js.Object {
  
  def pcre_match(string: String, regex: String): Double = js.native
  
  def pcre_match_group(string: String, num_pcre: Double): Double = js.native
}
object Typeofregex {
  
  @scala.inline
  def apply(pcre_match: (String, String) => Double, pcre_match_group: (String, Double) => Double): Typeofregex = {
    val __obj = js.Dynamic.literal(pcre_match = js.Any.fromFunction2(pcre_match), pcre_match_group = js.Any.fromFunction2(pcre_match_group))
    __obj.asInstanceOf[Typeofregex]
  }
  
  @scala.inline
  implicit class TypeofregexOps[Self <: Typeofregex] (val x: Self) extends AnyVal {
    
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
    def setPcre_match(value: (String, String) => Double): Self = this.set("pcre_match", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPcre_match_group(value: (String, Double) => Double): Self = this.set("pcre_match_group", js.Any.fromFunction2(value))
  }
}
