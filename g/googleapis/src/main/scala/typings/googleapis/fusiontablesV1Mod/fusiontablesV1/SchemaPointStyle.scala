package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a PointStyle within a StyleSetting
  */
@js.native
trait SchemaPointStyle extends js.Object {
  
  /**
    * Name of the icon. Use values defined in
    * http://www.google.com/fusiontables/DataSource?dsrcid=308519
    */
  var iconName: js.UndefOr[String] = js.native
  
  /**
    * Column or a bucket value from which the icon name is to be determined.
    */
  var iconStyler: js.UndefOr[SchemaStyleFunction] = js.native
}
object SchemaPointStyle {
  
  @scala.inline
  def apply(): SchemaPointStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPointStyle]
  }
  
  @scala.inline
  implicit class SchemaPointStyleOps[Self <: SchemaPointStyle] (val x: Self) extends AnyVal {
    
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
    def setIconName(value: String): Self = this.set("iconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconName: Self = this.set("iconName", js.undefined)
    
    @scala.inline
    def setIconStyler(value: SchemaStyleFunction): Self = this.set("iconStyler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconStyler: Self = this.set("iconStyler", js.undefined)
  }
}
