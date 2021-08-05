package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A snapshot resource. Snapshots are used in &lt;a
  * href=&quot;https://cloud.google.com/pubsub/docs/replay-overview&quot;&gt;Seek&lt;/a&gt;
  * operations, which allow you to manage message acknowledgments in bulk. That
  * is, you can set the acknowledgment state of messages in an existing
  * subscription to the state captured by a snapshot.
  */
trait SchemaSnapshot extends StObject {
  
  /**
    * The snapshot is guaranteed to exist up until this time. A newly-created
    * snapshot expires no later than 7 days from the time of its creation. Its
    * exact lifetime is determined at creation by the existing backlog in the
    * source subscription. Specifically, the lifetime of the snapshot is `7
    * days - (age of oldest unacked message in the subscription)`. For example,
    * consider a subscription whose oldest unacked message is 3 days old. If a
    * snapshot is created from this subscription, the snapshot -- which will
    * always capture this 3-day-old backlog as long as the snapshot exists --
    * will expire in 4 days. The service will refuse to create a snapshot that
    * would expire in less than 1 hour after creation.
    */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /**
    * See &lt;a
    * href=&quot;https://cloud.google.com/pubsub/docs/labels&quot;&gt; Creating
    * and managing labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The name of the snapshot.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the topic from which this snapshot is retaining messages.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object SchemaSnapshot {
  
  inline def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  
  extension [Self <: SchemaSnapshot](x: Self) {
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
