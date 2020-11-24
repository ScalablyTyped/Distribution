package typings.markdownIt.rulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleOptions extends js.Object {
  
  /**
    * array with names of "alternate" chains.
    */
  var alt: js.Array[String] = js.native
}
object RuleOptions {
  
  @scala.inline
  def apply(alt: js.Array[String]): RuleOptions = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOptions]
  }
  
  @scala.inline
  implicit class RuleOptionsOps[Self <: RuleOptions] (val x: Self) extends AnyVal {
    
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
    def setAltVarargs(value: String*): Self = this.set("alt", js.Array(value :_*))
    
    @scala.inline
    def setAlt(value: js.Array[String]): Self = this.set("alt", value.asInstanceOf[js.Any])
  }
}
