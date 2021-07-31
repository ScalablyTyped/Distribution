package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medium extends StObject {
  
  var large: js.UndefOr[String] = js.undefined
  
  var medium: js.UndefOr[String] = js.undefined
  
  var small: js.UndefOr[String] = js.undefined
  
  var xlarge: js.UndefOr[String] = js.undefined
  
  var xsmall: js.UndefOr[String] = js.undefined
}
object Medium {
  
  @scala.inline
  def apply(): Medium = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Medium]
  }
  
  @scala.inline
  implicit class MediumMutableBuilder[Self <: Medium] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    @scala.inline
    def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    @scala.inline
    def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
    
    @scala.inline
    def setXsmall(value: String): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
  }
}
