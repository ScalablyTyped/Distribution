package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set up or update a new push notification watch on this user&#39;s mailbox.
  */
@js.native
trait SchemaWatchRequest extends StObject {
  
  /**
    * Filtering behavior of labelIds list specified.
    */
  var labelFilterAction: js.UndefOr[String] = js.native
  
  /**
    * List of label_ids to restrict notifications about. By default, if
    * unspecified, all changes are pushed out. If specified then dictates which
    * labels are required for a push notification to be generated.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A fully qualified Google Cloud Pub/Sub API topic name to publish the
    * events to. This topic name **must** already exist in Cloud Pub/Sub and
    * you **must** have already granted gmail &quot;publish&quot; permission on
    * it. For example,
    * &quot;projects/my-project-identifier/topics/my-topic-name&quot; (using
    * the Cloud Pub/Sub &quot;v1&quot; topic naming format).  Note that the
    * &quot;my-project-identifier&quot; portion must exactly match your Google
    * developer project id (the one executing this watch request).
    */
  var topicName: js.UndefOr[String] = js.native
}
object SchemaWatchRequest {
  
  @scala.inline
  def apply(): SchemaWatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchRequest]
  }
  
  @scala.inline
  implicit class SchemaWatchRequestMutableBuilder[Self <: SchemaWatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelFilterAction(value: String): Self = StObject.set(x, "labelFilterAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFilterActionUndefined: Self = StObject.set(x, "labelFilterAction", js.undefined)
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value :_*))
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
