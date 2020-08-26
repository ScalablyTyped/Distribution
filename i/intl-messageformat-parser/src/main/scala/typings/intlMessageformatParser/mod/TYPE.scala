package typings.intlMessageformatParser.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TYPE extends js.Object

@JSImport("intl-messageformat-parser", "TYPE")
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
    * Only possible within plural argument.
    * This is the `#` symbol that will be substituted with the count.
    */
  @js.native
  sealed trait pound extends TYPE
  
  /**
    * Variable w/ select format
    */
  @js.native
  sealed trait select extends TYPE
  
  /**
    * XML-like tag
    */
  @js.native
  sealed trait tag extends TYPE
  
  /**
    * Variable w/ time format
    */
  @js.native
  sealed trait time extends TYPE
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
  /* 1 */ @js.native
  object argument extends TopLevel[argument with Double]
  
  /* 3 */ @js.native
  object date extends TopLevel[date with Double]
  
  /* 0 */ @js.native
  object literal extends TopLevel[literal with Double]
  
  /* 2 */ @js.native
  object number extends TopLevel[number with Double]
  
  /* 6 */ @js.native
  object plural extends TopLevel[plural with Double]
  
  /* 7 */ @js.native
  object pound extends TopLevel[pound with Double]
  
  /* 5 */ @js.native
  object select extends TopLevel[select with Double]
  
  /* 8 */ @js.native
  object tag extends TopLevel[tag with Double]
  
  /* 4 */ @js.native
  object time extends TopLevel[time with Double]
  
}

