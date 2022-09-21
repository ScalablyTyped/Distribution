package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateDatabaseMetadata extends StObject {
  
  /**
    * The database being created.
    */
  var database: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateDatabaseMetadata {
  
  inline def apply(): SchemaCreateDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDatabaseMetadata]
  }
  
  extension [Self <: SchemaCreateDatabaseMetadata](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
  }
}
