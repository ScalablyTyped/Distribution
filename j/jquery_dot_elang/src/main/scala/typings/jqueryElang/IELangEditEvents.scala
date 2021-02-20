package typings.jqueryElang

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IELangEditEvents extends StObject {
  
  var insert: JQueryDeferred[_] = js.native
  
  var modify: JQueryDeferred[_] = js.native
  
  var remove: JQueryDeferred[_] = js.native
  
  var select: JQueryDeferred[_] = js.native
}
object IELangEditEvents {
  
  @scala.inline
  def apply(
    insert: JQueryDeferred[_],
    modify: JQueryDeferred[_],
    remove: JQueryDeferred[_],
    select: JQueryDeferred[_]
  ): IELangEditEvents = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], modify = modify.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangEditEvents]
  }
  
  @scala.inline
  implicit class IELangEditEventsMutableBuilder[Self <: IELangEditEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsert(value: JQueryDeferred[_]): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModify(value: JQueryDeferred[_]): Self = StObject.set(x, "modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: JQueryDeferred[_]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: JQueryDeferred[_]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
