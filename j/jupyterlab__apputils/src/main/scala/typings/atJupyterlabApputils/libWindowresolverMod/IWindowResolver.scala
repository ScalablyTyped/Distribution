package typings.atJupyterlabApputils.libWindowresolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowResolver extends js.Object {
  /**
    * A window name to use as a handle among shared resources.
    */
  val name: String
}

object IWindowResolver {
  @scala.inline
  def apply(name: String): IWindowResolver = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[IWindowResolver]
  }
}

