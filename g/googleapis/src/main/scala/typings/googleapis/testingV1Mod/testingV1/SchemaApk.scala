package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Android package file to install.
  */
trait SchemaApk extends StObject {
  
  /**
    * The path to an APK to be installed on the device before the test begins.
    */
  var location: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * The java package for the APK to be installed. Value is determined by
    * examining the application&#39;s manifest.
    */
  var packageName: js.UndefOr[String] = js.undefined
}
object SchemaApk {
  
  inline def apply(): SchemaApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApk]
  }
  
  extension [Self <: SchemaApk](x: Self) {
    
    inline def setLocation(value: SchemaFileReference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
