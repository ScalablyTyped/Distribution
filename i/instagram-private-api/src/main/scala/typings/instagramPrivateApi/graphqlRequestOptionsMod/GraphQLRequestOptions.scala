package typings.instagramPrivateApi.graphqlRequestOptionsMod

import typings.instagramPrivateApi.AnonFriendlyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var documentId: String
  var surface: AnonFriendlyName
  var variables: js.Any
}

object GraphQLRequestOptions {
  @scala.inline
  def apply(documentId: String, surface: AnonFriendlyName, variables: js.Any, accessToken: String = null): GraphQLRequestOptions = {
    val __obj = js.Dynamic.literal(documentId = documentId.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestOptions]
  }
}

