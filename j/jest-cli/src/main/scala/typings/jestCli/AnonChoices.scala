package typings.jestCli

import typings.jestCli.jestCliStrings.`Select between Babel and V8 to collect coverage`
import typings.jestCli.jestCliStrings.babel
import typings.jestCli.jestCliStrings.v8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChoices extends js.Object {
  val choices: js.Tuple2[babel, v8]
  val description: `Select between Babel and V8 to collect coverage`
}

object AnonChoices {
  @scala.inline
  def apply(choices: js.Tuple2[babel, v8], description: `Select between Babel and V8 to collect coverage`): AnonChoices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChoices]
  }
}

