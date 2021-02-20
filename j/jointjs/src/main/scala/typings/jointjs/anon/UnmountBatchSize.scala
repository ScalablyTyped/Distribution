package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmountBatchSize extends StObject {
  
  var unmountBatchSize: js.UndefOr[Double] = js.native
}
object UnmountBatchSize {
  
  @scala.inline
  def apply(): UnmountBatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmountBatchSize]
  }
  
  @scala.inline
  implicit class UnmountBatchSizeMutableBuilder[Self <: UnmountBatchSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnmountBatchSize(value: Double): Self = StObject.set(x, "unmountBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmountBatchSizeUndefined: Self = StObject.set(x, "unmountBatchSize", js.undefined)
  }
}
