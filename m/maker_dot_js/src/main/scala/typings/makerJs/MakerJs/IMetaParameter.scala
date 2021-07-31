package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a parameter and its limits.
  */
trait IMetaParameter extends StObject {
  
  /**
    * Optional maximum value of the range.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional minimum value of the range.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional step value between min and max.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * Display text of the parameter.
    */
  var title: String
  
  /**
    * Type of the parameter. Currently supports "range".
    */
  var `type`: String
  
  /**
    * Initial sample value for this parameter.
    */
  var value: js.Any
}
object IMetaParameter {
  
  @scala.inline
  def apply(title: String, `type`: String, value: js.Any): IMetaParameter = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaParameter]
  }
  
  @scala.inline
  implicit class IMetaParameterMutableBuilder[Self <: IMetaParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
