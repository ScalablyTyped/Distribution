package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlurColor extends js.Object {
  var blur: jssLib.cssMod.Length
  var color: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['color'] */ js.Any
  var x: jssLib.cssMod.Length
  var y: jssLib.cssMod.Length
}

object Anon_BlurColor {
  @scala.inline
  def apply(
    blur: jssLib.cssMod.Length,
    color: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['color'] */ js.Any,
    x: jssLib.cssMod.Length,
    y: jssLib.cssMod.Length
  ): Anon_BlurColor = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], color = color, x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlurColor]
  }
}

