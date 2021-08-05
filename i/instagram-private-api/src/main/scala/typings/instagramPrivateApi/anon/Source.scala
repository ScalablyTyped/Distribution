package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var source: js.UndefOr[IgAppModule] = js.undefined
  
  var userIds: js.Array[Double | String]
}
object Source {
  
  inline def apply(userIds: js.Array[Double | String]): Source = {
    val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setSource(value: IgAppModule): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUserIds(value: js.Array[Double | String]): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsVarargs(value: (Double | String)*): Self = StObject.set(x, "userIds", js.Array(value :_*))
  }
}
