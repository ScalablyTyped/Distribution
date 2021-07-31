package typings.intlMessageformatParser.srcTypesMod

import typings.intlMessageformatParser.intlMessageformatParserNumbers.`0`
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberSkeleton
  extends StObject
     with Skeleton {
  
  var location: js.UndefOr[Location] = js.undefined
  
  var parsedOptions: NumberFormatOptions
  
  var tokens: js.Array[NumberSkeletonToken]
  
  var `type`: `0`
}
object NumberSkeleton {
  
  @scala.inline
  def apply(parsedOptions: NumberFormatOptions, tokens: js.Array[NumberSkeletonToken]): NumberSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0)
    __obj.asInstanceOf[NumberSkeleton]
  }
  
  @scala.inline
  implicit class NumberSkeletonMutableBuilder[Self <: NumberSkeleton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setParsedOptions(value: NumberFormatOptions): Self = StObject.set(x, "parsedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Array[NumberSkeletonToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: NumberSkeletonToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
