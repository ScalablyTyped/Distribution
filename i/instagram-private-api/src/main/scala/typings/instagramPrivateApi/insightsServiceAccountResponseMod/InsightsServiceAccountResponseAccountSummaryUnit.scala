package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseAccountSummaryUnit extends StObject {
  
  var posts_count: Double
}
object InsightsServiceAccountResponseAccountSummaryUnit {
  
  @scala.inline
  def apply(posts_count: Double): InsightsServiceAccountResponseAccountSummaryUnit = {
    val __obj = js.Dynamic.literal(posts_count = posts_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountSummaryUnit]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountSummaryUnitMutableBuilder[Self <: InsightsServiceAccountResponseAccountSummaryUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosts_count(value: Double): Self = StObject.set(x, "posts_count", value.asInstanceOf[js.Any])
  }
}
