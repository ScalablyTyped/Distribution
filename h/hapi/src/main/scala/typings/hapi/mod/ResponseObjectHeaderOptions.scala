package typings.hapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseObjectHeaderOptions extends StObject {
  
  var append: js.UndefOr[Boolean] = js.undefined
  
  var duplicate: js.UndefOr[Boolean] = js.undefined
  
  var `override`: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
}
object ResponseObjectHeaderOptions {
  
  inline def apply(): ResponseObjectHeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseObjectHeaderOptions]
  }
  
  extension [Self <: ResponseObjectHeaderOptions](x: Self) {
    
    inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setDuplicate(value: Boolean): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
    
    inline def setDuplicateUndefined: Self = StObject.set(x, "duplicate", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
