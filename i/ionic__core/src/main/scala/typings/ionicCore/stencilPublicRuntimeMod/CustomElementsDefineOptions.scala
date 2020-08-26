package typings.ionicCore.stencilPublicRuntimeMod

import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomElementsDefineOptions extends js.Object {
  var ael: js.UndefOr[
    js.Function4[
      /* el */ EventTarget, 
      /* eventName */ String, 
      /* listener */ EventListenerOrEventListenerObject, 
      /* options */ Boolean | AddEventListenerOptions, 
      Unit
    ]
  ] = js.native
  var ce: js.UndefOr[
    js.Function2[/* eventName */ String, /* opts */ js.UndefOr[js.Any], CustomEvent[_]]
  ] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var jmp: js.UndefOr[js.Function1[/* c */ js.Function, _]] = js.native
  var raf: js.UndefOr[js.Function1[/* c */ FrameRequestCallback, Double]] = js.native
  var rel: js.UndefOr[
    js.Function4[
      /* el */ EventTarget, 
      /* eventName */ String, 
      /* listener */ EventListenerOrEventListenerObject, 
      /* options */ Boolean | AddEventListenerOptions, 
      Unit
    ]
  ] = js.native
  var resourcesUrl: js.UndefOr[String] = js.native
  var syncQueue: js.UndefOr[Boolean] = js.native
  var transformTagName: js.UndefOr[js.Function1[/* tagName */ String, String]] = js.native
}

object CustomElementsDefineOptions {
  @scala.inline
  def apply(): CustomElementsDefineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomElementsDefineOptions]
  }
  @scala.inline
  implicit class CustomElementsDefineOptionsOps[Self <: CustomElementsDefineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAel(
      value: (/* el */ EventTarget, /* eventName */ String, /* listener */ EventListenerOrEventListenerObject, /* options */ Boolean | AddEventListenerOptions) => Unit
    ): Self = this.set("ael", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAel: Self = this.set("ael", js.undefined)
    @scala.inline
    def setCe(value: (/* eventName */ String, /* opts */ js.UndefOr[js.Any]) => CustomEvent[_]): Self = this.set("ce", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCe: Self = this.set("ce", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setJmp(value: /* c */ js.Function => _): Self = this.set("jmp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteJmp: Self = this.set("jmp", js.undefined)
    @scala.inline
    def setRaf(value: /* c */ FrameRequestCallback => Double): Self = this.set("raf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRaf: Self = this.set("raf", js.undefined)
    @scala.inline
    def setRel(
      value: (/* el */ EventTarget, /* eventName */ String, /* listener */ EventListenerOrEventListenerObject, /* options */ Boolean | AddEventListenerOptions) => Unit
    ): Self = this.set("rel", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    @scala.inline
    def setResourcesUrl(value: String): Self = this.set("resourcesUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcesUrl: Self = this.set("resourcesUrl", js.undefined)
    @scala.inline
    def setSyncQueue(value: Boolean): Self = this.set("syncQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncQueue: Self = this.set("syncQueue", js.undefined)
    @scala.inline
    def setTransformTagName(value: /* tagName */ String => String): Self = this.set("transformTagName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformTagName: Self = this.set("transformTagName", js.undefined)
  }
  
}

