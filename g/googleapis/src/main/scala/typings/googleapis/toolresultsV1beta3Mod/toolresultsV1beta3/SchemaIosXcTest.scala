package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosXcTest extends StObject {
  
  /**
    * Bundle ID of the app.
    */
  var bundleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Xcode version that the test was run with.
    */
  var xcodeVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaIosXcTest {
  
  inline def apply(): SchemaIosXcTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosXcTest]
  }
  
  extension [Self <: SchemaIosXcTest](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setXcodeVersion(value: String): Self = StObject.set(x, "xcodeVersion", value.asInstanceOf[js.Any])
    
    inline def setXcodeVersionNull: Self = StObject.set(x, "xcodeVersion", null)
    
    inline def setXcodeVersionUndefined: Self = StObject.set(x, "xcodeVersion", js.undefined)
  }
}
