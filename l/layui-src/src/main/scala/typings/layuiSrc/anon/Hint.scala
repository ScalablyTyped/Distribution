package typings.layuiSrc.anon

import typings.layuiSrc.Layui.DateOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hint extends StObject {
  
  var config: DateOption
  
  def hint(content: String): Unit
}
object Hint {
  
  inline def apply(config: DateOption, hint: String => Unit): Hint = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hint = js.Any.fromFunction1(hint))
    __obj.asInstanceOf[Hint]
  }
  
  extension [Self <: Hint](x: Self) {
    
    inline def setConfig(value: DateOption): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setHint(value: String => Unit): Self = StObject.set(x, "hint", js.Any.fromFunction1(value))
  }
}
