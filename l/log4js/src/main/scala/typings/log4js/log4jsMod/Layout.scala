package typings.log4js.log4jsMod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.log4jsStrings.basic
import typings.log4js.log4jsStrings.colored
import typings.log4js.log4jsStrings.coloured
import typings.log4js.log4jsStrings.dummy
import typings.log4js.log4jsStrings.messagePassThrough
import typings.log4js.log4jsStrings.pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.log4js.log4jsMod.BaseLayout
  - typings.log4js.log4jsMod.ColoredLayout
  - typings.log4js.log4jsMod.MessagePassThroughLayout
  - typings.log4js.log4jsMod.DummyLayout
  - typings.log4js.log4jsMod.PatternLayout
  - typings.log4js.log4jsMod.CustomLayout
*/
trait Layout extends js.Object

object Layout {
  @scala.inline
  def ColoredLayout(`type`: colored | coloured): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
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
  def PatternLayout(pattern: String, `type`: pattern, tokens: StringDictionary[Token] = null): Layout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  def CustomLayout(`type`: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Layout]
  }
}

