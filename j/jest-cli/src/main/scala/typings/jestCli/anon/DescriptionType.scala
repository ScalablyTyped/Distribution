package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Alias for --coverageDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionType extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Alias for --coverageDot`
  val `type`: boolean
}

object DescriptionType {
  @scala.inline
  def apply(description: `Alias for --coverageDot`, `type`: boolean): DescriptionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionType]
  }
}

