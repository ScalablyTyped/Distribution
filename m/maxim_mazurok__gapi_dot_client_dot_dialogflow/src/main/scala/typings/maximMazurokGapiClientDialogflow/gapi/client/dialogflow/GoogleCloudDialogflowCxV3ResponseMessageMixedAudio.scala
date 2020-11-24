package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3ResponseMessageMixedAudio extends js.Object {
  
  /** Segments this audio response is composed of. */
  var segments: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]] = js.native
}
object GoogleCloudDialogflowCxV3ResponseMessageMixedAudio {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3ResponseMessageMixedAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageMixedAudio]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3ResponseMessageMixedAudioOps[Self <: GoogleCloudDialogflowCxV3ResponseMessageMixedAudio] (val x: Self) extends AnyVal {
    
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
    def setSegmentsVarargs(value: GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
  }
}
