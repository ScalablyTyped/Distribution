package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Short Dynamic Link suffix.
  */
@js.native
trait SchemaSuffix extends js.Object {
  /**
    * Only applies to Option.CUSTOM.
    */
  var customSuffix: js.UndefOr[String] = js.native
  /**
    * Suffix option.
    */
  var option: js.UndefOr[String] = js.native
}

object SchemaSuffix {
  @scala.inline
  def apply(customSuffix: String = null, option: String = null): SchemaSuffix = {
    val __obj = js.Dynamic.literal()
    if (customSuffix != null) __obj.updateDynamic("customSuffix")(customSuffix.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuffix]
  }
}

