package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Up extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var down: js.UndefOr[ReactNode] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
  
  var up: js.UndefOr[ReactNode] = js.undefined
}
object Up {
  
  @scala.inline
  def apply(): Up = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Up]
  }
  
  @scala.inline
  implicit class UpMutableBuilder[Self <: Up] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDown(value: ReactNode): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setUp(value: ReactNode): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
