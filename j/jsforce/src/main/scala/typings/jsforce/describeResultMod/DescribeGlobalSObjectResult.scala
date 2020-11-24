package typings.jsforce.describeResultMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalSObjectResult extends js.Object {
  
  var activateable: Boolean = js.native
  
  var createable: Boolean = js.native
  
  var custom: Boolean = js.native
  
  var customSetting: Boolean = js.native
  
  var deletable: Boolean = js.native
  
  var deprecatedAndHidden: Boolean = js.native
  
  var feedEnabled: Boolean = js.native
  
  var hasSubtypes: Boolean = js.native
  
  var isSubtype: Boolean = js.native
  
  var keyPrefix: String | Null = js.native
  
  var label: String = js.native
  
  var labelPlural: String = js.native
  
  var layoutable: Boolean = js.native
  
  var mergeable: Boolean = js.native
  
  var mruEnabled: Boolean = js.native
  
  var name: String = js.native
  
  var queryable: Boolean = js.native
  
  var replicateable: Boolean = js.native
  
  var retrieveable: Boolean = js.native
  
  var searchable: Boolean = js.native
  
  var triggerable: Boolean = js.native
  
  var undeletable: Boolean = js.native
  
  var updateable: Boolean = js.native
  
  var urls: Record[String, String] = js.native
}
object DescribeGlobalSObjectResult {
  
  @scala.inline
  def apply(
    activateable: Boolean,
    createable: Boolean,
    custom: Boolean,
    customSetting: Boolean,
    deletable: Boolean,
    deprecatedAndHidden: Boolean,
    feedEnabled: Boolean,
    hasSubtypes: Boolean,
    isSubtype: Boolean,
    label: String,
    labelPlural: String,
    layoutable: Boolean,
    mergeable: Boolean,
    mruEnabled: Boolean,
    name: String,
    queryable: Boolean,
    replicateable: Boolean,
    retrieveable: Boolean,
    searchable: Boolean,
    triggerable: Boolean,
    undeletable: Boolean,
    updateable: Boolean,
    urls: Record[String, String]
  ): DescribeGlobalSObjectResult = {
    val __obj = js.Dynamic.literal(activateable = activateable.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], customSetting = customSetting.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], feedEnabled = feedEnabled.asInstanceOf[js.Any], hasSubtypes = hasSubtypes.asInstanceOf[js.Any], isSubtype = isSubtype.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPlural = labelPlural.asInstanceOf[js.Any], layoutable = layoutable.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mruEnabled = mruEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], replicateable = replicateable.asInstanceOf[js.Any], retrieveable = retrieveable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], triggerable = triggerable.asInstanceOf[js.Any], undeletable = undeletable.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalSObjectResult]
  }
  
  @scala.inline
  implicit class DescribeGlobalSObjectResultOps[Self <: DescribeGlobalSObjectResult] (val x: Self) extends AnyVal {
    
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
    def setHasSubtypes(value: Boolean): Self = this.set("hasSubtypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSubtype(value: Boolean): Self = this.set("isSubtype", value.asInstanceOf[js.Any])
    
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
    def setQueryable(value: Boolean): Self = this.set("queryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicateable(value: Boolean): Self = this.set("replicateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveable(value: Boolean): Self = this.set("retrieveable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerable(value: Boolean): Self = this.set("triggerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeletable(value: Boolean): Self = this.set("undeletable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateable(value: Boolean): Self = this.set("updateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrls(value: Record[String, String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefix(value: String): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixNull: Self = this.set("keyPrefix", null)
  }
}
