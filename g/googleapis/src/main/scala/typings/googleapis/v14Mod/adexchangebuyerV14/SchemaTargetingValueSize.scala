package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetingValueSize extends StObject {
  
  /**
    * The height of the creative.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The width of the creative.
    */
  var width: js.UndefOr[Double] = js.native
}
object SchemaTargetingValueSize {
  
  @scala.inline
  def apply(): SchemaTargetingValueSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueSize]
  }
  
  @scala.inline
  implicit class SchemaTargetingValueSizeMutableBuilder[Self <: SchemaTargetingValueSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
