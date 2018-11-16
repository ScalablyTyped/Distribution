package typings
package gregorianDashCalendarLib.gregorianDashCalendarDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeStyle extends js.Object

@JSImport("gregorian-calendar-format", "DateTimeStyle")
@js.native
object DateTimeStyle extends js.Object {
  /**
           * full style
           */
  @js.native
  sealed trait FULL
    extends gregorianDashCalendarLib.gregorianDashCalendarDashFormatMod.DateTimeStyle
  
  /**
           * long style
           */
  @js.native
  sealed trait LONG
    extends gregorianDashCalendarLib.gregorianDashCalendarDashFormatMod.DateTimeStyle
  
  /**
           * medium style
           */
  @js.native
  sealed trait MEDIUM
    extends gregorianDashCalendarLib.gregorianDashCalendarDashFormatMod.DateTimeStyle
  
  /**
           * short style
           */
  @js.native
  sealed trait SHORT
    extends gregorianDashCalendarLib.gregorianDashCalendarDashFormatMod.DateTimeStyle
  
}

