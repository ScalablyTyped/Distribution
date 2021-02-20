package typings.lokijs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetainDirtyFlags
  extends /* collName */ StringDictionary[js.Any | Inflate] {
  
  var retainDirtyFlags: js.UndefOr[Boolean] = js.native
  
  var throttledSaves: js.UndefOr[Boolean] = js.native
}
object RetainDirtyFlags {
  
  @scala.inline
  def apply(): RetainDirtyFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetainDirtyFlags]
  }
  
  @scala.inline
  implicit class RetainDirtyFlagsMutableBuilder[Self <: RetainDirtyFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetainDirtyFlags(value: Boolean): Self = StObject.set(x, "retainDirtyFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainDirtyFlagsUndefined: Self = StObject.set(x, "retainDirtyFlags", js.undefined)
    
    @scala.inline
    def setThrottledSaves(value: Boolean): Self = StObject.set(x, "throttledSaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottledSavesUndefined: Self = StObject.set(x, "throttledSaves", js.undefined)
  }
}
