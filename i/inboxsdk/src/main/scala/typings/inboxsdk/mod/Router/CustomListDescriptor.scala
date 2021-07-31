package typings.inboxsdk.mod.Router

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomListDescriptor extends StObject {
  
  var hasMore: js.UndefOr[Boolean] = js.undefined
  
  var threads: js.Array[ThreadDescriptor | String]
  
  var total: js.UndefOr[Double] = js.undefined
}
object CustomListDescriptor {
  
  @scala.inline
  def apply(threads: js.Array[ThreadDescriptor | String]): CustomListDescriptor = {
    val __obj = js.Dynamic.literal(threads = threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomListDescriptor]
  }
  
  @scala.inline
  implicit class CustomListDescriptorMutableBuilder[Self <: CustomListDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
    
    @scala.inline
    def setThreads(value: js.Array[ThreadDescriptor | String]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsVarargs(value: (ThreadDescriptor | String)*): Self = StObject.set(x, "threads", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
