package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersVersionsSetLatest
  extends StObject
     with StandardParameters {
  
  /**
    * GTM ContainerVersion's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/versions/{version_id\}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersVersionsSetLatest {
  
  inline def apply(): ParamsResourceAccountsContainersVersionsSetLatest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersVersionsSetLatest]
  }
  
  extension [Self <: ParamsResourceAccountsContainersVersionsSetLatest](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
