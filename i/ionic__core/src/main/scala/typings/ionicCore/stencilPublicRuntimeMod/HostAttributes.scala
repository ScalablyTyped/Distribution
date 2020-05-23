package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Host
  */
trait HostAttributes
  extends /* prop */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[String | StringDictionary[Boolean]] = js.undefined
  var ref: js.UndefOr[js.Function1[/* el */ HTMLElement | Null, Unit]] = js.undefined
  var style: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
}

object HostAttributes {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    `class`: String | StringDictionary[Boolean] = null,
    ref: /* el */ HTMLElement | Null => Unit = null,
    style: StringDictionary[js.UndefOr[String]] = null
  ): HostAttributes = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1(ref))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostAttributes]
  }
}

