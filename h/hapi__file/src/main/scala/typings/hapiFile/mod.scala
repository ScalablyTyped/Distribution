package typings.hapiFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uniqueFilename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueFilename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def uniqueFilename(path: String, `extension`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueFilename")(path.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[String]
}
