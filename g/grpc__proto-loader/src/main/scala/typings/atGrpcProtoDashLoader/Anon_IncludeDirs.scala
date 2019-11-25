package typings.atGrpcProtoDashLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeDirs extends js.Object {
  var includeDirs: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_IncludeDirs {
  @scala.inline
  def apply(includeDirs: js.Array[String] = null): Anon_IncludeDirs = {
    val __obj = js.Dynamic.literal()
    if (includeDirs != null) __obj.updateDynamic("includeDirs")(includeDirs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeDirs]
  }
}

