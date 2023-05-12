package typings.importMetaResolve

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolveGetPackageTypeMod {
  
  @JSImport("import-meta-resolve/lib/resolve-get-package-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPackageType(url: URL): PackageType = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageType")(url.asInstanceOf[js.Any]).asInstanceOf[PackageType]
  
  type PackageType = typings.importMetaResolve.libPackageConfigMod.PackageType
}
