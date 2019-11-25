package typings.atKeystonejsAppDashNuxt.atKeystonejsAppDashNuxtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NuxtOptions extends js.Object {
  var buildDir: js.UndefOr[String] = js.undefined
  var srcDir: js.UndefOr[String] = js.undefined
}

object NuxtOptions {
  @scala.inline
  def apply(buildDir: String = null, srcDir: String = null): NuxtOptions = {
    val __obj = js.Dynamic.literal()
    if (buildDir != null) __obj.updateDynamic("buildDir")(buildDir.asInstanceOf[js.Any])
    if (srcDir != null) __obj.updateDynamic("srcDir")(srcDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[NuxtOptions]
  }
}

