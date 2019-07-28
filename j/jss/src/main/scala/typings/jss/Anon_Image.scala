package typings.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['listStyleImage'] */ js.Any
  var position: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['listStylePosition'] */ js.Any
  var `type`: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['listStyleType'] */ js.Any
}

object Anon_Image {
  @scala.inline
  def apply(
    image: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['listStyleImage'] */ js.Any,
    position: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['listStylePosition'] */ js.Any,
    `type`: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['listStyleType'] */ js.Any
  ): Anon_Image = {
    val __obj = js.Dynamic.literal(image = image, position = position)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Image]
  }
}

