package typings
package lowdbLib.lowdbMod.LowdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowdbBase[SchemaT] extends js.Object {
  def getState(): SchemaT
  def setState(state: SchemaT): this.type
}

