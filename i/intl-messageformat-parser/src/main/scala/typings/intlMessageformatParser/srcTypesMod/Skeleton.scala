package typings.intlMessageformatParser.srcTypesMod

import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.intlMessageformatParser.srcTypesMod.NumberSkeleton
  - typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
*/
trait Skeleton extends StObject
object Skeleton {
  
  inline def DateTimeSkeleton(parsedOptions: DateTimeFormatOptions, pattern: String): typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton]
  }
  
  inline def NumberSkeleton(parsedOptions: NumberFormatOptions, tokens: js.Array[NumberSkeletonToken]): typings.intlMessageformatParser.srcTypesMod.NumberSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0)
    __obj.asInstanceOf[typings.intlMessageformatParser.srcTypesMod.NumberSkeleton]
  }
}
