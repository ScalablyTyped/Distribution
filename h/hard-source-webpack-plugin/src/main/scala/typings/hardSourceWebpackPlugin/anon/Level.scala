package typings.hardSourceWebpackPlugin.anon

import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.debug
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.error
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.info
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.log
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.none
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.test
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends js.Object {
  
  var level: debug | log | info | warn | error = js.native
  
  var mode: none | test = js.native
}
object Level {
  
  @scala.inline
  def apply(level: debug | log | info | warn | error, mode: none | test): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLevel(value: debug | log | info | warn | error): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: none | test): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
