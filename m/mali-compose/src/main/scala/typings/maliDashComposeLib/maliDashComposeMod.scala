package typings
package maliDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali-compose", JSImport.Namespace)
@js.native
object maliDashComposeMod extends js.Object {
  def apply(
    middleware: js.Array[
      js.Function2[
        /* ctx */ maliLib.maliMod.MaliNs.Context, 
        /* next */ js.Function0[stdLib.Promise[scala.Unit]], 
        stdLib.Promise[scala.Unit]
      ]
    ]
  ): js.Function2[
    /* context */ maliLib.maliMod.MaliNs.Context, 
    /* next */ js.Function0[stdLib.Promise[scala.Unit]], 
    stdLib.Promise[scala.Unit]
  ] = js.native
}

