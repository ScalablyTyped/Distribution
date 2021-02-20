package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pages extends StObject {
  
  var `full-color`: js.UndefOr[Double] = js.native
  
  var monochrome: js.UndefOr[Double] = js.native
}
object Pages {
  
  @scala.inline
  def apply(): Pages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pages]
  }
  
  @scala.inline
  implicit class PagesMutableBuilder[Self <: Pages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFull-color`(value: Double): Self = StObject.set(x, "full-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFull-colorUndefined`: Self = StObject.set(x, "full-color", js.undefined)
    
    @scala.inline
    def setMonochrome(value: Double): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
  }
}
