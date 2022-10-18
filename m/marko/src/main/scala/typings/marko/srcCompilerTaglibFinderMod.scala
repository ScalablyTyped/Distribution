package typings.marko

import typings.marko.srcCompilerTaglibLoaderTaglibMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCompilerTaglibFinderMod {
  
  @JSImport("marko/src/compiler/taglib-finder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  inline def excludeDir(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("excludeDir")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def excludePackage(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("excludePackage")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def find(dirname: String, registeredTaglibs: js.Array[default]): js.Array[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(dirname.asInstanceOf[js.Any], registeredTaglibs.asInstanceOf[js.Any])).asInstanceOf[js.Array[default]]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
}
