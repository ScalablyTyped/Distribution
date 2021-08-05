package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WritableSpecification extends StObject {
  
  /** A Database. */
  var db: Database
  
  /** The table or view's name. */
  var name: String
  
  /** The table's primary key. */
  var pk: String
  
  /** The name of the schema owning the table. */
  var schema: String
}
object WritableSpecification {
  
  inline def apply(db: Database, name: String, pk: String, schema: String): WritableSpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritableSpecification]
  }
  
  extension [Self <: WritableSpecification](x: Self) {
    
    inline def setDb(value: Database): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
