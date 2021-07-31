package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The range of the population values.
  */
trait SchemaRange extends StObject {
  
  /**
    * The maximum of the population values.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum of the population values.
    */
  var min: js.UndefOr[Double] = js.undefined
}
object SchemaRange {
  
  @scala.inline
  def apply(): SchemaRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRange]
  }
  
  @scala.inline
  implicit class SchemaRangeMutableBuilder[Self <: SchemaRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
