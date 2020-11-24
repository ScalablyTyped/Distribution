package typings.maximMazurokGapiClientBigquery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Labels extends js.Object {
  
  var labels: js.UndefOr[js.Array[String]] = js.native
  
  var lossType: js.UndefOr[String] = js.native
  
  var modelType: js.UndefOr[String] = js.native
}
object Labels {
  
  @scala.inline
  def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  
  @scala.inline
  implicit class LabelsOps[Self <: Labels] (val x: Self) extends AnyVal {
    
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
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLossType(value: String): Self = this.set("lossType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLossType: Self = this.set("lossType", js.undefined)
    
    @scala.inline
    def setModelType(value: String): Self = this.set("modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelType: Self = this.set("modelType", js.undefined)
  }
}
