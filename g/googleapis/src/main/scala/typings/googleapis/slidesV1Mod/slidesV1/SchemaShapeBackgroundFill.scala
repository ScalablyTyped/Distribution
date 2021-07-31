package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The shape background fill.
  */
trait SchemaShapeBackgroundFill extends StObject {
  
  /**
    * The background fill property state.  Updating the fill on a shape will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no fill on a shape, set this field
    * to `NOT_RENDERED`. In this case, any other fill fields set in the same
    * request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.undefined
  
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.undefined
}
object SchemaShapeBackgroundFill {
  
  @scala.inline
  def apply(): SchemaShapeBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShapeBackgroundFill]
  }
  
  @scala.inline
  implicit class SchemaShapeBackgroundFillMutableBuilder[Self <: SchemaShapeBackgroundFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    @scala.inline
    def setSolidFill(value: SchemaSolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
