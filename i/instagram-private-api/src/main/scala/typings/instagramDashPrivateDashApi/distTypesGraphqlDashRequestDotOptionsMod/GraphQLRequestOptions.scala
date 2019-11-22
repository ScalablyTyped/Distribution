package typings.instagramDashPrivateDashApi.distTypesGraphqlDashRequestDotOptionsMod

import typings.instagramDashPrivateDashApi.Anon_FriendlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var documentId: String
  var surface: Anon_FriendlyName
  var variables: js.Any
}

object GraphQLRequestOptions {
  @scala.inline
  def apply(documentId: String, surface: Anon_FriendlyName, variables: js.Any, accessToken: String = null): GraphQLRequestOptions = {
    val __obj = js.Dynamic.literal(documentId = documentId, surface = surface, variables = variables)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    __obj.asInstanceOf[GraphQLRequestOptions]
  }
}

