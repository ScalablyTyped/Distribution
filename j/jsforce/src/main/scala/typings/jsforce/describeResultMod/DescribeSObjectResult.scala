package typings.jsforce.describeResultMod

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
    actionOverrides: js.UndefOr[Null | maybe[js.Array[ActionOverride]]] = js.undefined,
    keyPrefix: js.UndefOr[Null | maybe[String]] = js.undefined,
    listviewable: js.UndefOr[Null | maybe[Boolean]] = js.undefined,
    lookupLayoutable: js.UndefOr[Null | maybe[Boolean]] = js.undefined,
    networkScopeFieldName: js.UndefOr[Null | maybe[String]] = js.undefined,
    urlDetail: String = null,
    urlEdit: String = null,
    urlNew: String = null
  ): DescribeSObjectResult = {
    val __obj = js.Dynamic.literal(activateable = activateable.asInstanceOf[js.Any], childRelationships = childRelationships.asInstanceOf[js.Any], compactLayoutable = compactLayoutable.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], customSetting = customSetting.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], feedEnabled = feedEnabled.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPlural = labelPlural.asInstanceOf[js.Any], layoutable = layoutable.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mruEnabled = mruEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namedLayoutInfos = namedLayoutInfos.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], recordTypeInfos = recordTypeInfos.asInstanceOf[js.Any], replicateable = replicateable.asInstanceOf[js.Any], retrieveable = retrieveable.asInstanceOf[js.Any], searchLayoutable = searchLayoutable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any], triggerable = triggerable.asInstanceOf[js.Any], undeletable = undeletable.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    if (!js.isUndefined(actionOverrides)) __obj.updateDynamic("actionOverrides")(actionOverrides.asInstanceOf[js.Any])
    if (!js.isUndefined(keyPrefix)) __obj.updateDynamic("keyPrefix")(keyPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(listviewable)) __obj.updateDynamic("listviewable")(listviewable.asInstanceOf[js.Any])
    if (!js.isUndefined(lookupLayoutable)) __obj.updateDynamic("lookupLayoutable")(lookupLayoutable.asInstanceOf[js.Any])
    if (!js.isUndefined(networkScopeFieldName)) __obj.updateDynamic("networkScopeFieldName")(networkScopeFieldName.asInstanceOf[js.Any])
    if (urlDetail != null) __obj.updateDynamic("urlDetail")(urlDetail.asInstanceOf[js.Any])
    if (urlEdit != null) __obj.updateDynamic("urlEdit")(urlEdit.asInstanceOf[js.Any])
    if (urlNew != null) __obj.updateDynamic("urlNew")(urlNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSObjectResult]
  }
}

