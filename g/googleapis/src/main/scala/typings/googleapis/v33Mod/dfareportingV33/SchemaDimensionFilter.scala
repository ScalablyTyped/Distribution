package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a dimension filter.
  */
trait SchemaDimensionFilter extends StObject {
  
  /**
    * The name of the dimension to filter.
    */
  var dimensionName: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#dimensionFilter.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the dimension to filter.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaDimensionFilter {
  
  inline def apply(): SchemaDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionFilter]
  }
  
  extension [Self <: SchemaDimensionFilter](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
