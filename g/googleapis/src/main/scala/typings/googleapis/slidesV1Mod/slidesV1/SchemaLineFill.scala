package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The fill of the line.
  */
trait SchemaLineFill extends StObject {
  
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.undefined
}
object SchemaLineFill {
  
  @scala.inline
  def apply(): SchemaLineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineFill]
  }
  
  @scala.inline
  implicit class SchemaLineFillMutableBuilder[Self <: SchemaLineFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolidFill(value: SchemaSolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
