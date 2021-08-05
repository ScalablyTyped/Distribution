package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleapis.googleapisStrings.alpha
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: alpha
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "alpha")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: alpha): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
