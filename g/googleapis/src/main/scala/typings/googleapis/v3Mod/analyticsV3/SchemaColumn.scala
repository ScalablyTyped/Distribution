package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a metadata column.
  */
trait SchemaColumn extends StObject {
  
  /**
    * Map of attribute name and value for this column.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Column id.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for Analytics column.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaColumn {
  
  inline def apply(): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumn]
  }
  
  extension [Self <: SchemaColumn](x: Self) {
    
    inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
