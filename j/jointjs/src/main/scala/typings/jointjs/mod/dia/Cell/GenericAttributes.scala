package typings.jointjs.mod.dia.Cell

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericAttributes[T]
  extends /* key */ StringDictionary[js.Any] {
  var attrs: js.UndefOr[T] = js.native
  var z: js.UndefOr[Double] = js.native
}

object GenericAttributes {
  @scala.inline
  def apply[T](): GenericAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericAttributes[T]]
  }
  @scala.inline
  implicit class GenericAttributesOps[Self <: GenericAttributes[_], T] (val x: Self with GenericAttributes[T]) extends AnyVal {
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
    def setAttrs(value: T): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
  
}

