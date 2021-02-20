package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLayout
  extends /* key */ StringDictionary[js.Any]
     with Layout {
  
  var `type`: String = js.native
}
object CustomLayout {
  
  @scala.inline
  def apply(`type`: String): CustomLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLayout]
  }
  
  @scala.inline
  implicit class CustomLayoutMutableBuilder[Self <: CustomLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
