package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalExplanation extends js.Object {
  
  /** Class label for this set of global explanations. Will be empty/null for binary logistic and linear regression models. Sorted alphabetically in descending order. */
  var classLabel: js.UndefOr[String] = js.native
  
  /** A list of the top global explanations. Sorted by absolute value of attribution in descending order. */
  var explanations: js.UndefOr[js.Array[Explanation]] = js.native
}
object GlobalExplanation {
  
  @scala.inline
  def apply(): GlobalExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalExplanation]
  }
  
  @scala.inline
  implicit class GlobalExplanationOps[Self <: GlobalExplanation] (val x: Self) extends AnyVal {
    
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
    def setClassLabel(value: String): Self = this.set("classLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassLabel: Self = this.set("classLabel", js.undefined)
    
    @scala.inline
    def setExplanationsVarargs(value: Explanation*): Self = this.set("explanations", js.Array(value :_*))
    
    @scala.inline
    def setExplanations(value: js.Array[Explanation]): Self = this.set("explanations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplanations: Self = this.set("explanations", js.undefined)
  }
}
