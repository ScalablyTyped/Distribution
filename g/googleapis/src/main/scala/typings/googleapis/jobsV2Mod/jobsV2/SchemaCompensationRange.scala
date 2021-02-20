package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compensation range.
  */
@js.native
trait SchemaCompensationRange extends StObject {
  
  /**
    * Optional.  The maximum amount of compensation. If left empty, the value
    * is set to a maximal compensation value and the currency code is set to
    * match the currency code of min_compensation.
    */
  var max: js.UndefOr[SchemaMoney] = js.native
  
  /**
    * Optional.  The minimum amount of compensation. If left empty, the value
    * is set to zero and the currency code is set to match the currency code of
    * max_compensation.
    */
  var min: js.UndefOr[SchemaMoney] = js.native
}
object SchemaCompensationRange {
  
  @scala.inline
  def apply(): SchemaCompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationRange]
  }
  
  @scala.inline
  implicit class SchemaCompensationRangeMutableBuilder[Self <: SchemaCompensationRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: SchemaMoney): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: SchemaMoney): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
