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
    createListener: js.Function1[lestateLib.Anon_Force, scala.Unit],
    get: js.Function0[js.Any],
    getDescription: js.Function0[js.Object],
    insert: js.Function1[js.Object, scala.Unit],
    set: js.Function1[js.Object, js.Array[lestateLib.Anon_Id]]
  ): LeState = {
    val __obj = js.Dynamic.literal(createListener = createListener, get = get, getDescription = getDescription, insert = insert, set = set)
  
    __obj.asInstanceOf[LeState]
  }
}

