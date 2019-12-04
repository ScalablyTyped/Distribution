package typings.atIonicCliDashFramework.utilsNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveOptions extends js.Object {
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object ResolveOptions {
  @scala.inline
  def apply(paths: js.Array[String] = null): ResolveOptions = {
    val __obj = js.Dynamic.literal()
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveOptions]
  }
}

