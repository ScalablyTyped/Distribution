package typings.jestCli.anon

import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nargs extends js.Object {
  val description: java.lang.String = js.native
  val nargs: typings.jestCli.jestCliNumbers.`1` = js.native
  val `type`: string = js.native
}

object Nargs {
  @scala.inline
  def apply(description: java.lang.String, nargs: typings.jestCli.jestCliNumbers.`1`, `type`: string): Nargs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], nargs = nargs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nargs]
  }
  @scala.inline
  implicit class NargsOps[Self <: Nargs] (val x: Self) extends AnyVal {
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
    def setDescription(value: java.lang.String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setNargs(value: typings.jestCli.jestCliNumbers.`1`): Self = this.set("nargs", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

