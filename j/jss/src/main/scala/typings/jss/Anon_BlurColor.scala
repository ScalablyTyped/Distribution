package typings.jss

import typings.jss.cssMod.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlurColor extends js.Object {
  var blur: Length
  var color: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['color'] */ js.Any
  var x: Length
  var y: Length
}

object Anon_BlurColor {
  @scala.inline
  def apply(
    blur: Length,
    color: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['color'] */ js.Any,
    x: Length,
    y: Length
  ): Anon_BlurColor = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], color = color, x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlurColor]
  }
}

