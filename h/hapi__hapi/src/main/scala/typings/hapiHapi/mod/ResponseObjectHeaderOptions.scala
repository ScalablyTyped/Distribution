package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseObjectHeaderOptions extends StObject {
  
  var append: js.UndefOr[Boolean] = js.native
  
  var duplicate: js.UndefOr[Boolean] = js.native
  
  var `override`: js.UndefOr[Boolean] = js.native
  
  var separator: js.UndefOr[String] = js.native
}
object ResponseObjectHeaderOptions {
  
  @scala.inline
  def apply(): ResponseObjectHeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseObjectHeaderOptions]
  }
  
  @scala.inline
  implicit class ResponseObjectHeaderOptionsMutableBuilder[Self <: ResponseObjectHeaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    @scala.inline
    def setDuplicate(value: Boolean): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateUndefined: Self = StObject.set(x, "duplicate", js.undefined)
    
    @scala.inline
    def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
