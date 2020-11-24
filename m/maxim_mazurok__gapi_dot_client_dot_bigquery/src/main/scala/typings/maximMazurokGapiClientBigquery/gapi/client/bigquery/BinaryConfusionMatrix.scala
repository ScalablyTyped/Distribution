package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryConfusionMatrix extends js.Object {
  
  /** The fraction of predictions given the correct label. */
  var accuracy: js.UndefOr[Double] = js.native
  
  /** The equally weighted average of recall and precision. */
  var f1Score: js.UndefOr[Double] = js.native
  
  /** Number of false samples predicted as false. */
  var falseNegatives: js.UndefOr[String] = js.native
  
  /** Number of false samples predicted as true. */
  var falsePositives: js.UndefOr[String] = js.native
  
  /** Threshold value used when computing each of the following metric. */
  var positiveClassThreshold: js.UndefOr[Double] = js.native
  
  /** The fraction of actual positive predictions that had positive actual labels. */
  var precision: js.UndefOr[Double] = js.native
  
  /** The fraction of actual positive labels that were given a positive prediction. */
  var recall: js.UndefOr[Double] = js.native
  
  /** Number of true samples predicted as false. */
  var trueNegatives: js.UndefOr[String] = js.native
  
  /** Number of true samples predicted as true. */
  var truePositives: js.UndefOr[String] = js.native
}
object BinaryConfusionMatrix {
  
  @scala.inline
  def apply(): BinaryConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryConfusionMatrix]
  }
  
  @scala.inline
  implicit class BinaryConfusionMatrixOps[Self <: BinaryConfusionMatrix] (val x: Self) extends AnyVal {
    
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    
    @scala.inline
    def setF1Score(value: Double): Self = this.set("f1Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF1Score: Self = this.set("f1Score", js.undefined)
    
    @scala.inline
    def setFalseNegatives(value: String): Self = this.set("falseNegatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFalseNegatives: Self = this.set("falseNegatives", js.undefined)
    
    @scala.inline
    def setFalsePositives(value: String): Self = this.set("falsePositives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFalsePositives: Self = this.set("falsePositives", js.undefined)
    
    @scala.inline
    def setPositiveClassThreshold(value: Double): Self = this.set("positiveClassThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositiveClassThreshold: Self = this.set("positiveClassThreshold", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setRecall(value: Double): Self = this.set("recall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecall: Self = this.set("recall", js.undefined)
    
    @scala.inline
    def setTrueNegatives(value: String): Self = this.set("trueNegatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrueNegatives: Self = this.set("trueNegatives", js.undefined)
    
    @scala.inline
    def setTruePositives(value: String): Self = this.set("truePositives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruePositives: Self = this.set("truePositives", js.undefined)
  }
}
