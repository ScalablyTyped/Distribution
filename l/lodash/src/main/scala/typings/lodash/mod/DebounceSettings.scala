package typings.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebounceSettings extends js.Object {
  
  /**
    * @see _.leading
    */
  var leading: js.UndefOr[Boolean] = js.native
  
  /**
    * @see _.maxWait
    */
  var maxWait: js.UndefOr[Double] = js.native
  
  /**
    * @see _.trailing
    */
  var trailing: js.UndefOr[Boolean] = js.native
}
object DebounceSettings {
  
  @scala.inline
  def apply(): DebounceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebounceSettings]
  }
  
  @scala.inline
  implicit class DebounceSettingsOps[Self <: DebounceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLeading(value: Boolean): Self = this.set("leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeading: Self = this.set("leading", js.undefined)
    
    @scala.inline
    def setMaxWait(value: Double): Self = this.set("maxWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWait: Self = this.set("maxWait", js.undefined)
    
    @scala.inline
    def setTrailing(value: Boolean): Self = this.set("trailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailing: Self = this.set("trailing", js.undefined)
  }
}
