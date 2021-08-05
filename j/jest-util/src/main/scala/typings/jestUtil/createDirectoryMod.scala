package typings.jestUtil

import typings.jestTypes.configMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createDirectoryMod {
  
  @JSImport("jest-util/build/createDirectory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: Path): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
