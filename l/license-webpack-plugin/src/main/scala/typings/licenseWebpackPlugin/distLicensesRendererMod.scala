package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLicensesRendererMod {
  
  trait LicensesRenderer extends StObject {
    
    def renderBanner(filename: String, modules: js.Array[LicenseIdentifiedModule]): String
    
    def renderLicenses(modules: js.Array[LicenseIdentifiedModule]): String
  }
  object LicensesRenderer {
    
    inline def apply(
      renderBanner: (String, js.Array[LicenseIdentifiedModule]) => String,
      renderLicenses: js.Array[LicenseIdentifiedModule] => String
    ): LicensesRenderer = {
      val __obj = js.Dynamic.literal(renderBanner = js.Any.fromFunction2(renderBanner), renderLicenses = js.Any.fromFunction1(renderLicenses))
      __obj.asInstanceOf[LicensesRenderer]
    }
    
    extension [Self <: LicensesRenderer](x: Self) {
      
      inline def setRenderBanner(value: (String, js.Array[LicenseIdentifiedModule]) => String): Self = StObject.set(x, "renderBanner", js.Any.fromFunction2(value))
      
      inline def setRenderLicenses(value: js.Array[LicenseIdentifiedModule] => String): Self = StObject.set(x, "renderLicenses", js.Any.fromFunction1(value))
    }
  }
}
