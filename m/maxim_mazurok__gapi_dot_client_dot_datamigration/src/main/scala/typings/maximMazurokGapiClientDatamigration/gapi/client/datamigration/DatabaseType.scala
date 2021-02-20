package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseType extends StObject {
  
  /** The database engine. */
  var engine: js.UndefOr[String] = js.native
  
  /** The database provider. */
  var provider: js.UndefOr[String] = js.native
}
object DatabaseType {
  
  @scala.inline
  def apply(): DatabaseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseType]
  }
  
  @scala.inline
  implicit class DatabaseTypeMutableBuilder[Self <: DatabaseType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
