package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the `CreateSnapshot` method.
  */
trait SchemaCreateSnapshotRequest extends StObject {
  
  /**
    * See &lt;a
    * href=&quot;https://cloud.google.com/pubsub/docs/labels&quot;&gt; Creating
    * and managing labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The subscription whose backlog the snapshot retains. Specifically, the
    * created snapshot is guaranteed to retain:  (a) The existing backlog on
    * the subscription. More precisely, this is      defined as the messages in
    * the subscription&#39;s backlog that are      unacknowledged upon the
    * successful completion of the      `CreateSnapshot` request; as well as:
    * (b) Any messages published to the subscription&#39;s topic following the
    * successful completion of the CreateSnapshot request. Format is
    * `projects/{project}/subscriptions/{sub}`.
    */
  var subscription: js.UndefOr[String] = js.undefined
}
object SchemaCreateSnapshotRequest {
  
  inline def apply(): SchemaCreateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSnapshotRequest]
  }
  
  extension [Self <: SchemaCreateSnapshotRequest](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
