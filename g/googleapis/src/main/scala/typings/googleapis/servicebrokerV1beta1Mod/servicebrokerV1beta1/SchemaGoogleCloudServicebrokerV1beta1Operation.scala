package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a long running operation, which conforms to OpenService API.
  */
trait SchemaGoogleCloudServicebrokerV1beta1Operation extends StObject {
  
  /**
    * Optional description of the Operation state.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the operation. Valid values are: &quot;in progress&quot;,
    * &quot;succeeded&quot;, and &quot;failed&quot;.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1beta1Operation {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1Operation]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1OperationMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1beta1Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
