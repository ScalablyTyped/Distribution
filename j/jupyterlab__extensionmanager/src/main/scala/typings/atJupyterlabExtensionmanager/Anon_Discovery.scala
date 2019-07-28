package typings.atJupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Discovery extends js.Object {
  var discovery: js.UndefOr[Anon_Kernel] = js.undefined
}

object Anon_Discovery {
  @scala.inline
  def apply(discovery: Anon_Kernel = null): Anon_Discovery = {
    val __obj = js.Dynamic.literal()
    if (discovery != null) __obj.updateDynamic("discovery")(discovery)
    __obj.asInstanceOf[Anon_Discovery]
  }
}

