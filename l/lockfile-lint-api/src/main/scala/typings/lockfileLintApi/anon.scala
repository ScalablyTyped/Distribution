package typings.lockfileLintApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Packages extends StObject {
    
    var packages: typings.lockfileLintApi.mod.Packages
  }
  object Packages {
    
    inline def apply(packages: typings.lockfileLintApi.mod.Packages): Packages = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Packages] (val x: Self) extends AnyVal {
      
      inline def setPackages(value: typings.lockfileLintApi.mod.Packages): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    }
  }
}
