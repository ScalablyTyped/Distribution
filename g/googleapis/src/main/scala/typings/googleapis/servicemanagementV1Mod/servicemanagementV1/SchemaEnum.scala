package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum type definition.
  */
@js.native
trait SchemaEnum extends js.Object {
  /**
    * Enum value definitions.
    */
  var enumvalue: js.UndefOr[js.Array[SchemaEnumValue]] = js.native
  /**
    * Enum type name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
  /**
    * The source context.
    */
  var sourceContext: js.UndefOr[SchemaSourceContext] = js.native
  /**
    * The source syntax.
    */
  var syntax: js.UndefOr[String] = js.native
}

object SchemaEnum {
  @scala.inline
  def apply(
    enumvalue: js.Array[SchemaEnumValue] = null,
    name: String = null,
    options: js.Array[SchemaOption] = null,
    sourceContext: SchemaSourceContext = null,
    syntax: String = null
  ): SchemaEnum = {
    val __obj = js.Dynamic.literal()
    if (enumvalue != null) __obj.updateDynamic("enumvalue")(enumvalue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (sourceContext != null) __obj.updateDynamic("sourceContext")(sourceContext.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnum]
  }
}

