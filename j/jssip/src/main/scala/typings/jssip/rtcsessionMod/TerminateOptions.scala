package typings.jssip.rtcsessionMod

import typings.jssip.constantsMod.causes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateOptions
  extends StObject
     with RejectOptions {
  
  var body: js.UndefOr[String] = js.undefined
  
  var cause: js.UndefOr[causes | String] = js.undefined
}
object TerminateOptions {
  
  inline def apply(): TerminateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateOptions]
  }
  
  extension [Self <: TerminateOptions](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCause(value: causes | String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
  }
}
