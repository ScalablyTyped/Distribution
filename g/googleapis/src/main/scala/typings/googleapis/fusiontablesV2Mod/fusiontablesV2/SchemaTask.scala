package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A background task on a table, initiated for time- or resource-consuming
  * operations such as changing column types or deleting all rows.
  */
trait SchemaTask extends StObject {
  
  /**
    * Type of the resource. This is always &quot;fusiontables#task&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Task percentage completion.
    */
  var progress: js.UndefOr[String] = js.undefined
  
  /**
    * false while the table is busy with some other task. true if this
    * background task is currently running.
    */
  var started: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier for the task.
    */
  var taskId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of background task.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaTask {
  
  @scala.inline
  def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  
  @scala.inline
  implicit class SchemaTaskMutableBuilder[Self <: SchemaTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
