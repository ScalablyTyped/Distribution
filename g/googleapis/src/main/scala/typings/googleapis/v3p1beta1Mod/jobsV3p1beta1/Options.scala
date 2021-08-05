package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typings.googleapis.googleapisStrings.v3p1beta1
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v3p1beta1
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v3p1beta1")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v3p1beta1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
