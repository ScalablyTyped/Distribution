package typings.luminoWidgets.commandpaletteMod.CommandPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The render data for a command palette empty message.
  */
trait IEmptyMessageRenderData extends js.Object {
  /**
    * The query which failed to match any commands.
    */
  var query: String
}

object IEmptyMessageRenderData {
  @scala.inline
  def apply(query: String): IEmptyMessageRenderData = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEmptyMessageRenderData]
  }
}

