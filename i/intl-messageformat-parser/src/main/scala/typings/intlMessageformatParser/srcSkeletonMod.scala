package typings.intlMessageformatParser

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.intlMessageformatParser.intlMessageformatParserStrings.h11
import typings.intlMessageformatParser.intlMessageformatParserStrings.h12
import typings.intlMessageformatParser.intlMessageformatParserStrings.h23
import typings.intlMessageformatParser.intlMessageformatParserStrings.h24
import typings.intlMessageformatParser.srcTypesMod.NumberSkeletonToken
import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSkeletonMod {
  
  @JSImport("intl-messageformat-parser/src/skeleton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDateTimeSkeleton(skeleton: String): ExtendedDateTimeFormatOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any]).asInstanceOf[ExtendedDateTimeFormatOptions]
  
  inline def parseNumberSkeleton(tokens: js.Array[NumberSkeletonToken]): NumberFormatOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumberSkeleton")(tokens.asInstanceOf[js.Any]).asInstanceOf[NumberFormatOptions]
  
  trait ExtendedDateTimeFormatOptions
    extends StObject
       with DateTimeFormatOptions {
    
    var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.undefined
  }
  object ExtendedDateTimeFormatOptions {
    
    inline def apply(): ExtendedDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendedDateTimeFormatOptions]
    }
    
    extension [Self <: ExtendedDateTimeFormatOptions](x: Self) {
      
      inline def setHourCycle(value: h11 | h12 | h23 | h24): Self = StObject.set(x, "hourCycle", value.asInstanceOf[js.Any])
      
      inline def setHourCycleUndefined: Self = StObject.set(x, "hourCycle", js.undefined)
    }
  }
}
