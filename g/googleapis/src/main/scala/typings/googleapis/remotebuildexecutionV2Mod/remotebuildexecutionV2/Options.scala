package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v2
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v2")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
