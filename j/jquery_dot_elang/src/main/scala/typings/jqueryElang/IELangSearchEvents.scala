package typings.jqueryElang

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IELangSearchEvents extends StObject {
  
  var select: JQueryDeferred[Any]
}
object IELangSearchEvents {
  
  inline def apply(select: JQueryDeferred[Any]): IELangSearchEvents = {
    val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangSearchEvents]
  }
  
  extension [Self <: IELangSearchEvents](x: Self) {
    
    inline def setSelect(value: JQueryDeferred[Any]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
