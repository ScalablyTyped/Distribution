package typings.googleapis.sheetsV4Mod.sheetsV4

import typings.googleapis.googleapisStrings.v4
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v4
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v4")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v4): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
