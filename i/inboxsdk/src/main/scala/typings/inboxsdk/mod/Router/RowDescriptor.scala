package typings.inboxsdk.mod.Router

import typings.inboxsdk.mod.Lists.LabelDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowDescriptor extends StObject {
  
  var body: String
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var iconHtml: js.UndefOr[String] = js.undefined
  
  var iconUrl: js.UndefOr[String] = js.undefined
  
  var isRead: String
  
  var labels: js.Array[LabelDescriptor]
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var routeID: js.UndefOr[String] = js.undefined
  
  var routeParams: js.UndefOr[js.Array[String]] = js.undefined
  
  var shortDetailText: String
  
  var title: String
}
object RowDescriptor {
  
  inline def apply(
    body: String,
    isRead: String,
    labels: js.Array[LabelDescriptor],
    shortDetailText: String,
    title: String
  ): RowDescriptor = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isRead = isRead.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], shortDetailText = shortDetailText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowDescriptor] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setIconHtml(value: String): Self = StObject.set(x, "iconHtml", value.asInstanceOf[js.Any])
    
    inline def setIconHtmlUndefined: Self = StObject.set(x, "iconHtml", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setIsRead(value: String): Self = StObject.set(x, "isRead", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[LabelDescriptor]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: LabelDescriptor*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setRouteID(value: String): Self = StObject.set(x, "routeID", value.asInstanceOf[js.Any])
    
    inline def setRouteIDUndefined: Self = StObject.set(x, "routeID", js.undefined)
    
    inline def setRouteParams(value: js.Array[String]): Self = StObject.set(x, "routeParams", value.asInstanceOf[js.Any])
    
    inline def setRouteParamsUndefined: Self = StObject.set(x, "routeParams", js.undefined)
    
    inline def setRouteParamsVarargs(value: String*): Self = StObject.set(x, "routeParams", js.Array(value*))
    
    inline def setShortDetailText(value: String): Self = StObject.set(x, "shortDetailText", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
