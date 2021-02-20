package typings.heapdump

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("heapdump", "writeSnapshot")
  @js.native
  def writeSnapshot(): Unit = js.native
  @JSImport("heapdump", "writeSnapshot")
  @js.native
  def writeSnapshot(callback: js.Function2[/* err */ Error | Null, /* filename */ js.UndefOr[String], Unit]): Unit = js.native
  @JSImport("heapdump", "writeSnapshot")
  @js.native
  def writeSnapshot(
    dumpFileName: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* filename */ js.UndefOr[String], Unit]
  ): Unit = js.native
  @JSImport("heapdump", "writeSnapshot")
  @js.native
  def writeSnapshot(dumpFileName: String): Unit = js.native
  @JSImport("heapdump", "writeSnapshot")
  @js.native
  def writeSnapshot(
    dumpFileName: String,
    callback: js.Function2[/* err */ Error | Null, /* filename */ js.UndefOr[String], Unit]
  ): Unit = js.native
}
