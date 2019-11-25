package typings.graphql

import typings.graphql.languageAstMod.Location
import typings.graphql.languageAstMod.StringValueNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  val description: js.UndefOr[StringValueNode] = js.undefined
  val loc: js.UndefOr[Location] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(description: StringValueNode = null, loc: Location = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Description]
  }
}

