package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AscendingCount extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.native
  
  var count: js.UndefOr[Double] = js.native
}
object AscendingCount {
  
  @scala.inline
  def apply(): AscendingCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AscendingCount]
  }
  
  @scala.inline
  implicit class AscendingCountMutableBuilder[Self <: AscendingCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
