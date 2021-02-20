package typings.lokijs

import typings.lokijs.lokijsStrings.active
import typings.lokijs.lokijsStrings.passive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicViewOptions extends StObject {
  
  var minRebuildInterval: Double = js.native
  
  var persistent: Boolean = js.native
  
  var sortPriority: active | passive = js.native
}
object DynamicViewOptions {
  
  @scala.inline
  def apply(minRebuildInterval: Double, persistent: Boolean, sortPriority: active | passive): DynamicViewOptions = {
    val __obj = js.Dynamic.literal(minRebuildInterval = minRebuildInterval.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], sortPriority = sortPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicViewOptions]
  }
  
  @scala.inline
  implicit class DynamicViewOptionsMutableBuilder[Self <: DynamicViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinRebuildInterval(value: Double): Self = StObject.set(x, "minRebuildInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortPriority(value: active | passive): Self = StObject.set(x, "sortPriority", value.asInstanceOf[js.Any])
  }
}
