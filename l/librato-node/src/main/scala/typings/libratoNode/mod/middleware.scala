package typings.libratoNode.mod

import typings.libratoNode.AnonRequestCountKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("librato-node", "middleware")
@js.native
object middleware extends js.Object {
  def apply(): js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ] = js.native
  def apply(config: AnonRequestCountKey): js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ] = js.native
}

