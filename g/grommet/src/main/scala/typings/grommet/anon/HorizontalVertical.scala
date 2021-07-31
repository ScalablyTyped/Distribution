package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalVertical extends StObject {
  
  var horizontal: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[String] = js.undefined
}
object HorizontalVertical {
  
  @scala.inline
  def apply(): HorizontalVertical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalVertical]
  }
  
  @scala.inline
  implicit class HorizontalVerticalMutableBuilder[Self <: HorizontalVertical] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
