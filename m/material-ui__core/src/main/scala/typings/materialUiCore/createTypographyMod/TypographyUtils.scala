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
}

