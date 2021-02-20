package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigTableIODetails extends StObject {
  
  /** InstanceId accessed in the connection. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** ProjectId accessed in the connection. */
  var projectId: js.UndefOr[String] = js.native
  
  /** TableId accessed in the connection. */
  var tableId: js.UndefOr[String] = js.native
}
object BigTableIODetails {
  
  @scala.inline
  def apply(): BigTableIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigTableIODetails]
  }
  
  @scala.inline
  implicit class BigTableIODetailsMutableBuilder[Self <: BigTableIODetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
