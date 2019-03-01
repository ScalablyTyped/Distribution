package typings
package atGrpcProtoDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeDirs extends js.Object {
  var includeDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_IncludeDirs {
  @scala.inline
  def apply(includeDirs: js.Array[java.lang.String] = null): Anon_IncludeDirs = {
    val __obj = js.Dynamic.literal()
    if (includeDirs != null) __obj.updateDynamic("includeDirs")(includeDirs)
    __obj.asInstanceOf[Anon_IncludeDirs]
  }
}

