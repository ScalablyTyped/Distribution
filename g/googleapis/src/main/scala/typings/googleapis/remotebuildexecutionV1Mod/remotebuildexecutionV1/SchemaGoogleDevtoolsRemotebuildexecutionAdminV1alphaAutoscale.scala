package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale extends StObject {
  
  /**
    * The maximal number of workers. Must be equal to or greater than min_size.
    */
  var maxSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimal number of workers. Must be greater than 0.
    */
  var minSize: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale](x: Self) {
    
    inline def setMaxSize(value: String): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeNull: Self = StObject.set(x, "maxSize", null)
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: String): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeNull: Self = StObject.set(x, "minSize", null)
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
