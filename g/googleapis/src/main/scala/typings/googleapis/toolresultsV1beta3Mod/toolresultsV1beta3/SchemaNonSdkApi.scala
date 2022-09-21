package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNonSdkApi extends StObject {
  
  /**
    * The signature of the Non-SDK API
    */
  var apiSignature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Example stack traces of this API being called.
    */
  var exampleStackTraces: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional debugging insights for non-SDK API violations.
    */
  var insights: js.UndefOr[js.Array[SchemaNonSdkApiInsight]] = js.undefined
  
  /**
    * The total number of times this API was observed to have been called.
    */
  var invocationCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Which list this API appears on
    */
  var list: js.UndefOr[String | Null] = js.undefined
}
object SchemaNonSdkApi {
  
  inline def apply(): SchemaNonSdkApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonSdkApi]
  }
  
  extension [Self <: SchemaNonSdkApi](x: Self) {
    
    inline def setApiSignature(value: String): Self = StObject.set(x, "apiSignature", value.asInstanceOf[js.Any])
    
    inline def setApiSignatureNull: Self = StObject.set(x, "apiSignature", null)
    
    inline def setApiSignatureUndefined: Self = StObject.set(x, "apiSignature", js.undefined)
    
    inline def setExampleStackTraces(value: js.Array[String]): Self = StObject.set(x, "exampleStackTraces", value.asInstanceOf[js.Any])
    
    inline def setExampleStackTracesNull: Self = StObject.set(x, "exampleStackTraces", null)
    
    inline def setExampleStackTracesUndefined: Self = StObject.set(x, "exampleStackTraces", js.undefined)
    
    inline def setExampleStackTracesVarargs(value: String*): Self = StObject.set(x, "exampleStackTraces", js.Array(value*))
    
    inline def setInsights(value: js.Array[SchemaNonSdkApiInsight]): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    inline def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
    
    inline def setInsightsVarargs(value: SchemaNonSdkApiInsight*): Self = StObject.set(x, "insights", js.Array(value*))
    
    inline def setInvocationCount(value: Double): Self = StObject.set(x, "invocationCount", value.asInstanceOf[js.Any])
    
    inline def setInvocationCountNull: Self = StObject.set(x, "invocationCount", null)
    
    inline def setInvocationCountUndefined: Self = StObject.set(x, "invocationCount", js.undefined)
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListNull: Self = StObject.set(x, "list", null)
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
  }
}
