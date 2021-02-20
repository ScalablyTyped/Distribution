package typings.lowlight.lowlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightOptions extends StObject {
  
  var prefix: js.UndefOr[String] = js.native
}
object HighlightOptions {
  
  @scala.inline
  def apply(): HighlightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightOptions]
  }
  
  @scala.inline
  implicit class HighlightOptionsMutableBuilder[Self <: HighlightOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
