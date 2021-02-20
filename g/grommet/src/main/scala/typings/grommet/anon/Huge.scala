package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Huge extends StObject {
  
  var huge: js.UndefOr[String] = js.native
  
  var large: js.UndefOr[String] = js.native
  
  var medium: js.UndefOr[String] = js.native
  
  var small: js.UndefOr[String] = js.native
  
  var xlarge: js.UndefOr[String] = js.native
}
object Huge {
  
  @scala.inline
  def apply(): Huge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Huge]
  }
  
  @scala.inline
  implicit class HugeMutableBuilder[Self <: Huge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHuge(value: String): Self = StObject.set(x, "huge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHugeUndefined: Self = StObject.set(x, "huge", js.undefined)
    
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
  }
}
