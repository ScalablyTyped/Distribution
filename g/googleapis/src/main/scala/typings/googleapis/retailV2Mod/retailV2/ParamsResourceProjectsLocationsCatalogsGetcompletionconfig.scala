package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsGetcompletionconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full CompletionConfig resource name. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/completionConfig
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsGetcompletionconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsGetcompletionconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsGetcompletionconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsGetcompletionconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
