package typings.intlMessageformatParser.srcTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TYPE extends js.Object
@JSImport("intl-messageformat-parser/src/types", "TYPE")
@js.native
object TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
  
  /**
    * Variable w/o any format, e.g `var` in `this is a {var}`
    */
  @js.native
  sealed trait argument extends TYPE
  /* 1 */ @js.native
  object argument extends TopLevel[argument with Double]
  
  /**
    * Variable w/ date format
    */
  @js.native
  sealed trait date extends TYPE
  /* 3 */ @js.native
  object date extends TopLevel[date with Double]
  
  /**
    * Raw text
    */
  @js.native
  sealed trait literal extends TYPE
  /* 0 */ @js.native
  object literal extends TopLevel[literal with Double]
  
  /**
    * Variable w/ number format
    */
  @js.native
  sealed trait number extends TYPE
  /* 2 */ @js.native
  object number extends TopLevel[number with Double]
  
  /**
    * Variable w/ plural format
    */
  @js.native
  sealed trait plural extends TYPE
  /* 6 */ @js.native
  object plural extends TopLevel[plural with Double]
  
  /**
    * Only possible within plural argument.
    * This is the `#` symbol that will be substituted with the count.
    */
  @js.native
  sealed trait pound extends TYPE
  /* 7 */ @js.native
  object pound extends TopLevel[pound with Double]
  
  /**
    * Variable w/ select format
    */
  @js.native
  sealed trait select extends TYPE
  /* 5 */ @js.native
  object select extends TopLevel[select with Double]
  
  /**
    * XML-like tag
    */
  @js.native
  sealed trait tag extends TYPE
  /* 8 */ @js.native
  object tag extends TopLevel[tag with Double]
  
  /**
    * Variable w/ time format
    */
  @js.native
  sealed trait time extends TYPE
  /* 4 */ @js.native
  object time extends TopLevel[time with Double]
}
