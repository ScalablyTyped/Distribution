package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Select between Babel and V8 to collect coverage`
import typings.jestCli.jestCliStrings.babel
import typings.jestCli.jestCliStrings.v8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choices extends js.Object {
  val choices: js.Tuple2[babel, v8]
  val description: `Select between Babel and V8 to collect coverage`
}

object Choices {
  @scala.inline
  def apply(choices: js.Tuple2[babel, v8], description: `Select between Babel and V8 to collect coverage`): Choices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
}

