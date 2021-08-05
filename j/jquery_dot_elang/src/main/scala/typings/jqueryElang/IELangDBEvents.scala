package typings.jqueryElang

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IELangDBEvents extends StObject {
  
  var insert: JQueryDeferred[js.Any]
  
  var modify: JQueryDeferred[js.Any]
  
  var remove: JQueryDeferred[js.Any]
  
  var select: JQueryDeferred[js.Any]
}
object IELangDBEvents {
  
  inline def apply(
    insert: JQueryDeferred[js.Any],
    modify: JQueryDeferred[js.Any],
    remove: JQueryDeferred[js.Any],
    select: JQueryDeferred[js.Any]
  ): IELangDBEvents = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], modify = modify.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBEvents]
  }
  
  extension [Self <: IELangDBEvents](x: Self) {
    
    inline def setInsert(value: JQueryDeferred[js.Any]): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setModify(value: JQueryDeferred[js.Any]): Self = StObject.set(x, "modify", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: JQueryDeferred[js.Any]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: JQueryDeferred[js.Any]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
