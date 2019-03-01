package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  val description: js.UndefOr[graphqlLib.languageAstMod.StringValueNode] = js.undefined
  val loc: js.UndefOr[graphqlLib.languageAstMod.Location] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(
    description: graphqlLib.languageAstMod.StringValueNode = null,
    loc: graphqlLib.languageAstMod.Location = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Description]
  }
}

