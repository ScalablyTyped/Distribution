package typings.importMetaResolve

import typings.node.urlMod.URL_
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("import-meta-resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def moduleResolve(specifier: String, base: URL_): URL_ = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[URL_]
  inline def moduleResolve(specifier: String, base: URL_, conditions: Unit, preserveSymlinks: Boolean): URL_ = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any])).asInstanceOf[URL_]
  inline def moduleResolve(specifier: String, base: URL_, conditions: Set[String]): URL_ = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any])).asInstanceOf[URL_]
  inline def moduleResolve(specifier: String, base: URL_, conditions: Set[String], preserveSymlinks: Boolean): URL_ = (^.asInstanceOf[js.Dynamic].applyDynamic("moduleResolve")(specifier.asInstanceOf[js.Any], base.asInstanceOf[js.Any], conditions.asInstanceOf[js.Any], preserveSymlinks.asInstanceOf[js.Any])).asInstanceOf[URL_]
  
  inline def resolve(specifier: String, parent: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(specifier.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  type ErrnoException = typings.importMetaResolve.libErrorsMod.ErrnoException
}
