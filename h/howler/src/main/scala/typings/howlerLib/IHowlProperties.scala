package typings
package howlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHowlProperties extends js.Object {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var html5: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var mute: js.UndefOr[scala.Boolean] = js.undefined
  var onend: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onfade: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onload: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onloaderror: js.UndefOr[js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit]] = js.undefined
  var onmute: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onpause: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onplay: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onplayerror: js.UndefOr[js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit]] = js.undefined
  var onrate: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onseek: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onstop: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onvolume: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var pool: js.UndefOr[scala.Double] = js.undefined
  var preload: js.UndefOr[scala.Boolean] = js.undefined
  var rate: js.UndefOr[scala.Double] = js.undefined
  var sprite: js.UndefOr[IHowlSoundSpriteDefinition] = js.undefined
  var src: java.lang.String | js.Array[java.lang.String]
  var volume: js.UndefOr[scala.Double] = js.undefined
  var xhrWithCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

