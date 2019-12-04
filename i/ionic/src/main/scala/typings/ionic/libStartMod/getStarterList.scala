package typings.ionic.libStartMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.StarterList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/start", "getStarterList")
@js.native
object getStarterList extends js.Object {
  def apply(config: IConfig): js.Promise[StarterList] = js.native
  def apply(config: IConfig, tag: String): js.Promise[StarterList] = js.native
}

