package typings
package atHapiGlueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plugins extends js.Object {
  var plugins: js.Array[java.lang.String] | js.Array[atHapiGlueLib.atHapiGlueMod.Plugin] | (js.Array[java.lang.String | atHapiGlueLib.atHapiGlueMod.Plugin])
}

object Anon_Plugins {
  @scala.inline
  def apply(
    plugins: js.Array[java.lang.String] | js.Array[atHapiGlueLib.atHapiGlueMod.Plugin] | (js.Array[java.lang.String | atHapiGlueLib.atHapiGlueMod.Plugin])
  ): Anon_Plugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Plugins]
  }
}

