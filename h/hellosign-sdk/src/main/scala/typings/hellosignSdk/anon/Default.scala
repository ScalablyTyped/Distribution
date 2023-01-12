package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: String
  
  var draw: js.UndefOr[Boolean] = js.undefined
  
  var phone: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  var upload: js.UndefOr[Boolean] = js.undefined
}
object Default {
  
  inline def apply(default: String): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: Boolean): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
    
    inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
    
    inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpload(value: Boolean): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
