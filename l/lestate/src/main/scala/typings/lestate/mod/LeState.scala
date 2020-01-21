package typings.lestate.mod

import typings.lestate.AnonForce
import typings.lestate.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeState extends js.Object {
  def createListener(options: AnonForce): Unit
  def get(): js.Any
  def getDescription(): js.Object
  def insert(newValue: js.Object): Unit
  def set(newValue: js.Object): js.Array[AnonId]
}

object LeState {
  @scala.inline
  def apply(
    createListener: AnonForce => Unit,
    get: () => js.Any,
    getDescription: () => js.Object,
    insert: js.Object => Unit,
    set: js.Object => js.Array[AnonId]
  ): LeState = {
    val __obj = js.Dynamic.literal(createListener = js.Any.fromFunction1(createListener), get = js.Any.fromFunction0(get), getDescription = js.Any.fromFunction0(getDescription), insert = js.Any.fromFunction1(insert), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[LeState]
  }
}

