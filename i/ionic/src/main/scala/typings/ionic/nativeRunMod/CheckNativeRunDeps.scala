package typings.ionic.nativeRunMod

import typings.ionic.definitionsMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckNativeRunDeps extends js.Object {
  val config: IConfig
}

object CheckNativeRunDeps {
  @scala.inline
  def apply(config: IConfig): CheckNativeRunDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckNativeRunDeps]
  }
}

