package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerFormatOptions extends StObject {
  
  var format: js.UndefOr[LoggerFormat] = js.undefined
}
object LoggerFormatOptions {
  
  inline def apply(): LoggerFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggerFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: /* message */ js.UndefOr[String] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
