package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseConfig extends StObject {
  
  /**
    * Optional. Cloud SQL machine type used by Airflow database. It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified,
    * db-n1-standard-2 will be used. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
    */
  var machineType: js.UndefOr[String] = js.undefined
}
object DatabaseConfig {
  
  inline def apply(): DatabaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseConfig] (val x: Self) extends AnyVal {
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
  }
}
