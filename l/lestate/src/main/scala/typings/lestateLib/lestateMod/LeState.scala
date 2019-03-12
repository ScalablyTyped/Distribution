package typings
package lestateLib.lestateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeState extends js.Object {
  def createListener(options: lestateLib.Anon_Force): scala.Unit
  def get(): js.Any
  def getDescription(): js.Object
  def insert(newValue: js.Object): scala.Unit
  def set(newValue: js.Object): js.Array[lestateLib.Anon_Id]
}

object LeState {
  @scala.inline
  def apply(
    createListener: lestateLib.Anon_Force => scala.Unit,
    get: () => js.Any,
    getDescription: () => js.Object,
    insert: js.Object => scala.Unit,
    set: js.Object => js.Array[lestateLib.Anon_Id]
  ): LeState = {
    val __obj = js.Dynamic.literal(createListener = js.Any.fromFunction1(createListener), get = js.Any.fromFunction0(get), getDescription = js.Any.fromFunction0(getDescription), insert = js.Any.fromFunction1(insert), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[LeState]
  }
}

