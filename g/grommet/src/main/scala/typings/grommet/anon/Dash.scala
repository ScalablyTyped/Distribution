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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dash extends StObject {
  
  var color: js.UndefOr[ColorType | js.Array[Color] | Opacity] = js.undefined
  
  var dash: js.UndefOr[Boolean] = js.undefined
  
  // defaults to undefined
  var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.undefined
  
  var point: js.UndefOr[circle | diamond | square | star | triangle | triangleDown] = js.undefined
  
  // default across points
  // property to get values from objects in data
  var property: String | (js.Array[Property | String]) | Thickness
  
  var round: js.UndefOr[Boolean] = js.undefined
  
  // defaults to undefined
  var thickness: js.UndefOr[ThicknessType] = js.undefined
  
  // defaults to auto assigned based on available space and amount of data
  var `type`: js.UndefOr[bar | line | area | point | bars] = js.undefined
}
object Dash {
  
  @scala.inline
  def apply(property: String | (js.Array[Property | String]) | Thickness): Dash = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dash]
  }
  
  @scala.inline
  implicit class DashMutableBuilder[Self <: Dash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType | js.Array[Color] | Opacity): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Color*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDash(value: Boolean): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    @scala.inline
    def setOpacity(value: weak | medium | strong | Boolean | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPoint(value: circle | diamond | square | star | triangle | triangleDown): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setProperty(value: String | (js.Array[Property | String]) | Thickness): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyVarargs(value: (Property | String)*): Self = StObject.set(x, "property", js.Array(value :_*))
    
    @scala.inline
    def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    @scala.inline
    def setThickness(value: ThicknessType): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setType(value: bar | line | area | point | bars): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
