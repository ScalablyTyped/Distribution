package typings.lzmaNative

import typings.lzmaNative.mod.Preset
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Compress extends StObject {
    
    def compress(buf: String, mode: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
    def compress(
      buf: String,
      mode: Preset,
      on_finish: js.Function1[/* result */ Buffer, Unit],
      on_progress: js.Function1[/* progress */ Double, Unit]
    ): Unit = js.native
    def compress(buf: Buffer, mode: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
    def compress(
      buf: Buffer,
      mode: Preset,
      on_finish: js.Function1[/* result */ Buffer, Unit],
      on_progress: js.Function1[/* progress */ Double, Unit]
    ): Unit = js.native
    
    def decompress(buf: String, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
    def decompress(
      buf: String,
      on_finish: js.Function1[/* result */ Buffer, Unit],
      on_progress: js.Function1[/* progress */ Double, Unit]
    ): Unit = js.native
    def decompress(buf: Buffer, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
    def decompress(
      buf: Buffer,
      on_finish: js.Function1[/* result */ Buffer, Unit],
      on_progress: js.Function1[/* progress */ Double, Unit]
    ): Unit = js.native
  }
}
