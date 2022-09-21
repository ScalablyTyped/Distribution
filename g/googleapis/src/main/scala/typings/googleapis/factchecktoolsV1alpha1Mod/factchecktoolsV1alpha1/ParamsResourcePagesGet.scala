package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePagesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the resource to get, in the form of `pages/{page_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePagesGet {
  
  inline def apply(): ParamsResourcePagesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesGet]
  }
  
  extension [Self <: ParamsResourcePagesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
