package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsReleasesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * `Release` filter. The list method supports filters with restrictions on
    * the `Release.name`, `Release.ruleset_name`, and
    * `Release.test_suite_name`.  Example 1: A filter of 'name=prod*' might
    * return `Release`s with names within 'projects/foo' prefixed with 'prod':
    * Name                          | Ruleset Name
    * ------------------------------|------------- projects/foo/releases/prod
    * | projects/foo/rulesets/uuid1234 projects/foo/releases/prod/v1 |
    * projects/foo/rulesets/uuid1234 projects/foo/releases/prod/v2 |
    * projects/foo/rulesets/uuid8888  Example 2: A filter of `name=prod*
    * ruleset_name=uuid1234` would return only `Release` instances for
    * 'projects/foo' with names prefixed with 'prod' referring to the same
    * `Ruleset` name of 'uuid1234':  Name                          | Ruleset
    * Name ------------------------------|-------------
    * projects/foo/releases/prod    | projects/foo/rulesets/1234
    * projects/foo/releases/prod/v1 | projects/foo/rulesets/1234  In the
    * examples, the filter parameters refer to the search filters are relative
    * to the project. Fully qualified prefixed may also be used. e.g.
    * `test_suite_name=projects/foo/testsuites/uuid1`
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Resource name for the project.  Format: `projects/{project_id}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is
    * just a hint and the service may choose to load fewer than `page_size`
    * results due to the size of the output. To traverse all of the releases,
    * the caller should iterate until the `page_token` on the response is
    * empty.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Next page token for the next batch of `Release` instances.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsReleasesList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    filter: String = null,
    key: String = null,
    name: String = null,
    oauth_token: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsReleasesList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsReleasesList]
  }
}

