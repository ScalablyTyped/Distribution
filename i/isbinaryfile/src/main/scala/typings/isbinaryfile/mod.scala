package typings.isbinaryfile

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("isbinaryfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBinaryFile(file: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def isBinaryFile(file: String, size: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryFile")(file.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isBinaryFile(file: Buffer): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def isBinaryFile(file: Buffer, size: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryFile")(file.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def isBinaryFileSync(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isBinaryFileSync(file: String, size: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryFileSync")(file.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isBinaryFileSync(file: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isBinaryFileSync(file: Buffer, size: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryFileSync")(file.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
