package typings.materialChips.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHOICE extends js.Object {
  
  var CHOICE: String = js.native
  
  var FILTER: String = js.native
}
object CHOICE {
  
  @scala.inline
  def apply(CHOICE: String, FILTER: String): CHOICE = {
    val __obj = js.Dynamic.literal(CHOICE = CHOICE.asInstanceOf[js.Any], FILTER = FILTER.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHOICE]
  }
  
  @scala.inline
  implicit class CHOICEOps[Self <: CHOICE] (val x: Self) extends AnyVal {
    
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
    def setCHOICE(value: String): Self = this.set("CHOICE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFILTER(value: String): Self = this.set("FILTER", value.asInstanceOf[js.Any])
  }
}
