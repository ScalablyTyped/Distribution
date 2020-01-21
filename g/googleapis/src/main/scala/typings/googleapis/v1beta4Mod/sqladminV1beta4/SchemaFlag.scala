package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A flag resource.
  */
@js.native
trait SchemaFlag extends js.Object {
  /**
    * For STRING flags, a list of strings that the value can be set to.
    */
  var allowedStringValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * The database version this flag applies to. Can be MYSQL_5_5, MYSQL_5_6,
    * or MYSQL_5_7. MYSQL_5_7 is applicable only to Second Generation
    * instances.
    */
  var appliesTo: js.UndefOr[js.Array[String]] = js.native
  /**
    * True if the flag is only released in Beta.
    */
  var inBeta: js.UndefOr[Boolean] = js.native
  /**
    * This is always sql#flag.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * For INTEGER flags, the maximum allowed value.
    */
  var maxValue: js.UndefOr[String] = js.native
  /**
    * For INTEGER flags, the minimum allowed value.
    */
  var minValue: js.UndefOr[String] = js.native
  /**
    * This is the name of the flag. Flag names always use underscores, not
    * hyphens, e.g. max_allowed_packet
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether changing this flag will trigger a database restart.
    * Only applicable to Second Generation instances.
    */
  var requiresRestart: js.UndefOr[Boolean] = js.native
  /**
    * The type of the flag. Flags are typed to being BOOLEAN, STRING, INTEGER
    * or NONE. NONE is used for flags which do not take a value, such as
    * skip_grant_tables.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaFlag {
  @scala.inline
  def apply(
    allowedStringValues: js.Array[String] = null,
    appliesTo: js.Array[String] = null,
    inBeta: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    maxValue: String = null,
    minValue: String = null,
    name: String = null,
    requiresRestart: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): SchemaFlag = {
    val __obj = js.Dynamic.literal()
    if (allowedStringValues != null) __obj.updateDynamic("allowedStringValues")(allowedStringValues.asInstanceOf[js.Any])
    if (appliesTo != null) __obj.updateDynamic("appliesTo")(appliesTo.asInstanceOf[js.Any])
    if (!js.isUndefined(inBeta)) __obj.updateDynamic("inBeta")(inBeta.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(requiresRestart)) __obj.updateDynamic("requiresRestart")(requiresRestart.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFlag]
  }
}

