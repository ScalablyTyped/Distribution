package typings
package howlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Howl extends js.Object {
  def duration(): scala.Double = js.native
  def duration(id: scala.Double): scala.Double = js.native
  def fade(from: scala.Double, to: scala.Double, duration: scala.Double): this.type = js.native
  def fade(from: scala.Double, to: scala.Double, duration: scala.Double, id: scala.Double): this.type = js.native
  def load(): scala.Unit = js.native
  def loop(): this.type = js.native
  def loop(loop: scala.Boolean): this.type = js.native
  def loop(loop: scala.Boolean, id: scala.Double): this.type = js.native
  def mute(): scala.Boolean = js.native
  def mute(muted: scala.Boolean): this.type = js.native
  def mute(muted: scala.Boolean, id: scala.Double): this.type = js.native
  def off(event: java.lang.String): this.type = js.native
  def off(event: java.lang.String, callback: js.Function): this.type = js.native
  def off(event: java.lang.String, callback: js.Function, id: scala.Double): this.type = js.native
  def on(event: java.lang.String, callback: js.Function): this.type = js.native
  def on(event: java.lang.String, callback: js.Function, id: scala.Double): this.type = js.native
  @JSName("on")
  def on_end(
    event: howlerLib.howlerLibStrings.end,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(
    event: howlerLib.howlerLibStrings.end,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_fade(
    event: howlerLib.howlerLibStrings.fade,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fade(
    event: howlerLib.howlerLibStrings.fade,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_load(event: howlerLib.howlerLibStrings.load, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_load(event: howlerLib.howlerLibStrings.load, callback: js.Function0[scala.Unit], id: scala.Double): this.type = js.native
  @JSName("on")
  def on_loaderror(
    event: howlerLib.howlerLibStrings.loaderror,
    callback: js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_loaderror(
    event: howlerLib.howlerLibStrings.loaderror,
    callback: js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_mute(
    event: howlerLib.howlerLibStrings.mute,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mute(
    event: howlerLib.howlerLibStrings.mute,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_pause(
    event: howlerLib.howlerLibStrings.pause,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pause(
    event: howlerLib.howlerLibStrings.pause,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_play(
    event: howlerLib.howlerLibStrings.play,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_play(
    event: howlerLib.howlerLibStrings.play,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_playerror(
    event: howlerLib.howlerLibStrings.playerror,
    callback: js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_playerror(
    event: howlerLib.howlerLibStrings.playerror,
    callback: js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_rate(
    event: howlerLib.howlerLibStrings.rate,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rate(
    event: howlerLib.howlerLibStrings.rate,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_seek(
    event: howlerLib.howlerLibStrings.seek,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_seek(
    event: howlerLib.howlerLibStrings.seek,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_stop(
    event: howlerLib.howlerLibStrings.stop,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_stop(
    event: howlerLib.howlerLibStrings.stop,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("on")
  def on_volume(
    event: howlerLib.howlerLibStrings.volume,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_volume(
    event: howlerLib.howlerLibStrings.volume,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  def once(event: java.lang.String, callback: js.Function): this.type = js.native
  def once(event: java.lang.String, callback: js.Function, id: scala.Double): this.type = js.native
  @JSName("once")
  def once_end(
    event: howlerLib.howlerLibStrings.end,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_end(
    event: howlerLib.howlerLibStrings.end,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_fade(
    event: howlerLib.howlerLibStrings.fade,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_fade(
    event: howlerLib.howlerLibStrings.fade,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_load(event: howlerLib.howlerLibStrings.load, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_load(event: howlerLib.howlerLibStrings.load, callback: js.Function0[scala.Unit], id: scala.Double): this.type = js.native
  @JSName("once")
  def once_loaderror(
    event: howlerLib.howlerLibStrings.loaderror,
    callback: js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_loaderror(
    event: howlerLib.howlerLibStrings.loaderror,
    callback: js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_mute(
    event: howlerLib.howlerLibStrings.mute,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mute(
    event: howlerLib.howlerLibStrings.mute,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_pause(
    event: howlerLib.howlerLibStrings.pause,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pause(
    event: howlerLib.howlerLibStrings.pause,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_play(
    event: howlerLib.howlerLibStrings.play,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_play(
    event: howlerLib.howlerLibStrings.play,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_playerror(
    event: howlerLib.howlerLibStrings.playerror,
    callback: js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_playerror(
    event: howlerLib.howlerLibStrings.playerror,
    callback: js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_rate(
    event: howlerLib.howlerLibStrings.rate,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rate(
    event: howlerLib.howlerLibStrings.rate,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_seek(
    event: howlerLib.howlerLibStrings.seek,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_seek(
    event: howlerLib.howlerLibStrings.seek,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_stop(
    event: howlerLib.howlerLibStrings.stop,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_stop(
    event: howlerLib.howlerLibStrings.stop,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  @JSName("once")
  def once_volume(
    event: howlerLib.howlerLibStrings.volume,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_volume(
    event: howlerLib.howlerLibStrings.volume,
    callback: js.Function1[/* soundId */ scala.Double, scala.Unit],
    id: scala.Double
  ): this.type = js.native
  def orientation(
    x: scala.Double,
    y: scala.Double,
    z: scala.Double,
    xUp: scala.Double,
    yUp: scala.Double,
    zUp: scala.Double
  ): this.type | scala.Unit = js.native
  def pannerAttr(o: Anon_ConeInnerAngle): this.type = js.native
  def pannerAttr(o: Anon_ConeInnerAngle, id: scala.Double): this.type = js.native
   // .play() is not chainable; the other methods are
  def pause(): this.type = js.native
  def pause(id: scala.Double): this.type = js.native
  def play(): scala.Double = js.native
  def play(spriteOrId: java.lang.String): scala.Double = js.native
  def play(spriteOrId: scala.Double): scala.Double = js.native
  def playing(): scala.Boolean = js.native
  def playing(id: scala.Double): scala.Boolean = js.native
  def pos(x: scala.Double, y: scala.Double, z: scala.Double): this.type | scala.Unit = js.native
  def pos(x: scala.Double, y: scala.Double, z: scala.Double, id: scala.Double): this.type | scala.Unit = js.native
  def rate(): scala.Double = js.native
  def rate(idOrSetRate: scala.Double): this.type | scala.Double = js.native
  def rate(rate: scala.Double, id: scala.Double): this.type = js.native
  def seek(): this.type | scala.Double = js.native
  def seek(seek: scala.Double): this.type | scala.Double = js.native
  def seek(seek: scala.Double, id: scala.Double): this.type | scala.Double = js.native
  def state(): howlerLib.howlerLibStrings.unloaded | howlerLib.howlerLibStrings.loading | howlerLib.howlerLibStrings.loaded = js.native
  def stereo(pan: scala.Double): this.type | scala.Unit = js.native
  def stereo(pan: scala.Double, id: scala.Double): this.type | scala.Unit = js.native
  def stop(): this.type = js.native
  def stop(id: scala.Double): this.type = js.native
  def unload(): scala.Unit = js.native
  def volume(): scala.Double = js.native
  def volume(idOrSetVolume: scala.Double): this.type | scala.Double = js.native
  def volume(volume: scala.Double, id: scala.Double): this.type = js.native
}

