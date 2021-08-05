package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleapis.googleapisStrings.v2beta1
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v2beta1
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v2beta1")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v2beta1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
