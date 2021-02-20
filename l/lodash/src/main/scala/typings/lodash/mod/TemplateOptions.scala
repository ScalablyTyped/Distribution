package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateOptions extends TemplateSettings {
  
  /**
    * @see _.sourceURL
    */
  var sourceURL: js.UndefOr[java.lang.String] = js.native
}
object TemplateOptions {
  
  @scala.inline
  def apply(): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions]
  }
  
  @scala.inline
  implicit class TemplateOptionsMutableBuilder[Self <: TemplateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceURL(value: java.lang.String): Self = StObject.set(x, "sourceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceURLUndefined: Self = StObject.set(x, "sourceURL", js.undefined)
  }
}
