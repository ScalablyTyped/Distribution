package typings
package maliDashOnerrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali-onerror", JSImport.Namespace)
@js.native
object maliDashOnerrorMod extends js.Object {
  def apply(fn: js.Function2[/* err */ nodeLib.Error, /* ctx */ maliLib.maliMod.MaliNs.Context, scala.Unit]): js.Function2[
    /* ctx */ maliLib.maliMod.MaliNs.Context, 
    /* next */ js.Function0[stdLib.Promise[scala.Unit]], 
    stdLib.Promise[scala.Unit]
  ] = js.native
}

