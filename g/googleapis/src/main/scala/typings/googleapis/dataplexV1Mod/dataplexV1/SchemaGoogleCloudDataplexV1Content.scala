package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1Content extends StObject {
  
  /**
    * Output only. Content creation time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Content data in string format.
    */
  var dataText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Description of the content.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User defined labels for the content.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The relative resource name of the content, of the form: projects/{project_id\}/locations/{location_id\}/lakes/{lake_id\}/content/{content_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notebook related configurations.
    */
  var notebook: js.UndefOr[SchemaGoogleCloudDataplexV1ContentNotebook] = js.undefined
  
  /**
    * Required. The path for the Content file, represented as directory structure. Unique within a lake. Limited to alphanumerics, hyphens, underscores, dots and slashes.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sql Script related configurations.
    */
  var sqlScript: js.UndefOr[SchemaGoogleCloudDataplexV1ContentSqlScript] = js.undefined
  
  /**
    * Output only. System generated globally unique ID for the content. This ID will be different if the content is deleted and re-created with the same name.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the content was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1Content {
  
  inline def apply(): SchemaGoogleCloudDataplexV1Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1Content]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1Content](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataText(value: String): Self = StObject.set(x, "dataText", value.asInstanceOf[js.Any])
    
    inline def setDataTextNull: Self = StObject.set(x, "dataText", null)
    
    inline def setDataTextUndefined: Self = StObject.set(x, "dataText", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotebook(value: SchemaGoogleCloudDataplexV1ContentNotebook): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    
    inline def setNotebookUndefined: Self = StObject.set(x, "notebook", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSqlScript(value: SchemaGoogleCloudDataplexV1ContentSqlScript): Self = StObject.set(x, "sqlScript", value.asInstanceOf[js.Any])
    
    inline def setSqlScriptUndefined: Self = StObject.set(x, "sqlScript", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
