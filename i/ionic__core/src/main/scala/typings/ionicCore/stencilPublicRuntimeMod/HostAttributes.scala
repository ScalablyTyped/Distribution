package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Host
  */
@js.native
trait HostAttributes
  extends /* prop */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[String | StringDictionary[Boolean]] = js.native
  var ref: js.UndefOr[js.Function1[/* el */ HTMLElement | Null, Unit]] = js.native
  var style: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
}

object HostAttributes {
  @scala.inline
  def apply(): HostAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostAttributes]
  }
  @scala.inline
  implicit class HostAttributesOps[Self <: HostAttributes] (val x: Self) extends AnyVal {
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
    def setClass(value: String | StringDictionary[Boolean]): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setRef(value: /* el */ HTMLElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setStyle(value: StringDictionary[js.UndefOr[String]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

