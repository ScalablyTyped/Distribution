package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1TagFieldEnumValue extends StObject {
  
  /** The display name of the enum value. */
  var displayName: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1TagFieldEnumValue {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1TagFieldEnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1TagFieldEnumValue]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TagFieldEnumValueMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1TagFieldEnumValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
