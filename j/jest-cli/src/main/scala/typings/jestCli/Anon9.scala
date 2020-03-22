package typings.jestCli

import typings.jestCli.jestCliStrings.`The path to the QuotationmarkprettierQuotationmark module used for inline snapshotsDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon9 extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `The path to the QuotationmarkprettierQuotationmark module used for inline snapshotsDot`
  val `type`: string
}

object Anon9 {
  @scala.inline
  def apply(
    description: `The path to the QuotationmarkprettierQuotationmark module used for inline snapshotsDot`,
    `type`: string,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon9 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon9]
  }
}

