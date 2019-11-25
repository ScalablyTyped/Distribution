package typings.atIonicCore.loaderMod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomElementsDefineOptions extends js.Object {
  var ael: js.UndefOr[
    js.Function4[
      /* el */ EventTarget, 
      /* eventName */ String, 
      /* listener */ EventListenerOrEventListenerObject, 
      /* options */ Boolean | AddEventListenerOptions, 
      Unit
    ]
  ] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var jmp: js.UndefOr[js.Function1[/* c */ js.Function, _]] = js.undefined
  var raf: js.UndefOr[js.Function1[/* c */ FrameRequestCallback, Double]] = js.undefined
  var rel: js.UndefOr[
    js.Function4[
      /* el */ EventTarget, 
      /* eventName */ String, 
      /* listener */ EventListenerOrEventListenerObject, 
      /* options */ Boolean | AddEventListenerOptions, 
      Unit
    ]
  ] = js.undefined
  var resourcesUrl: js.UndefOr[String] = js.undefined
  var syncQueue: js.UndefOr[Boolean] = js.undefined
}

object CustomElementsDefineOptions {
  @scala.inline
  def apply(
    ael: (/* el */ EventTarget, /* eventName */ String, /* listener */ EventListenerOrEventListenerObject, /* options */ Boolean | AddEventListenerOptions) => Unit = null,
    exclude: js.Array[String] = null,
    jmp: /* c */ js.Function => _ = null,
    raf: /* c */ FrameRequestCallback => Double = null,
    rel: (/* el */ EventTarget, /* eventName */ String, /* listener */ EventListenerOrEventListenerObject, /* options */ Boolean | AddEventListenerOptions) => Unit = null,
    resourcesUrl: String = null,
    syncQueue: js.UndefOr[Boolean] = js.undefined
  ): CustomElementsDefineOptions = {
    val __obj = js.Dynamic.literal()
    if (ael != null) __obj.updateDynamic("ael")(js.Any.fromFunction4(ael))
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (jmp != null) __obj.updateDynamic("jmp")(js.Any.fromFunction1(jmp))
    if (raf != null) __obj.updateDynamic("raf")(js.Any.fromFunction1(raf))
    if (rel != null) __obj.updateDynamic("rel")(js.Any.fromFunction4(rel))
    if (resourcesUrl != null) __obj.updateDynamic("resourcesUrl")(resourcesUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(syncQueue)) __obj.updateDynamic("syncQueue")(syncQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomElementsDefineOptions]
  }
}

