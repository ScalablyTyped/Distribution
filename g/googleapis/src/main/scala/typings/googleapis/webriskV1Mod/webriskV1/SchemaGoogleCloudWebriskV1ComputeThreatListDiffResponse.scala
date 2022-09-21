package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse extends StObject {
  
  /**
    * A set of entries to add to a local threat type's list.
    */
  var additions: js.UndefOr[SchemaGoogleCloudWebriskV1ThreatEntryAdditions] = js.undefined
  
  /**
    * The expected SHA256 hash of the client state; that is, of the sorted list of all hashes present in the database after applying the provided diff. If the client state doesn't match the expected state, the client must discard this diff and retry later.
    */
  var checksum: js.UndefOr[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum] = js.undefined
  
  /**
    * The new opaque client version token. This should be retained by the client and passed into the next call of ComputeThreatListDiff as 'version_token'. A separate version token should be stored and used for each threatList.
    */
  var newVersionToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The soonest the client should wait before issuing any diff request. Querying sooner is unlikely to produce a meaningful diff. Waiting longer is acceptable considering the use case. If this field is not set clients may update as soon as they want.
    */
  var recommendedNextDiff: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A set of entries to remove from a local threat type's list. This field may be empty.
    */
  var removals: js.UndefOr[SchemaGoogleCloudWebriskV1ThreatEntryRemovals] = js.undefined
  
  /**
    * The type of response. This may indicate that an action must be taken by the client when the response is received.
    */
  var responseType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse {
  
  inline def apply(): SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse](x: Self) {
    
    inline def setAdditions(value: SchemaGoogleCloudWebriskV1ThreatEntryAdditions): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    inline def setChecksum(value: SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponseChecksum): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setNewVersionToken(value: String): Self = StObject.set(x, "newVersionToken", value.asInstanceOf[js.Any])
    
    inline def setNewVersionTokenNull: Self = StObject.set(x, "newVersionToken", null)
    
    inline def setNewVersionTokenUndefined: Self = StObject.set(x, "newVersionToken", js.undefined)
    
    inline def setRecommendedNextDiff(value: String): Self = StObject.set(x, "recommendedNextDiff", value.asInstanceOf[js.Any])
    
    inline def setRecommendedNextDiffNull: Self = StObject.set(x, "recommendedNextDiff", null)
    
    inline def setRecommendedNextDiffUndefined: Self = StObject.set(x, "recommendedNextDiff", js.undefined)
    
    inline def setRemovals(value: SchemaGoogleCloudWebriskV1ThreatEntryRemovals): Self = StObject.set(x, "removals", value.asInstanceOf[js.Any])
    
    inline def setRemovalsUndefined: Self = StObject.set(x, "removals", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
