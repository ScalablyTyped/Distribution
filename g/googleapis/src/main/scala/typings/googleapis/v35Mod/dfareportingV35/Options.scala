package typings.googleapis.v35Mod.dfareportingV35

import typings.googleapis.googleapisStrings.v3Dot5
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v3Dot5
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v3.5")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v3Dot5): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
