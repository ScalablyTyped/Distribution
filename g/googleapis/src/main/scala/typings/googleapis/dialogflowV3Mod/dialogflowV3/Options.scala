package typings.googleapis.dialogflowV3Mod.dialogflowV3

import typings.googleapis.googleapisStrings.v3
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v3
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v3")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v3): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
