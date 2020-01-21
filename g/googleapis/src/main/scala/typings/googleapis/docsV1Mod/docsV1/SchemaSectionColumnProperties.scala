package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties that apply to a section&#39;s column.
  */
@js.native
trait SchemaSectionColumnProperties extends js.Object {
  /**
    * The padding at the end of the column.
    */
  var paddingEnd: js.UndefOr[SchemaDimension] = js.native
  /**
    * The width of the column.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
}

object SchemaSectionColumnProperties {
  @scala.inline
  def apply(paddingEnd: SchemaDimension = null, width: SchemaDimension = null): SchemaSectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (paddingEnd != null) __obj.updateDynamic("paddingEnd")(paddingEnd.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSectionColumnProperties]
  }
}

