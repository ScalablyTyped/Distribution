package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightSize extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[String] = js.native
}
object HeightSize {
  
  @scala.inline
  def apply(): HeightSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightSize]
  }
  
  @scala.inline
  implicit class HeightSizeMutableBuilder[Self <: HeightSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
