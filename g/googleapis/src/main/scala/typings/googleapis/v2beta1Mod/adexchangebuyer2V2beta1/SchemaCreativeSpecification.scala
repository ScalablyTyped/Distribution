package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information for a creative that is associated with a
  * Programmatic Guaranteed/Preferred Deal in Ad Manager.
  */
@js.native
trait SchemaCreativeSpecification extends StObject {
  
  /**
    * Companion sizes may be filled in only when this is a video creative.
    */
  var creativeCompanionSizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
  
  /**
    * The size of the creative.
    */
  var creativeSize: js.UndefOr[SchemaAdSize] = js.native
}
object SchemaCreativeSpecification {
  
  @scala.inline
  def apply(): SchemaCreativeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSpecification]
  }
  
  @scala.inline
  implicit class SchemaCreativeSpecificationMutableBuilder[Self <: SchemaCreativeSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeCompanionSizes(value: js.Array[SchemaAdSize]): Self = StObject.set(x, "creativeCompanionSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeCompanionSizesUndefined: Self = StObject.set(x, "creativeCompanionSizes", js.undefined)
    
    @scala.inline
    def setCreativeCompanionSizesVarargs(value: SchemaAdSize*): Self = StObject.set(x, "creativeCompanionSizes", js.Array(value :_*))
    
    @scala.inline
    def setCreativeSize(value: SchemaAdSize): Self = StObject.set(x, "creativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSizeUndefined: Self = StObject.set(x, "creativeSize", js.undefined)
  }
}
