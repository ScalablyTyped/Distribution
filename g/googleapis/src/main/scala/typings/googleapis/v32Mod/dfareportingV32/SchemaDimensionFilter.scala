package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a dimension filter.
  */
@js.native
trait SchemaDimensionFilter extends StObject {
  
  /**
    * The name of the dimension to filter.
    */
  var dimensionName: js.UndefOr[String] = js.native
  
  /**
    * The kind of resource this is, in this case dfareporting#dimensionFilter.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The value of the dimension to filter.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaDimensionFilter {
  
  @scala.inline
  def apply(): SchemaDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionFilter]
  }
  
  @scala.inline
  implicit class SchemaDimensionFilterMutableBuilder[Self <: SchemaDimensionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
