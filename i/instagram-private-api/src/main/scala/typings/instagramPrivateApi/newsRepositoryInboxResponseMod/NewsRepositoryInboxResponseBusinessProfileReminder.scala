package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseBusinessProfileReminder extends StObject {
  
  var subtitle: String
  
  var title: String
}
object NewsRepositoryInboxResponseBusinessProfileReminder {
  
  inline def apply(subtitle: String, title: String): NewsRepositoryInboxResponseBusinessProfileReminder = {
    val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseBusinessProfileReminder]
  }
  
  extension [Self <: NewsRepositoryInboxResponseBusinessProfileReminder](x: Self) {
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
