package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsKnowledgebasesDocumentsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The document resource name. The name must be empty when creating a
    * document. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base
    * ID>/documents/<Document ID>`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Document] = js.native
  /**
    * Optional. Not specified means `update all`. Currently, only
    * `display_name` can be updated, an InvalidArgument will be returned for
    * attempting to update other fields.
    */
  var updateMask: js.UndefOr[String] = js.native
}

