package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitySpecification extends StObject {
  
  /** A Database. */
  var db: Database
  
  /** Name of the loader that discovered the entity. */
  var loader: String
  
  /** The entity's name. */
  var name: String
  
  /** Path to the entity, if a file. */
  var path: String
  
  /** Entity's owning schema, if a database object. */
  var schema: String
}
object EntitySpecification {
  
  inline def apply(db: Database, loader: String, name: String, path: String, schema: String): EntitySpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySpecification]
  }
  
  extension [Self <: EntitySpecification](x: Self) {
    
    inline def setDb(value: Database): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
