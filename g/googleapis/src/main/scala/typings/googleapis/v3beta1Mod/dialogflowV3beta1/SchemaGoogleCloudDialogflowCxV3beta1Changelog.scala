package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1Changelog extends StObject {
  
  /**
    * The action of the change.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp of the change.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The affected resource display name of the change.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of the changelog. Format: `projects//locations//agents//changelogs/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The affected resource name of the change.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The affected resource type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email address of the authenticated user.
    */
  var userEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1Changelog {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1Changelog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1Changelog]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1Changelog](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailNull: Self = StObject.set(x, "userEmail", null)
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
