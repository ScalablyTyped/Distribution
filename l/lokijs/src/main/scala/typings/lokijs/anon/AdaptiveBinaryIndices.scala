package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdaptiveBinaryIndices extends StObject {
  
  var adaptiveBinaryIndices: js.UndefOr[Boolean] = js.native
}
object AdaptiveBinaryIndices {
  
  @scala.inline
  def apply(): AdaptiveBinaryIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdaptiveBinaryIndices]
  }
  
  @scala.inline
  implicit class AdaptiveBinaryIndicesMutableBuilder[Self <: AdaptiveBinaryIndices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdaptiveBinaryIndices(value: Boolean): Self = StObject.set(x, "adaptiveBinaryIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdaptiveBinaryIndicesUndefined: Self = StObject.set(x, "adaptiveBinaryIndices", js.undefined)
  }
}
