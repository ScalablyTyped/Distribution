package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message included in the response field of operations returned from
  * StartEnvironment once the operation is complete.
  */
@js.native
trait SchemaStartEnvironmentResponse extends StObject {
  
  /**
    * Environment that was started.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.native
}
object SchemaStartEnvironmentResponse {
  
  @scala.inline
  def apply(): SchemaStartEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartEnvironmentResponse]
  }
  
  @scala.inline
  implicit class SchemaStartEnvironmentResponseMutableBuilder[Self <: SchemaStartEnvironmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: SchemaEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
