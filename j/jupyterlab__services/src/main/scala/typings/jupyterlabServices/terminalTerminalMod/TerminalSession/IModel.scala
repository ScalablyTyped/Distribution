package typings.jupyterlabServices.terminalTerminalMod.TerminalSession

import typings.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The server model for a terminal session.
  */
trait IModel extends JSONObject {
  /**
    * The name of the terminal session.
    */
  val name: String
}

object IModel {
  @scala.inline
  def apply(name: String): IModel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IModel]
  }
}

