package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsSavedadstylesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account for which to get the saved ad style.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Saved ad style to retrieve.
    */
  var savedAdStyleId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsSavedadstylesGet {
  
  inline def apply(): ParamsResourceAccountsSavedadstylesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsSavedadstylesGet]
  }
  
  extension [Self <: ParamsResourceAccountsSavedadstylesGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setSavedAdStyleId(value: String): Self = StObject.set(x, "savedAdStyleId", value.asInstanceOf[js.Any])
    
    inline def setSavedAdStyleIdUndefined: Self = StObject.set(x, "savedAdStyleId", js.undefined)
  }
}
