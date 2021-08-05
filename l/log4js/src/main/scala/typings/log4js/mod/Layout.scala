package typings.log4js.mod

import typings.log4js.log4jsStrings.colored
import typings.log4js.log4jsStrings.coloured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.log4js.mod.BaseLayout
  - typings.log4js.mod.ColoredLayout
  - typings.log4js.mod.MessagePassThroughLayout
  - typings.log4js.mod.DummyLayout
  - typings.log4js.mod.PatternLayout
  - typings.log4js.mod.CustomLayout
*/
trait Layout extends StObject
object Layout {
  
  inline def BaseLayout(): typings.log4js.mod.BaseLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("basic")
    __obj.asInstanceOf[typings.log4js.mod.BaseLayout]
  }
  
  inline def ColoredLayout(`type`: colored | coloured): typings.log4js.mod.ColoredLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.ColoredLayout]
  }
  
  inline def CustomLayout(`type`: String): typings.log4js.mod.CustomLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.CustomLayout]
  }
  
  inline def DummyLayout(): typings.log4js.mod.DummyLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dummy")
    __obj.asInstanceOf[typings.log4js.mod.DummyLayout]
  }
  
  inline def MessagePassThroughLayout(): typings.log4js.mod.MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("messagePassThrough")
    __obj.asInstanceOf[typings.log4js.mod.MessagePassThroughLayout]
  }
  
  inline def PatternLayout(pattern: String): typings.log4js.mod.PatternLayout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typings.log4js.mod.PatternLayout]
  }
}
