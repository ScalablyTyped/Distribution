package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnector extends StObject {
  
  /**
    * Output only. Created time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Description of the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Link to documentation page.
    */
  var documentationUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Link to external page.
    */
  var externalUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Flag to mark the version indicating the launch stage.
    */
  var launchStage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of the Connector. Format: projects/{project\}/locations/{location\}/providers/{provider\}/connectors/{connector\} Only global location is supported for Connector resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Updated time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Cloud storage location of icons etc consumed by UI.
    */
  var webAssetsLocation: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnector {
  
  inline def apply(): SchemaConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnector]
  }
  
  extension [Self <: SchemaConnector](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDocumentationUri(value: String): Self = StObject.set(x, "documentationUri", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUriNull: Self = StObject.set(x, "documentationUri", null)
    
    inline def setDocumentationUriUndefined: Self = StObject.set(x, "documentationUri", js.undefined)
    
    inline def setExternalUri(value: String): Self = StObject.set(x, "externalUri", value.asInstanceOf[js.Any])
    
    inline def setExternalUriNull: Self = StObject.set(x, "externalUri", null)
    
    inline def setExternalUriUndefined: Self = StObject.set(x, "externalUri", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStageNull: Self = StObject.set(x, "launchStage", null)
    
    inline def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWebAssetsLocation(value: String): Self = StObject.set(x, "webAssetsLocation", value.asInstanceOf[js.Any])
    
    inline def setWebAssetsLocationNull: Self = StObject.set(x, "webAssetsLocation", null)
    
    inline def setWebAssetsLocationUndefined: Self = StObject.set(x, "webAssetsLocation", js.undefined)
  }
}
