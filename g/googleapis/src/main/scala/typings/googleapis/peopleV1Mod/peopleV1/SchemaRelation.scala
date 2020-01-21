package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s relation to another person.
  */
@js.native
trait SchemaRelation extends js.Object {
  /**
    * The type of the relation translated and formatted in the viewer&#39;s
    * account locale or the locale specified in the Accept-Language HTTP
    * header.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * Metadata about the relation.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The name of the other person this relation refers to.
    */
  var person: js.UndefOr[String] = js.native
  /**
    * The person&#39;s relation to the other person. The type can be custom or
    * one of these predefined values:  * `spouse` * `child` * `mother` *
    * `father` * `parent` * `brother` * `sister` * `friend` * `relative` *
    * `domesticPartner` * `manager` * `assistant` * `referredBy` * `partner`
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaRelation {
  @scala.inline
  def apply(
    formattedType: String = null,
    metadata: SchemaFieldMetadata = null,
    person: String = null,
    `type`: String = null
  ): SchemaRelation = {
    val __obj = js.Dynamic.literal()
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRelation]
  }
}

