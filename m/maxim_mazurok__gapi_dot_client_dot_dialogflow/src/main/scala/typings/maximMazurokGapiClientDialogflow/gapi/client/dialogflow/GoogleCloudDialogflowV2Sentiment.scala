package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2Sentiment extends js.Object {
  
  /** A non-negative number in the [0, +inf) range, which represents the absolute magnitude of sentiment, regardless of score (positive or negative). */
  var magnitude: js.UndefOr[Double] = js.native
  
  /** Sentiment score between -1.0 (negative sentiment) and 1.0 (positive sentiment). */
  var score: js.UndefOr[Double] = js.native
}
object GoogleCloudDialogflowV2Sentiment {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Sentiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Sentiment]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2SentimentOps[Self <: GoogleCloudDialogflowV2Sentiment] (val x: Self) extends AnyVal {
    
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
    def setMagnitude(value: Double): Self = this.set("magnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagnitude: Self = this.set("magnitude", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
}
