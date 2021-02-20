package typings.got.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress extends StObject {
  
  var percent: Double = js.native
  
  var total: Double | Null = js.native
  
  var transferred: Double = js.native
}
object Progress {
  
  @scala.inline
  def apply(percent: Double, transferred: Double): Progress = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNull: Self = StObject.set(x, "total", null)
    
    @scala.inline
    def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
  }
}
