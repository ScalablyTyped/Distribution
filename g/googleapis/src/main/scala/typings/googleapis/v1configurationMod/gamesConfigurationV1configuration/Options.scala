package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.googleapis.googleapisStrings.v1configuration
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends GlobalOptions {
  
  var version: v1configuration = js.native
}
object Options {
  
  @scala.inline
  def apply(version: v1configuration): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: v1configuration): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
