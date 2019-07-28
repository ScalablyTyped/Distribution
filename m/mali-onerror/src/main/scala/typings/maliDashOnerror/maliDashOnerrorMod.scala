package typings.maliDashOnerror

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali-onerror", JSImport.Namespace)
@js.native
object maliDashOnerrorMod extends js.Object {
  def apply(
    fn: js.Function2[
      /* err */ Error, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Context */ /* ctx */ js.Any, 
      Unit
    ]
  ): js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Context */ /* ctx */ js.Any, 
    /* next */ js.Function0[js.Promise[Unit]], 
    js.Promise[Unit]
  ] = js.native
}

