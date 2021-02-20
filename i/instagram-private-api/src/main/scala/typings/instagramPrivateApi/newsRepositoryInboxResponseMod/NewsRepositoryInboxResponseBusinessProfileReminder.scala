package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseBusinessProfileReminder extends StObject {
  
  var subtitle: String = js.native
  
  var title: String = js.native
}
object NewsRepositoryInboxResponseBusinessProfileReminder {
  
  @scala.inline
  def apply(subtitle: String, title: String): NewsRepositoryInboxResponseBusinessProfileReminder = {
    val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseBusinessProfileReminder]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseBusinessProfileReminderMutableBuilder[Self <: NewsRepositoryInboxResponseBusinessProfileReminder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
