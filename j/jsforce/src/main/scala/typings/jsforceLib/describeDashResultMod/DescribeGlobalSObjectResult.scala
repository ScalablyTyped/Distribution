package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalSObjectResult extends js.Object {
  var activateable: scala.Boolean
  var createable: scala.Boolean
  var custom: scala.Boolean
  var customSetting: scala.Boolean
  var deletable: scala.Boolean
  var deprecatedAndHidden: scala.Boolean
  var feedEnabled: scala.Boolean
  var hasSubtypes: scala.Boolean
  var isSubtype: scala.Boolean
  var keyPrefix: java.lang.String | scala.Null
  var label: java.lang.String
  var labelPlural: java.lang.String
  var layoutable: scala.Boolean
  var mergeable: scala.Boolean
  var mruEnabled: scala.Boolean
  var name: java.lang.String
  var queryable: scala.Boolean
  var replicateable: scala.Boolean
  var retrieveable: scala.Boolean
  var searchable: scala.Boolean
  var triggerable: scala.Boolean
  var undeletable: scala.Boolean
  var updateable: scala.Boolean
  var urls: stdLib.Record[java.lang.String, java.lang.String]
}

object DescribeGlobalSObjectResult {
  @scala.inline
  def apply(
    activateable: scala.Boolean,
    createable: scala.Boolean,
    custom: scala.Boolean,
    customSetting: scala.Boolean,
    deletable: scala.Boolean,
    deprecatedAndHidden: scala.Boolean,
    feedEnabled: scala.Boolean,
    hasSubtypes: scala.Boolean,
    isSubtype: scala.Boolean,
    label: java.lang.String,
    labelPlural: java.lang.String,
    layoutable: scala.Boolean,
    mergeable: scala.Boolean,
    mruEnabled: scala.Boolean,
    name: java.lang.String,
    queryable: scala.Boolean,
    replicateable: scala.Boolean,
    retrieveable: scala.Boolean,
    searchable: scala.Boolean,
    triggerable: scala.Boolean,
    undeletable: scala.Boolean,
    updateable: scala.Boolean,
    urls: stdLib.Record[java.lang.String, java.lang.String],
    keyPrefix: java.lang.String = null
  ): DescribeGlobalSObjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activateable")(activateable)
    __obj.updateDynamic("createable")(createable)
    __obj.updateDynamic("custom")(custom)
    __obj.updateDynamic("customSetting")(customSetting)
    __obj.updateDynamic("deletable")(deletable)
    __obj.updateDynamic("deprecatedAndHidden")(deprecatedAndHidden)
    __obj.updateDynamic("feedEnabled")(feedEnabled)
    __obj.updateDynamic("hasSubtypes")(hasSubtypes)
    __obj.updateDynamic("isSubtype")(isSubtype)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("labelPlural")(labelPlural)
    __obj.updateDynamic("layoutable")(layoutable)
    __obj.updateDynamic("mergeable")(mergeable)
    __obj.updateDynamic("mruEnabled")(mruEnabled)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("queryable")(queryable)
    __obj.updateDynamic("replicateable")(replicateable)
    __obj.updateDynamic("retrieveable")(retrieveable)
    __obj.updateDynamic("searchable")(searchable)
    __obj.updateDynamic("triggerable")(triggerable)
    __obj.updateDynamic("undeletable")(undeletable)
    __obj.updateDynamic("updateable")(updateable)
    __obj.updateDynamic("urls")(urls)
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix)
    __obj.asInstanceOf[DescribeGlobalSObjectResult]
  }
}

