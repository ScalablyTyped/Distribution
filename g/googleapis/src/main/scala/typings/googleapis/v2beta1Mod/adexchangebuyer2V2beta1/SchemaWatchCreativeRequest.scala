package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request for watching changes to creative Status.
  */
@js.native
trait SchemaWatchCreativeRequest extends StObject {
  
  /**
    * The Pub/Sub topic to publish notifications to. This topic must already
    * exist and must give permission to ad-exchange-buyside-reports@google.com
    * to write to the topic. This should be the full resource name in
    * &quot;projects/{project_id}/topics/{topic_id}&quot; format.
    */
  var topic: js.UndefOr[String] = js.native
}
object SchemaWatchCreativeRequest {
  
  @scala.inline
  def apply(): SchemaWatchCreativeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchCreativeRequest]
  }
  
  @scala.inline
  implicit class SchemaWatchCreativeRequestMutableBuilder[Self <: SchemaWatchCreativeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
