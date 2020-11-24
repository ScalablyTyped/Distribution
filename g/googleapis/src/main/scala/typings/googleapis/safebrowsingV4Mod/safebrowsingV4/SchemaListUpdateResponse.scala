package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An update to an individual list.
  */
@js.native
trait SchemaListUpdateResponse extends js.Object {
  
  /**
    * A set of entries to add to a local threat type&#39;s list. Repeated to
    * allow for a combination of compressed and raw data to be sent in a single
    * response.
    */
  var additions: js.UndefOr[js.Array[SchemaThreatEntrySet]] = js.native
  
  /**
    * The expected SHA256 hash of the client state; that is, of the sorted list
    * of all hashes present in the database after applying the provided update.
    * If the client state doesn&#39;t match the expected state, the client must
    * disregard this update and retry later.
    */
  var checksum: js.UndefOr[SchemaChecksum] = js.native
  
  /**
    * The new client state, in encrypted format. Opaque to clients.
    */
  var newClientState: js.UndefOr[String] = js.native
  
  /**
    * The platform type for which data is returned.
    */
  var platformType: js.UndefOr[String] = js.native
  
  /**
    * A set of entries to remove from a local threat type&#39;s list. In
    * practice, this field is empty or contains exactly one ThreatEntrySet.
    */
  var removals: js.UndefOr[js.Array[SchemaThreatEntrySet]] = js.native
  
  /**
    * The type of response. This may indicate that an action is required by the
    * client when the response is received.
    */
  var responseType: js.UndefOr[String] = js.native
  
  /**
    * The format of the threats.
    */
  var threatEntryType: js.UndefOr[String] = js.native
  
  /**
    * The threat type for which data is returned.
    */
  var threatType: js.UndefOr[String] = js.native
}
object SchemaListUpdateResponse {
  
  @scala.inline
  def apply(): SchemaListUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUpdateResponse]
  }
  
  @scala.inline
  implicit class SchemaListUpdateResponseOps[Self <: SchemaListUpdateResponse] (val x: Self) extends AnyVal {
    
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
    def setAdditionsVarargs(value: SchemaThreatEntrySet*): Self = this.set("additions", js.Array(value :_*))
    
    @scala.inline
    def setAdditions(value: js.Array[SchemaThreatEntrySet]): Self = this.set("additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditions: Self = this.set("additions", js.undefined)
    
    @scala.inline
    def setChecksum(value: SchemaChecksum): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setNewClientState(value: String): Self = this.set("newClientState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewClientState: Self = this.set("newClientState", js.undefined)
    
    @scala.inline
    def setPlatformType(value: String): Self = this.set("platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformType: Self = this.set("platformType", js.undefined)
    
    @scala.inline
    def setRemovalsVarargs(value: SchemaThreatEntrySet*): Self = this.set("removals", js.Array(value :_*))
    
    @scala.inline
    def setRemovals(value: js.Array[SchemaThreatEntrySet]): Self = this.set("removals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovals: Self = this.set("removals", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setThreatEntryType(value: String): Self = this.set("threatEntryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatEntryType: Self = this.set("threatEntryType", js.undefined)
    
    @scala.inline
    def setThreatType(value: String): Self = this.set("threatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatType: Self = this.set("threatType", js.undefined)
  }
}
