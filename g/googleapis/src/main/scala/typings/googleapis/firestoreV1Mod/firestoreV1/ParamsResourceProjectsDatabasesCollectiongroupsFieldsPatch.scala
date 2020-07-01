package typings.googleapis.firestoreV1Mod.firestoreV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A field name of the form
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
    * A field path may be a simple field name, e.g. `address` or a path to
    * fields within map_value , e.g. `address.city`, or a special field path.
    * The only valid special field is `*`, which represents any field.  Field
    * paths may be quoted using ` (backtick). The only character that needs to
    * be escaped within a quoted field path is the backtick character itself,
    * escaped using a backslash. Special characters in field paths that must be
    * quoted include: `*`, `.`, ``` (backtick), `[`, `]`, as well as any ascii
    * symbolic characters.  Examples: (Note: Comments here are written in
    * markdown syntax, so there is an  additional layer of backticks to
    * represent a code block) `\`address.city\`` represents a field named
    * `address.city`, not the map key `city` in the field `address`. `\`*\``
    * represents a field named `*`, not any field.  A special `Field` contains
    * the default indexing settings for all fields. This field's resource name
    * is:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/x`
    * Indexes defined on this `Field` will be applied to all fields which do
    * not have their own `Field` index configuration.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFirestoreAdminV1Field] = js.native
  /**
    * A mask, relative to the field. If specified, only configuration specified
    * by this field_mask will be updated in the field.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    name: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: SchemaGoogleFirestoreAdminV1Field = null,
    updateMask: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesCollectiongroupsFieldsPatch]
  }
}

