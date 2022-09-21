package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTestCasesResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of test cases.
    */
  var testCases: js.UndefOr[js.Array[SchemaTestCase]] = js.undefined
}
object SchemaListTestCasesResponse {
  
  inline def apply(): SchemaListTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTestCasesResponse]
  }
  
  extension [Self <: SchemaListTestCasesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTestCases(value: js.Array[SchemaTestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    inline def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    inline def setTestCasesVarargs(value: SchemaTestCase*): Self = StObject.set(x, "testCases", js.Array(value*))
  }
}
