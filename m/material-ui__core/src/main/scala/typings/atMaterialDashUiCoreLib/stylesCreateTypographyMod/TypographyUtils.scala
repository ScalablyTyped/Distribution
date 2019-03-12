package typings
package atMaterialDashUiCoreLib.stylesCreateTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypographyUtils extends js.Object {
  def pxToRem(px: scala.Double): java.lang.String
}

object TypographyUtils {
  @scala.inline
  def apply(pxToRem: scala.Double => java.lang.String): TypographyUtils = {
    val __obj = js.Dynamic.literal(pxToRem = js.Any.fromFunction1(pxToRem))
  
    __obj.asInstanceOf[TypographyUtils]
  }
}

