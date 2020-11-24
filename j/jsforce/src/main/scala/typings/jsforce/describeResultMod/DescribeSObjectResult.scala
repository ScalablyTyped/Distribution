package typings.jsforce.describeResultMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSObjectResult extends js.Object {
  
  var actionOverrides: js.UndefOr[maybe[js.Array[ActionOverride]]] = js.native
  
  var activateable: Boolean = js.native
  
  var childRelationships: js.Array[ChildRelationship] = js.native
  
  var compactLayoutable: Boolean = js.native
  
  var createable: Boolean = js.native
  
  var custom: Boolean = js.native
  
  var customSetting: Boolean = js.native
  
  var deletable: Boolean = js.native
  
  var deprecatedAndHidden: Boolean = js.native
  
  var feedEnabled: Boolean = js.native
  
  var fields: js.Array[Field] = js.native
  
  var keyPrefix: js.UndefOr[maybe[String]] = js.native
  
  var label: String = js.native
  
  var labelPlural: String = js.native
  
  var layoutable: Boolean = js.native
  
  var listviewable: js.UndefOr[maybe[Boolean]] = js.native
  
  var lookupLayoutable: js.UndefOr[maybe[Boolean]] = js.native
  
  var mergeable: Boolean = js.native
  
  var mruEnabled: Boolean = js.native
  
  var name: String = js.native
  
  var namedLayoutInfos: js.Array[NamedLayoutInfo] = js.native
  
  var networkScopeFieldName: js.UndefOr[maybe[String]] = js.native
  
  var queryable: Boolean = js.native
  
  var recordTypeInfos: js.Array[RecordTypeInfo] = js.native
  
  var replicateable: Boolean = js.native
  
  var retrieveable: Boolean = js.native
  
  var searchLayoutable: Boolean = js.native
  
  var searchable: Boolean = js.native
  
  var supportedScopes: js.Array[ScopeInfo] = js.native
  
  var triggerable: Boolean = js.native
  
  var undeletable: Boolean = js.native
  
  var updateable: Boolean = js.native
  
  var urlDetail: js.UndefOr[String] = js.native
  
  var urlEdit: js.UndefOr[String] = js.native
  
  var urlNew: js.UndefOr[String] = js.native
  
  var urls: Record[String, String] = js.native
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
    urls: Record[String, String]
  ): DescribeSObjectResult = {
    val __obj = js.Dynamic.literal(activateable = activateable.asInstanceOf[js.Any], childRelationships = childRelationships.asInstanceOf[js.Any], compactLayoutable = compactLayoutable.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], customSetting = customSetting.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], feedEnabled = feedEnabled.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPlural = labelPlural.asInstanceOf[js.Any], layoutable = layoutable.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mruEnabled = mruEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namedLayoutInfos = namedLayoutInfos.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], recordTypeInfos = recordTypeInfos.asInstanceOf[js.Any], replicateable = replicateable.asInstanceOf[js.Any], retrieveable = retrieveable.asInstanceOf[js.Any], searchLayoutable = searchLayoutable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any], triggerable = triggerable.asInstanceOf[js.Any], undeletable = undeletable.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSObjectResult]
  }
  
  @scala.inline
  implicit class DescribeSObjectResultOps[Self <: DescribeSObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivateable(value: Boolean): Self = this.set("activateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildRelationshipsVarargs(value: ChildRelationship*): Self = this.set("childRelationships", js.Array(value :_*))
    
    @scala.inline
    def setChildRelationships(value: js.Array[ChildRelationship]): Self = this.set("childRelationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactLayoutable(value: Boolean): Self = this.set("compactLayoutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateable(value: Boolean): Self = this.set("createable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSetting(value: Boolean): Self = this.set("customSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletable(value: Boolean): Self = this.set("deletable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedAndHidden(value: Boolean): Self = this.set("deprecatedAndHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedEnabled(value: Boolean): Self = this.set("feedEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPlural(value: String): Self = this.set("labelPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutable(value: Boolean): Self = this.set("layoutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeable(value: Boolean): Self = this.set("mergeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMruEnabled(value: Boolean): Self = this.set("mruEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedLayoutInfosVarargs(value: NamedLayoutInfo*): Self = this.set("namedLayoutInfos", js.Array(value :_*))
    
    @scala.inline
    def setNamedLayoutInfos(value: js.Array[NamedLayoutInfo]): Self = this.set("namedLayoutInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryable(value: Boolean): Self = this.set("queryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTypeInfosVarargs(value: RecordTypeInfo*): Self = this.set("recordTypeInfos", js.Array(value :_*))
    
    @scala.inline
    def setRecordTypeInfos(value: js.Array[RecordTypeInfo]): Self = this.set("recordTypeInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicateable(value: Boolean): Self = this.set("replicateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveable(value: Boolean): Self = this.set("retrieveable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchLayoutable(value: Boolean): Self = this.set("searchLayoutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopesVarargs(value: ScopeInfo*): Self = this.set("supportedScopes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedScopes(value: js.Array[ScopeInfo]): Self = this.set("supportedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerable(value: Boolean): Self = this.set("triggerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeletable(value: Boolean): Self = this.set("undeletable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateable(value: Boolean): Self = this.set("updateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrls(value: Record[String, String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionOverridesVarargs(value: ActionOverride*): Self = this.set("actionOverrides", js.Array(value :_*))
    
    @scala.inline
    def setActionOverrides(value: maybe[js.Array[ActionOverride]]): Self = this.set("actionOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionOverrides: Self = this.set("actionOverrides", js.undefined)
    
    @scala.inline
    def setActionOverridesNull: Self = this.set("actionOverrides", null)
    
    @scala.inline
    def setKeyPrefix(value: maybe[String]): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPrefix: Self = this.set("keyPrefix", js.undefined)
    
    @scala.inline
    def setKeyPrefixNull: Self = this.set("keyPrefix", null)
    
    @scala.inline
    def setListviewable(value: maybe[Boolean]): Self = this.set("listviewable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListviewable: Self = this.set("listviewable", js.undefined)
    
    @scala.inline
    def setListviewableNull: Self = this.set("listviewable", null)
    
    @scala.inline
    def setLookupLayoutable(value: maybe[Boolean]): Self = this.set("lookupLayoutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookupLayoutable: Self = this.set("lookupLayoutable", js.undefined)
    
    @scala.inline
    def setLookupLayoutableNull: Self = this.set("lookupLayoutable", null)
    
    @scala.inline
    def setNetworkScopeFieldName(value: maybe[String]): Self = this.set("networkScopeFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkScopeFieldName: Self = this.set("networkScopeFieldName", js.undefined)
    
    @scala.inline
    def setNetworkScopeFieldNameNull: Self = this.set("networkScopeFieldName", null)
    
    @scala.inline
    def setUrlDetail(value: String): Self = this.set("urlDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlDetail: Self = this.set("urlDetail", js.undefined)
    
    @scala.inline
    def setUrlEdit(value: String): Self = this.set("urlEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlEdit: Self = this.set("urlEdit", js.undefined)
    
    @scala.inline
    def setUrlNew(value: String): Self = this.set("urlNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlNew: Self = this.set("urlNew", js.undefined)
  }
}
