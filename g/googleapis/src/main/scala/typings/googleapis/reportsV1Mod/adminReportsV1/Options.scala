package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.googleapisStrings.reports_v1
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: reports_v1
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "reports_v1")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: reports_v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
