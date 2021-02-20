package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Large extends StObject {
  
  var large: js.UndefOr[HeightSize] = js.native
  
  var medium: js.UndefOr[HeightSize] = js.native
  
  var small: js.UndefOr[HeightSize] = js.native
  
  var xlarge: js.UndefOr[HeightSize] = js.native
  
  var xsmall: js.UndefOr[HeightSize] = js.native
  
  var xxlarge: js.UndefOr[HeightSize] = js.native
}
object Large {
  
  @scala.inline
  def apply(): Large = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Large]
  }
  
  @scala.inline
  implicit class LargeMutableBuilder[Self <: Large] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLarge(value: HeightSize): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    @scala.inline
    def setMedium(value: HeightSize): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setSmall(value: HeightSize): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    @scala.inline
    def setXlarge(value: HeightSize): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
    
    @scala.inline
    def setXsmall(value: HeightSize): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
    
    @scala.inline
    def setXxlarge(value: HeightSize): Self = StObject.set(x, "xxlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXxlargeUndefined: Self = StObject.set(x, "xxlarge", js.undefined)
  }
}
