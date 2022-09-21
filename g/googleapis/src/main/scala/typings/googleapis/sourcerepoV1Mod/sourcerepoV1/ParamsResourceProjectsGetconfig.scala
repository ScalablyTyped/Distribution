package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetconfig
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the requested project. Values are of the form `projects/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetconfig {
  
  inline def apply(): ParamsResourceProjectsGetconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetconfig]
  }
  
  extension [Self <: ParamsResourceProjectsGetconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
