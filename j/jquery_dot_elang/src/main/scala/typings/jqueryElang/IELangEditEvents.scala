package typings.jqueryElang

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IELangEditEvents extends StObject {
  
  var insert: JQueryDeferred[Any]
  
  var modify: JQueryDeferred[Any]
  
  var remove: JQueryDeferred[Any]
  
  var select: JQueryDeferred[Any]
}
object IELangEditEvents {
  
  inline def apply(
    insert: JQueryDeferred[Any],
    modify: JQueryDeferred[Any],
    remove: JQueryDeferred[Any],
    select: JQueryDeferred[Any]
  ): IELangEditEvents = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], modify = modify.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangEditEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IELangEditEvents] (val x: Self) extends AnyVal {
    
    inline def setInsert(value: JQueryDeferred[Any]): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setModify(value: JQueryDeferred[Any]): Self = StObject.set(x, "modify", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: JQueryDeferred[Any]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: JQueryDeferred[Any]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
