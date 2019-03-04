package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSObjectResult extends js.Object {
  var actionOverrides: js.UndefOr[maybe[js.Array[ActionOverride]]] = js.undefined
  var activateable: scala.Boolean
  var childRelationships: js.Array[ChildRelationship]
  var compactLayoutable: scala.Boolean
  var createable: scala.Boolean
  var custom: scala.Boolean
  var customSetting: scala.Boolean
  var deletable: scala.Boolean
  var deprecatedAndHidden: scala.Boolean
  var feedEnabled: scala.Boolean
  var fields: js.Array[Field]
  var keyPrefix: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var label: java.lang.String
  var labelPlural: java.lang.String
  var layoutable: scala.Boolean
  var listviewable: js.UndefOr[maybe[scala.Boolean]] = js.undefined
  var lookupLayoutable: js.UndefOr[maybe[scala.Boolean]] = js.undefined
  var mergeable: scala.Boolean
  var mruEnabled: scala.Boolean
  var name: java.lang.String
  var namedLayoutInfos: js.Array[NamedLayoutInfo]
  var networkScopeFieldName: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var queryable: scala.Boolean
  var recordTypeInfos: js.Array[RecordTypeInfo]
  var replicateable: scala.Boolean
  var retrieveable: scala.Boolean
  var searchLayoutable: scala.Boolean
  var searchable: scala.Boolean
  var supportedScopes: js.Array[ScopeInfo]
  var triggerable: scala.Boolean
  var undeletable: scala.Boolean
  var updateable: scala.Boolean
  var urlDetail: js.UndefOr[java.lang.String] = js.undefined
  var urlEdit: js.UndefOr[java.lang.String] = js.undefined
  var urlNew: js.UndefOr[java.lang.String] = js.undefined
  var urls: stdLib.Record[java.lang.String, java.lang.String]
}

object DescribeSObjectResult {
  @scala.inline
  def apply(
    activateable: scala.Boolean,
    childRelationships: js.Array[ChildRelationship],
    compactLayoutable: scala.Boolean,
    createable: scala.Boolean,
    custom: scala.Boolean,
    customSetting: scala.Boolean,
    deletable: scala.Boolean,
    deprecatedAndHidden: scala.Boolean,
    feedEnabled: scala.Boolean,
    fields: js.Array[Field],
    label: java.lang.String,
    labelPlural: java.lang.String,
    layoutable: scala.Boolean,
    mergeable: scala.Boolean,
    mruEnabled: scala.Boolean,
    name: java.lang.String,
    namedLayoutInfos: js.Array[NamedLayoutInfo],
    queryable: scala.Boolean,
    recordTypeInfos: js.Array[RecordTypeInfo],
    replicateable: scala.Boolean,
    retrieveable: scala.Boolean,
    searchLayoutable: scala.Boolean,
    searchable: scala.Boolean,
    supportedScopes: js.Array[ScopeInfo],
    triggerable: scala.Boolean,
    undeletable: scala.Boolean,
    updateable: scala.Boolean,
    urls: stdLib.Record[java.lang.String, java.lang.String],
    actionOverrides: maybe[js.Array[ActionOverride]] = null,
    keyPrefix: maybe[java.lang.String] = null,
    listviewable: maybe[scala.Boolean] = null,
    lookupLayoutable: maybe[scala.Boolean] = null,
    networkScopeFieldName: maybe[java.lang.String] = null,
    urlDetail: java.lang.String = null,
    urlEdit: java.lang.String = null,
    urlNew: java.lang.String = null
  ): DescribeSObjectResult = {
    val __obj = js.Dynamic.literal(activateable = activateable, childRelationships = childRelationships, compactLayoutable = compactLayoutable, createable = createable, custom = custom, customSetting = customSetting, deletable = deletable, deprecatedAndHidden = deprecatedAndHidden, feedEnabled = feedEnabled, fields = fields, label = label, labelPlural = labelPlural, layoutable = layoutable, mergeable = mergeable, mruEnabled = mruEnabled, name = name, namedLayoutInfos = namedLayoutInfos, queryable = queryable, recordTypeInfos = recordTypeInfos, replicateable = replicateable, retrieveable = retrieveable, searchLayoutable = searchLayoutable, searchable = searchable, supportedScopes = supportedScopes, triggerable = triggerable, undeletable = undeletable, updateable = updateable, urls = urls)
    if (actionOverrides != null) __obj.updateDynamic("actionOverrides")(actionOverrides.asInstanceOf[js.Any])
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    if (listviewable != null) __obj.updateDynamic("listviewable")(listviewable.asInstanceOf[js.Any])
    if (lookupLayoutable != null) __obj.updateDynamic("lookupLayoutable")(lookupLayoutable.asInstanceOf[js.Any])
    if (networkScopeFieldName != null) __obj.updateDynamic("networkScopeFieldName")(networkScopeFieldName.asInstanceOf[js.Any])
    if (urlDetail != null) __obj.updateDynamic("urlDetail")(urlDetail)
    if (urlEdit != null) __obj.updateDynamic("urlEdit")(urlEdit)
    if (urlNew != null) __obj.updateDynamic("urlNew")(urlNew)
    __obj.asInstanceOf[DescribeSObjectResult]
  }
}

