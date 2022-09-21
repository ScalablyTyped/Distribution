package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsPhrasesetsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the phrase set to delete. Format: `projects/{project\}/locations/{location\}/phraseSets/{phrase_set\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsPhrasesetsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsPhrasesetsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsPhrasesetsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsPhrasesetsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
