package typings.handlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrecompileOptions extends CompileOptions {
  
  var destName: js.UndefOr[String] = js.native
  
  var srcName: js.UndefOr[String] = js.native
}
object PrecompileOptions {
  
  @scala.inline
  def apply(): PrecompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecompileOptions]
  }
  
  @scala.inline
  implicit class PrecompileOptionsMutableBuilder[Self <: PrecompileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestName(value: String): Self = StObject.set(x, "destName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestNameUndefined: Self = StObject.set(x, "destName", js.undefined)
    
    @scala.inline
    def setSrcName(value: String): Self = StObject.set(x, "srcName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcNameUndefined: Self = StObject.set(x, "srcName", js.undefined)
  }
}
