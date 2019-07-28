package typings.lovefield.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binder extends js.Object {
  def getIndex(): Double
}

object Binder {
  @scala.inline
  def apply(getIndex: () => Double): Binder = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex))
  
    __obj.asInstanceOf[Binder]
  }
}

