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
  var deleteable: scala.Boolean
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
  var undeleteable: scala.Boolean
  var updateable: scala.Boolean
  var urlDetail: js.UndefOr[java.lang.String] = js.undefined
  var urlEdit: js.UndefOr[java.lang.String] = js.undefined
  var urlNew: js.UndefOr[java.lang.String] = js.undefined
  var urls: stdLib.Record[java.lang.String, java.lang.String]
}

