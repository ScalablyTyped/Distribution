package typings.lowdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowdbBase[SchemaT] extends js.Object {
  def getState(): SchemaT
  def setState(state: SchemaT): this.type
}

object LowdbBase {
  @scala.inline
  def apply[SchemaT](getState: () => SchemaT, setState: SchemaT => LowdbBase[SchemaT]): LowdbBase[SchemaT] = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[LowdbBase[SchemaT]]
  }
}

