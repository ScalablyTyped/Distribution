package typings.jsforce.describeResultMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalSObjectResult extends js.Object {
  var activateable: Boolean
  var createable: Boolean
  var custom: Boolean
  var customSetting: Boolean
  var deletable: Boolean
  var deprecatedAndHidden: Boolean
  var feedEnabled: Boolean
  var hasSubtypes: Boolean
  var isSubtype: Boolean
  var keyPrefix: String | Null
  var label: String
  var labelPlural: String
  var layoutable: Boolean
  var mergeable: Boolean
  var mruEnabled: Boolean
  var name: String
  var queryable: Boolean
  var replicateable: Boolean
  var retrieveable: Boolean
  var searchable: Boolean
  var triggerable: Boolean
  var undeletable: Boolean
  var updateable: Boolean
  var urls: Record[String, String]
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
    urls: Record[String, String],
    keyPrefix: String = null
  ): DescribeGlobalSObjectResult = {
    val __obj = js.Dynamic.literal(activateable = activateable.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], customSetting = customSetting.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], feedEnabled = feedEnabled.asInstanceOf[js.Any], hasSubtypes = hasSubtypes.asInstanceOf[js.Any], isSubtype = isSubtype.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPlural = labelPlural.asInstanceOf[js.Any], layoutable = layoutable.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mruEnabled = mruEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], replicateable = replicateable.asInstanceOf[js.Any], retrieveable = retrieveable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], triggerable = triggerable.asInstanceOf[js.Any], undeletable = undeletable.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], keyPrefix = keyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalSObjectResult]
  }
}

