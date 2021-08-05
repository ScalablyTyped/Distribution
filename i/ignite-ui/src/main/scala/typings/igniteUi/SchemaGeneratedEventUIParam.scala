package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeneratedEventUIParam extends StObject {
  
  /**
    * Gets reference to data source.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to data source schema.
    */
  var schema: js.UndefOr[js.Any] = js.undefined
}
object SchemaGeneratedEventUIParam {
  
  inline def apply(): SchemaGeneratedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedEventUIParam]
  }
  
  extension [Self <: SchemaGeneratedEventUIParam](x: Self) {
    
    inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSchema(value: js.Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
