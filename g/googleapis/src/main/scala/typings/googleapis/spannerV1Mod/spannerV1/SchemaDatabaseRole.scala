package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatabaseRole extends StObject {
  
  /**
    * Required. The name of the database role. Values are of the form `projects//instances//databases//databaseRoles/ {role\}`, where `` is as specified in the `CREATE ROLE` DDL statement. This name can be passed to Get/Set IAMPolicy methods to identify the database role.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatabaseRole {
  
  inline def apply(): SchemaDatabaseRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseRole]
  }
  
  extension [Self <: SchemaDatabaseRole](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
