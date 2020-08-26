package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridAppendRowsOnDemandMethods extends js.Object {
  /**
    * Destroys the append rows on demand widget
    */
  def destroy(): Unit = js.native
  /**
    * Loads the next chunk of data.
    */
  def nextChunk(): Unit = js.native
}

object IgGridAppendRowsOnDemandMethods {
  @scala.inline
  def apply(destroy: () => Unit, nextChunk: () => Unit): IgGridAppendRowsOnDemandMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), nextChunk = js.Any.fromFunction0(nextChunk))
    __obj.asInstanceOf[IgGridAppendRowsOnDemandMethods]
  }
  @scala.inline
  implicit class IgGridAppendRowsOnDemandMethodsOps[Self <: IgGridAppendRowsOnDemandMethods] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setNextChunk(value: () => Unit): Self = this.set("nextChunk", js.Any.fromFunction0(value))
  }
  
}

