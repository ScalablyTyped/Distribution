package typings.jsonapiDashSerializer.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializerOptions extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  var dataLinks: js.UndefOr[js.Array[js.Function0[Unit] | String]] = js.undefined
  var dataMeta: js.UndefOr[js.Function0[Unit] | js.Object] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ignoreRelationshipData: js.UndefOr[Boolean] = js.undefined
  var included: js.UndefOr[Boolean] = js.undefined
  var keyForAttribute: js.UndefOr[String | KeyForAttribute] = js.undefined
  var meta: js.UndefOr[js.Object] = js.undefined
  var nullIfMissing: js.UndefOr[Boolean] = js.undefined
  var pluralizeType: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[js.Function0[Unit] | Boolean | String] = js.undefined
  var relationshipLinks: js.UndefOr[js.Object] = js.undefined
  var relationshipMeta: js.UndefOr[js.Object] = js.undefined
  var topLevelLinks: js.UndefOr[js.Array[js.Function0[Unit] | String]] = js.undefined
  var transform: js.UndefOr[Transform] = js.undefined
  var typeForAttribute: js.UndefOr[TypeForAttribute] = js.undefined
}

object SerializerOptions {
  @scala.inline
  def apply(
    attributes: js.Array[String] = null,
    dataLinks: js.Array[js.Function0[Unit] | String] = null,
    dataMeta: js.Function0[Unit] | js.Object = null,
    id: String = null,
    ignoreRelationshipData: js.UndefOr[Boolean] = js.undefined,
    included: js.UndefOr[Boolean] = js.undefined,
    keyForAttribute: String | KeyForAttribute = null,
    meta: js.Object = null,
    nullIfMissing: js.UndefOr[Boolean] = js.undefined,
    pluralizeType: js.UndefOr[Boolean] = js.undefined,
    ref: js.Function0[Unit] | Boolean | String = null,
    relationshipLinks: js.Object = null,
    relationshipMeta: js.Object = null,
    topLevelLinks: js.Array[js.Function0[Unit] | String] = null,
    transform: /* record */ js.Any => js.Any = null,
    typeForAttribute: (/* attribute */ String, /* object */ js.UndefOr[js.Any]) => js.Any = null
  ): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (dataLinks != null) __obj.updateDynamic("dataLinks")(dataLinks)
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
    if (topLevelLinks != null) __obj.updateDynamic("topLevelLinks")(topLevelLinks)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (typeForAttribute != null) __obj.updateDynamic("typeForAttribute")(js.Any.fromFunction2(typeForAttribute))
    __obj.asInstanceOf[SerializerOptions]
  }
}

