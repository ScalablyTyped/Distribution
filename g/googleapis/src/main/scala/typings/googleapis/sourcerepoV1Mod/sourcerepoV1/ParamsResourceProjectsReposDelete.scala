package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsReposDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the repo to delete. Values are of the form `projects//repos/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsReposDelete {
  
  inline def apply(): ParamsResourceProjectsReposDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsReposDelete]
  }
  
  extension [Self <: ParamsResourceProjectsReposDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
