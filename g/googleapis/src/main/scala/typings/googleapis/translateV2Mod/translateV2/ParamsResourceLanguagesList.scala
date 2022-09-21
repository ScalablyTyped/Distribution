package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLanguagesList
  extends StObject
     with StandardParameters {
  
  /**
    * The model type for which supported languages should be returned.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * The language to use to return localized, human readable names of supported
    * languages.
    */
  var target: js.UndefOr[String] = js.undefined
}
object ParamsResourceLanguagesList {
  
  inline def apply(): ParamsResourceLanguagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLanguagesList]
  }
  
  extension [Self <: ParamsResourceLanguagesList](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
