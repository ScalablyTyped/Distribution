package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowdbBase[SchemaT] extends js.Object {
  def getState(): SchemaT
  def setState(state: SchemaT): this.type
}

object LowdbBase {
  @scala.inline
  def apply[SchemaT](getState: js.Function0[SchemaT], setState: js.Function1[SchemaT, LowdbBase[SchemaT]]): LowdbBase[SchemaT] = {
    val __obj = js.Dynamic.literal(getState = getState, setState = setState)
  
    __obj.asInstanceOf[LowdbBase[SchemaT]]
  }
}

