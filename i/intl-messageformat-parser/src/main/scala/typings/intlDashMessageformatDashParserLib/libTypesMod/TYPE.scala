package typings
package intlDashMessageformatDashParserLib.libTypesMod

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
  sealed trait argument
    extends intlDashMessageformatDashParserLib.libTypesMod.TYPE
  
  /**
    * Variable w/ date format
    */
  @js.native
  sealed trait date
    extends intlDashMessageformatDashParserLib.libTypesMod.TYPE
  
  /**
    * Raw text
    */
  @js.native
  sealed trait literal
    extends intlDashMessageformatDashParserLib.libTypesMod.TYPE
  
  /**
    * Variable w/ number format
    */
  @js.native
  sealed trait number
    extends intlDashMessageformatDashParserLib.libTypesMod.TYPE
  
  /**
    * Variable w/ plural format
    */
  @js.native
  sealed trait plural
    extends intlDashMessageformatDashParserLib.libTypesMod.TYPE
  
  /**
    * Variable w/ select format
    */
  @js.native
  sealed trait select
    extends intlDashMessageformatDashParserLib.libTypesMod.TYPE
  
  /**
    * Variable w/ time format
    */
  @js.native
  sealed trait time
    extends intlDashMessageformatDashParserLib.libTypesMod.TYPE
  
  /* 1 */ val argument: argument with scala.Double = js.native
  /* 3 */ val date: date with scala.Double = js.native
  /* 0 */ val literal: literal with scala.Double = js.native
  /* 2 */ val number: number with scala.Double = js.native
  /* 6 */ val plural: plural with scala.Double = js.native
  /* 5 */ val select: select with scala.Double = js.native
  /* 4 */ val time: time with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[intlDashMessageformatDashParserLib.libTypesMod.TYPE with scala.Double] = js.native
}

