package typings
package jsonapiDashSerializerLib.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializerOptions extends js.Object {
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dataLinks: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Function0[scala.Unit]]] = js.undefined
  var dataMeta: js.UndefOr[js.Function0[scala.Unit] | js.Object] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var ignoreRelationshipData: js.UndefOr[scala.Boolean] = js.undefined
  var included: js.UndefOr[scala.Boolean] = js.undefined
  var keyForAttribute: js.UndefOr[java.lang.String | KeyForAttribute] = js.undefined
  var meta: js.UndefOr[js.Object] = js.undefined
  var nullIfMissing: js.UndefOr[scala.Boolean] = js.undefined
  var pluralizeType: js.UndefOr[scala.Boolean] = js.undefined
  var ref: js.UndefOr[js.Function0[scala.Unit] | scala.Boolean | java.lang.String] = js.undefined
  var relationshipLinks: js.UndefOr[js.Object] = js.undefined
  var relationshipMeta: js.UndefOr[js.Object] = js.undefined
  var topLevelLinks: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Function0[scala.Unit]]] = js.undefined
  var transform: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var typeForAttribute: js.UndefOr[TypeForAttribute] = js.undefined
}

