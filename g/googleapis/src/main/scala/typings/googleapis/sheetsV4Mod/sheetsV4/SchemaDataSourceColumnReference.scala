package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceColumnReference extends StObject {
  
  /**
    * The display name of the column. It should be unique within a data source.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataSourceColumnReference {
  
  inline def apply(): SchemaDataSourceColumnReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceColumnReference]
  }
  
  extension [Self <: SchemaDataSourceColumnReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
