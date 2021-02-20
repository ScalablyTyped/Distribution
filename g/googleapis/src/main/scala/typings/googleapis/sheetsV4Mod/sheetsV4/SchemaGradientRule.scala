package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule that applies a gradient color scale format, based on the
  * interpolation points listed. The format of a cell will vary based on its
  * contents as compared to the values of the interpolation points.
  */
@js.native
trait SchemaGradientRule extends StObject {
  
  /**
    * The final interpolation point.
    */
  var maxpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
  
  /**
    * An optional midway interpolation point.
    */
  var midpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
  
  /**
    * The starting interpolation point.
    */
  var minpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
}
object SchemaGradientRule {
  
  @scala.inline
  def apply(): SchemaGradientRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGradientRule]
  }
  
  @scala.inline
  implicit class SchemaGradientRuleMutableBuilder[Self <: SchemaGradientRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxpoint(value: SchemaInterpolationPoint): Self = StObject.set(x, "maxpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxpointUndefined: Self = StObject.set(x, "maxpoint", js.undefined)
    
    @scala.inline
    def setMidpoint(value: SchemaInterpolationPoint): Self = StObject.set(x, "midpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidpointUndefined: Self = StObject.set(x, "midpoint", js.undefined)
    
    @scala.inline
    def setMinpoint(value: SchemaInterpolationPoint): Self = StObject.set(x, "minpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinpointUndefined: Self = StObject.set(x, "minpoint", js.undefined)
  }
}
