package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToSQLOptions extends js.Object {
  
  var includeOffset: js.UndefOr[Boolean] = js.native
  
  var includeZone: js.UndefOr[Boolean] = js.native
}
object ToSQLOptions {
  
  @scala.inline
  def apply(): ToSQLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToSQLOptions]
  }
  
  @scala.inline
  implicit class ToSQLOptionsOps[Self <: ToSQLOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeOffset(value: Boolean): Self = this.set("includeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeOffset: Self = this.set("includeOffset", js.undefined)
    
    @scala.inline
    def setIncludeZone(value: Boolean): Self = this.set("includeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeZone: Self = this.set("includeZone", js.undefined)
  }
}
