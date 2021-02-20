package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripFlags extends StObject {
  
  var close: Boolean = js.native
  
  var open: Boolean = js.native
}
object StripFlags {
  
  @scala.inline
  def apply(close: Boolean, open: Boolean): StripFlags = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripFlags]
  }
  
  @scala.inline
  implicit class StripFlagsMutableBuilder[Self <: StripFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
