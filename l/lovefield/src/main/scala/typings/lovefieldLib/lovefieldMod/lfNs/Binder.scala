package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binder extends js.Object {
  def getIndex(): scala.Double
}

object Binder {
  @scala.inline
  def apply(getIndex: js.Function0[scala.Double]): Binder = {
    val __obj = js.Dynamic.literal(getIndex = getIndex)
  
    __obj.asInstanceOf[Binder]
  }
}

