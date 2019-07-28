package typings.jss

import typings.jss.cssMod.Length
import typings.jss.jssStrings.inset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blur extends js.Object {
  var blur: Length
  var color: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['color'] */ js.Any
  var inset: js.UndefOr[typings.jss.jssStrings.inset] = js.undefined
  var spread: Length
  var x: Length
  var y: Length
}

object Anon_Blur {
  @scala.inline
  def apply(
    blur: Length,
    color: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['color'] */ js.Any,
    spread: Length,
    x: Length,
    y: Length,
    inset: inset = null
  ): Anon_Blur = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], color = color, spread = spread.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset)
    __obj.asInstanceOf[Anon_Blur]
  }
}

