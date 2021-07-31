package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object netGopherMod {
  
  @JSImport("locutus/php/net-gopher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def gopherParsedir(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gopher_parsedir")().asInstanceOf[js.Any]
  @scala.inline
  def gopherParsedir(dirent: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gopher_parsedir")(dirent.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
