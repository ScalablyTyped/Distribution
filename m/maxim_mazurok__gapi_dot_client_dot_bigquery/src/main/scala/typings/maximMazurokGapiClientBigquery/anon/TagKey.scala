package typings.maximMazurokGapiClientBigquery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagKey extends StObject {
  
  /** [Required] The namespaced friendly name of the tag key, e.g. "12345/environment" where 12345 is org id. */
  var tagKey: js.UndefOr[String] = js.undefined
  
  /** [Required] Friendly short name of the tag value, e.g. "production". */
  var tagValue: js.UndefOr[String] = js.undefined
}
object TagKey {
  
  inline def apply(): TagKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagKey] (val x: Self) extends AnyVal {
    
    inline def setTagKey(value: String): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
    
    inline def setTagValue(value: String): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
  }
}
