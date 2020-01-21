package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties describing the look and feel of a list bullet at a
  * given level of nesting.
  */
@js.native
trait SchemaNestingLevel extends js.Object {
  /**
    * The style of a bullet at this level of nesting.
    */
  var bulletStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaNestingLevel {
  @scala.inline
  def apply(bulletStyle: SchemaTextStyle = null): SchemaNestingLevel = {
    val __obj = js.Dynamic.literal()
    if (bulletStyle != null) __obj.updateDynamic("bulletStyle")(bulletStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNestingLevel]
  }
}

