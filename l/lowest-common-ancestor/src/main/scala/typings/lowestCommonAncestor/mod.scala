package typings.lowestCommonAncestor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lowest-common-ancestor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lowestCommonAncestor(filepaths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lowestCommonAncestor")(filepaths.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
}
