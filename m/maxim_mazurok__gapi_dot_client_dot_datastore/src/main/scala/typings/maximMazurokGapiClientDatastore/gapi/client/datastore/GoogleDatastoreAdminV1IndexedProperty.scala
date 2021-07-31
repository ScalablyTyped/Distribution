package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDatastoreAdminV1IndexedProperty extends StObject {
  
  /** Required. The indexed property's direction. Must not be DIRECTION_UNSPECIFIED. */
  var direction: js.UndefOr[String] = js.undefined
  
  /** Required. The property name to index. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleDatastoreAdminV1IndexedProperty {
  
  @scala.inline
  def apply(): GoogleDatastoreAdminV1IndexedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1IndexedProperty]
  }
  
  @scala.inline
  implicit class GoogleDatastoreAdminV1IndexedPropertyMutableBuilder[Self <: GoogleDatastoreAdminV1IndexedProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
