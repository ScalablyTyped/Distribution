package typings.intlMessageformatParser.srcTypesMod

import typings.intlMessageformatParser.intlMessageformatParserNumbers.`1`
import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeSkeleton
  extends StObject
     with Skeleton {
  
  var location: js.UndefOr[Location] = js.undefined
  
  var parsedOptions: DateTimeFormatOptions
  
  var pattern: String
  
  var `type`: `1`
}
object DateTimeSkeleton {
  
  @scala.inline
  def apply(parsedOptions: DateTimeFormatOptions, pattern: String): DateTimeSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[DateTimeSkeleton]
  }
  
  @scala.inline
  implicit class DateTimeSkeletonMutableBuilder[Self <: DateTimeSkeleton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setParsedOptions(value: DateTimeFormatOptions): Self = StObject.set(x, "parsedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
