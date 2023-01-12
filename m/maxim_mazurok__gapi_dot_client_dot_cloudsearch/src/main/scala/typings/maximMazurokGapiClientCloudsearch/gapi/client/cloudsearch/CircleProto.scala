package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleProto extends StObject {
  
  /** Circle ID is unique only relative to the owner's Gaia ID. Currently required. */
  var circleId: js.UndefOr[String] = js.undefined
  
  /** The owner of the circle. Currently required. */
  var ownerGaiaId: js.UndefOr[String] = js.undefined
  
  /**
    * If present, then tests for membership in this circle must use data known to be at least as fresh as the given (FBS-assigned) timestamp. See
    * http://go/fbs-consistent-read-after-important-write Before using this, be sure that any service checking authorization against this circle supports checking consistency timestamps.
    * For example, as of 12/2011, Keystore only supports this for the Moonshine configuration, and in others authorization checks will fail if the timestamp is present.
    */
  var requiredConsistencyTimestampUsec: js.UndefOr[String] = js.undefined
}
object CircleProto {
  
  inline def apply(): CircleProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircleProto] (val x: Self) extends AnyVal {
    
    inline def setCircleId(value: String): Self = StObject.set(x, "circleId", value.asInstanceOf[js.Any])
    
    inline def setCircleIdUndefined: Self = StObject.set(x, "circleId", js.undefined)
    
    inline def setOwnerGaiaId(value: String): Self = StObject.set(x, "ownerGaiaId", value.asInstanceOf[js.Any])
    
    inline def setOwnerGaiaIdUndefined: Self = StObject.set(x, "ownerGaiaId", js.undefined)
    
    inline def setRequiredConsistencyTimestampUsec(value: String): Self = StObject.set(x, "requiredConsistencyTimestampUsec", value.asInstanceOf[js.Any])
    
    inline def setRequiredConsistencyTimestampUsecUndefined: Self = StObject.set(x, "requiredConsistencyTimestampUsec", js.undefined)
  }
}
