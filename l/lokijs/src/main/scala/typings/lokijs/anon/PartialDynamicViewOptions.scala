package typings.lokijs.anon

import typings.lokijs.lokijsStrings.active
import typings.lokijs.lokijsStrings.passive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.DynamicViewOptions> */
trait PartialDynamicViewOptions extends StObject {
  
  var minRebuildInterval: js.UndefOr[Double] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var sortPriority: js.UndefOr[active | passive] = js.undefined
}
object PartialDynamicViewOptions {
  
  @scala.inline
  def apply(): PartialDynamicViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDynamicViewOptions]
  }
  
  @scala.inline
  implicit class PartialDynamicViewOptionsMutableBuilder[Self <: PartialDynamicViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinRebuildInterval(value: Double): Self = StObject.set(x, "minRebuildInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRebuildIntervalUndefined: Self = StObject.set(x, "minRebuildInterval", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    @scala.inline
    def setSortPriority(value: active | passive): Self = StObject.set(x, "sortPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortPriorityUndefined: Self = StObject.set(x, "sortPriority", js.undefined)
  }
}
