package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. See CompensationInfo.  Compensation range.
  */
@js.native
trait SchemaExtendedCompensationInfoCompensationRange extends StObject {
  
  /**
    * Required.  Maximum value.
    */
  var max: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
  
  /**
    * Required.  Minimum value.
    */
  var min: js.UndefOr[SchemaExtendedCompensationInfoDecimal] = js.native
}
object SchemaExtendedCompensationInfoCompensationRange {
  
  @scala.inline
  def apply(): SchemaExtendedCompensationInfoCompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtendedCompensationInfoCompensationRange]
  }
  
  @scala.inline
  implicit class SchemaExtendedCompensationInfoCompensationRangeMutableBuilder[Self <: SchemaExtendedCompensationInfoCompensationRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: SchemaExtendedCompensationInfoDecimal): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: SchemaExtendedCompensationInfoDecimal): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
