package typings.loadYamlFile

import typings.node.bufferMod.global.Buffer
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("load-yaml-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadYamlFile(path: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadYamlFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def loadYamlFile(path: Buffer): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadYamlFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def loadYamlFile(path: URL): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadYamlFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def loadYamlFileSync(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadYamlFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def loadYamlFileSync(path: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadYamlFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def loadYamlFileSync(path: URL): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadYamlFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
}
