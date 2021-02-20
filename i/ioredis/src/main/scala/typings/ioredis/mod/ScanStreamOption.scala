package typings.ioredis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanStreamOption extends StObject {
  
  var count: js.UndefOr[Double] = js.native
  
  var `match`: js.UndefOr[String] = js.native
}
object ScanStreamOption {
  
  @scala.inline
  def apply(): ScanStreamOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanStreamOption]
  }
  
  @scala.inline
  implicit class ScanStreamOptionMutableBuilder[Self <: ScanStreamOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
  }
}
