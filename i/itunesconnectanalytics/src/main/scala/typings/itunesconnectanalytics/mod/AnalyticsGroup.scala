package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsGroup extends StObject {
  
  var key: String
  
  var title: String
}
object AnalyticsGroup {
  
  @scala.inline
  def apply(key: String, title: String): AnalyticsGroup = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsGroup]
  }
  
  @scala.inline
  implicit class AnalyticsGroupMutableBuilder[Self <: AnalyticsGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
