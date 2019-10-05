package typings.jsforce.describeDashResultMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSObjectResult extends js.Object {
  var actionOverrides: js.UndefOr[maybe[js.Array[ActionOverride]]] = js.undefined
  var activateable: Boolean
  var childRelationships: js.Array[ChildRelationship]
  var compactLayoutable: Boolean
  var createable: Boolean
  var custom: Boolean
  var customSetting: Boolean
  var deletable: Boolean
  var deprecatedAndHidden: Boolean
  var feedEnabled: Boolean
  var fields: js.Array[Field]
  var keyPrefix: js.UndefOr[maybe[String]] = js.undefined
  var label: String
  var labelPlural: String
  var layoutable: Boolean
  var listviewable: js.UndefOr[maybe[Boolean]] = js.undefined
  var lookupLayoutable: js.UndefOr[maybe[Boolean]] = js.undefined
  var mergeable: Boolean
  var mruEnabled: Boolean
  var name: String
  var namedLayoutInfos: js.Array[NamedLayoutInfo]
  var networkScopeFieldName: js.UndefOr[maybe[String]] = js.undefined
  var queryable: Boolean
  var recordTypeInfos: js.Array[RecordTypeInfo]
  var replicateable: Boolean
  var retrieveable: Boolean
  var searchLayoutable: Boolean
  var searchable: Boolean
  var supportedScopes: js.Array[ScopeInfo]
  var triggerable: Boolean
  var undeletable: Boolean
  var updateable: Boolean
  var urlDetail: js.UndefOr[String] = js.undefined
  var urlEdit: js.UndefOr[String] = js.undefined
  var urlNew: js.UndefOr[String] = js.undefined
  var urls: Record[String, String]
}

object DescribeSObjectResult {
  @scala.inline
  def apply(
    activateable: Boolean,
    childRelationships: js.Array[ChildRelationship],
    compactLayoutable: Boolean,
    createable: Boolean,
    custom: Boolean,
    customSetting: Boolean,
    deletable: Boolean,
    deprecatedAndHidden: Boolean,
    feedEnabled: Boolean,
    fields: js.Array[Field],
    label: String,
    labelPlural: String,
    layoutable: Boolean,
    mergeable: Boolean,
    mruEnabled: Boolean,
    name: String,
    namedLayoutInfos: js.Array[NamedLayoutInfo],
    queryable: Boolean,
    recordTypeInfos: js.Array[RecordTypeInfo],
    replicateable: Boolean,
    retrieveable: Boolean,
    searchLayoutable: Boolean,
    searchable: Boolean,
    supportedScopes: js.Array[ScopeInfo],
    triggerable: Boolean,
    undeletable: Boolean,
    updateable: Boolean,
    urls: Record[String, String],
    actionOverrides: maybe[js.Array[ActionOverride]] = null,
    keyPrefix: maybe[String] = null,
    listviewable: js.UndefOr[Boolean] = js.undefined,
    lookupLayoutable: js.UndefOr[Boolean] = js.undefined,
    networkScopeFieldName: maybe[String] = null,
    urlDetail: String = null,
    urlEdit: String = null,
    urlNew: String = null
  ): DescribeSObjectResult = {
    val __obj = js.Dynamic.literal(activateable = activateable, childRelationships = childRelationships, compactLayoutable = compactLayoutable, createable = createable, custom = custom, customSetting = customSetting, deletable = deletable, deprecatedAndHidden = deprecatedAndHidden, feedEnabled = feedEnabled, fields = fields, label = label, labelPlural = labelPlural, layoutable = layoutable, mergeable = mergeable, mruEnabled = mruEnabled, name = name, namedLayoutInfos = namedLayoutInfos, queryable = queryable, recordTypeInfos = recordTypeInfos, replicateable = replicateable, retrieveable = retrieveable, searchLayoutable = searchLayoutable, searchable = searchable, supportedScopes = supportedScopes, triggerable = triggerable, undeletable = undeletable, updateable = updateable, urls = urls)
    if (actionOverrides != null) __obj.updateDynamic("actionOverrides")(actionOverrides.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(listviewable)) __obj.updateDynamic("listviewable")(listviewable)
    if (!js.isUndefined(lookupLayoutable)) __obj.updateDynamic("lookupLayoutable")(lookupLayoutable)
    if (networkScopeFieldName != null) __obj.updateDynamic("networkScopeFieldName")(networkScopeFieldName.asInstanceOf[js.Any])
    if (urlDetail != null) __obj.updateDynamic("urlDetail")(urlDetail)
    if (urlEdit != null) __obj.updateDynamic("urlEdit")(urlEdit)
    if (urlNew != null) __obj.updateDynamic("urlNew")(urlNew)
    __obj.asInstanceOf[DescribeSObjectResult]
  }
}

