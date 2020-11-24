package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for predictions to be issued against a trained model.
  */
@js.native
trait SchemaGoogleCloudMlV1PredictRequest extends js.Object {
  
  /**
    *  Required. The prediction request body.
    */
  var httpBody: js.UndefOr[SchemaGoogleApiHttpBody] = js.native
}
object SchemaGoogleCloudMlV1PredictRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1PredictRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1PredictRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1PredictRequestOps[Self <: SchemaGoogleCloudMlV1PredictRequest] (val x: Self) extends AnyVal {
    
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
    def setHttpBody(value: SchemaGoogleApiHttpBody): Self = this.set("httpBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpBody: Self = this.set("httpBody", js.undefined)
  }
}
