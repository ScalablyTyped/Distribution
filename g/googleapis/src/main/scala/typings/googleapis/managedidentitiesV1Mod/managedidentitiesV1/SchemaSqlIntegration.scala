package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlIntegration extends StObject {
  
  /**
    * Output only. The time the SQL integration was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique name of the SQL integration in the form of `projects/{project_id\}/locations/global/domains/{domain_name\}/sqlIntegrations/{sql_integration\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of an integrated SQL instance
    */
  var sqlInstance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the SQL integration.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the SQL integration was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaSqlIntegration {
  
  inline def apply(): SchemaSqlIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlIntegration]
  }
  
  extension [Self <: SchemaSqlIntegration](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSqlInstance(value: String): Self = StObject.set(x, "sqlInstance", value.asInstanceOf[js.Any])
    
    inline def setSqlInstanceNull: Self = StObject.set(x, "sqlInstance", null)
    
    inline def setSqlInstanceUndefined: Self = StObject.set(x, "sqlInstance", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
