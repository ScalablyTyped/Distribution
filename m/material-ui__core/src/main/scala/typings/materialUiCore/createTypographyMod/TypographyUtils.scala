package typings.materialUiCore.createTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypographyUtils extends js.Object {
  def pxToRem(px: Double): String = js.native
}

object TypographyUtils {
  @scala.inline
  def apply(pxToRem: Double => String): TypographyUtils = {
    val __obj = js.Dynamic.literal(pxToRem = js.Any.fromFunction1(pxToRem))
    __obj.asInstanceOf[TypographyUtils]
  }
  @scala.inline
  implicit class TypographyUtilsOps[Self <: TypographyUtils] (val x: Self) extends AnyVal {
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
    def setPxToRem(value: Double => String): Self = this.set("pxToRem", js.Any.fromFunction1(value))
  }
  
}

