package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsQuestionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the question to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsQuestionsDelete {
  
  inline def apply(): ParamsResourceLocationsQuestionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsQuestionsDelete]
  }
  
  extension [Self <: ParamsResourceLocationsQuestionsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
