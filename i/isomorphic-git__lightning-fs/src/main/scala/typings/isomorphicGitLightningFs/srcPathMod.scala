package typings.isomorphicGitLightningFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPathMod {
  
  @JSImport("@isomorphic-git/lightning-fs/src/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def basename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dirname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def join(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(parts.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def normalize(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolve(paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(paths.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def split(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
