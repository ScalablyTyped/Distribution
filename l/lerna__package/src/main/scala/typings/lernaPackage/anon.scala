package typings.lernaPackage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Packages extends StObject {
    
    var packages: js.Array[String]
  }
  object Packages {
    
    inline def apply(packages: js.Array[String]): Packages = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packages]
    }
    
    extension [Self <: Packages](x: Self) {
      
      inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
    }
  }
}
