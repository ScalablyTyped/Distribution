package typings.importMetaResolve

import typings.std.Set
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("import-meta-resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def moduleResolve(specifier: String, base: URL): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[URL]
  inline def moduleResolve(specifier: String, base: URL, conditions: Unit, preserveSymlinks: Boolean): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any])).asInstanceOf[URL]
  inline def moduleResolve(specifier: String, base: URL, conditions: Set[String]): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any])).asInstanceOf[URL]
  inline def moduleResolve(specifier: String, base: URL, conditions: Set[String], preserveSymlinks: Boolean): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any])).asInstanceOf[URL]
  
  inline def resolve(specifier: String, parent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(specifier.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type ErrnoException = typings.importMetaResolve.libErrorsMod.ErrnoException
}
