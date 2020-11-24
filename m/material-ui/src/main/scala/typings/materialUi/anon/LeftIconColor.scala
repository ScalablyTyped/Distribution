package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftIconColor extends js.Object {
  
  var leftIconColor: js.UndefOr[String] = js.native
  
  var nestedLevelDepth: js.UndefOr[Double] = js.native
  
  var rightIconColor: js.UndefOr[String] = js.native
  
  var secondaryTextColor: js.UndefOr[String] = js.native
}
object LeftIconColor {
  
  @scala.inline
  def apply(): LeftIconColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftIconColor]
  }
  
  @scala.inline
  implicit class LeftIconColorOps[Self <: LeftIconColor] (val x: Self) extends AnyVal {
    
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
    def setLeftIconColor(value: String): Self = this.set("leftIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIconColor: Self = this.set("leftIconColor", js.undefined)
    
    @scala.inline
    def setNestedLevelDepth(value: Double): Self = this.set("nestedLevelDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedLevelDepth: Self = this.set("nestedLevelDepth", js.undefined)
    
    @scala.inline
    def setRightIconColor(value: String): Self = this.set("rightIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightIconColor: Self = this.set("rightIconColor", js.undefined)
    
    @scala.inline
    def setSecondaryTextColor(value: String): Self = this.set("secondaryTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryTextColor: Self = this.set("secondaryTextColor", js.undefined)
  }
}
