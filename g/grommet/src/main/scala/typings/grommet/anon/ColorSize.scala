package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSize extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var size: js.UndefOr[String] = js.native
}
object ColorSize {
  
  @scala.inline
  def apply(): ColorSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSize]
  }
  
  @scala.inline
  implicit class ColorSizeMutableBuilder[Self <: ColorSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
