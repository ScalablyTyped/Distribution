package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationsCordovaProjectMod {
  
  @JSImport("ionic/lib/integrations/cordova/project", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPackagePath(appName: String, platform: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackagePath")(appName.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getPackagePath(appName: String, platform: String, param2: GetPackagePathOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackagePath")(appName.asInstanceOf[js.Any], platform.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getPlatforms(projectDir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatforms")(projectDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  trait GetPackagePathOptions extends StObject {
    
    var emulator: js.UndefOr[Boolean] = js.undefined
    
    var release: js.UndefOr[Boolean] = js.undefined
  }
  object GetPackagePathOptions {
    
    inline def apply(): GetPackagePathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPackagePathOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPackagePathOptions] (val x: Self) extends AnyVal {
      
      inline def setEmulator(value: Boolean): Self = StObject.set(x, "emulator", value.asInstanceOf[js.Any])
      
      inline def setEmulatorUndefined: Self = StObject.set(x, "emulator", js.undefined)
      
      inline def setRelease(value: Boolean): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    }
  }
}
