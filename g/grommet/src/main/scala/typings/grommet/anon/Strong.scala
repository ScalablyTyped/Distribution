package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strong extends StObject {
  
  var medium: js.UndefOr[Double] = js.native
  
  var strong: js.UndefOr[Double] = js.native
  
  var weak: js.UndefOr[Double] = js.native
}
object Strong {
  
  @scala.inline
  def apply(): Strong = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Strong]
  }
  
  @scala.inline
  implicit class StrongMutableBuilder[Self <: Strong] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setStrong(value: Double): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    
    @scala.inline
    def setWeak(value: Double): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
