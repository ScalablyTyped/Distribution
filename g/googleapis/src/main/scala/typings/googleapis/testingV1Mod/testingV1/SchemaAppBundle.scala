package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Android App Bundle file format, containing a BundleConfig.pb file, a
  * base module directory, zero or more dynamic feature module directories.
  * &lt;p&gt;See https://developer.android.com/guide/app-bundle/build for
  * guidance on building App Bundles.
  */
@js.native
trait SchemaAppBundle extends StObject {
  
  /**
    * .aab file representing the app bundle under test.
    */
  var bundleLocation: js.UndefOr[SchemaFileReference] = js.native
}
object SchemaAppBundle {
  
  @scala.inline
  def apply(): SchemaAppBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppBundle]
  }
  
  @scala.inline
  implicit class SchemaAppBundleMutableBuilder[Self <: SchemaAppBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleLocation(value: SchemaFileReference): Self = StObject.set(x, "bundleLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleLocationUndefined: Self = StObject.set(x, "bundleLocation", js.undefined)
  }
}
