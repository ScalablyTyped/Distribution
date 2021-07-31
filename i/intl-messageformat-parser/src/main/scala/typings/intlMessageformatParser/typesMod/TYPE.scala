package typings.intlMessageformatParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TYPE extends StObject
@JSImport("intl-messageformat-parser/lib/src/types", "TYPE")
@js.native
object TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE & Double] = js.native
  
  /**
    * Variable w/o any format, e.g `var` in `this is a {var}`
    */
  @js.native
  sealed trait argument
    extends StObject
       with TYPE
  /* 1 */ val argument: typings.intlMessageformatParser.typesMod.TYPE.argument & Double = js.native
  
  /**
    * Variable w/ date format
    */
  @js.native
  sealed trait date
    extends StObject
       with TYPE
  /* 3 */ val date: typings.intlMessageformatParser.typesMod.TYPE.date & Double = js.native
  
  /**
    * Raw text
    */
  @js.native
  sealed trait literal
    extends StObject
       with TYPE
  /* 0 */ val literal: typings.intlMessageformatParser.typesMod.TYPE.literal & Double = js.native
  
  /**
    * Variable w/ number format
    */
  @js.native
  sealed trait number
    extends StObject
       with TYPE
  /* 2 */ val number: typings.intlMessageformatParser.typesMod.TYPE.number & Double = js.native
  
  /**
    * Variable w/ plural format
    */
  @js.native
  sealed trait plural
    extends StObject
       with TYPE
  /* 6 */ val plural: typings.intlMessageformatParser.typesMod.TYPE.plural & Double = js.native
  
  /**
    * Only possible within plural argument.
    * This is the `#` symbol that will be substituted with the count.
    */
  @js.native
  sealed trait pound
    extends StObject
       with TYPE
  /* 7 */ val pound: typings.intlMessageformatParser.typesMod.TYPE.pound & Double = js.native
  
  /**
    * Variable w/ select format
    */
  @js.native
  sealed trait select
    extends StObject
       with TYPE
  /* 5 */ val select: typings.intlMessageformatParser.typesMod.TYPE.select & Double = js.native
  
  /**
    * XML-like tag
    */
  @js.native
  sealed trait tag
    extends StObject
       with TYPE
  /* 8 */ val tag: typings.intlMessageformatParser.typesMod.TYPE.tag & Double = js.native
  
  /**
    * Variable w/ time format
    */
  @js.native
  sealed trait time
    extends StObject
       with TYPE
  /* 4 */ val time: typings.intlMessageformatParser.typesMod.TYPE.time & Double = js.native
}
