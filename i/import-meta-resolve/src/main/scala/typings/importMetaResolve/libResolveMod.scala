package typings.importMetaResolve

import typings.importMetaResolve.anon.Conditions
import typings.importMetaResolve.anon.Format
import typings.std.Set
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolveMod {
  
  @JSImport("import-meta-resolve/lib/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultResolve(specifier: String): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultResolve")(specifier.asInstanceOf[js.Any]).asInstanceOf[Format]
  inline def defaultResolve(specifier: String, context: Conditions): Format = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultResolve")(specifier.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Format]
  
  inline def moduleResolve(specifier: String, base: URL): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[URL]
  inline def moduleResolve(specifier: String, base: URL, conditions: Unit, preserveSymlinks: Boolean): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any])).asInstanceOf[URL]
  inline def moduleResolve(specifier: String, base: URL, conditions: Set[String]): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any])).asInstanceOf[URL]
  inline def moduleResolve(specifier: String, base: URL, conditions: Set[String], preserveSymlinks: Boolean): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any])).asInstanceOf[URL]
  
  type ErrnoException = typings.importMetaResolve.libErrorsMod.ErrnoException
  
  type PackageConfig = typings.importMetaResolve.libPackageConfigMod.PackageConfig
}
