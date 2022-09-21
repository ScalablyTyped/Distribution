package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object netGopherMod {
  
  @JSImport("locutus/php/net-gopher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gopherParsedir(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gopher_parsedir")().asInstanceOf[Any]
  inline def gopherParsedir(dirent: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gopher_parsedir")(dirent.asInstanceOf[js.Any]).asInstanceOf[Any]
}
