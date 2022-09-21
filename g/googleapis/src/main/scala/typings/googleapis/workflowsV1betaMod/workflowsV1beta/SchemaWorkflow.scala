package typings.googleapis.workflowsV1betaMod.workflowsV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkflow extends StObject {
  
  /**
    * Output only. The timestamp of when the workflow was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The resource name of the workflow. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp that the latest revision of the workflow was created.
    */
  var revisionCreateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The revision of the workflow. A new revision of a workflow is created as a result of updating the following properties of a workflow: - Service account - Workflow code to be executed The format is "000001-a4d", where the first 6 characters define the zero-padded revision ordinal number. They are followed by a hyphen and 3 hexadecimal random characters.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow has. Format: projects/{project\}/serviceAccounts/{account\} or {account\} Using `-` as a wildcard for the `{project\}` or not providing one at all will infer the project from the account. The `{account\}` value can be the `email` address or the `unique_id` of the service account. If not provided, workflow will use the project's default service account. Modifying this field for an existing workflow results in a new workflow revision.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Workflow code to be executed. The size limit is 128KB.
    */
  var sourceContents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the workflow deployment.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last update timestamp of the workflow.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkflow {
  
  inline def apply(): SchemaWorkflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflow]
  }
  
  extension [Self <: SchemaWorkflow](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRevisionCreateTime(value: String): Self = StObject.set(x, "revisionCreateTime", value.asInstanceOf[js.Any])
    
    inline def setRevisionCreateTimeNull: Self = StObject.set(x, "revisionCreateTime", null)
    
    inline def setRevisionCreateTimeUndefined: Self = StObject.set(x, "revisionCreateTime", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setSourceContents(value: String): Self = StObject.set(x, "sourceContents", value.asInstanceOf[js.Any])
    
    inline def setSourceContentsNull: Self = StObject.set(x, "sourceContents", null)
    
    inline def setSourceContentsUndefined: Self = StObject.set(x, "sourceContents", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
