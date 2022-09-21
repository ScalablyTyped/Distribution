package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaToolOutputReference extends StObject {
  
  /**
    * The creation time of the file. - In response: present if set by create/update request - In create/update request: optional
    */
  var creationTime: js.UndefOr[SchemaTimestamp] = js.undefined
  
  /**
    * A FileReference to an output file. - In response: always set - In create/update request: always set
    */
  var output: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * The test case to which this output file belongs. - In response: present if set by create/update request - In create/update request: optional
    */
  var testCase: js.UndefOr[SchemaTestCaseReference] = js.undefined
}
object SchemaToolOutputReference {
  
  inline def apply(): SchemaToolOutputReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolOutputReference]
  }
  
  extension [Self <: SchemaToolOutputReference](x: Self) {
    
    inline def setCreationTime(value: SchemaTimestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setOutput(value: SchemaFileReference): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setTestCase(value: SchemaTestCaseReference): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
  }
}
