package typings.jsforce.describeResultMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSObjectResult extends StObject {
  
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
    urls: Record[String, String]
  ): DescribeSObjectResult = {
    val __obj = js.Dynamic.literal(activateable = activateable.asInstanceOf[js.Any], childRelationships = childRelationships.asInstanceOf[js.Any], compactLayoutable = compactLayoutable.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], customSetting = customSetting.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], feedEnabled = feedEnabled.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPlural = labelPlural.asInstanceOf[js.Any], layoutable = layoutable.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mruEnabled = mruEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namedLayoutInfos = namedLayoutInfos.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], recordTypeInfos = recordTypeInfos.asInstanceOf[js.Any], replicateable = replicateable.asInstanceOf[js.Any], retrieveable = retrieveable.asInstanceOf[js.Any], searchLayoutable = searchLayoutable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any], triggerable = triggerable.asInstanceOf[js.Any], undeletable = undeletable.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSObjectResult]
  }
  
  @scala.inline
  implicit class DescribeSObjectResultMutableBuilder[Self <: DescribeSObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionOverrides(value: maybe[js.Array[ActionOverride]]): Self = StObject.set(x, "actionOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionOverridesNull: Self = StObject.set(x, "actionOverrides", null)
    
    @scala.inline
    def setActionOverridesUndefined: Self = StObject.set(x, "actionOverrides", js.undefined)
    
    @scala.inline
    def setActionOverridesVarargs(value: ActionOverride*): Self = StObject.set(x, "actionOverrides", js.Array(value :_*))
    
    @scala.inline
    def setActivateable(value: Boolean): Self = StObject.set(x, "activateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildRelationships(value: js.Array[ChildRelationship]): Self = StObject.set(x, "childRelationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildRelationshipsVarargs(value: ChildRelationship*): Self = StObject.set(x, "childRelationships", js.Array(value :_*))
    
    @scala.inline
    def setCompactLayoutable(value: Boolean): Self = StObject.set(x, "compactLayoutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateable(value: Boolean): Self = StObject.set(x, "createable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSetting(value: Boolean): Self = StObject.set(x, "customSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedAndHidden(value: Boolean): Self = StObject.set(x, "deprecatedAndHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedEnabled(value: Boolean): Self = StObject.set(x, "feedEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setKeyPrefix(value: maybe[String]): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixNull: Self = StObject.set(x, "keyPrefix", null)
    
    @scala.inline
    def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPlural(value: String): Self = StObject.set(x, "labelPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutable(value: Boolean): Self = StObject.set(x, "layoutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListviewable(value: maybe[Boolean]): Self = StObject.set(x, "listviewable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListviewableNull: Self = StObject.set(x, "listviewable", null)
    
    @scala.inline
    def setListviewableUndefined: Self = StObject.set(x, "listviewable", js.undefined)
    
    @scala.inline
    def setLookupLayoutable(value: maybe[Boolean]): Self = StObject.set(x, "lookupLayoutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupLayoutableNull: Self = StObject.set(x, "lookupLayoutable", null)
    
    @scala.inline
    def setLookupLayoutableUndefined: Self = StObject.set(x, "lookupLayoutable", js.undefined)
    
    @scala.inline
    def setMergeable(value: Boolean): Self = StObject.set(x, "mergeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMruEnabled(value: Boolean): Self = StObject.set(x, "mruEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedLayoutInfos(value: js.Array[NamedLayoutInfo]): Self = StObject.set(x, "namedLayoutInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedLayoutInfosVarargs(value: NamedLayoutInfo*): Self = StObject.set(x, "namedLayoutInfos", js.Array(value :_*))
    
    @scala.inline
    def setNetworkScopeFieldName(value: maybe[String]): Self = StObject.set(x, "networkScopeFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkScopeFieldNameNull: Self = StObject.set(x, "networkScopeFieldName", null)
    
    @scala.inline
    def setNetworkScopeFieldNameUndefined: Self = StObject.set(x, "networkScopeFieldName", js.undefined)
    
    @scala.inline
    def setQueryable(value: Boolean): Self = StObject.set(x, "queryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTypeInfos(value: js.Array[RecordTypeInfo]): Self = StObject.set(x, "recordTypeInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTypeInfosVarargs(value: RecordTypeInfo*): Self = StObject.set(x, "recordTypeInfos", js.Array(value :_*))
    
    @scala.inline
    def setReplicateable(value: Boolean): Self = StObject.set(x, "replicateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveable(value: Boolean): Self = StObject.set(x, "retrieveable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchLayoutable(value: Boolean): Self = StObject.set(x, "searchLayoutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopes(value: js.Array[ScopeInfo]): Self = StObject.set(x, "supportedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopesVarargs(value: ScopeInfo*): Self = StObject.set(x, "supportedScopes", js.Array(value :_*))
    
    @scala.inline
    def setTriggerable(value: Boolean): Self = StObject.set(x, "triggerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeletable(value: Boolean): Self = StObject.set(x, "undeletable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateable(value: Boolean): Self = StObject.set(x, "updateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlDetail(value: String): Self = StObject.set(x, "urlDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlDetailUndefined: Self = StObject.set(x, "urlDetail", js.undefined)
    
    @scala.inline
    def setUrlEdit(value: String): Self = StObject.set(x, "urlEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlEditUndefined: Self = StObject.set(x, "urlEdit", js.undefined)
    
    @scala.inline
    def setUrlNew(value: String): Self = StObject.set(x, "urlNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNewUndefined: Self = StObject.set(x, "urlNew", js.undefined)
    
    @scala.inline
    def setUrls(value: Record[String, String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
  }
}
