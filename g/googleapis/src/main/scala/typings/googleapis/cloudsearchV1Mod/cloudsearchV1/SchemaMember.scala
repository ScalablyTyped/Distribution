package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMember extends StObject {
  
  var roster: js.UndefOr[SchemaRoster] = js.undefined
  
  var user: js.UndefOr[SchemaUser] = js.undefined
}
object SchemaMember {
  
  inline def apply(): SchemaMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMember]
  }
  
  extension [Self <: SchemaMember](x: Self) {
    
    inline def setRoster(value: SchemaRoster): Self = StObject.set(x, "roster", value.asInstanceOf[js.Any])
    
    inline def setRosterUndefined: Self = StObject.set(x, "roster", js.undefined)
    
    inline def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
