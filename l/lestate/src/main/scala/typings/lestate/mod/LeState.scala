package typings.lestate.mod

import typings.lestate.anon.Force
import typings.lestate.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeState extends js.Object {
  def createListener(options: Force): Unit = js.native
  def get(): js.Any = js.native
  def getDescription(): js.Object = js.native
  def insert(newValue: js.Object): Unit = js.native
  def set(newValue: js.Object): js.Array[Id] = js.native
}

object LeState {
  @scala.inline
  def apply(
    createListener: Force => Unit,
    get: () => js.Any,
    getDescription: () => js.Object,
    insert: js.Object => Unit,
    set: js.Object => js.Array[Id]
  ): LeState = {
    val __obj = js.Dynamic.literal(createListener = js.Any.fromFunction1(createListener), get = js.Any.fromFunction0(get), getDescription = js.Any.fromFunction0(getDescription), insert = js.Any.fromFunction1(insert), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[LeState]
  }
  @scala.inline
  implicit class LeStateOps[Self <: LeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateListener(value: Force => Unit): Self = this.set("createListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: () => js.Any): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDescription(value: () => js.Object): Self = this.set("getDescription", js.Any.fromFunction0(value))
    @scala.inline
    def setInsert(value: js.Object => Unit): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: js.Object => js.Array[Id]): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

