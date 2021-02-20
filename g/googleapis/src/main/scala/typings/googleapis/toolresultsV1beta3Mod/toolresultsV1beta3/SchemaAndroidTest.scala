package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Android mobile test specification.
  */
@js.native
trait SchemaAndroidTest extends StObject {
  
  /**
    * Information about the application under test.
    */
  var androidAppInfo: js.UndefOr[SchemaAndroidAppInfo] = js.native
  
  /**
    * An Android instrumentation test.
    */
  var androidInstrumentationTest: js.UndefOr[SchemaAndroidInstrumentationTest] = js.native
  
  /**
    * An Android robo test.
    */
  var androidRoboTest: js.UndefOr[SchemaAndroidRoboTest] = js.native
  
  /**
    * Max time a test is allowed to run before it is automatically cancelled.
    */
  var testTimeout: js.UndefOr[SchemaDuration] = js.native
}
object SchemaAndroidTest {
  
  @scala.inline
  def apply(): SchemaAndroidTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidTest]
  }
  
  @scala.inline
  implicit class SchemaAndroidTestMutableBuilder[Self <: SchemaAndroidTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidAppInfo(value: SchemaAndroidAppInfo): Self = StObject.set(x, "androidAppInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidAppInfoUndefined: Self = StObject.set(x, "androidAppInfo", js.undefined)
    
    @scala.inline
    def setAndroidInstrumentationTest(value: SchemaAndroidInstrumentationTest): Self = StObject.set(x, "androidInstrumentationTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidInstrumentationTestUndefined: Self = StObject.set(x, "androidInstrumentationTest", js.undefined)
    
    @scala.inline
    def setAndroidRoboTest(value: SchemaAndroidRoboTest): Self = StObject.set(x, "androidRoboTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidRoboTestUndefined: Self = StObject.set(x, "androidRoboTest", js.undefined)
    
    @scala.inline
    def setTestTimeout(value: SchemaDuration): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
  }
}
