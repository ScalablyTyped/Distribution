package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1SentimentConfig extends js.Object {
  
  /** If set to true, contributors will have the option to select sentiment of the label they selected, to mark it as negative or positive label. Default is false. */
  var enableLabelSentimentSelection: js.UndefOr[Boolean] = js.native
}
object GoogleCloudDatalabelingV1beta1SentimentConfig {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1SentimentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SentimentConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1SentimentConfigOps[Self <: GoogleCloudDatalabelingV1beta1SentimentConfig] (val x: Self) extends AnyVal {
    
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
    def setEnableLabelSentimentSelection(value: Boolean): Self = this.set("enableLabelSentimentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLabelSentimentSelection: Self = this.set("enableLabelSentimentSelection", js.undefined)
  }
}
