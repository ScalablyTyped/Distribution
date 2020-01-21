package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The styling that applies to a section.
  */
@js.native
trait SchemaSectionStyle extends js.Object {
  /**
    * The section&#39;s columns properties.  If empty, the section contains one
    * column with the default properties in the Docs editor.
    */
  var columnProperties: js.UndefOr[js.Array[SchemaSectionColumnProperties]] = js.native
  /**
    * The style of column separators.  This style can be set even when there is
    * one column in the section.
    */
  var columnSeparatorStyle: js.UndefOr[String] = js.native
  /**
    * The content direction of this section. If unset, the value defaults to
    * LEFT_TO_RIGHT.
    */
  var contentDirection: js.UndefOr[String] = js.native
}

object SchemaSectionStyle {
  @scala.inline
  def apply(
    columnProperties: js.Array[SchemaSectionColumnProperties] = null,
    columnSeparatorStyle: String = null,
    contentDirection: String = null
  ): SchemaSectionStyle = {
    val __obj = js.Dynamic.literal()
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties.asInstanceOf[js.Any])
    if (columnSeparatorStyle != null) __obj.updateDynamic("columnSeparatorStyle")(columnSeparatorStyle.asInstanceOf[js.Any])
    if (contentDirection != null) __obj.updateDynamic("contentDirection")(contentDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSectionStyle]
  }
}

