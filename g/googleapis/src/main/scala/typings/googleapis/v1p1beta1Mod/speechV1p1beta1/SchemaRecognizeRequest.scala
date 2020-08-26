package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level message sent by the client for the `Recognize` method.
  */
@js.native
trait SchemaRecognizeRequest extends js.Object {
  /**
    * *Required* The audio data to be recognized.
    */
  var audio: js.UndefOr[SchemaRecognitionAudio] = js.native
  /**
    * *Required* Provides information to the recognizer that specifies how to
    * process the request.
    */
  var config: js.UndefOr[SchemaRecognitionConfig] = js.native
  /**
    * *Optional* The name of the model to use for recognition.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaRecognizeRequest {
  @scala.inline
  def apply(): SchemaRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognizeRequest]
  }
  @scala.inline
  implicit class SchemaRecognizeRequestOps[Self <: SchemaRecognizeRequest] (val x: Self) extends AnyVal {
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
    def setAudio(value: SchemaRecognitionAudio): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setConfig(value: SchemaRecognitionConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

