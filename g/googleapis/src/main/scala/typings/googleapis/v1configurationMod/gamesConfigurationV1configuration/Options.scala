package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.googleapis.googleapisStrings.v1configuration
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v1configuration
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v1configuration")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v1configuration): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
