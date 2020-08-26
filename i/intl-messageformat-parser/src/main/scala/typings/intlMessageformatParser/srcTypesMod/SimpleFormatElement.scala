package typings.intlMessageformatParser.srcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleFormatElement[T /* <: TYPE */, S /* <: Skeleton */] extends BaseElement[T] {
  var style: js.UndefOr[String | S | Null] = js.native
}

object SimpleFormatElement {
  @scala.inline
  def apply[/* <: typings.intlMessageformatParser.srcTypesMod.TYPE */ T, /* <: typings.intlMessageformatParser.srcTypesMod.Skeleton */ S](`type`: T, value: String): SimpleFormatElement[T, S] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleFormatElement[T, S]]
  }
  @scala.inline
  implicit class SimpleFormatElementOps[Self <: SimpleFormatElement[_, _], /* <: typings.intlMessageformatParser.srcTypesMod.TYPE */ T, /* <: typings.intlMessageformatParser.srcTypesMod.Skeleton */ S] (val x: Self with (SimpleFormatElement[T, S])) extends AnyVal {
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
    def setStyle(value: String | S): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

