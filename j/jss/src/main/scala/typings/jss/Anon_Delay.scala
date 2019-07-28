package typings.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['transitionDelay'] */ js.Any
  var duration: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['transitionDuration'] */ js.Any
  var property: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['transitionProperty'] */ js.Any
  var timingFunction: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['transitionTimingFunction'] */ js.Any
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['transitionDelay'] */ js.Any,
    duration: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['transitionDuration'] */ js.Any,
    property: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['transitionProperty'] */ js.Any,
    timingFunction: /* import warning: ImportType.apply Failed type conversion: jss.jss/css.CSSProperties['transitionTimingFunction'] */ js.Any
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay, duration = duration, property = property, timingFunction = timingFunction)
  
    __obj.asInstanceOf[Anon_Delay]
  }
}

