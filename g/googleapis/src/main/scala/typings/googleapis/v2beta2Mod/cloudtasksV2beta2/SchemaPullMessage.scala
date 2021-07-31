package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pull message contains data that can be used by the caller of LeaseTasks
  * to process the task.  This proto can only be used for tasks in a queue
  * which has pull_target set.
  */
trait SchemaPullMessage extends StObject {
  
  /**
    * A data payload consumed by the worker to execute the task.
    */
  var payload: js.UndefOr[String] = js.undefined
  
  /**
    * The task&#39;s tag.  Tags allow similar tasks to be processed in a batch.
    * If you label tasks with a tag, your worker can lease tasks with the same
    * tag using filter. For example, if you want to aggregate the events
    * associated with a specific user once a day, you could tag tasks with the
    * user ID.  The task&#39;s tag can only be set when the task is created.
    * The tag must be less than 500 characters.  SDK compatibility: Although
    * the SDK allows tags to be either string or
    * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
    * only UTF-8 encoded tags can be used in Cloud Tasks. If a tag isn&#39;t
    * UTF-8 encoded, the tag will be empty when the task is returned by Cloud
    * Tasks.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object SchemaPullMessage {
  
  @scala.inline
  def apply(): SchemaPullMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullMessage]
  }
  
  @scala.inline
  implicit class SchemaPullMessageMutableBuilder[Self <: SchemaPullMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
