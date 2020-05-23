package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Exit the test suite immediately after GraveaccentnGraveaccent number of failing testsDot`
import typings.jestCli.jestCliStrings.b
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  val alias: b
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Exit the test suite immediately after GraveaccentnGraveaccent number of failing testsDot`
  val `type`: boolean
}

object Alias {
  @scala.inline
  def apply(
    alias: b,
    description: `Exit the test suite immediately after GraveaccentnGraveaccent number of failing testsDot`,
    `type`: boolean
  ): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
}

