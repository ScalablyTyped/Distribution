package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebounceSettings extends StObject {
  
  /**
    * @see _.leading
    */
  var leading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @see _.maxWait
    */
  var maxWait: js.UndefOr[Double] = js.undefined
  
  /**
    * @see _.trailing
    */
  var trailing: js.UndefOr[Boolean] = js.undefined
}
object DebounceSettings {
  
  @scala.inline
  def apply(): DebounceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebounceSettings]
  }
  
  @scala.inline
  implicit class DebounceSettingsMutableBuilder[Self <: DebounceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    @scala.inline
    def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
    
    @scala.inline
    def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
  }
}
