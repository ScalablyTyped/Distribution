package typings.intlMessageformatParser.srcTypesMod

import typings.intlMessageformatParser.intlMessageformatParserNumbers.`0`
import typings.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberSkeleton extends Skeleton {
  
  var location: js.UndefOr[Location] = js.native
  
  var parsedOptions: NumberFormatOptions = js.native
  
  var tokens: js.Array[NumberSkeletonToken] = js.native
  
  var `type`: `0` = js.native
}
object NumberSkeleton {
  
  @scala.inline
  def apply(parsedOptions: NumberFormatOptions, tokens: js.Array[NumberSkeletonToken], `type`: `0`): NumberSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSkeleton]
  }
  
  @scala.inline
  implicit class NumberSkeletonOps[Self <: NumberSkeleton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParsedOptions(value: NumberFormatOptions): Self = this.set("parsedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: NumberSkeletonToken*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[NumberSkeletonToken]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
