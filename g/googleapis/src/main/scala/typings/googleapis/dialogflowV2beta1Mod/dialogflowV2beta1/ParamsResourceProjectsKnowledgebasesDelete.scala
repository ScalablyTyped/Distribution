package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsKnowledgebasesDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. Force deletes the knowledge base. When set to true, any
    * documents in the knowledge base are also deleted.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * Required. The name of the knowledge base to delete. Format:
    * `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    */
  var name: js.UndefOr[String] = js.native
}

