package typings.jqueryTools.JQueryTools.overlay

import typings.jqueryTools.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay extends js.Object {
  /** Closes the overlay. */
  def close(): Overlay = js.native
  /** Returns the closing element(s) as a jQuery object. */
  def getClosers(): JQuery = js.native
  /** Returns the configuration for the overlay. */
  def getConf(): OverlayOptions = js.native
  /** Returns the overlayed element as a jQuery object. */
  def getOverlay(): JQuery = js.native
  /** Returns the triggering element as a jQuery object. */
  def getTrigger(): JQuery = js.native
  /** Returns `true` if the overlay is opened. */
  def isOpened(): Boolean = js.native
  /** Opens the overlay. */
  def load(): Overlay = js.native
}

object Overlay {
  @scala.inline
  def apply(
    close: () => Overlay,
    getClosers: () => JQuery,
    getConf: () => OverlayOptions,
    getOverlay: () => JQuery,
    getTrigger: () => JQuery,
    isOpened: () => Boolean,
    load: () => Overlay
  ): Overlay = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getClosers = js.Any.fromFunction0(getClosers), getConf = js.Any.fromFunction0(getConf), getOverlay = js.Any.fromFunction0(getOverlay), getTrigger = js.Any.fromFunction0(getTrigger), isOpened = js.Any.fromFunction0(isOpened), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[Overlay]
  }
  @scala.inline
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Overlay): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClosers(value: () => JQuery): Self = this.set("getClosers", js.Any.fromFunction0(value))
    @scala.inline
    def setGetConf(value: () => OverlayOptions): Self = this.set("getConf", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOverlay(value: () => JQuery): Self = this.set("getOverlay", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTrigger(value: () => JQuery): Self = this.set("getTrigger", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOpened(value: () => Boolean): Self = this.set("isOpened", js.Any.fromFunction0(value))
    @scala.inline
    def setLoad(value: () => Overlay): Self = this.set("load", js.Any.fromFunction0(value))
  }
  
}

