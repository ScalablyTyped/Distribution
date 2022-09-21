package typings.heapdump

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("heapdump", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeSnapshot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSnapshot")().asInstanceOf[Unit]
  inline def writeSnapshot(callback: js.Function2[/* err */ js.Error | Null, /* filename */ js.UndefOr[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSnapshot")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def writeSnapshot(dumpFileName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSnapshot")(dumpFileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def writeSnapshot(
    dumpFileName: String,
    callback: js.Function2[/* err */ js.Error | Null, /* filename */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSnapshot")(dumpFileName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeSnapshot(
    dumpFileName: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* filename */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSnapshot")(dumpFileName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
