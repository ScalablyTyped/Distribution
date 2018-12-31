package typings
package maliDashOnerrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali-onerror", JSImport.Namespace)
@js.native
object maliDashOnerrorMod extends js.Object {
  def apply(
    fn: js.Function2[
      /* err */ nodeLib.Error, 
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Context */ /* ctx */ js.Any, 
      scala.Unit
    ]
  ): js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Context */ /* ctx */ js.Any, 
    /* next */ js.Function0[js.Promise[scala.Unit]], 
    js.Promise[scala.Unit]
  ] = js.native
}

