package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockstrapModalDefaultsFooterData extends js.Object {
  
  var closeLabel: String = js.native
  
  var primaryLabel: String = js.native
}
object KnockstrapModalDefaultsFooterData {
  
  @scala.inline
  def apply(closeLabel: String, primaryLabel: String): KnockstrapModalDefaultsFooterData = {
    val __obj = js.Dynamic.literal(closeLabel = closeLabel.asInstanceOf[js.Any], primaryLabel = primaryLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapModalDefaultsFooterData]
  }
  
  @scala.inline
  implicit class KnockstrapModalDefaultsFooterDataOps[Self <: KnockstrapModalDefaultsFooterData] (val x: Self) extends AnyVal {
    
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
    def setCloseLabel(value: String): Self = this.set("closeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryLabel(value: String): Self = this.set("primaryLabel", value.asInstanceOf[js.Any])
  }
}
