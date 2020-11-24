package typings.log4js.mod

import typings.log4js.log4jsStrings.basic
import typings.log4js.log4jsStrings.colored
import typings.log4js.log4jsStrings.coloured
import typings.log4js.log4jsStrings.dummy
import typings.log4js.log4jsStrings.messagePassThrough
import typings.log4js.log4jsStrings.pattern
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
trait Layout extends js.Object
object Layout {
  
  @scala.inline
  def MessagePassThroughLayout(`type`: messagePassThrough): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  def DummyLayout(`type`: dummy): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  def BaseLayout(`type`: basic): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  def ColoredLayout(`type`: colored | coloured): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  def CustomLayout(`type`: String): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  def PatternLayout(pattern: String, `type`: pattern): Layout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}
