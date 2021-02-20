package typings.ionic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectMod {
  
  @JSImport("ionic/lib/integrations/cordova/project", "getPackagePath")
  @js.native
  def getPackagePath(appName: String, platform: String): js.Promise[String] = js.native
  @JSImport("ionic/lib/integrations/cordova/project", "getPackagePath")
  @js.native
  def getPackagePath(appName: String, platform: String, hasEmulatorRelease: GetPackagePathOptions): js.Promise[String] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/project", "getPlatforms")
  @js.native
  def getPlatforms(projectDir: String): js.Promise[js.Array[String]] = js.native
  
  @js.native
  trait GetPackagePathOptions extends StObject {
    
    var emulator: js.UndefOr[Boolean] = js.native
    
    var release: js.UndefOr[Boolean] = js.native
  }
  object GetPackagePathOptions {
    
    @scala.inline
    def apply(): GetPackagePathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPackagePathOptions]
    }
    
    @scala.inline
    implicit class GetPackagePathOptionsMutableBuilder[Self <: GetPackagePathOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmulator(value: Boolean): Self = StObject.set(x, "emulator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmulatorUndefined: Self = StObject.set(x, "emulator", js.undefined)
      
      @scala.inline
      def setRelease(value: Boolean): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    }
  }
}
