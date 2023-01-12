package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enterprise extends StObject {
  
  /** Admins of the enterprise. This is only supported for enterprises created via the EMM-initiated flow. */
  var administrator: js.UndefOr[js.Array[Administrator]] = js.undefined
  
  /** The unique ID for the enterprise. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The name of the enterprise, for example, "Example, Inc". */
  var name: js.UndefOr[String] = js.undefined
  
  /** The enterprise's primary domain, such as "example.com". */
  var primaryDomain: js.UndefOr[String] = js.undefined
}
object Enterprise {
  
  inline def apply(): Enterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enterprise] (val x: Self) extends AnyVal {
    
    inline def setAdministrator(value: js.Array[Administrator]): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
    
    inline def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
    
    inline def setAdministratorVarargs(value: Administrator*): Self = StObject.set(x, "administrator", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimaryDomain(value: String): Self = StObject.set(x, "primaryDomain", value.asInstanceOf[js.Any])
    
    inline def setPrimaryDomainUndefined: Self = StObject.set(x, "primaryDomain", js.undefined)
  }
}
