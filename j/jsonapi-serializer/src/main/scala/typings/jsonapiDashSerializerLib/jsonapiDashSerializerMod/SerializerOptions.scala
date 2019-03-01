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

object SerializerOptions {
  @scala.inline
  def apply(
    attributes: js.Array[java.lang.String] = null,
    dataLinks: js.Array[java.lang.String] | js.Array[js.Function0[scala.Unit]] = null,
    dataMeta: js.Function0[scala.Unit] | js.Object = null,
    id: java.lang.String = null,
    ignoreRelationshipData: js.UndefOr[scala.Boolean] = js.undefined,
    included: js.UndefOr[scala.Boolean] = js.undefined,
    keyForAttribute: java.lang.String | KeyForAttribute = null,
    meta: js.Object = null,
    nullIfMissing: js.UndefOr[scala.Boolean] = js.undefined,
    pluralizeType: js.UndefOr[scala.Boolean] = js.undefined,
    ref: js.Function0[scala.Unit] | scala.Boolean | java.lang.String = null,
    relationshipLinks: js.Object = null,
    relationshipMeta: js.Object = null,
    topLevelLinks: js.Array[java.lang.String] | js.Array[js.Function0[scala.Unit]] = null,
    transform: js.Function0[scala.Unit] = null,
    typeForAttribute: TypeForAttribute = null
  ): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (dataLinks != null) __obj.updateDynamic("dataLinks")(dataLinks.asInstanceOf[js.Any])
    if (dataMeta != null) __obj.updateDynamic("dataMeta")(dataMeta.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(ignoreRelationshipData)) __obj.updateDynamic("ignoreRelationshipData")(ignoreRelationshipData)
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included)
    if (keyForAttribute != null) __obj.updateDynamic("keyForAttribute")(keyForAttribute.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (!js.isUndefined(nullIfMissing)) __obj.updateDynamic("nullIfMissing")(nullIfMissing)
    if (!js.isUndefined(pluralizeType)) __obj.updateDynamic("pluralizeType")(pluralizeType)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (relationshipLinks != null) __obj.updateDynamic("relationshipLinks")(relationshipLinks)
    if (relationshipMeta != null) __obj.updateDynamic("relationshipMeta")(relationshipMeta)
    if (topLevelLinks != null) __obj.updateDynamic("topLevelLinks")(topLevelLinks.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (typeForAttribute != null) __obj.updateDynamic("typeForAttribute")(typeForAttribute)
    __obj.asInstanceOf[SerializerOptions]
  }
}

