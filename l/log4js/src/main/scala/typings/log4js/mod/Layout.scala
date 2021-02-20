package typings.log4js.mod

import typings.log4js.log4jsStrings.basic
import typings.log4js.log4jsStrings.colored
import typings.log4js.log4jsStrings.coloured
import typings.log4js.log4jsStrings.dummy
import typings.log4js.log4jsStrings.messagePassThrough
import typings.log4js.log4jsStrings.pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def BaseLayout(`type`: basic): typings.log4js.mod.BaseLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.BaseLayout]
  }
  
  @scala.inline
  def ColoredLayout(`type`: colored | coloured): typings.log4js.mod.ColoredLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.ColoredLayout]
  }
  
  @scala.inline
  def CustomLayout(`type`: String): typings.log4js.mod.CustomLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.CustomLayout]
  }
  
  @scala.inline
  def DummyLayout(`type`: dummy): typings.log4js.mod.DummyLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.DummyLayout]
  }
  
  @scala.inline
  def MessagePassThroughLayout(`type`: messagePassThrough): typings.log4js.mod.MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.MessagePassThroughLayout]
  }
  
  @scala.inline
  def PatternLayout(pattern: String, `type`: pattern): typings.log4js.mod.PatternLayout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.log4js.mod.PatternLayout]
  }
}
