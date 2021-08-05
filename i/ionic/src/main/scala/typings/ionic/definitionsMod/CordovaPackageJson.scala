package typings.ionic.definitionsMod

import typings.ionic.anon.Platforms
import typings.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPackageJson
  extends StObject
     with PackageJson {
  
  var cordova: Platforms
}
object CordovaPackageJson {
  
  inline def apply(cordova: Platforms, name: String, version: String): CordovaPackageJson = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPackageJson]
  }
  
  extension [Self <: CordovaPackageJson](x: Self) {
    
    inline def setCordova(value: Platforms): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
  }
}
