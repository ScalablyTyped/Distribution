package typings
package lzmaDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Buf extends js.Object {
  def compress(
    buf: java.lang.String,
    mode: lzmaDashNativeLib.lzmaDashNativeMod.Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(
    buf: java.lang.String,
    mode: lzmaDashNativeLib.lzmaDashNativeMod.Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit],
    on_progress: js.Function1[/* progress */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def compress(
    buf: nodeLib.Buffer,
    mode: lzmaDashNativeLib.lzmaDashNativeMod.Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(
    buf: nodeLib.Buffer,
    mode: lzmaDashNativeLib.lzmaDashNativeMod.Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit],
    on_progress: js.Function1[/* progress */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def decompress(buf: java.lang.String, on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  def decompress(
    buf: java.lang.String,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit],
    on_progress: js.Function1[/* progress */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def decompress(buf: nodeLib.Buffer, on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
  def decompress(
    buf: nodeLib.Buffer,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit],
    on_progress: js.Function1[/* progress */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
}

