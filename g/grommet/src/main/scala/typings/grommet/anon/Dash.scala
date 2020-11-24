package typings.grommet.anon

import typings.grommet.grommetStrings.area
import typings.grommet.grommetStrings.bar
import typings.grommet.grommetStrings.bars
import typings.grommet.grommetStrings.circle
import typings.grommet.grommetStrings.diamond
import typings.grommet.grommetStrings.line
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.point
import typings.grommet.grommetStrings.square
import typings.grommet.grommetStrings.star
import typings.grommet.grommetStrings.strong
import typings.grommet.grommetStrings.triangle
import typings.grommet.grommetStrings.triangleDown
import typings.grommet.grommetStrings.weak
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.ThicknessType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dash extends js.Object {
  
  var color: js.UndefOr[ColorType | js.Array[Color] | Opacity] = js.native
  
  var dash: js.UndefOr[Boolean] = js.native
  
   // defaults to undefined
  var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.native
  
  var point: js.UndefOr[circle | diamond | square | star | triangle | triangleDown] = js.native
  
   // default across points
  // property to get values from objects in data
  var property: String | (js.Array[Property | String]) | Thickness = js.native
  
  var round: js.UndefOr[Boolean] = js.native
  
   // defaults to undefined
  var thickness: js.UndefOr[ThicknessType] = js.native
  
   // defaults to auto assigned based on available space and amount of data
  var `type`: js.UndefOr[bar | line | area | point | bars] = js.native
}
object Dash {
  
  @scala.inline
  def apply(property: String | (js.Array[Property | String]) | Thickness): Dash = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dash]
  }
  
  @scala.inline
  implicit class DashOps[Self <: Dash] (val x: Self) extends AnyVal {
    
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
    def setPropertyVarargs(value: (Property | String)*): Self = this.set("property", js.Array(value :_*))
    
    @scala.inline
    def setProperty(value: String | (js.Array[Property | String]) | Thickness): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: Color*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: ColorType | js.Array[Color] | Opacity): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDash(value: Boolean): Self = this.set("dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
    
    @scala.inline
    def setOpacity(value: weak | medium | strong | Boolean | Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPoint(value: circle | diamond | square | star | triangle | triangleDown): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setThickness(value: ThicknessType): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setType(value: bar | line | area | point | bars): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
