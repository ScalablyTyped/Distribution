package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseAdsManager extends StObject {
  
  var pending_count: Double
}
object NewsRepositoryInboxResponseAdsManager {
  
  @scala.inline
  def apply(pending_count: Double): NewsRepositoryInboxResponseAdsManager = {
    val __obj = js.Dynamic.literal(pending_count = pending_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseAdsManager]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseAdsManagerMutableBuilder[Self <: NewsRepositoryInboxResponseAdsManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPending_count(value: Double): Self = StObject.set(x, "pending_count", value.asInstanceOf[js.Any])
  }
}
