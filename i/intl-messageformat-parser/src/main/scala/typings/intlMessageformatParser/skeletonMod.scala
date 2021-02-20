package typings.intlMessageformatParser

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.intlMessageformatParser.intlMessageformatParserStrings.h11
import typings.intlMessageformatParser.intlMessageformatParserStrings.h12
import typings.intlMessageformatParser.intlMessageformatParserStrings.h23
import typings.intlMessageformatParser.intlMessageformatParserStrings.h24
import typings.intlMessageformatParser.typesMod.NumberSkeletonToken
import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  @JSImport("intl-messageformat-parser/lib/src/skeleton", "parseDateTimeSkeleton")
  @js.native
  def parseDateTimeSkeleton(skeleton: String): ExtendedDateTimeFormatOptions = js.native
  
  @JSImport("intl-messageformat-parser/lib/src/skeleton", "parseNumberSkeleton")
  @js.native
  def parseNumberSkeleton(tokens: js.Array[NumberSkeletonToken]): NumberFormatOptions = js.native
  
  @js.native
  trait ExtendedDateTimeFormatOptions extends DateTimeFormatOptions {
    
    var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.native
  }
  object ExtendedDateTimeFormatOptions {
    
    @scala.inline
    def apply(): ExtendedDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedDateTimeFormatOptions]
    }
    
    @scala.inline
    implicit class ExtendedDateTimeFormatOptionsMutableBuilder[Self <: ExtendedDateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHourCycle(value: h11 | h12 | h23 | h24): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    }
  }
}
