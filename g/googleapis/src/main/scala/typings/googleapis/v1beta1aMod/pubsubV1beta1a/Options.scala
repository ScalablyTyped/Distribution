package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import typings.googleapis.googleapisStrings.v1beta1a
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v1beta1a
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v1beta1a")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v1beta1a): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
