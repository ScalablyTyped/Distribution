package typings.jiti

import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("jiti/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectLegacySyntax(code: String): RegExpMatchArray | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLegacySyntax")(code.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray | Null]
  
  inline def getCacheDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheDir")().asInstanceOf[String]
  
  inline def isDir(filename: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWritable(filename: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWritable")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def md5(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("md5")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def md5(content: String, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(content.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readNearestPackageJSON(path: String): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJson */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("readNearestPackageJSON")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJson */ Any
  ]]
}
