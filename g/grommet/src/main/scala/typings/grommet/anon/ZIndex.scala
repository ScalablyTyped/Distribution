package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZIndex extends StObject {
  
  var zIndex: js.UndefOr[String] = js.native
}
object ZIndex {
  
  @scala.inline
  def apply(): ZIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndex]
  }
  
  @scala.inline
  implicit class ZIndexMutableBuilder[Self <: ZIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
