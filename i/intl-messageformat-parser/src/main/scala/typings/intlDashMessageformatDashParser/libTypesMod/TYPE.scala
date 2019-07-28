package typings.intlDashMessageformatDashParser.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPE extends js.Object

@JSImport("intl-messageformat-parser/lib/types", "TYPE")
@js.native
object TYPE extends js.Object {
  /**
    * Variable w/o any format, e.g `var` in `this is a {var}`
    */
  @js.native
  sealed trait argument extends TYPE
  
  /**
    * Variable w/ date format
    */
  @js.native
  sealed trait date extends TYPE
  
  /**
    * Raw text
    */
  @js.native
  sealed trait literal extends TYPE
  
  /**
    * Variable w/ number format
    */
  @js.native
  sealed trait number extends TYPE
  
  /**
    * Variable w/ plural format
    */
  @js.native
  sealed trait plural extends TYPE
  
  /**
    * Variable w/ select format
    */
  @js.native
  sealed trait select extends TYPE
  
  /**
    * Variable w/ time format
    */
  @js.native
  sealed trait time extends TYPE
  
  /* 1 */ val argument: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.argument with Double = js.native
  /* 3 */ val date: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.date with Double = js.native
  /* 0 */ val literal: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.literal with Double = js.native
  /* 2 */ val number: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.number with Double = js.native
  /* 6 */ val plural: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.plural with Double = js.native
  /* 5 */ val select: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.select with Double = js.native
  /* 4 */ val time: typings.intlDashMessageformatDashParser.libTypesMod.TYPE.time with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
}

