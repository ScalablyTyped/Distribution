package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set up or update a new push notification watch on this user&#39;s mailbox.
  */
@js.native
trait SchemaWatchRequest extends js.Object {
  
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
  implicit class SchemaWatchRequestOps[Self <: SchemaWatchRequest] (val x: Self) extends AnyVal {
    
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
    def setLabelFilterAction(value: String): Self = this.set("labelFilterAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFilterAction: Self = this.set("labelFilterAction", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = this.set("labelIds", js.Array(value :_*))
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = this.set("labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelIds: Self = this.set("labelIds", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
}
