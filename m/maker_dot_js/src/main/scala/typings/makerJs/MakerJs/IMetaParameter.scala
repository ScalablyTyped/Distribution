package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a parameter and its limits.
  */
@js.native
trait IMetaParameter extends js.Object {
  
  /**
    * Optional maximum value of the range.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Optional minimum value of the range.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Optional step value between min and max.
    */
  var step: js.UndefOr[Double] = js.native
  
  /**
    * Display text of the parameter.
    */
  var title: String = js.native
  
  /**
    * Type of the parameter. Currently supports "range".
    */
  var `type`: String = js.native
  
  /**
    * Initial sample value for this parameter.
    */
  var value: js.Any = js.native
}
object IMetaParameter {
  
  @scala.inline
  def apply(title: String, `type`: String, value: js.Any): IMetaParameter = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaParameter]
  }
  
  @scala.inline
  implicit class IMetaParameterOps[Self <: IMetaParameter] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
