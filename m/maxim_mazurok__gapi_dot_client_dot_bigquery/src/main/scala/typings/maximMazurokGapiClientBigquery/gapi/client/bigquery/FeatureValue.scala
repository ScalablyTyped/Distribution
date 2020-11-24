package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureValue extends js.Object {
  
  /** The categorical feature value. */
  var categoricalValue: js.UndefOr[CategoricalValue] = js.native
  
  /** The feature column name. */
  var featureColumn: js.UndefOr[String] = js.native
  
  /** The numerical feature value. This is the centroid value for this feature. */
  var numericalValue: js.UndefOr[Double] = js.native
}
object FeatureValue {
  
  @scala.inline
  def apply(): FeatureValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureValue]
  }
  
  @scala.inline
  implicit class FeatureValueOps[Self <: FeatureValue] (val x: Self) extends AnyVal {
    
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
    def setCategoricalValue(value: CategoricalValue): Self = this.set("categoricalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoricalValue: Self = this.set("categoricalValue", js.undefined)
    
    @scala.inline
    def setFeatureColumn(value: String): Self = this.set("featureColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureColumn: Self = this.set("featureColumn", js.undefined)
    
    @scala.inline
    def setNumericalValue(value: Double): Self = this.set("numericalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericalValue: Self = this.set("numericalValue", js.undefined)
  }
}
