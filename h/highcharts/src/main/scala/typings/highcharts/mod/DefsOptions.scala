package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefsOptions extends StObject {
  
  var arrow: js.UndefOr[DefsArrowOptions | SVGDefinitionObject] = js.native
  
  var `reverse-arrow`: js.UndefOr[DefsReverseArrowOptions | SVGDefinitionObject] = js.native
}
object DefsOptions {
  
  @scala.inline
  def apply(): DefsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsOptions]
  }
  
  @scala.inline
  implicit class DefsOptionsMutableBuilder[Self <: DefsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrow(value: DefsArrowOptions | SVGDefinitionObject): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def `setReverse-arrow`(value: DefsReverseArrowOptions | SVGDefinitionObject): Self = StObject.set(x, "reverse-arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setReverse-arrowUndefined`: Self = StObject.set(x, "reverse-arrow", js.undefined)
  }
}
