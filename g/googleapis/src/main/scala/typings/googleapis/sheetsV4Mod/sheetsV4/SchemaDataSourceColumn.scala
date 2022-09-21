package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceColumn extends StObject {
  
  /**
    * The formula of the calculated column.
    */
  var formula: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The column reference.
    */
  var reference: js.UndefOr[SchemaDataSourceColumnReference] = js.undefined
}
object SchemaDataSourceColumn {
  
  inline def apply(): SchemaDataSourceColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceColumn]
  }
  
  extension [Self <: SchemaDataSourceColumn](x: Self) {
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaNull: Self = StObject.set(x, "formula", null)
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setReference(value: SchemaDataSourceColumnReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
