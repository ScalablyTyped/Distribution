package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyIntegrityViolationEvent extends StObject {
  
  /** UID of the application which owns the key */
  var applicationUid: js.UndefOr[Double] = js.undefined
  
  /** Alias of the key. */
  var keyAlias: js.UndefOr[String] = js.undefined
}
object KeyIntegrityViolationEvent {
  
  inline def apply(): KeyIntegrityViolationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyIntegrityViolationEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyIntegrityViolationEvent] (val x: Self) extends AnyVal {
    
    inline def setApplicationUid(value: Double): Self = StObject.set(x, "applicationUid", value.asInstanceOf[js.Any])
    
    inline def setApplicationUidUndefined: Self = StObject.set(x, "applicationUid", js.undefined)
    
    inline def setKeyAlias(value: String): Self = StObject.set(x, "keyAlias", value.asInstanceOf[js.Any])
    
    inline def setKeyAliasUndefined: Self = StObject.set(x, "keyAlias", js.undefined)
  }
}
