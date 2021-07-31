package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  /** Output only. Creation timestamp in RFC3339 text format. */
  var insertTime: js.UndefOr[String] = js.undefined
  
  /** Name of the type. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The Operation that most recently ran, or is currently running, on this type. */
  var operation: js.UndefOr[Operation] = js.undefined
  
  /** Output only. Server defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}
object Type {
  
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
