package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseType extends StObject {
  
  /** The database engine. */
  var engine: js.UndefOr[String] = js.undefined
  
  /** The database provider. */
  var provider: js.UndefOr[String] = js.undefined
}
object DatabaseType {
  
  inline def apply(): DatabaseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseType]
  }
  
  extension [Self <: DatabaseType](x: Self) {
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
