package typings.lernaGetPackages

import typings.lernaGetPackages.anon.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(path: String): js.Array[LernaPackage] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[LernaPackage]]
  
  @JSImport("lerna-get-packages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LernaPackage extends StObject {
    
    @JSName("package")
    var _package: Config
    
    var location: String
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
