package typings.jestCli

import typings.jestCli.jestCliStrings.`This option sets the URL for the jsdom environmentDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon21 extends js.Object {
  val description: `This option sets the URL for the jsdom environmentDot`
  val `type`: string
}

object Anon21 {
  @scala.inline
  def apply(description: `This option sets the URL for the jsdom environmentDot`, `type`: string): Anon21 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon21]
  }
}

