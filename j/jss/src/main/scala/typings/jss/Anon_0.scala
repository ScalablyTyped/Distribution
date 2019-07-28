package typings.jss

import typings.csstype.csstypeMod.BackgroundPositionProperty
import typings.csstype.csstypeMod.BackgroundSizeProperty
import typings.jss.jssNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var attachment: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundAttachment'] */ js.Any
  var color: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundColor'] */ js.Any
  var image: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundImage'] */ js.Any
  var position: (/* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundPosition'] */ js.Any) | (js.Tuple2[
    js.UndefOr[BackgroundPositionProperty[String | `0`]], 
    js.UndefOr[BackgroundPositionProperty[String | `0`]]
  ])
   // Can be written using array e.g. `[0 0]`
  var repeat: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundRepeat'] */ js.Any
  var size: (/* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundSize'] */ js.Any) | (js.Tuple2[
    js.UndefOr[BackgroundSizeProperty[String | `0`]], 
    js.UndefOr[BackgroundSizeProperty[String | `0`]]
  ])
}

object Anon_0 {
  @scala.inline
  def apply(
    attachment: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundAttachment'] */ js.Any,
    color: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundColor'] */ js.Any,
    image: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundImage'] */ js.Any,
    position: (/* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundPosition'] */ js.Any) | (js.Tuple2[
      js.UndefOr[BackgroundPositionProperty[String | `0`]], 
      js.UndefOr[BackgroundPositionProperty[String | `0`]]
    ]),
    repeat: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundRepeat'] */ js.Any,
    size: (/* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['backgroundSize'] */ js.Any) | (js.Tuple2[
      js.UndefOr[BackgroundSizeProperty[String | `0`]], 
      js.UndefOr[BackgroundSizeProperty[String | `0`]]
    ])
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(attachment = attachment, color = color, image = image, position = position.asInstanceOf[js.Any], repeat = repeat, size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_0]
  }
}

