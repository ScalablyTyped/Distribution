package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Down extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var down: js.UndefOr[js.Any] = js.native
  
  var up: js.UndefOr[js.Any] = js.native
}
object Down {
  
  @scala.inline
  def apply(): Down = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Down]
  }
  
  @scala.inline
  implicit class DownMutableBuilder[Self <: Down] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDown(value: js.Any): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    @scala.inline
    def setUp(value: js.Any): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
