package typings.ionic.nativeRunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/native-run", "getNativeTargets")
@js.native
object getNativeTargets extends js.Object {
  def apply(hasLogShell: RunNativeRunDeps, platform: String): js.Promise[NativeTargetPlatform] = js.native
}

