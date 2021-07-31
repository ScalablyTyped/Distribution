package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A test of an iOS application that uses the XCTest framework. Xcode supports
  * the option to &quot;build for testing&quot;, which generates an .xctestrun
  * file that contains a test specification (arguments, test methods, etc).
  * This test type accepts a zip file containing the .xctestrun file and the
  * corresponding contents of the Build/Products directory that contains all
  * the binaries needed to run the tests.
  */
trait SchemaIosXcTest extends StObject {
  
  /**
    * Output only. The bundle id for the application under test.
    */
  var appBundleId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The .zip containing the .xctestrun file and the contents of the
    * DerivedData/Build/Products directory. The .xctestrun file in this zip is
    * ignored if the xctestrun field is specified.
    */
  var testsZip: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * The Xcode version that should be used for the test. Use the
    * TestEnvironmentDiscoveryService to get supported options. Defaults to the
    * latest Xcode version Firebase Test Lab supports.
    */
  var xcodeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * An .xctestrun file that will override the .xctestrun file in the tests
    * zip. Because the .xctestrun file contains environment variables along
    * with test methods to run and/or ignore, this can be useful for sharding
    * tests. Default is taken from the tests zip.
    */
  var xctestrun: js.UndefOr[SchemaFileReference] = js.undefined
}
object SchemaIosXcTest {
  
  @scala.inline
  def apply(): SchemaIosXcTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosXcTest]
  }
  
  @scala.inline
  implicit class SchemaIosXcTestMutableBuilder[Self <: SchemaIosXcTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppBundleId(value: String): Self = StObject.set(x, "appBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppBundleIdUndefined: Self = StObject.set(x, "appBundleId", js.undefined)
    
    @scala.inline
    def setTestsZip(value: SchemaFileReference): Self = StObject.set(x, "testsZip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsZipUndefined: Self = StObject.set(x, "testsZip", js.undefined)
    
    @scala.inline
    def setXcodeVersion(value: String): Self = StObject.set(x, "xcodeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXcodeVersionUndefined: Self = StObject.set(x, "xcodeVersion", js.undefined)
    
    @scala.inline
    def setXctestrun(value: SchemaFileReference): Self = StObject.set(x, "xctestrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXctestrunUndefined: Self = StObject.set(x, "xctestrun", js.undefined)
  }
}
