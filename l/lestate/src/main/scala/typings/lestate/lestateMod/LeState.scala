package typings.lestate.lestateMod

import typings.lestate.Anon_Force
import typings.lestate.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeState extends js.Object {
  def createListener(options: Anon_Force): Unit
  def get(): js.Any
  def getDescription(): js.Object
  def insert(newValue: js.Object): Unit
  def set(newValue: js.Object): js.Array[Anon_Id]
}

object LeState {
  @scala.inline
  def apply(
    createListener: Anon_Force => Unit,
    get: () => js.Any,
    getDescription: () => js.Object,
    insert: js.Object => Unit,
    set: js.Object => js.Array[Anon_Id]
  ): LeState = {
    val __obj = js.Dynamic.literal(createListener = js.Any.fromFunction1(createListener), get = js.Any.fromFunction0(get), getDescription = js.Any.fromFunction0(getDescription), insert = js.Any.fromFunction1(insert), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[LeState]
  }
}

