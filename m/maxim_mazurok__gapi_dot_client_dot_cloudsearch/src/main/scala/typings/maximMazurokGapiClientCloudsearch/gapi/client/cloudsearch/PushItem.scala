package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushItem extends StObject {
  
  /**
    * Content hash of the item according to the repository. If specified, this is used to determine how to modify this item's status. Setting this field and the type field results in
    * argument error. The maximum length is 2048 characters.
    */
  var contentHash: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata hash of the item according to the repository. If specified, this is used to determine how to modify this item's status. Setting this field and the type field results in
    * argument error. The maximum length is 2048 characters.
    */
  var metadataHash: js.UndefOr[String] = js.undefined
  
  /** Provides additional document state information for the connector, such as an alternate repository ID and other metadata. The maximum length is 8192 bytes. */
  var payload: js.UndefOr[String] = js.undefined
  
  /** Queue to which this item belongs to. The default queue is chosen if this field is not specified. The maximum length is 512 characters. */
  var queue: js.UndefOr[String] = js.undefined
  
  /**
    * Populate this field to store Connector or repository error details. This information is displayed in the Admin Console. This field may only be populated when the Type is
    * REPOSITORY_ERROR.
    */
  var repositoryError: js.UndefOr[RepositoryError] = js.undefined
  
  /**
    * Structured data hash of the item according to the repository. If specified, this is used to determine how to modify this item's status. Setting this field and the type field results
    * in argument error. The maximum length is 2048 characters.
    */
  var structuredDataHash: js.UndefOr[String] = js.undefined
  
  /** The type of the push operation that defines the push behavior. */
  var `type`: js.UndefOr[String] = js.undefined
}
object PushItem {
  
  @scala.inline
  def apply(): PushItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushItem]
  }
  
  @scala.inline
  implicit class PushItemMutableBuilder[Self <: PushItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHashUndefined: Self = StObject.set(x, "contentHash", js.undefined)
    
    @scala.inline
    def setMetadataHash(value: String): Self = StObject.set(x, "metadataHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataHashUndefined: Self = StObject.set(x, "metadataHash", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    @scala.inline
    def setRepositoryError(value: RepositoryError): Self = StObject.set(x, "repositoryError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryErrorUndefined: Self = StObject.set(x, "repositoryError", js.undefined)
    
    @scala.inline
    def setStructuredDataHash(value: String): Self = StObject.set(x, "structuredDataHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuredDataHashUndefined: Self = StObject.set(x, "structuredDataHash", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
