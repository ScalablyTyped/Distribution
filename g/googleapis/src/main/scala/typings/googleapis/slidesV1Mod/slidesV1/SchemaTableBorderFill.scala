package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The fill of the border.
  */
trait SchemaTableBorderFill extends StObject {
  
  /**
    * Solid fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.undefined
}
object SchemaTableBorderFill {
  
  @scala.inline
  def apply(): SchemaTableBorderFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderFill]
  }
  
  @scala.inline
  implicit class SchemaTableBorderFillMutableBuilder[Self <: SchemaTableBorderFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolidFill(value: SchemaSolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
