package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of Android device configuration permutations is defined by the the
  * cross-product of the given axes. Internally, the given AndroidMatrix will
  * be expanded into a set of AndroidDevices.  Only supported permutations will
  * be instantiated.  Invalid permutations (e.g., incompatible models/versions)
  * are ignored.
  */
@js.native
trait SchemaAndroidMatrix extends StObject {
  
  /**
    * Required. The ids of the set of Android device to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidModelIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The ids of the set of Android OS version to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidVersionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The set of locales the test device will enable for testing. Use
    * the TestEnvironmentDiscoveryService to get supported options.
    */
  var locales: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The set of orientations to test with. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var orientations: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAndroidMatrix {
  
  @scala.inline
  def apply(): SchemaAndroidMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidMatrix]
  }
  
  @scala.inline
  implicit class SchemaAndroidMatrixMutableBuilder[Self <: SchemaAndroidMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidModelIds(value: js.Array[String]): Self = StObject.set(x, "androidModelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidModelIdsUndefined: Self = StObject.set(x, "androidModelIds", js.undefined)
    
    @scala.inline
    def setAndroidModelIdsVarargs(value: String*): Self = StObject.set(x, "androidModelIds", js.Array(value :_*))
    
    @scala.inline
    def setAndroidVersionIds(value: js.Array[String]): Self = StObject.set(x, "androidVersionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidVersionIdsUndefined: Self = StObject.set(x, "androidVersionIds", js.undefined)
    
    @scala.inline
    def setAndroidVersionIdsVarargs(value: String*): Self = StObject.set(x, "androidVersionIds", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    @scala.inline
    def setOrientations(value: js.Array[String]): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    @scala.inline
    def setOrientationsVarargs(value: String*): Self = StObject.set(x, "orientations", js.Array(value :_*))
  }
}
