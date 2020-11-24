package typings.lolex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lolex", "install")
@js.native
object install extends js.Object {
  
  def apply[TClock /* <: Clock */](): InstalledClock[TClock] = js.native
  def apply[TClock /* <: Clock */](opts: LolexInstallOpts): InstalledClock[TClock] = js.native
}
