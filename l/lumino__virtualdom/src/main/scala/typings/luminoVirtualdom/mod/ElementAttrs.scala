package typings.luminoVirtualdom.mod

import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MediaStreamErrorEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @lumino/virtualdom.@lumino/virtualdom.ElementBaseAttrs & @lumino/virtualdom.@lumino/virtualdom.ElementEventAttrs & @lumino/virtualdom.@lumino/virtualdom.ElementSpecialAttrs */
trait ElementAttrs extends js.Object {
  val abbr: js.UndefOr[String] = js.undefined
  val accept: js.UndefOr[String] = js.undefined
  val `accept-charset`: js.UndefOr[String] = js.undefined
  val accesskey: js.UndefOr[String] = js.undefined
  val action: js.UndefOr[String] = js.undefined
  val allowfullscreen: js.UndefOr[String] = js.undefined
  val alt: js.UndefOr[String] = js.undefined
  val autocomplete: js.UndefOr[String] = js.undefined
  val autofocus: js.UndefOr[String] = js.undefined
  val autoplay: js.UndefOr[String] = js.undefined
  val autosave: js.UndefOr[String] = js.undefined
  val checked: js.UndefOr[String] = js.undefined
  val cite: js.UndefOr[String] = js.undefined
  /**
    * The JS-safe name for the HTML `class` attribute.
    */
  val className: js.UndefOr[String] = js.undefined
  val cols: js.UndefOr[String] = js.undefined
  val colspan: js.UndefOr[String] = js.undefined
  val contenteditable: js.UndefOr[String] = js.undefined
  val controls: js.UndefOr[String] = js.undefined
  val coords: js.UndefOr[String] = js.undefined
  val crossorigin: js.UndefOr[String] = js.undefined
  val data: js.UndefOr[String] = js.undefined
  /**
    * The dataset for the rendered DOM element.
    */
  val dataset: js.UndefOr[ElementDataset] = js.undefined
  val datetime: js.UndefOr[String] = js.undefined
  val default: js.UndefOr[String] = js.undefined
  val dir: js.UndefOr[String] = js.undefined
  val dirname: js.UndefOr[String] = js.undefined
  val disabled: js.UndefOr[String] = js.undefined
  val download: js.UndefOr[String] = js.undefined
  val draggable: js.UndefOr[String] = js.undefined
  val dropzone: js.UndefOr[String] = js.undefined
  val enctype: js.UndefOr[String] = js.undefined
  val form: js.UndefOr[String] = js.undefined
  val formaction: js.UndefOr[String] = js.undefined
  val formenctype: js.UndefOr[String] = js.undefined
  val formmethod: js.UndefOr[String] = js.undefined
  val formnovalidate: js.UndefOr[String] = js.undefined
  val formtarget: js.UndefOr[String] = js.undefined
  val headers: js.UndefOr[String] = js.undefined
  val height: js.UndefOr[String] = js.undefined
  val hidden: js.UndefOr[String] = js.undefined
  val high: js.UndefOr[String] = js.undefined
  val href: js.UndefOr[String] = js.undefined
  val hreflang: js.UndefOr[String] = js.undefined
  /**
    * The JS-safe name for the HTML `for` attribute.
    */
  val htmlFor: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val inputmode: js.UndefOr[String] = js.undefined
  val integrity: js.UndefOr[String] = js.undefined
  val ismap: js.UndefOr[String] = js.undefined
  /**
    * The key id for the virtual element node.
    *
    * If a node is given a key id, the generated DOM node will not be
    * recreated during a rendering update if it only moves among its
    * siblings in the render tree.
    *
    * In general, reordering child nodes will cause the nodes to be
    * completely re-rendered. Keys allow this to be optimized away.
    *
    * If a key is provided, it must be unique among sibling nodes.
    */
  val key: js.UndefOr[String] = js.undefined
  val kind: js.UndefOr[String] = js.undefined
  val label: js.UndefOr[String] = js.undefined
  val lang: js.UndefOr[String] = js.undefined
  val list: js.UndefOr[String] = js.undefined
  val loop: js.UndefOr[String] = js.undefined
  val low: js.UndefOr[String] = js.undefined
  val max: js.UndefOr[String] = js.undefined
  val maxlength: js.UndefOr[String] = js.undefined
  val media: js.UndefOr[String] = js.undefined
  val mediagroup: js.UndefOr[String] = js.undefined
  val method: js.UndefOr[String] = js.undefined
  val min: js.UndefOr[String] = js.undefined
  val minlength: js.UndefOr[String] = js.undefined
  val multiple: js.UndefOr[String] = js.undefined
  val muted: js.UndefOr[String] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  val novalidate: js.UndefOr[String] = js.undefined
  val onabort: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.undefined
  val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onblur: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.undefined
  val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val oncopy: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.undefined
  val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val oncut: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.undefined
  val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val ondrag: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondrop: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.undefined
  val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onemptied: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onended: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]] = js.undefined
  val onerror: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]] = js.undefined
  val onfocus: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.undefined
  val oninput: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.undefined
  val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.undefined
  val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.undefined
  val onload: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onloadend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.undefined
  val onmousewheel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]] = js.undefined
  val onpaste: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.undefined
  val onpause: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onplaying: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.undefined
  val onprogress: js.UndefOr[
    js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent[EventTarget], _]
  ] = js.undefined
  val onratechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onreset: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onscroll: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.undefined
  val onseeked: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onseeking: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onselect: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.undefined
  val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onstalled: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.undefined
  val optimum: js.UndefOr[String] = js.undefined
  val pattern: js.UndefOr[String] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val poster: js.UndefOr[String] = js.undefined
  val preload: js.UndefOr[String] = js.undefined
  val readonly: js.UndefOr[String] = js.undefined
  val rel: js.UndefOr[String] = js.undefined
  val required: js.UndefOr[String] = js.undefined
  val reversed: js.UndefOr[String] = js.undefined
  val rows: js.UndefOr[String] = js.undefined
  val rowspan: js.UndefOr[String] = js.undefined
  val sandbox: js.UndefOr[String] = js.undefined
  val scope: js.UndefOr[String] = js.undefined
  val selected: js.UndefOr[String] = js.undefined
  val shape: js.UndefOr[String] = js.undefined
  val size: js.UndefOr[String] = js.undefined
  val sizes: js.UndefOr[String] = js.undefined
  val span: js.UndefOr[String] = js.undefined
  val spellcheck: js.UndefOr[String] = js.undefined
  val src: js.UndefOr[String] = js.undefined
  val srcdoc: js.UndefOr[String] = js.undefined
  val srclang: js.UndefOr[String] = js.undefined
  val srcset: js.UndefOr[String] = js.undefined
  val start: js.UndefOr[String] = js.undefined
  val step: js.UndefOr[String] = js.undefined
  /**
    * The inline style for the rendered DOM element.
    */
  val style: js.UndefOr[ElementInlineStyle] = js.undefined
  val tabindex: js.UndefOr[String] = js.undefined
  val target: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
  val typemustmatch: js.UndefOr[String] = js.undefined
  val usemap: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[String] = js.undefined
  val width: js.UndefOr[String] = js.undefined
  val wrap: js.UndefOr[String] = js.undefined
}

object ElementAttrs {
  @scala.inline
  def apply(
    abbr: String = null,
    accept: String = null,
    `accept-charset`: String = null,
    accesskey: String = null,
    action: String = null,
    allowfullscreen: String = null,
    alt: String = null,
    autocomplete: String = null,
    autofocus: String = null,
    autoplay: String = null,
    autosave: String = null,
    checked: String = null,
    cite: String = null,
    className: String = null,
    cols: String = null,
    colspan: String = null,
    contenteditable: String = null,
    controls: String = null,
    coords: String = null,
    crossorigin: String = null,
    data: String = null,
    dataset: ElementDataset = null,
    datetime: String = null,
    default: String = null,
    dir: String = null,
    dirname: String = null,
    disabled: String = null,
    download: String = null,
    draggable: String = null,
    dropzone: String = null,
    enctype: String = null,
    form: String = null,
    formaction: String = null,
    formenctype: String = null,
    formmethod: String = null,
    formnovalidate: String = null,
    formtarget: String = null,
    headers: String = null,
    height: String = null,
    hidden: String = null,
    high: String = null,
    href: String = null,
    hreflang: String = null,
    htmlFor: String = null,
    id: String = null,
    inputmode: String = null,
    integrity: String = null,
    ismap: String = null,
    key: String = null,
    kind: String = null,
    label: String = null,
    lang: String = null,
    list: String = null,
    loop: String = null,
    low: String = null,
    max: String = null,
    maxlength: String = null,
    media: String = null,
    mediagroup: String = null,
    method: String = null,
    min: String = null,
    minlength: String = null,
    multiple: String = null,
    muted: String = null,
    name: String = null,
    novalidate: String = null,
    onabort: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _] = null,
    onauxclick: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _] = null,
    oncanplay: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    oncanplaythrough: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onchange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onclick: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    oncontextmenu: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    oncopy: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _] = null,
    oncuechange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    oncut: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _] = null,
    ondblclick: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragleave: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onemptied: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onended: js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _] = null,
    onerror: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _] = null,
    onfocus: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _] = null,
    oninput: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    oninvalid: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onkeydown: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onloadeddata: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onloadedmetadata: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onloadend: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onloadstart: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onmousedown: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _] = null,
    onmousewheel: js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _] = null,
    onpaste: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _] = null,
    onpause: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onplay: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onplaying: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onpointercancel: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent[EventTarget], _] = null,
    onratechange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onreset: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onscroll: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _] = null,
    onseeked: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onseeking: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onselect: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _] = null,
    onselectstart: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onstalled: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onsubmit: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onsuspend: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    ontimeupdate: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onvolumechange: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    onwaiting: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _] = null,
    optimum: String = null,
    pattern: String = null,
    placeholder: String = null,
    poster: String = null,
    preload: String = null,
    readonly: String = null,
    rel: String = null,
    required: String = null,
    reversed: String = null,
    rows: String = null,
    rowspan: String = null,
    sandbox: String = null,
    scope: String = null,
    selected: String = null,
    shape: String = null,
    size: String = null,
    sizes: String = null,
    span: String = null,
    spellcheck: String = null,
    src: String = null,
    srcdoc: String = null,
    srclang: String = null,
    srcset: String = null,
    start: String = null,
    step: String = null,
    style: ElementInlineStyle = null,
    tabindex: String = null,
    target: String = null,
    title: String = null,
    `type`: String = null,
    typemustmatch: String = null,
    usemap: String = null,
    value: String = null,
    width: String = null,
    wrap: String = null
  ): ElementAttrs = {
    val __obj = js.Dynamic.literal()
    if (abbr != null) __obj.updateDynamic("abbr")(abbr.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (`accept-charset` != null) __obj.updateDynamic("accept-charset")(`accept-charset`.asInstanceOf[js.Any])
    if (accesskey != null) __obj.updateDynamic("accesskey")(accesskey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (allowfullscreen != null) __obj.updateDynamic("allowfullscreen")(allowfullscreen.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (autofocus != null) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autosave != null) __obj.updateDynamic("autosave")(autosave.asInstanceOf[js.Any])
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (cite != null) __obj.updateDynamic("cite")(cite.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (colspan != null) __obj.updateDynamic("colspan")(colspan.asInstanceOf[js.Any])
    if (contenteditable != null) __obj.updateDynamic("contenteditable")(contenteditable.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (coords != null) __obj.updateDynamic("coords")(coords.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dirname != null) __obj.updateDynamic("dirname")(dirname.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (dropzone != null) __obj.updateDynamic("dropzone")(dropzone.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formaction != null) __obj.updateDynamic("formaction")(formaction.asInstanceOf[js.Any])
    if (formenctype != null) __obj.updateDynamic("formenctype")(formenctype.asInstanceOf[js.Any])
    if (formmethod != null) __obj.updateDynamic("formmethod")(formmethod.asInstanceOf[js.Any])
    if (formnovalidate != null) __obj.updateDynamic("formnovalidate")(formnovalidate.asInstanceOf[js.Any])
    if (formtarget != null) __obj.updateDynamic("formtarget")(formtarget.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hreflang != null) __obj.updateDynamic("hreflang")(hreflang.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (ismap != null) __obj.updateDynamic("ismap")(ismap.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediagroup != null) __obj.updateDynamic("mediagroup")(mediagroup.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength.asInstanceOf[js.Any])
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (muted != null) __obj.updateDynamic("muted")(muted.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (novalidate != null) __obj.updateDynamic("novalidate")(novalidate.asInstanceOf[js.Any])
    if (onabort != null) __obj.updateDynamic("onabort")(onabort.asInstanceOf[js.Any])
    if (onauxclick != null) __obj.updateDynamic("onauxclick")(onauxclick.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (oncanplay != null) __obj.updateDynamic("oncanplay")(oncanplay.asInstanceOf[js.Any])
    if (oncanplaythrough != null) __obj.updateDynamic("oncanplaythrough")(oncanplaythrough.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu.asInstanceOf[js.Any])
    if (oncopy != null) __obj.updateDynamic("oncopy")(oncopy.asInstanceOf[js.Any])
    if (oncuechange != null) __obj.updateDynamic("oncuechange")(oncuechange.asInstanceOf[js.Any])
    if (oncut != null) __obj.updateDynamic("oncut")(oncut.asInstanceOf[js.Any])
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick.asInstanceOf[js.Any])
    if (ondrag != null) __obj.updateDynamic("ondrag")(ondrag.asInstanceOf[js.Any])
    if (ondragend != null) __obj.updateDynamic("ondragend")(ondragend.asInstanceOf[js.Any])
    if (ondragenter != null) __obj.updateDynamic("ondragenter")(ondragenter.asInstanceOf[js.Any])
    if (ondragexit != null) __obj.updateDynamic("ondragexit")(ondragexit.asInstanceOf[js.Any])
    if (ondragleave != null) __obj.updateDynamic("ondragleave")(ondragleave.asInstanceOf[js.Any])
    if (ondragover != null) __obj.updateDynamic("ondragover")(ondragover.asInstanceOf[js.Any])
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(ondragstart.asInstanceOf[js.Any])
    if (ondrop != null) __obj.updateDynamic("ondrop")(ondrop.asInstanceOf[js.Any])
    if (ondurationchange != null) __obj.updateDynamic("ondurationchange")(ondurationchange.asInstanceOf[js.Any])
    if (onemptied != null) __obj.updateDynamic("onemptied")(onemptied.asInstanceOf[js.Any])
    if (onended != null) __obj.updateDynamic("onended")(onended.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(onerror.asInstanceOf[js.Any])
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus.asInstanceOf[js.Any])
    if (oninput != null) __obj.updateDynamic("oninput")(oninput.asInstanceOf[js.Any])
    if (oninvalid != null) __obj.updateDynamic("oninvalid")(oninvalid.asInstanceOf[js.Any])
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(onkeydown.asInstanceOf[js.Any])
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(onkeypress.asInstanceOf[js.Any])
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    if (onloadeddata != null) __obj.updateDynamic("onloadeddata")(onloadeddata.asInstanceOf[js.Any])
    if (onloadedmetadata != null) __obj.updateDynamic("onloadedmetadata")(onloadedmetadata.asInstanceOf[js.Any])
    if (onloadend != null) __obj.updateDynamic("onloadend")(onloadend.asInstanceOf[js.Any])
    if (onloadstart != null) __obj.updateDynamic("onloadstart")(onloadstart.asInstanceOf[js.Any])
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown.asInstanceOf[js.Any])
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(onmouseenter.asInstanceOf[js.Any])
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(onmouseleave.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(onmousemove.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(onmouseup.asInstanceOf[js.Any])
    if (onmousewheel != null) __obj.updateDynamic("onmousewheel")(onmousewheel.asInstanceOf[js.Any])
    if (onpaste != null) __obj.updateDynamic("onpaste")(onpaste.asInstanceOf[js.Any])
    if (onpause != null) __obj.updateDynamic("onpause")(onpause.asInstanceOf[js.Any])
    if (onplay != null) __obj.updateDynamic("onplay")(onplay.asInstanceOf[js.Any])
    if (onplaying != null) __obj.updateDynamic("onplaying")(onplaying.asInstanceOf[js.Any])
    if (onpointercancel != null) __obj.updateDynamic("onpointercancel")(onpointercancel.asInstanceOf[js.Any])
    if (onpointerdown != null) __obj.updateDynamic("onpointerdown")(onpointerdown.asInstanceOf[js.Any])
    if (onpointerenter != null) __obj.updateDynamic("onpointerenter")(onpointerenter.asInstanceOf[js.Any])
    if (onpointerleave != null) __obj.updateDynamic("onpointerleave")(onpointerleave.asInstanceOf[js.Any])
    if (onpointermove != null) __obj.updateDynamic("onpointermove")(onpointermove.asInstanceOf[js.Any])
    if (onpointerout != null) __obj.updateDynamic("onpointerout")(onpointerout.asInstanceOf[js.Any])
    if (onpointerover != null) __obj.updateDynamic("onpointerover")(onpointerover.asInstanceOf[js.Any])
    if (onpointerup != null) __obj.updateDynamic("onpointerup")(onpointerup.asInstanceOf[js.Any])
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress.asInstanceOf[js.Any])
    if (onratechange != null) __obj.updateDynamic("onratechange")(onratechange.asInstanceOf[js.Any])
    if (onreset != null) __obj.updateDynamic("onreset")(onreset.asInstanceOf[js.Any])
    if (onscroll != null) __obj.updateDynamic("onscroll")(onscroll.asInstanceOf[js.Any])
    if (onseeked != null) __obj.updateDynamic("onseeked")(onseeked.asInstanceOf[js.Any])
    if (onseeking != null) __obj.updateDynamic("onseeking")(onseeking.asInstanceOf[js.Any])
    if (onselect != null) __obj.updateDynamic("onselect")(onselect.asInstanceOf[js.Any])
    if (onselectstart != null) __obj.updateDynamic("onselectstart")(onselectstart.asInstanceOf[js.Any])
    if (onstalled != null) __obj.updateDynamic("onstalled")(onstalled.asInstanceOf[js.Any])
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (onsuspend != null) __obj.updateDynamic("onsuspend")(onsuspend.asInstanceOf[js.Any])
    if (ontimeupdate != null) __obj.updateDynamic("ontimeupdate")(ontimeupdate.asInstanceOf[js.Any])
    if (onvolumechange != null) __obj.updateDynamic("onvolumechange")(onvolumechange.asInstanceOf[js.Any])
    if (onwaiting != null) __obj.updateDynamic("onwaiting")(onwaiting.asInstanceOf[js.Any])
    if (optimum != null) __obj.updateDynamic("optimum")(optimum.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (readonly != null) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (reversed != null) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowspan != null) __obj.updateDynamic("rowspan")(rowspan.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (spellcheck != null) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcdoc != null) __obj.updateDynamic("srcdoc")(srcdoc.asInstanceOf[js.Any])
    if (srclang != null) __obj.updateDynamic("srclang")(srclang.asInstanceOf[js.Any])
    if (srcset != null) __obj.updateDynamic("srcset")(srcset.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typemustmatch != null) __obj.updateDynamic("typemustmatch")(typemustmatch.asInstanceOf[js.Any])
    if (usemap != null) __obj.updateDynamic("usemap")(usemap.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAttrs]
  }
}

