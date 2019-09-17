package typings.libratoDashNode.libratoDashNodeMod

import typings.libratoDashNode.Anon_RequestCountKey
import typings.libratoDashNode.libratoDashNodeStrings.SIGINT
import typings.libratoDashNode.libratoDashNodeStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("librato-node", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def configure(config: LibratoConfig): Unit = js.native
  def configure(config: LibratoSimulate): Unit = js.native
  def flush(): Unit = js.native
  def flush(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def increment(name: String): Unit = js.native
  def increment(name: String, value: Double): Unit = js.native
  def increment(name: String, value: Double, opts: CustomSource): Unit = js.native
  def measure(name: String, value: Double): Unit = js.native
  def measure(name: String, value: Double, opts: CustomSource): Unit = js.native
  def middleware(): js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ] = js.native
  def middleware(config: Anon_RequestCountKey): js.Function3[
    /* req */ js.Object, 
    /* res */ js.Object, 
    /* next */ js.Function0[Unit | js.Promise[Unit]], 
    Unit
  ] = js.native
  @JSName("on")
  def on_SIGINT(event: SIGINT, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_error(event: error, handler: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def stop(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def timing(name: String, fn: js.Function1[/* done */ js.Function0[Unit], Unit]): Unit = js.native
  def timing(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  def timing(name: String, fn: js.Function1[/* done */ js.Function0[Unit], Unit], opts: CustomSource): Unit = js.native
  def timing(
    name: String,
    fn: js.Function1[/* done */ js.Function0[Unit], Unit],
    opts: CustomSource,
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
  @JSName("timing")
  def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ T, T], 
      Unit
    ]
  ): T = js.native
  @JSName("timing")
  def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ T, T], 
      Unit
    ],
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): T = js.native
  @JSName("timing")
  def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ T, T], 
      Unit
    ],
    opts: CustomSource
  ): T = js.native
  @JSName("timing")
  def timing_T_T[T](
    name: String,
    fn: js.Function1[
      /* done */ js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ T, T], 
      Unit
    ],
    opts: CustomSource,
    cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]
  ): T = js.native
}

