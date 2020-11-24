package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushItem extends js.Object {
  
  /**
    * Content hash of the item according to the repository. If specified, this is used to determine how to modify this item's status. Setting this field and the type field results in
    * argument error. The maximum length is 2048 characters.
    */
  var contentHash: js.UndefOr[String] = js.native
  
  /**
    * Metadata hash of the item according to the repository. If specified, this is used to determine how to modify this item's status. Setting this field and the type field results in
    * argument error. The maximum length is 2048 characters.
    */
  var metadataHash: js.UndefOr[String] = js.native
  
  /** Provides additional document state information for the connector, such as an alternate repository ID and other metadata. The maximum length is 8192 bytes. */
  var payload: js.UndefOr[String] = js.native
  
  /** Queue to which this item belongs to. The default queue is chosen if this field is not specified. The maximum length is 512 characters. */
  var queue: js.UndefOr[String] = js.native
  
  /**
    * Populate this field to store Connector or repository error details. This information is displayed in the Admin Console. This field may only be populated when the Type is
    * REPOSITORY_ERROR.
    */
  var repositoryError: js.UndefOr[RepositoryError] = js.native
  
  /**
    * Structured data hash of the item according to the repository. If specified, this is used to determine how to modify this item's status. Setting this field and the type field results
    * in argument error. The maximum length is 2048 characters.
    */
  var structuredDataHash: js.UndefOr[String] = js.native
  
  /** The type of the push operation that defines the push behavior. */
  var `type`: js.UndefOr[String] = js.native
}
object PushItem {
  
  @scala.inline
  def apply(): PushItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushItem]
  }
  
  @scala.inline
  implicit class PushItemOps[Self <: PushItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentHash(value: String): Self = this.set("contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHash: Self = this.set("contentHash", js.undefined)
    
    @scala.inline
    def setMetadataHash(value: String): Self = this.set("metadataHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataHash: Self = this.set("metadataHash", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    
    @scala.inline
    def setRepositoryError(value: RepositoryError): Self = this.set("repositoryError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryError: Self = this.set("repositoryError", js.undefined)
    
    @scala.inline
    def setStructuredDataHash(value: String): Self = this.set("structuredDataHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructuredDataHash: Self = this.set("structuredDataHash", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
