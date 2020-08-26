package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`The path to the QuotationmarkprettierQuotationmark module used for inline snapshotsDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `9` extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.native
  val description: `The path to the QuotationmarkprettierQuotationmark module used for inline snapshotsDot` = js.native
  val `type`: string = js.native
}

object `9` {
  @scala.inline
  def apply(
    description: `The path to the QuotationmarkprettierQuotationmark module used for inline snapshotsDot`,
    `type`: string
  ): `9` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  @scala.inline
  implicit class `9Ops`[Self <: `9`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: `The path to the QuotationmarkprettierQuotationmark module used for inline snapshotsDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

