package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a tool results history resource.
  */
@js.native
trait SchemaToolResultsHistory extends StObject {
  
  /**
    * Required. A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  
  /**
    * Required. The cloud project that owns the tool results history.
    */
  var projectId: js.UndefOr[String] = js.native
}
object SchemaToolResultsHistory {
  
  @scala.inline
  def apply(): SchemaToolResultsHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolResultsHistory]
  }
  
  @scala.inline
  implicit class SchemaToolResultsHistoryMutableBuilder[Self <: SchemaToolResultsHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
