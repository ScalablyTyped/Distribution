package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactGroupProto extends StObject {
  
  /** Group ID is unique only relative to the owner's Gaia ID. */
  var groupId: js.UndefOr[String] = js.undefined
  
  var ownerGaiaId: js.UndefOr[String] = js.undefined
  
  /**
    * If present, then tests for membership in this ContactGroup must use data known to be at least as fresh as the given (FBS-assigned) timestamp. See
    * http://go/fbs-consistent-read-after-important-write Before using this, be sure that any service checking authorization against this group supports checking consistency timestamps.
    * For example, as of 12/2011, Keystore only supports this for the Moonshine configuration, and in others authorization checks will fail if the timestamp is present.
    */
  var requiredConsistencyTimestampUsec: js.UndefOr[String] = js.undefined
}
object ContactGroupProto {
  
  inline def apply(): ContactGroupProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupProto]
  }
  
  extension [Self <: ContactGroupProto](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setOwnerGaiaId(value: String): Self = StObject.set(x, "ownerGaiaId", value.asInstanceOf[js.Any])
    
    inline def setOwnerGaiaIdUndefined: Self = StObject.set(x, "ownerGaiaId", js.undefined)
    
    inline def setRequiredConsistencyTimestampUsec(value: String): Self = StObject.set(x, "requiredConsistencyTimestampUsec", value.asInstanceOf[js.Any])
    
    inline def setRequiredConsistencyTimestampUsecUndefined: Self = StObject.set(x, "requiredConsistencyTimestampUsec", js.undefined)
  }
}
