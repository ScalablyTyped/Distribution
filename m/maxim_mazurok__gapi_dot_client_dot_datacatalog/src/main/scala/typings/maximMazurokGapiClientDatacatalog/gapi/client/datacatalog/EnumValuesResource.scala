package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesResource extends StObject {
  
  def rename(request: Key, body: GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  /**
    * Renames an enum value in a tag template. The enum values have to be unique within one enum field. Thus, an enum value cannot be renamed with a name used in any other enum value
    * within the same enum field.
    */
  def rename(request: Uploadprotocol): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
}
