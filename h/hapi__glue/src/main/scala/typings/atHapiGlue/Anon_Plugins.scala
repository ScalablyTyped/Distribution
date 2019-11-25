package typings.atHapiGlue

import typings.atHapiGlue.atHapiGlueMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plugins extends js.Object {
  var plugins: js.Array[Plugin | String]
}

object Anon_Plugins {
  @scala.inline
  def apply(plugins: js.Array[Plugin | String]): Anon_Plugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Plugins]
  }
}

