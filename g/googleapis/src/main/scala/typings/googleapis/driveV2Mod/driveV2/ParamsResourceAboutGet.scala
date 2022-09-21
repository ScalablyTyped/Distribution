package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAboutGet
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to count changes outside the My Drive hierarchy. When set to false, changes to files such as those in the Application Data folder or shared files which have not been added to My Drive will be omitted from the maxChangeIdCount.
    */
  var includeSubscribed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of remaining change IDs to count
    */
  var maxChangeIdCount: js.UndefOr[String] = js.undefined
  
  /**
    * Change ID to start counting from when calculating number of remaining change IDs
    */
  var startChangeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAboutGet {
  
  inline def apply(): ParamsResourceAboutGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAboutGet]
  }
  
  extension [Self <: ParamsResourceAboutGet](x: Self) {
    
    inline def setIncludeSubscribed(value: Boolean): Self = StObject.set(x, "includeSubscribed", value.asInstanceOf[js.Any])
    
    inline def setIncludeSubscribedUndefined: Self = StObject.set(x, "includeSubscribed", js.undefined)
    
    inline def setMaxChangeIdCount(value: String): Self = StObject.set(x, "maxChangeIdCount", value.asInstanceOf[js.Any])
    
    inline def setMaxChangeIdCountUndefined: Self = StObject.set(x, "maxChangeIdCount", js.undefined)
    
    inline def setStartChangeId(value: String): Self = StObject.set(x, "startChangeId", value.asInstanceOf[js.Any])
    
    inline def setStartChangeIdUndefined: Self = StObject.set(x, "startChangeId", js.undefined)
  }
}
