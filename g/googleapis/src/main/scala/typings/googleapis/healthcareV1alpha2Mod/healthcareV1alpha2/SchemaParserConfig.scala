package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for the parser. It determines how the server parses the
  * messages.
  */
@js.native
trait SchemaParserConfig extends js.Object {
  /**
    * Determines whether messages with no header are allowed.
    */
  var allowNullHeader: js.UndefOr[Boolean] = js.native
  /**
    * Byte(s) to be used as the segment terminator. If this is unset,
    * &#39;\r&#39; will be used as segment terminator.
    */
  var segmentTerminator: js.UndefOr[String] = js.native
}

object SchemaParserConfig {
  @scala.inline
  def apply(allowNullHeader: js.UndefOr[Boolean] = js.undefined, segmentTerminator: String = null): SchemaParserConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNullHeader)) __obj.updateDynamic("allowNullHeader")(allowNullHeader.get.asInstanceOf[js.Any])
    if (segmentTerminator != null) __obj.updateDynamic("segmentTerminator")(segmentTerminator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParserConfig]
  }
}

