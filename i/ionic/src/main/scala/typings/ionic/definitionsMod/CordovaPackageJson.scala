package typings.ionic.definitionsMod

import typings.ionic.anon.Platforms
import typings.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPackageJson extends PackageJson {
  
  var cordova: Platforms = js.native
}
object CordovaPackageJson {
  
  @scala.inline
  def apply(cordova: Platforms, name: String, version: String): CordovaPackageJson = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPackageJson]
  }
  
  @scala.inline
  implicit class CordovaPackageJsonMutableBuilder[Self <: CordovaPackageJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCordova(value: Platforms): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
  }
}
