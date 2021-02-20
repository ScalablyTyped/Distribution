package typings.lernaGetPackages

import typings.lernaGetPackages.anon.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lerna-get-packages", JSImport.Namespace)
  @js.native
  def apply(path: String): js.Array[LernaPackage] = js.native
  
  @js.native
  trait LernaPackage extends StObject {
    
    @JSName("package")
    var _package: Config = js.native
    
    var location: String = js.native
  }
  object LernaPackage {
    
    @scala.inline
    def apply(_package: Config, location: String): LernaPackage = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[LernaPackage]
    }
    
    @scala.inline
    implicit class LernaPackageMutableBuilder[Self <: LernaPackage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: Config): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
}
