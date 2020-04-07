package typings.googleapis.kgsearchV1Mod.kgsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEntitiesSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The list of entity id to be used for search instead of query string. To
    * specify multiple ids in the HTTP request, repeat the parameter in the URL
    * as in ...?ids=A&ids=B
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Enables indenting of json results.
    */
  var indent: js.UndefOr[Boolean] = js.native
  /**
    * The list of language codes (defined in ISO 693) to run the query with,
    * e.g. 'en'.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Limits the number of entities to be returned.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Enables prefix match against names and aliases of entities
    */
  var prefix: js.UndefOr[Boolean] = js.native
  /**
    * The literal query string for search.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Restricts returned entities with these types, e.g. Person (as defined in
    * http://schema.org/Person). If multiple types are specified, returned
    * entities will contain one or more of these types.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceEntitiesSearch {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    ids: js.Array[String] = null,
    indent: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    languages: js.Array[String] = null,
    limit: Int | Double = null,
    oauth_token: String = null,
    prefix: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    query: String = null,
    quotaUser: String = null,
    types: js.Array[String] = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceEntitiesSearch = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceEntitiesSearch]
  }
}

