package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch of Change messages.
  */
trait SchemaGoogleWatcherV1ChangeBatch extends StObject {
  
  /**
    * A list of Change messages.
    */
  var changes: js.UndefOr[js.Array[SchemaGoogleWatcherV1Change]] = js.undefined
}
object SchemaGoogleWatcherV1ChangeBatch {
  
  @scala.inline
  def apply(): SchemaGoogleWatcherV1ChangeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleWatcherV1ChangeBatch]
  }
  
  @scala.inline
  implicit class SchemaGoogleWatcherV1ChangeBatchMutableBuilder[Self <: SchemaGoogleWatcherV1ChangeBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[SchemaGoogleWatcherV1Change]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    @scala.inline
    def setChangesVarargs(value: SchemaGoogleWatcherV1Change*): Self = StObject.set(x, "changes", js.Array(value :_*))
  }
}
