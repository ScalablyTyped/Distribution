package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The page background fill.
  */
@js.native
trait SchemaPageBackgroundFill extends StObject {
  
  /**
    * The background fill property state.  Updating the fill on a page will
    * implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no fill on a page, set this field
    * to `NOT_RENDERED`. In this case, any other fill fields set in the same
    * request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.native
  
  /**
    * Stretched picture fill.
    */
  var stretchedPictureFill: js.UndefOr[SchemaStretchedPictureFill] = js.native
}
object SchemaPageBackgroundFill {
  
  @scala.inline
  def apply(): SchemaPageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageBackgroundFill]
  }
  
  @scala.inline
  implicit class SchemaPageBackgroundFillMutableBuilder[Self <: SchemaPageBackgroundFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    @scala.inline
    def setSolidFill(value: SchemaSolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
    
    @scala.inline
    def setStretchedPictureFill(value: SchemaStretchedPictureFill): Self = StObject.set(x, "stretchedPictureFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchedPictureFillUndefined: Self = StObject.set(x, "stretchedPictureFill", js.undefined)
  }
}
