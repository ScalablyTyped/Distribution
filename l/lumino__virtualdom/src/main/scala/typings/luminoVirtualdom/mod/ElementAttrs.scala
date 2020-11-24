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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @lumino/virtualdom.@lumino/virtualdom.ElementBaseAttrs & @lumino/virtualdom.@lumino/virtualdom.ElementEventAttrs & @lumino/virtualdom.@lumino/virtualdom.ElementSpecialAttrs */
@js.native
trait ElementAttrs extends js.Object {
  
  val abbr: js.UndefOr[String] = js.native
  
  val accept: js.UndefOr[String] = js.native
  
  val `accept-charset`: js.UndefOr[String] = js.native
  
  val accesskey: js.UndefOr[String] = js.native
  
  val action: js.UndefOr[String] = js.native
  
  val allowfullscreen: js.UndefOr[String] = js.native
  
  val alt: js.UndefOr[String] = js.native
  
  val autocomplete: js.UndefOr[String] = js.native
  
  val autofocus: js.UndefOr[String] = js.native
  
  val autoplay: js.UndefOr[String] = js.native
  
  val autosave: js.UndefOr[String] = js.native
  
  val checked: js.UndefOr[String] = js.native
  
  val cite: js.UndefOr[String] = js.native
  
  /**
    * The JS-safe name for the HTML `class` attribute.
    */
  val className: js.UndefOr[String] = js.native
  
  val cols: js.UndefOr[String] = js.native
  
  val colspan: js.UndefOr[String] = js.native
  
  val contenteditable: js.UndefOr[String] = js.native
  
  val controls: js.UndefOr[String] = js.native
  
  val coords: js.UndefOr[String] = js.native
  
  val crossorigin: js.UndefOr[String] = js.native
  
  val data: js.UndefOr[String] = js.native
  
  /**
    * The dataset for the rendered DOM element.
    */
  val dataset: js.UndefOr[ElementDataset] = js.native
  
  val datetime: js.UndefOr[String] = js.native
  
  val default: js.UndefOr[String] = js.native
  
  val dir: js.UndefOr[String] = js.native
  
  val dirname: js.UndefOr[String] = js.native
  
  val disabled: js.UndefOr[String] = js.native
  
  val download: js.UndefOr[String] = js.native
  
  val draggable: js.UndefOr[String] = js.native
  
  val dropzone: js.UndefOr[String] = js.native
  
  val enctype: js.UndefOr[String] = js.native
  
  val form: js.UndefOr[String] = js.native
  
  val formaction: js.UndefOr[String] = js.native
  
  val formenctype: js.UndefOr[String] = js.native
  
  val formmethod: js.UndefOr[String] = js.native
  
  val formnovalidate: js.UndefOr[String] = js.native
  
  val formtarget: js.UndefOr[String] = js.native
  
  val headers: js.UndefOr[String] = js.native
  
  val height: js.UndefOr[String] = js.native
  
  val hidden: js.UndefOr[String] = js.native
  
  val high: js.UndefOr[String] = js.native
  
  val href: js.UndefOr[String] = js.native
  
  val hreflang: js.UndefOr[String] = js.native
  
  /**
    * The JS-safe name for the HTML `for` attribute.
    */
  val htmlFor: js.UndefOr[String] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  val inputmode: js.UndefOr[String] = js.native
  
  val integrity: js.UndefOr[String] = js.native
  
  val ismap: js.UndefOr[String] = js.native
  
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
  val key: js.UndefOr[String] = js.native
  
  val kind: js.UndefOr[String] = js.native
  
  val label: js.UndefOr[String] = js.native
  
  val lang: js.UndefOr[String] = js.native
  
  val list: js.UndefOr[String] = js.native
  
  val loop: js.UndefOr[String] = js.native
  
  val low: js.UndefOr[String] = js.native
  
  val max: js.UndefOr[String] = js.native
  
  val maxlength: js.UndefOr[String] = js.native
  
  val media: js.UndefOr[String] = js.native
  
  val mediagroup: js.UndefOr[String] = js.native
  
  val method: js.UndefOr[String] = js.native
  
  val min: js.UndefOr[String] = js.native
  
  val minlength: js.UndefOr[String] = js.native
  
  val multiple: js.UndefOr[String] = js.native
  
  val muted: js.UndefOr[String] = js.native
  
  val name: js.UndefOr[String] = js.native
  
  val novalidate: js.UndefOr[String] = js.native
  
  val onabort: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
  
  val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val onblur: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
  
  val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  
  val oncopy: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
  
  val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val oncut: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
  
  val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val ondrag: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  
  val ondragend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  
  val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  
  val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  
  val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  
  val ondragover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  
  val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  
  val ondrop: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]] = js.native
  
  val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onemptied: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onended: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]] = js.native
  
  val onerror: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]] = js.native
  
  val onfocus: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]] = js.native
  
  val oninput: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
  
  val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
  
  val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]] = js.native
  
  val onload: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onloadend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]] = js.native
  
  val onmousewheel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]] = js.native
  
  val onpaste: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]] = js.native
  
  val onpause: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onplaying: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  
  val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  
  val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  
  val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  
  val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  
  val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  
  val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  
  val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]] = js.native
  
  val onprogress: js.UndefOr[
    js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent[EventTarget], _]
  ] = js.native
  
  val onratechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onreset: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onscroll: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
  
  val onseeked: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onseeking: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onselect: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]] = js.native
  
  val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onstalled: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]] = js.native
  
  val optimum: js.UndefOr[String] = js.native
  
  val pattern: js.UndefOr[String] = js.native
  
  val placeholder: js.UndefOr[String] = js.native
  
  val poster: js.UndefOr[String] = js.native
  
  val preload: js.UndefOr[String] = js.native
  
  val readonly: js.UndefOr[String] = js.native
  
  val rel: js.UndefOr[String] = js.native
  
  val required: js.UndefOr[String] = js.native
  
  val reversed: js.UndefOr[String] = js.native
  
  val rows: js.UndefOr[String] = js.native
  
  val rowspan: js.UndefOr[String] = js.native
  
  val sandbox: js.UndefOr[String] = js.native
  
  val scope: js.UndefOr[String] = js.native
  
  val selected: js.UndefOr[String] = js.native
  
  val shape: js.UndefOr[String] = js.native
  
  val size: js.UndefOr[String] = js.native
  
  val sizes: js.UndefOr[String] = js.native
  
  val span: js.UndefOr[String] = js.native
  
  val spellcheck: js.UndefOr[String] = js.native
  
  val src: js.UndefOr[String] = js.native
  
  val srcdoc: js.UndefOr[String] = js.native
  
  val srclang: js.UndefOr[String] = js.native
  
  val srcset: js.UndefOr[String] = js.native
  
  val start: js.UndefOr[String] = js.native
  
  val step: js.UndefOr[String] = js.native
  
  /**
    * The inline style for the rendered DOM element.
    */
  val style: js.UndefOr[ElementInlineStyle] = js.native
  
  val tabindex: js.UndefOr[String] = js.native
  
  val target: js.UndefOr[String] = js.native
  
  val title: js.UndefOr[String] = js.native
  
  val `type`: js.UndefOr[String] = js.native
  
  val typemustmatch: js.UndefOr[String] = js.native
  
  val usemap: js.UndefOr[String] = js.native
  
  val value: js.UndefOr[String] = js.native
  
  val width: js.UndefOr[String] = js.native
  
  val wrap: js.UndefOr[String] = js.native
}
object ElementAttrs {
  
  @scala.inline
  def apply(): ElementAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAttrs]
  }
  
  @scala.inline
  implicit class ElementAttrsOps[Self <: ElementAttrs] (val x: Self) extends AnyVal {
    
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
    def setAbbr(value: String): Self = this.set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbbr: Self = this.set("abbr", js.undefined)
    
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def `setAccept-charset`(value: String): Self = this.set("accept-charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAccept-charset`: Self = this.set("accept-charset", js.undefined)
    
    @scala.inline
    def setAccesskey(value: String): Self = this.set("accesskey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccesskey: Self = this.set("accesskey", js.undefined)
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAllowfullscreen(value: String): Self = this.set("allowfullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowfullscreen: Self = this.set("allowfullscreen", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setAutocomplete(value: String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    
    @scala.inline
    def setAutofocus(value: String): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    
    @scala.inline
    def setAutoplay(value: String): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setAutosave(value: String): Self = this.set("autosave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutosave: Self = this.set("autosave", js.undefined)
    
    @scala.inline
    def setChecked(value: String): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setCite(value: String): Self = this.set("cite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCite: Self = this.set("cite", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCols(value: String): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setColspan(value: String): Self = this.set("colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColspan: Self = this.set("colspan", js.undefined)
    
    @scala.inline
    def setContenteditable(value: String): Self = this.set("contenteditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContenteditable: Self = this.set("contenteditable", js.undefined)
    
    @scala.inline
    def setControls(value: String): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setCoords(value: String): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    
    @scala.inline
    def setCrossorigin(value: String): Self = this.set("crossorigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossorigin: Self = this.set("crossorigin", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataset(value: ElementDataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setDatetime(value: String): Self = this.set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDirname(value: String): Self = this.set("dirname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirname: Self = this.set("dirname", js.undefined)
    
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setDraggable(value: String): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setDropzone(value: String): Self = this.set("dropzone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropzone: Self = this.set("dropzone", js.undefined)
    
    @scala.inline
    def setEnctype(value: String): Self = this.set("enctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnctype: Self = this.set("enctype", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setFormaction(value: String): Self = this.set("formaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormaction: Self = this.set("formaction", js.undefined)
    
    @scala.inline
    def setFormenctype(value: String): Self = this.set("formenctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormenctype: Self = this.set("formenctype", js.undefined)
    
    @scala.inline
    def setFormmethod(value: String): Self = this.set("formmethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormmethod: Self = this.set("formmethod", js.undefined)
    
    @scala.inline
    def setFormnovalidate(value: String): Self = this.set("formnovalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormnovalidate: Self = this.set("formnovalidate", js.undefined)
    
    @scala.inline
    def setFormtarget(value: String): Self = this.set("formtarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormtarget: Self = this.set("formtarget", js.undefined)
    
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHigh(value: String): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setHreflang(value: String): Self = this.set("hreflang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHreflang: Self = this.set("hreflang", js.undefined)
    
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInputmode(value: String): Self = this.set("inputmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputmode: Self = this.set("inputmode", js.undefined)
    
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    
    @scala.inline
    def setIsmap(value: String): Self = this.set("ismap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsmap: Self = this.set("ismap", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setLoop(value: String): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setLow(value: String): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxlength(value: String): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMediagroup(value: String): Self = this.set("mediagroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediagroup: Self = this.set("mediagroup", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinlength(value: String): Self = this.set("minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinlength: Self = this.set("minlength", js.undefined)
    
    @scala.inline
    def setMultiple(value: String): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setMuted(value: String): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNovalidate(value: String): Self = this.set("novalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNovalidate: Self = this.set("novalidate", js.undefined)
    
    @scala.inline
    def setOnabort(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = this.set("onabort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnabort: Self = this.set("onabort", js.undefined)
    
    @scala.inline
    def setOnauxclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onauxclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnauxclick: Self = this.set("onauxclick", js.undefined)
    
    @scala.inline
    def setOnblur(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = this.set("onblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    
    @scala.inline
    def setOncanplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oncanplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncanplay: Self = this.set("oncanplay", js.undefined)
    
    @scala.inline
    def setOncanplaythrough(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oncanplaythrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncanplaythrough: Self = this.set("oncanplaythrough", js.undefined)
    
    @scala.inline
    def setOnchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    
    @scala.inline
    def setOnclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setOncontextmenu(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("oncontextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncontextmenu: Self = this.set("oncontextmenu", js.undefined)
    
    @scala.inline
    def setOncopy(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = this.set("oncopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncopy: Self = this.set("oncopy", js.undefined)
    
    @scala.inline
    def setOncuechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oncuechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncuechange: Self = this.set("oncuechange", js.undefined)
    
    @scala.inline
    def setOncut(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = this.set("oncut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncut: Self = this.set("oncut", js.undefined)
    
    @scala.inline
    def setOndblclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("ondblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndblclick: Self = this.set("ondblclick", js.undefined)
    
    @scala.inline
    def setOndrag(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndrag: Self = this.set("ondrag", js.undefined)
    
    @scala.inline
    def setOndragend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragend: Self = this.set("ondragend", js.undefined)
    
    @scala.inline
    def setOndragenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragenter: Self = this.set("ondragenter", js.undefined)
    
    @scala.inline
    def setOndragexit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragexit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragexit: Self = this.set("ondragexit", js.undefined)
    
    @scala.inline
    def setOndragleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragleave: Self = this.set("ondragleave", js.undefined)
    
    @scala.inline
    def setOndragover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragover: Self = this.set("ondragover", js.undefined)
    
    @scala.inline
    def setOndragstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragstart: Self = this.set("ondragstart", js.undefined)
    
    @scala.inline
    def setOndrop(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, _]): Self = this.set("ondrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndrop: Self = this.set("ondrop", js.undefined)
    
    @scala.inline
    def setOndurationchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("ondurationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndurationchange: Self = this.set("ondurationchange", js.undefined)
    
    @scala.inline
    def setOnemptied(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onemptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnemptied: Self = this.set("onemptied", js.undefined)
    
    @scala.inline
    def setOnended(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MediaStreamErrorEvent, _]): Self = this.set("onended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnended: Self = this.set("onended", js.undefined)
    
    @scala.inline
    def setOnerror(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, _]): Self = this.set("onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnfocus(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, _]): Self = this.set("onfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnfocus: Self = this.set("onfocus", js.undefined)
    
    @scala.inline
    def setOninput(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oninput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOninput: Self = this.set("oninput", js.undefined)
    
    @scala.inline
    def setOninvalid(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("oninvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOninvalid: Self = this.set("oninvalid", js.undefined)
    
    @scala.inline
    def setOnkeydown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = this.set("onkeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnkeydown: Self = this.set("onkeydown", js.undefined)
    
    @scala.inline
    def setOnkeypress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = this.set("onkeypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnkeypress: Self = this.set("onkeypress", js.undefined)
    
    @scala.inline
    def setOnkeyup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, _]): Self = this.set("onkeyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnkeyup: Self = this.set("onkeyup", js.undefined)
    
    @scala.inline
    def setOnload(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    
    @scala.inline
    def setOnloadeddata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onloadeddata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloadeddata: Self = this.set("onloadeddata", js.undefined)
    
    @scala.inline
    def setOnloadedmetadata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onloadedmetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloadedmetadata: Self = this.set("onloadedmetadata", js.undefined)
    
    @scala.inline
    def setOnloadend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onloadend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloadend: Self = this.set("onloadend", js.undefined)
    
    @scala.inline
    def setOnloadstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onloadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloadstart: Self = this.set("onloadstart", js.undefined)
    
    @scala.inline
    def setOnmousedown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmousedown: Self = this.set("onmousedown", js.undefined)
    
    @scala.inline
    def setOnmouseenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseenter: Self = this.set("onmouseenter", js.undefined)
    
    @scala.inline
    def setOnmouseleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseleave: Self = this.set("onmouseleave", js.undefined)
    
    @scala.inline
    def setOnmousemove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmousemove: Self = this.set("onmousemove", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    
    @scala.inline
    def setOnmouseup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, _]): Self = this.set("onmouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseup: Self = this.set("onmouseup", js.undefined)
    
    @scala.inline
    def setOnmousewheel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, _]): Self = this.set("onmousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmousewheel: Self = this.set("onmousewheel", js.undefined)
    
    @scala.inline
    def setOnpaste(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, _]): Self = this.set("onpaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpaste: Self = this.set("onpaste", js.undefined)
    
    @scala.inline
    def setOnpause(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onpause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpause: Self = this.set("onpause", js.undefined)
    
    @scala.inline
    def setOnplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnplay: Self = this.set("onplay", js.undefined)
    
    @scala.inline
    def setOnplaying(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onplaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnplaying: Self = this.set("onplaying", js.undefined)
    
    @scala.inline
    def setOnpointercancel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointercancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointercancel: Self = this.set("onpointercancel", js.undefined)
    
    @scala.inline
    def setOnpointerdown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerdown: Self = this.set("onpointerdown", js.undefined)
    
    @scala.inline
    def setOnpointerenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerenter: Self = this.set("onpointerenter", js.undefined)
    
    @scala.inline
    def setOnpointerleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerleave: Self = this.set("onpointerleave", js.undefined)
    
    @scala.inline
    def setOnpointermove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointermove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointermove: Self = this.set("onpointermove", js.undefined)
    
    @scala.inline
    def setOnpointerout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerout: Self = this.set("onpointerout", js.undefined)
    
    @scala.inline
    def setOnpointerover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerover: Self = this.set("onpointerover", js.undefined)
    
    @scala.inline
    def setOnpointerup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, _]): Self = this.set("onpointerup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerup: Self = this.set("onpointerup", js.undefined)
    
    @scala.inline
    def setOnprogress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent[EventTarget], _]): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    
    @scala.inline
    def setOnratechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onratechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnratechange: Self = this.set("onratechange", js.undefined)
    
    @scala.inline
    def setOnreset(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnreset: Self = this.set("onreset", js.undefined)
    
    @scala.inline
    def setOnscroll(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = this.set("onscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnscroll: Self = this.set("onscroll", js.undefined)
    
    @scala.inline
    def setOnseeked(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onseeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnseeked: Self = this.set("onseeked", js.undefined)
    
    @scala.inline
    def setOnseeking(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onseeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnseeking: Self = this.set("onseeking", js.undefined)
    
    @scala.inline
    def setOnselect(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, _]): Self = this.set("onselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnselect: Self = this.set("onselect", js.undefined)
    
    @scala.inline
    def setOnselectstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onselectstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnselectstart: Self = this.set("onselectstart", js.undefined)
    
    @scala.inline
    def setOnstalled(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnstalled: Self = this.set("onstalled", js.undefined)
    
    @scala.inline
    def setOnsubmit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onsubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnsubmit: Self = this.set("onsubmit", js.undefined)
    
    @scala.inline
    def setOnsuspend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onsuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnsuspend: Self = this.set("onsuspend", js.undefined)
    
    @scala.inline
    def setOntimeupdate(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("ontimeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntimeupdate: Self = this.set("ontimeupdate", js.undefined)
    
    @scala.inline
    def setOnvolumechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onvolumechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnvolumechange: Self = this.set("onvolumechange", js.undefined)
    
    @scala.inline
    def setOnwaiting(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, _]): Self = this.set("onwaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnwaiting: Self = this.set("onwaiting", js.undefined)
    
    @scala.inline
    def setOptimum(value: String): Self = this.set("optimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimum: Self = this.set("optimum", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setReadonly(value: String): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setReversed(value: String): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    
    @scala.inline
    def setRows(value: String): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setRowspan(value: String): Self = this.set("rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowspan: Self = this.set("rowspan", js.undefined)
    
    @scala.inline
    def setSandbox(value: String): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setSpan(value: String): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    
    @scala.inline
    def setSpellcheck(value: String): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setSrcdoc(value: String): Self = this.set("srcdoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcdoc: Self = this.set("srcdoc", js.undefined)
    
    @scala.inline
    def setSrclang(value: String): Self = this.set("srclang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrclang: Self = this.set("srclang", js.undefined)
    
    @scala.inline
    def setSrcset(value: String): Self = this.set("srcset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcset: Self = this.set("srcset", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStep(value: String): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStyle(value: ElementInlineStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabindex(value: String): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypemustmatch(value: String): Self = this.set("typemustmatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypemustmatch: Self = this.set("typemustmatch", js.undefined)
    
    @scala.inline
    def setUsemap(value: String): Self = this.set("usemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsemap: Self = this.set("usemap", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
