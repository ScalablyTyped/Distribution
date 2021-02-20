package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAppender
  extends /* key */ StringDictionary[js.Any]
     with Appender {
  
  var `type`: String | AppenderModule = js.native
}
object CustomAppender {
  
  @scala.inline
  def apply(`type`: String | AppenderModule): CustomAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAppender]
  }
  
  @scala.inline
  implicit class CustomAppenderMutableBuilder[Self <: CustomAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String | AppenderModule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
