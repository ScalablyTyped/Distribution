package typings.less.global

import typings.less.LessStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Less")
@js.native
object Less_ extends js.Object {
  
  @js.native
  class PluginManager protected ()
    extends typings.less.Less.PluginManager {
    def this(less: LessStatic) = this()
  }
}
