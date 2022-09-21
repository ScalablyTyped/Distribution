package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Session extends StObject {
  
  /**
    * Output only. Session start time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The relative resource name of the content, of the form: projects/{project_id\}/locations/{location_id\}/lakes/{lake_id\}/environment/{environment_id\}/sessions/{session_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Email of user running the session.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Session {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Session]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Session](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
