package typings.log4js.mod

import typings.log4js.log4jsStrings.colored
import typings.log4js.log4jsStrings.coloured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColoredLayout
  extends StObject
     with Layout {
  
  var `type`: colored | coloured
}
object ColoredLayout {
  
  inline def apply(`type`: colored | coloured): ColoredLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColoredLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColoredLayout] (val x: Self) extends AnyVal {
    
    inline def setType(value: colored | coloured): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
