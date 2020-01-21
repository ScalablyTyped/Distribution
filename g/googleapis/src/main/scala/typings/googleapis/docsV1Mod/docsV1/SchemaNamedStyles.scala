package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The named styles. Paragraphs in the document can inherit their TextStyle
  * and ParagraphStyle from these named styles.
  */
@js.native
trait SchemaNamedStyles extends js.Object {
  /**
    * The named styles.  There is an entry for each of the possible named style
    * types.
    */
  var styles: js.UndefOr[js.Array[SchemaNamedStyle]] = js.native
}

object SchemaNamedStyles {
  @scala.inline
  def apply(styles: js.Array[SchemaNamedStyle] = null): SchemaNamedStyles = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNamedStyles]
  }
}

