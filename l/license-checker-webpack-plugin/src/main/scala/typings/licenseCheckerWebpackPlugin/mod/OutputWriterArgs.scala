package typings.licenseCheckerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputWriterArgs extends js.Object {
  var dependencies: js.Array[Dependency]
}

object OutputWriterArgs {
  @scala.inline
  def apply(dependencies: js.Array[Dependency]): OutputWriterArgs = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutputWriterArgs]
  }
}

