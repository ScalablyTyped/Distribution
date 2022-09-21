package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeEventContext extends StObject {
  
  var after_limit: js.UndefOr[Double] = js.undefined
  
  var before_limit: js.UndefOr[Double] = js.undefined
  
  var include_profile: js.UndefOr[Boolean] = js.undefined
}
object IncludeEventContext {
  
  inline def apply(): IncludeEventContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeEventContext]
  }
  
  extension [Self <: IncludeEventContext](x: Self) {
    
    inline def setAfter_limit(value: Double): Self = StObject.set(x, "after_limit", value.asInstanceOf[js.Any])
    
    inline def setAfter_limitUndefined: Self = StObject.set(x, "after_limit", js.undefined)
    
    inline def setBefore_limit(value: Double): Self = StObject.set(x, "before_limit", value.asInstanceOf[js.Any])
    
    inline def setBefore_limitUndefined: Self = StObject.set(x, "before_limit", js.undefined)
    
    inline def setInclude_profile(value: Boolean): Self = StObject.set(x, "include_profile", value.asInstanceOf[js.Any])
    
    inline def setInclude_profileUndefined: Self = StObject.set(x, "include_profile", js.undefined)
  }
}
