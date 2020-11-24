package typings.gregorianCalendar.gregorianCalendarFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeStyle extends js.Object
@JSImport("gregorian-calendar-format", "DateTimeStyle")
@js.native
object DateTimeStyle extends js.Object {
  
  /**
    * full style
    */
  @js.native
  sealed trait FULL extends DateTimeStyle
  
  /**
    * long style
    */
  @js.native
  sealed trait LONG extends DateTimeStyle
  
  /**
    * medium style
    */
  @js.native
  sealed trait MEDIUM extends DateTimeStyle
  
  /**
    * short style
    */
  @js.native
  sealed trait SHORT extends DateTimeStyle
}
