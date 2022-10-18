package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.esmTypesMod.OnoError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmIsomorphicDotnodeMod {
  
  @JSImport("@jsdevtools/ono/esm/isomorphic.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addInspectMethod[T](newError: OnoError[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addInspectMethod")(newError.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def format(format: Any, param: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(format.asInstanceOf[js.Any]).`++`(param.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def format(format: Unit, param: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(format.asInstanceOf[js.Any]).`++`(param.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
