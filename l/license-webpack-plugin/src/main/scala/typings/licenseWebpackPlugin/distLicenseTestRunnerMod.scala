package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLicenseTestRunnerMod {
  
  trait LicenseTestRunner extends StObject {
    
    def test(licenseId: String): Boolean
  }
  object LicenseTestRunner {
    
    inline def apply(test: String => Boolean): LicenseTestRunner = {
      val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[LicenseTestRunner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LicenseTestRunner] (val x: Self) extends AnyVal {
      
      inline def setTest(value: String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
}
