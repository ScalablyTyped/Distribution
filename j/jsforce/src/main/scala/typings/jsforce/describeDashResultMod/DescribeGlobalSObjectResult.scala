package typings.jsforce.describeDashResultMod

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
    val __obj = js.Dynamic.literal(activateable = activateable, createable = createable, custom = custom, customSetting = customSetting, deletable = deletable, deprecatedAndHidden = deprecatedAndHidden, feedEnabled = feedEnabled, hasSubtypes = hasSubtypes, isSubtype = isSubtype, label = label, labelPlural = labelPlural, layoutable = layoutable, mergeable = mergeable, mruEnabled = mruEnabled, name = name, queryable = queryable, replicateable = replicateable, retrieveable = retrieveable, searchable = searchable, triggerable = triggerable, undeletable = undeletable, updateable = updateable, urls = urls)
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix)
    __obj.asInstanceOf[DescribeGlobalSObjectResult]
  }
}

