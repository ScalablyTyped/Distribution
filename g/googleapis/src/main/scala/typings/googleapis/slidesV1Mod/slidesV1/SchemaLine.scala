package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement kind representing a non-connector line, straight connector,
  * curved connector, or bent connector.
  */
@js.native
trait SchemaLine extends StObject {
  
  /**
    * The category of the line.  It matches the `category` specified in
    * CreateLineRequest, and can be updated with UpdateLineCategoryRequest.
    */
  var lineCategory: js.UndefOr[String] = js.native
  
  /**
    * The properties of the line.
    */
  var lineProperties: js.UndefOr[SchemaLineProperties] = js.native
  
  /**
    * The type of the line.
    */
  var lineType: js.UndefOr[String] = js.native
}
object SchemaLine {
  
  @scala.inline
  def apply(): SchemaLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLine]
  }
  
  @scala.inline
  implicit class SchemaLineMutableBuilder[Self <: SchemaLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
    
    @scala.inline
    def setLineProperties(value: SchemaLineProperties): Self = StObject.set(x, "lineProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinePropertiesUndefined: Self = StObject.set(x, "lineProperties", js.undefined)
    
    @scala.inline
    def setLineType(value: String): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineTypeUndefined: Self = StObject.set(x, "lineType", js.undefined)
  }
}
