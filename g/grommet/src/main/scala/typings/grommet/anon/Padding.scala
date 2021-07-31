package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Padding extends StObject {
  
  var font: js.UndefOr[Weight] = js.undefined
  
  var padding: js.UndefOr[String | Top] = js.undefined
  
  var weight: js.UndefOr[Double | String] = js.undefined
}
object Padding {
  
  @scala.inline
  def apply(): Padding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: Weight): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setPadding(value: String | Top): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setWeight(value: Double | String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
