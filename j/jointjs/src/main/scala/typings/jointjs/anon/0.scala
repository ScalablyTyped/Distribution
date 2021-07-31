package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var mountBatchSize: js.UndefOr[Double] = js.undefined
}
object `0` {
  
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMountBatchSize(value: Double): Self = StObject.set(x, "mountBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountBatchSizeUndefined: Self = StObject.set(x, "mountBatchSize", js.undefined)
  }
}
