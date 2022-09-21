package typings.googleapis.iamV2betaMod.iamV2beta

import typings.googleapis.googleapisStrings.v2beta
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v2beta
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v2beta")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v2beta): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
