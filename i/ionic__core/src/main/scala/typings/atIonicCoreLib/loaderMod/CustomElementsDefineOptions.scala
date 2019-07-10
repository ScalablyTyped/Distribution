package typings
package atIonicCoreLib.loaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomElementsDefineOptions extends js.Object {
  var ael: js.UndefOr[
    js.Function4[
      /* el */ stdLib.EventTarget, 
      /* eventName */ java.lang.String, 
      /* listener */ stdLib.EventListenerOrEventListenerObject, 
      /* options */ scala.Boolean | stdLib.AddEventListenerOptions, 
      scala.Unit
    ]
  ] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var jmp: js.UndefOr[js.Function1[/* c */ js.Function, _]] = js.undefined
  var raf: js.UndefOr[js.Function1[/* c */ stdLib.FrameRequestCallback, scala.Double]] = js.undefined
  var rel: js.UndefOr[
    js.Function4[
      /* el */ stdLib.EventTarget, 
      /* eventName */ java.lang.String, 
      /* listener */ stdLib.EventListenerOrEventListenerObject, 
      /* options */ scala.Boolean | stdLib.AddEventListenerOptions, 
      scala.Unit
    ]
  ] = js.undefined
  var resourcesUrl: js.UndefOr[java.lang.String] = js.undefined
  var syncQueue: js.UndefOr[scala.Boolean] = js.undefined
}

object CustomElementsDefineOptions {
  @scala.inline
  def apply(
    ael: (/* el */ stdLib.EventTarget, /* eventName */ java.lang.String, /* listener */ stdLib.EventListenerOrEventListenerObject, /* options */ scala.Boolean | stdLib.AddEventListenerOptions) => scala.Unit = null,
    exclude: js.Array[java.lang.String] = null,
    jmp: /* c */ js.Function => _ = null,
    raf: /* c */ stdLib.FrameRequestCallback => scala.Double = null,
    rel: (/* el */ stdLib.EventTarget, /* eventName */ java.lang.String, /* listener */ stdLib.EventListenerOrEventListenerObject, /* options */ scala.Boolean | stdLib.AddEventListenerOptions) => scala.Unit = null,
    resourcesUrl: java.lang.String = null,
    syncQueue: js.UndefOr[scala.Boolean] = js.undefined
  ): CustomElementsDefineOptions = {
    val __obj = js.Dynamic.literal()
    if (ael != null) __obj.updateDynamic("ael")(js.Any.fromFunction4(ael))
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (jmp != null) __obj.updateDynamic("jmp")(js.Any.fromFunction1(jmp))
    if (raf != null) __obj.updateDynamic("raf")(js.Any.fromFunction1(raf))
    if (rel != null) __obj.updateDynamic("rel")(js.Any.fromFunction4(rel))
    if (resourcesUrl != null) __obj.updateDynamic("resourcesUrl")(resourcesUrl)
    if (!js.isUndefined(syncQueue)) __obj.updateDynamic("syncQueue")(syncQueue)
    __obj.asInstanceOf[CustomElementsDefineOptions]
  }
}

