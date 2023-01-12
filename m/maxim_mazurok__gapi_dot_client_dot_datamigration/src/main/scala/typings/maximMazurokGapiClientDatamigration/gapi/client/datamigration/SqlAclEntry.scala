package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlAclEntry extends StObject {
  
  /** The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** A label to identify this entry. */
  var label: js.UndefOr[String] = js.undefined
  
  /** Input only. The time-to-leave of this access control entry. */
  var ttl: js.UndefOr[String] = js.undefined
  
  /** The allowlisted value for the access control list. */
  var value: js.UndefOr[String] = js.undefined
}
object SqlAclEntry {
  
  inline def apply(): SqlAclEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlAclEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlAclEntry] (val x: Self) extends AnyVal {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
