package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublishXunitXmlFilesRequest extends StObject {
  
  /**
    * URI of the Xunit XML files to publish. The maximum size of the file this reference is pointing to is 50MB. Required.
    */
  var xunitXmlFiles: js.UndefOr[js.Array[SchemaFileReference]] = js.undefined
}
object SchemaPublishXunitXmlFilesRequest {
  
  inline def apply(): SchemaPublishXunitXmlFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublishXunitXmlFilesRequest]
  }
  
  extension [Self <: SchemaPublishXunitXmlFilesRequest](x: Self) {
    
    inline def setXunitXmlFiles(value: js.Array[SchemaFileReference]): Self = StObject.set(x, "xunitXmlFiles", value.asInstanceOf[js.Any])
    
    inline def setXunitXmlFilesUndefined: Self = StObject.set(x, "xunitXmlFiles", js.undefined)
    
    inline def setXunitXmlFilesVarargs(value: SchemaFileReference*): Self = StObject.set(x, "xunitXmlFiles", js.Array(value*))
  }
}
