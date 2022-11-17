package typings.leaflet.mod

import typings.leaflet.anon.BoundingClientRect
import typings.std.HTMLAnchorElement
import typings.std.HTMLAreaElement
import typings.std.HTMLAudioElement
import typings.std.HTMLBRElement
import typings.std.HTMLBaseElement
import typings.std.HTMLBodyElement
import typings.std.HTMLButtonElement
import typings.std.HTMLCanvasElement
import typings.std.HTMLDListElement
import typings.std.HTMLDataElement
import typings.std.HTMLDataListElement
import typings.std.HTMLDetailsElement
import typings.std.HTMLDialogElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLEmbedElement
import typings.std.HTMLFieldSetElement
import typings.std.HTMLFormElement
import typings.std.HTMLHRElement
import typings.std.HTMLHeadElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLHtmlElement
import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLLabelElement
import typings.std.HTMLLegendElement
import typings.std.HTMLLinkElement
import typings.std.HTMLMapElement
import typings.std.HTMLMenuElement
import typings.std.HTMLMetaElement
import typings.std.HTMLMeterElement
import typings.std.HTMLModElement
import typings.std.HTMLOListElement
import typings.std.HTMLObjectElement
import typings.std.HTMLOptGroupElement
import typings.std.HTMLOptionElement
import typings.std.HTMLOutputElement
import typings.std.HTMLParagraphElement
import typings.std.HTMLPictureElement
import typings.std.HTMLPreElement
import typings.std.HTMLProgressElement
import typings.std.HTMLQuoteElement
import typings.std.HTMLScriptElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSlotElement
import typings.std.HTMLSourceElement
import typings.std.HTMLSpanElement
import typings.std.HTMLStyleElement
import typings.std.HTMLTableCaptionElement
import typings.std.HTMLTableCellElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTemplateElement
import typings.std.HTMLTextAreaElement
import typings.std.HTMLTimeElement
import typings.std.HTMLTitleElement
import typings.std.HTMLTrackElement
import typings.std.HTMLUListElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DomUtil {
  
  @JSImport("leaflet", "DomUtil")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "DomUtil.TRANSFORM")
  @js.native
  def TRANSFORM: String = js.native
  inline def TRANSFORM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSFORM")(x.asInstanceOf[js.Any])
  
  @JSImport("leaflet", "DomUtil.TRANSITION")
  @js.native
  def TRANSITION: String = js.native
  inline def TRANSITION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION")(x.asInstanceOf[js.Any])
  
  @JSImport("leaflet", "DomUtil.TRANSITION_END")
  @js.native
  def TRANSITION_END: String = js.native
  inline def TRANSITION_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_END")(x.asInstanceOf[js.Any])
  
  inline def addClass(el: HTMLElement, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.annotation.targetName("create_samp")
  inline def create(tagName: "samp"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_canvas")
  inline def create(tagName: "canvas"): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  @scala.annotation.targetName("create_h1")
  inline def create(tagName: "h1"): HTMLHeadingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_ol")
  inline def create(tagName: "ol"): HTMLOListElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLOListElement]
  @scala.annotation.targetName("create_html")
  inline def create(tagName: "html"): HTMLHtmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLHtmlElement]
  @scala.annotation.targetName("create_details")
  inline def create(tagName: "details"): HTMLDetailsElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLDetailsElement]
  @scala.annotation.targetName("create_nav")
  inline def create(tagName: "nav"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_area")
  inline def create(tagName: "area"): HTMLAreaElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLAreaElement]
  @scala.annotation.targetName("create_ul")
  inline def create(tagName: "ul"): HTMLUListElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLUListElement]
  @scala.annotation.targetName("create_i")
  inline def create(tagName: "i"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_s")
  inline def create(tagName: "s"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_h3")
  inline def create(tagName: "h3"): HTMLHeadingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_cite")
  inline def create(tagName: "cite"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_main")
  inline def create(tagName: "main"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_address")
  inline def create(tagName: "address"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_audio")
  inline def create(tagName: "audio"): HTMLAudioElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLAudioElement]
  @scala.annotation.targetName("create_strong")
  inline def create(tagName: "strong"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_menu")
  inline def create(tagName: "menu"): HTMLMenuElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLMenuElement]
  @scala.annotation.targetName("create_datalist")
  inline def create(tagName: "datalist"): HTMLDataListElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLDataListElement]
  @scala.annotation.targetName("create_h4")
  inline def create(tagName: "h4"): HTMLHeadingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_progress")
  inline def create(tagName: "progress"): HTMLProgressElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLProgressElement]
  @scala.annotation.targetName("create_head")
  inline def create(tagName: "head"): HTMLHeadElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLHeadElement]
  @scala.annotation.targetName("create_textarea")
  inline def create(tagName: "textarea"): HTMLTextAreaElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTextAreaElement]
  @scala.annotation.targetName("create_col")
  inline def create(tagName: "col"): HTMLTableColElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableColElement]
  @scala.annotation.targetName("create_u")
  inline def create(tagName: "u"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_tr")
  inline def create(tagName: "tr"): HTMLTableRowElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableRowElement]
  /**
    * Creates an HTML element with `tagName`, sets its class to `className`, and optionally appends it to `container` element.
    * @param tagName The name of the tag to create (for example: `div` or `canvas`).
    * @param className The class to set on the created element.
    * @param container The container to append the created element to.
    */
  @scala.annotation.targetName("create_a")
  inline def create(tagName: "a"): HTMLAnchorElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLAnchorElement]
  @scala.annotation.targetName("create_h6")
  inline def create(tagName: "h6"): HTMLHeadingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_b")
  inline def create(tagName: "b"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_em")
  inline def create(tagName: "em"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_meta")
  inline def create(tagName: "meta"): HTMLMetaElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLMetaElement]
  @scala.annotation.targetName("create_link")
  inline def create(tagName: "link"): HTMLLinkElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLLinkElement]
  @scala.annotation.targetName("create_small")
  inline def create(tagName: "small"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_hr")
  inline def create(tagName: "hr"): HTMLHRElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLHRElement]
  @scala.annotation.targetName("create_caption")
  inline def create(tagName: "caption"): HTMLTableCaptionElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableCaptionElement]
  @scala.annotation.targetName("create_h2")
  inline def create(tagName: "h2"): HTMLHeadingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_option")
  inline def create(tagName: "option"): HTMLOptionElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLOptionElement]
  @scala.annotation.targetName("create_wbr")
  inline def create(tagName: "wbr"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_div")
  inline def create(tagName: "div"): HTMLDivElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLDivElement]
  @scala.annotation.targetName("create_picture")
  inline def create(tagName: "picture"): HTMLPictureElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLPictureElement]
  @scala.annotation.targetName("create_pre")
  inline def create(tagName: "pre"): HTMLPreElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLPreElement]
  @scala.annotation.targetName("create_select")
  inline def create(tagName: "select"): HTMLSelectElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLSelectElement]
  @scala.annotation.targetName("create_th")
  inline def create(tagName: "th"): HTMLTableCellElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableCellElement]
  @scala.annotation.targetName("create_figure")
  inline def create(tagName: "figure"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_form")
  inline def create(tagName: "form"): HTMLFormElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLFormElement]
  @scala.annotation.targetName("create_del")
  inline def create(tagName: "del"): HTMLModElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLModElement]
  @scala.annotation.targetName("create_h5")
  inline def create(tagName: "h5"): HTMLHeadingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_bdo")
  inline def create(tagName: "bdo"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_meter")
  inline def create(tagName: "meter"): HTMLMeterElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLMeterElement]
  @scala.annotation.targetName("create_tfoot")
  inline def create(tagName: "tfoot"): HTMLTableSectionElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_sup")
  inline def create(tagName: "sup"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_br")
  inline def create(tagName: "br"): HTMLBRElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLBRElement]
  @scala.annotation.targetName("create_header")
  inline def create(tagName: "header"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_img")
  inline def create(tagName: "img"): HTMLImageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLImageElement]
  @scala.annotation.targetName("create_colgroup")
  inline def create(tagName: "colgroup"): HTMLTableColElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableColElement]
  @scala.annotation.targetName("create_ruby")
  inline def create(tagName: "ruby"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_dialog")
  inline def create(tagName: "dialog"): HTMLDialogElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLDialogElement]
  @scala.annotation.targetName("create_base")
  inline def create(tagName: "base"): HTMLBaseElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLBaseElement]
  @scala.annotation.targetName("create_p")
  inline def create(tagName: "p"): HTMLParagraphElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLParagraphElement]
  @scala.annotation.targetName("create_input")
  inline def create(tagName: "input"): HTMLInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLInputElement]
  @scala.annotation.targetName("create_q")
  inline def create(tagName: "q"): HTMLQuoteElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLQuoteElement]
  @scala.annotation.targetName("create_kbd")
  inline def create(tagName: "kbd"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_fieldset")
  inline def create(tagName: "fieldset"): HTMLFieldSetElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLFieldSetElement]
  @scala.annotation.targetName("create_aside")
  inline def create(tagName: "aside"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_output")
  inline def create(tagName: "output"): HTMLOutputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLOutputElement]
  @scala.annotation.targetName("create_dt")
  inline def create(tagName: "dt"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_dl")
  inline def create(tagName: "dl"): HTMLDListElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLDListElement]
  @scala.annotation.targetName("create_slot")
  inline def create(tagName: "slot"): HTMLSlotElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLSlotElement]
  @scala.annotation.targetName("create_span")
  inline def create(tagName: "span"): HTMLSpanElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLSpanElement]
  @scala.annotation.targetName("create_body")
  inline def create(tagName: "body"): HTMLBodyElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLBodyElement]
  @scala.annotation.targetName("create_bdi")
  inline def create(tagName: "bdi"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_noscript")
  inline def create(tagName: "noscript"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_thead")
  inline def create(tagName: "thead"): HTMLTableSectionElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_footer")
  inline def create(tagName: "footer"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_article")
  inline def create(tagName: "article"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_time")
  inline def create(tagName: "time"): HTMLTimeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTimeElement]
  @scala.annotation.targetName("create_button")
  inline def create(tagName: "button"): HTMLButtonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLButtonElement]
  @scala.annotation.targetName("create_title")
  inline def create(tagName: "title"): HTMLTitleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTitleElement]
  @scala.annotation.targetName("create_var")
  inline def create(tagName: "var"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_track")
  inline def create(tagName: "track"): HTMLTrackElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTrackElement]
  @scala.annotation.targetName("create_script")
  inline def create(tagName: "script"): HTMLScriptElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLScriptElement]
  @scala.annotation.targetName("create_source")
  inline def create(tagName: "source"): HTMLSourceElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLSourceElement]
  @scala.annotation.targetName("create_iframe")
  inline def create(tagName: "iframe"): HTMLIFrameElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLIFrameElement]
  @scala.annotation.targetName("create_data")
  inline def create(tagName: "data"): HTMLDataElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLDataElement]
  @scala.annotation.targetName("create_li")
  inline def create(tagName: "li"): HTMLLIElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLLIElement]
  @scala.annotation.targetName("create_rp")
  inline def create(tagName: "rp"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_section")
  inline def create(tagName: "section"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_dd")
  inline def create(tagName: "dd"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_sub")
  inline def create(tagName: "sub"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_summary")
  inline def create(tagName: "summary"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_mark")
  inline def create(tagName: "mark"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_optgroup")
  inline def create(tagName: "optgroup"): HTMLOptGroupElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLOptGroupElement]
  @scala.annotation.targetName("create_video")
  inline def create(tagName: "video"): HTMLVideoElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLVideoElement]
  @scala.annotation.targetName("create_table")
  inline def create(tagName: "table"): HTMLTableElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableElement]
  @scala.annotation.targetName("create_hgroup")
  inline def create(tagName: "hgroup"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_map")
  inline def create(tagName: "map"): HTMLMapElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLMapElement]
  @scala.annotation.targetName("create_template")
  inline def create(tagName: "template"): HTMLTemplateElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTemplateElement]
  @scala.annotation.targetName("create_ins")
  inline def create(tagName: "ins"): HTMLModElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLModElement]
  @scala.annotation.targetName("create_code")
  inline def create(tagName: "code"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_dfn")
  inline def create(tagName: "dfn"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_abbr")
  inline def create(tagName: "abbr"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_blockquote")
  inline def create(tagName: "blockquote"): HTMLQuoteElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLQuoteElement]
  @scala.annotation.targetName("create_label")
  inline def create(tagName: "label"): HTMLLabelElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLLabelElement]
  @scala.annotation.targetName("create_legend")
  inline def create(tagName: "legend"): HTMLLegendElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLLegendElement]
  @scala.annotation.targetName("create_embed")
  inline def create(tagName: "embed"): HTMLEmbedElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLEmbedElement]
  @scala.annotation.targetName("create_tbody")
  inline def create(tagName: "tbody"): HTMLTableSectionElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_object")
  inline def create(tagName: "object"): HTMLObjectElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLObjectElement]
  @scala.annotation.targetName("create_figcaption")
  inline def create(tagName: "figcaption"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_style")
  inline def create(tagName: "style"): HTMLStyleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLStyleElement]
  @scala.annotation.targetName("create_rt")
  inline def create(tagName: "rt"): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_td")
  inline def create(tagName: "td"): HTMLTableCellElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLTableCellElement]
  @scala.annotation.targetName("create_h1")
  inline def create(tagName: "h1", className: String): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_samp")
  inline def create(tagName: "samp", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_sup")
  inline def create(tagName: "sup", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_link")
  inline def create(tagName: "link", className: String): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  @scala.annotation.targetName("create_template")
  inline def create(tagName: "template", className: String): HTMLTemplateElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTemplateElement]
  @scala.annotation.targetName("create_input")
  inline def create(tagName: "input", className: String): HTMLInputElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLInputElement]
  @scala.annotation.targetName("create_head")
  inline def create(tagName: "head", className: String): HTMLHeadElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadElement]
  @scala.annotation.targetName("create_aside")
  inline def create(tagName: "aside", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_source")
  inline def create(tagName: "source", className: String): HTMLSourceElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLSourceElement]
  @scala.annotation.targetName("create_rp")
  inline def create(tagName: "rp", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_hgroup")
  inline def create(tagName: "hgroup", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_h2")
  inline def create(tagName: "h2", className: String): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_colgroup")
  inline def create(tagName: "colgroup", className: String): HTMLTableColElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableColElement]
  @scala.annotation.targetName("create_main")
  inline def create(tagName: "main", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_figcaption")
  inline def create(tagName: "figcaption", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_b")
  inline def create(tagName: "b", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_track")
  inline def create(tagName: "track", className: String): HTMLTrackElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTrackElement]
  @scala.annotation.targetName("create_legend")
  inline def create(tagName: "legend", className: String): HTMLLegendElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLLegendElement]
  @scala.annotation.targetName("create_slot")
  inline def create(tagName: "slot", className: String): HTMLSlotElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLSlotElement]
  @scala.annotation.targetName("create_bdo")
  inline def create(tagName: "bdo", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_abbr")
  inline def create(tagName: "abbr", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_label")
  inline def create(tagName: "label", className: String): HTMLLabelElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLLabelElement]
  @scala.annotation.targetName("create_td")
  inline def create(tagName: "td", className: String): HTMLTableCellElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCellElement]
  @scala.annotation.targetName("create_embed")
  inline def create(tagName: "embed", className: String): HTMLEmbedElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLEmbedElement]
  @scala.annotation.targetName("create_h6")
  inline def create(tagName: "h6", className: String): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_title")
  inline def create(tagName: "title", className: String): HTMLTitleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTitleElement]
  @scala.annotation.targetName("create_dialog")
  inline def create(tagName: "dialog", className: String): HTMLDialogElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLDialogElement]
  @scala.annotation.targetName("create_form")
  inline def create(tagName: "form", className: String): HTMLFormElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLFormElement]
  @scala.annotation.targetName("create_data")
  inline def create(tagName: "data", className: String): HTMLDataElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLDataElement]
  @scala.annotation.targetName("create_caption")
  inline def create(tagName: "caption", className: String): HTMLTableCaptionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCaptionElement]
  @scala.annotation.targetName("create_p")
  inline def create(tagName: "p", className: String): HTMLParagraphElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLParagraphElement]
  @scala.annotation.targetName("create_dd")
  inline def create(tagName: "dd", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_style")
  inline def create(tagName: "style", className: String): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  @scala.annotation.targetName("create_audio")
  inline def create(tagName: "audio", className: String): HTMLAudioElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLAudioElement]
  @scala.annotation.targetName("create_blockquote")
  inline def create(tagName: "blockquote", className: String): HTMLQuoteElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLQuoteElement]
  @scala.annotation.targetName("create_del")
  inline def create(tagName: "del", className: String): HTMLModElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLModElement]
  @scala.annotation.targetName("create_section")
  inline def create(tagName: "section", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_table")
  inline def create(tagName: "table", className: String): HTMLTableElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableElement]
  @scala.annotation.targetName("create_tfoot")
  inline def create(tagName: "tfoot", className: String): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_s")
  inline def create(tagName: "s", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_h3")
  inline def create(tagName: "h3", className: String): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_wbr")
  inline def create(tagName: "wbr", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_var")
  inline def create(tagName: "var", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_sub")
  inline def create(tagName: "sub", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_rt")
  inline def create(tagName: "rt", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_a")
  inline def create(tagName: "a", className: String): HTMLAnchorElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLAnchorElement]
  @scala.annotation.targetName("create_canvas")
  inline def create(tagName: "canvas", className: String): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  @scala.annotation.targetName("create_bdi")
  inline def create(tagName: "bdi", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_meta")
  inline def create(tagName: "meta", className: String): HTMLMetaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLMetaElement]
  @scala.annotation.targetName("create_footer")
  inline def create(tagName: "footer", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_pre")
  inline def create(tagName: "pre", className: String): HTMLPreElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLPreElement]
  @scala.annotation.targetName("create_iframe")
  inline def create(tagName: "iframe", className: String): HTMLIFrameElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLIFrameElement]
  @scala.annotation.targetName("create_tbody")
  inline def create(tagName: "tbody", className: String): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_cite")
  inline def create(tagName: "cite", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_hr")
  inline def create(tagName: "hr", className: String): HTMLHRElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLHRElement]
  @scala.annotation.targetName("create_div")
  inline def create(tagName: "div", className: String): HTMLDivElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLDivElement]
  @scala.annotation.targetName("create_object")
  inline def create(tagName: "object", className: String): HTMLObjectElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLObjectElement]
  @scala.annotation.targetName("create_option")
  inline def create(tagName: "option", className: String): HTMLOptionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLOptionElement]
  @scala.annotation.targetName("create_dt")
  inline def create(tagName: "dt", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_summary")
  inline def create(tagName: "summary", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_li")
  inline def create(tagName: "li", className: String): HTMLLIElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLLIElement]
  @scala.annotation.targetName("create_address")
  inline def create(tagName: "address", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_i")
  inline def create(tagName: "i", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_col")
  inline def create(tagName: "col", className: String): HTMLTableColElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableColElement]
  @scala.annotation.targetName("create_noscript")
  inline def create(tagName: "noscript", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_strong")
  inline def create(tagName: "strong", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_nav")
  inline def create(tagName: "nav", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_base")
  inline def create(tagName: "base", className: String): HTMLBaseElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLBaseElement]
  @scala.annotation.targetName("create_tr")
  inline def create(tagName: "tr", className: String): HTMLTableRowElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableRowElement]
  @scala.annotation.targetName("create_html")
  inline def create(tagName: "html", className: String): HTMLHtmlElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLHtmlElement]
  @scala.annotation.targetName("create_u")
  inline def create(tagName: "u", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_textarea")
  inline def create(tagName: "textarea", className: String): HTMLTextAreaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTextAreaElement]
  @scala.annotation.targetName("create_article")
  inline def create(tagName: "article", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_kbd")
  inline def create(tagName: "kbd", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_header")
  inline def create(tagName: "header", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_ruby")
  inline def create(tagName: "ruby", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_em")
  inline def create(tagName: "em", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_mark")
  inline def create(tagName: "mark", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_h5")
  inline def create(tagName: "h5", className: String): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_datalist")
  inline def create(tagName: "datalist", className: String): HTMLDataListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLDataListElement]
  @scala.annotation.targetName("create_fieldset")
  inline def create(tagName: "fieldset", className: String): HTMLFieldSetElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLFieldSetElement]
  @scala.annotation.targetName("create_select")
  inline def create(tagName: "select", className: String): HTMLSelectElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLSelectElement]
  @scala.annotation.targetName("create_dl")
  inline def create(tagName: "dl", className: String): HTMLDListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLDListElement]
  @scala.annotation.targetName("create_dfn")
  inline def create(tagName: "dfn", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_ins")
  inline def create(tagName: "ins", className: String): HTMLModElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLModElement]
  @scala.annotation.targetName("create_h4")
  inline def create(tagName: "h4", className: String): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_img")
  inline def create(tagName: "img", className: String): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  @scala.annotation.targetName("create_video")
  inline def create(tagName: "video", className: String): HTMLVideoElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLVideoElement]
  @scala.annotation.targetName("create_map")
  inline def create(tagName: "map", className: String): HTMLMapElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLMapElement]
  @scala.annotation.targetName("create_time")
  inline def create(tagName: "time", className: String): HTMLTimeElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTimeElement]
  @scala.annotation.targetName("create_menu")
  inline def create(tagName: "menu", className: String): HTMLMenuElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLMenuElement]
  @scala.annotation.targetName("create_output")
  inline def create(tagName: "output", className: String): HTMLOutputElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLOutputElement]
  @scala.annotation.targetName("create_progress")
  inline def create(tagName: "progress", className: String): HTMLProgressElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLProgressElement]
  @scala.annotation.targetName("create_button")
  inline def create(tagName: "button", className: String): HTMLButtonElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLButtonElement]
  @scala.annotation.targetName("create_picture")
  inline def create(tagName: "picture", className: String): HTMLPictureElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLPictureElement]
  @scala.annotation.targetName("create_th")
  inline def create(tagName: "th", className: String): HTMLTableCellElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCellElement]
  @scala.annotation.targetName("create_ol")
  inline def create(tagName: "ol", className: String): HTMLOListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLOListElement]
  @scala.annotation.targetName("create_optgroup")
  inline def create(tagName: "optgroup", className: String): HTMLOptGroupElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLOptGroupElement]
  @scala.annotation.targetName("create_ul")
  inline def create(tagName: "ul", className: String): HTMLUListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLUListElement]
  @scala.annotation.targetName("create_figure")
  inline def create(tagName: "figure", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_area")
  inline def create(tagName: "area", className: String): HTMLAreaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLAreaElement]
  @scala.annotation.targetName("create_meter")
  inline def create(tagName: "meter", className: String): HTMLMeterElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLMeterElement]
  @scala.annotation.targetName("create_q")
  inline def create(tagName: "q", className: String): HTMLQuoteElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLQuoteElement]
  @scala.annotation.targetName("create_thead")
  inline def create(tagName: "thead", className: String): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_small")
  inline def create(tagName: "small", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_body")
  inline def create(tagName: "body", className: String): HTMLBodyElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLBodyElement]
  @scala.annotation.targetName("create_br")
  inline def create(tagName: "br", className: String): HTMLBRElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLBRElement]
  @scala.annotation.targetName("create_details")
  inline def create(tagName: "details", className: String): HTMLDetailsElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLDetailsElement]
  @scala.annotation.targetName("create_script")
  inline def create(tagName: "script", className: String): HTMLScriptElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLScriptElement]
  @scala.annotation.targetName("create_code")
  inline def create(tagName: "code", className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_span")
  inline def create(tagName: "span", className: String): HTMLSpanElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLSpanElement]
  @scala.annotation.targetName("create_track")
  inline def create(tagName: "track", className: String, container: HTMLElement): HTMLTrackElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTrackElement]
  @scala.annotation.targetName("create_template")
  inline def create(tagName: "template", className: String, container: HTMLElement): HTMLTemplateElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTemplateElement]
  @scala.annotation.targetName("create_address")
  inline def create(tagName: "address", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_slot")
  inline def create(tagName: "slot", className: String, container: HTMLElement): HTMLSlotElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLSlotElement]
  @scala.annotation.targetName("create_style")
  inline def create(tagName: "style", className: String, container: HTMLElement): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  @scala.annotation.targetName("create_table")
  inline def create(tagName: "table", className: String, container: HTMLElement): HTMLTableElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableElement]
  @scala.annotation.targetName("create_title")
  inline def create(tagName: "title", className: String, container: HTMLElement): HTMLTitleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTitleElement]
  @scala.annotation.targetName("create_video")
  inline def create(tagName: "video", className: String, container: HTMLElement): HTMLVideoElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLVideoElement]
  @scala.annotation.targetName("create_datalist")
  inline def create(tagName: "datalist", className: String, container: HTMLElement): HTMLDataListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDataListElement]
  @scala.annotation.targetName("create_meter")
  inline def create(tagName: "meter", className: String, container: HTMLElement): HTMLMeterElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLMeterElement]
  @scala.annotation.targetName("create_section")
  inline def create(tagName: "section", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_samp")
  inline def create(tagName: "samp", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_h2")
  inline def create(tagName: "h2", className: String, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_code")
  inline def create(tagName: "code", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_rt")
  inline def create(tagName: "rt", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_col")
  inline def create(tagName: "col", className: String, container: HTMLElement): HTMLTableColElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableColElement]
  @scala.annotation.targetName("create_sub")
  inline def create(tagName: "sub", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_source")
  inline def create(tagName: "source", className: String, container: HTMLElement): HTMLSourceElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLSourceElement]
  @scala.annotation.targetName("create_tbody")
  inline def create(tagName: "tbody", className: String, container: HTMLElement): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_details")
  inline def create(tagName: "details", className: String, container: HTMLElement): HTMLDetailsElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDetailsElement]
  @scala.annotation.targetName("create_strong")
  inline def create(tagName: "strong", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_aside")
  inline def create(tagName: "aside", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_base")
  inline def create(tagName: "base", className: String, container: HTMLElement): HTMLBaseElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLBaseElement]
  @scala.annotation.targetName("create_h5")
  inline def create(tagName: "h5", className: String, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_output")
  inline def create(tagName: "output", className: String, container: HTMLElement): HTMLOutputElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLOutputElement]
  @scala.annotation.targetName("create_ruby")
  inline def create(tagName: "ruby", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_h3")
  inline def create(tagName: "h3", className: String, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_select")
  inline def create(tagName: "select", className: String, container: HTMLElement): HTMLSelectElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLSelectElement]
  @scala.annotation.targetName("create_embed")
  inline def create(tagName: "embed", className: String, container: HTMLElement): HTMLEmbedElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLEmbedElement]
  @scala.annotation.targetName("create_sup")
  inline def create(tagName: "sup", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_div")
  inline def create(tagName: "div", className: String, container: HTMLElement): HTMLDivElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDivElement]
  @scala.annotation.targetName("create_input")
  inline def create(tagName: "input", className: String, container: HTMLElement): HTMLInputElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLInputElement]
  @scala.annotation.targetName("create_optgroup")
  inline def create(tagName: "optgroup", className: String, container: HTMLElement): HTMLOptGroupElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLOptGroupElement]
  @scala.annotation.targetName("create_hgroup")
  inline def create(tagName: "hgroup", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_footer")
  inline def create(tagName: "footer", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_script")
  inline def create(tagName: "script", className: String, container: HTMLElement): HTMLScriptElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLScriptElement]
  @scala.annotation.targetName("create_form")
  inline def create(tagName: "form", className: String, container: HTMLElement): HTMLFormElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLFormElement]
  @scala.annotation.targetName("create_legend")
  inline def create(tagName: "legend", className: String, container: HTMLElement): HTMLLegendElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLLegendElement]
  @scala.annotation.targetName("create_header")
  inline def create(tagName: "header", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_caption")
  inline def create(tagName: "caption", className: String, container: HTMLElement): HTMLTableCaptionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCaptionElement]
  @scala.annotation.targetName("create_h1")
  inline def create(tagName: "h1", className: String, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_option")
  inline def create(tagName: "option", className: String, container: HTMLElement): HTMLOptionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLOptionElement]
  @scala.annotation.targetName("create_var")
  inline def create(tagName: "var", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_bdo")
  inline def create(tagName: "bdo", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_menu")
  inline def create(tagName: "menu", className: String, container: HTMLElement): HTMLMenuElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLMenuElement]
  @scala.annotation.targetName("create_canvas")
  inline def create(tagName: "canvas", className: String, container: HTMLElement): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  @scala.annotation.targetName("create_object")
  inline def create(tagName: "object", className: String, container: HTMLElement): HTMLObjectElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLObjectElement]
  @scala.annotation.targetName("create_s")
  inline def create(tagName: "s", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_tfoot")
  inline def create(tagName: "tfoot", className: String, container: HTMLElement): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_html")
  inline def create(tagName: "html", className: String, container: HTMLElement): HTMLHtmlElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHtmlElement]
  @scala.annotation.targetName("create_dt")
  inline def create(tagName: "dt", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_mark")
  inline def create(tagName: "mark", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_article")
  inline def create(tagName: "article", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_img")
  inline def create(tagName: "img", className: String, container: HTMLElement): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  @scala.annotation.targetName("create_ul")
  inline def create(tagName: "ul", className: String, container: HTMLElement): HTMLUListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLUListElement]
  @scala.annotation.targetName("create_q")
  inline def create(tagName: "q", className: String, container: HTMLElement): HTMLQuoteElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLQuoteElement]
  @scala.annotation.targetName("create_colgroup")
  inline def create(tagName: "colgroup", className: String, container: HTMLElement): HTMLTableColElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableColElement]
  @scala.annotation.targetName("create_iframe")
  inline def create(tagName: "iframe", className: String, container: HTMLElement): HTMLIFrameElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLIFrameElement]
  @scala.annotation.targetName("create_label")
  inline def create(tagName: "label", className: String, container: HTMLElement): HTMLLabelElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLLabelElement]
  @scala.annotation.targetName("create_h6")
  inline def create(tagName: "h6", className: String, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_body")
  inline def create(tagName: "body", className: String, container: HTMLElement): HTMLBodyElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLBodyElement]
  @scala.annotation.targetName("create_dialog")
  inline def create(tagName: "dialog", className: String, container: HTMLElement): HTMLDialogElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDialogElement]
  @scala.annotation.targetName("create_head")
  inline def create(tagName: "head", className: String, container: HTMLElement): HTMLHeadElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadElement]
  @scala.annotation.targetName("create_fieldset")
  inline def create(tagName: "fieldset", className: String, container: HTMLElement): HTMLFieldSetElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLFieldSetElement]
  @scala.annotation.targetName("create_button")
  inline def create(tagName: "button", className: String, container: HTMLElement): HTMLButtonElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLButtonElement]
  @scala.annotation.targetName("create_li")
  inline def create(tagName: "li", className: String, container: HTMLElement): HTMLLIElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLLIElement]
  @scala.annotation.targetName("create_del")
  inline def create(tagName: "del", className: String, container: HTMLElement): HTMLModElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLModElement]
  @scala.annotation.targetName("create_blockquote")
  inline def create(tagName: "blockquote", className: String, container: HTMLElement): HTMLQuoteElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLQuoteElement]
  @scala.annotation.targetName("create_main")
  inline def create(tagName: "main", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_b")
  inline def create(tagName: "b", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_dfn")
  inline def create(tagName: "dfn", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_rp")
  inline def create(tagName: "rp", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_data")
  inline def create(tagName: "data", className: String, container: HTMLElement): HTMLDataElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDataElement]
  @scala.annotation.targetName("create_link")
  inline def create(tagName: "link", className: String, container: HTMLElement): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  @scala.annotation.targetName("create_em")
  inline def create(tagName: "em", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_map")
  inline def create(tagName: "map", className: String, container: HTMLElement): HTMLMapElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLMapElement]
  @scala.annotation.targetName("create_br")
  inline def create(tagName: "br", className: String, container: HTMLElement): HTMLBRElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLBRElement]
  @scala.annotation.targetName("create_pre")
  inline def create(tagName: "pre", className: String, container: HTMLElement): HTMLPreElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLPreElement]
  @scala.annotation.targetName("create_meta")
  inline def create(tagName: "meta", className: String, container: HTMLElement): HTMLMetaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLMetaElement]
  @scala.annotation.targetName("create_span")
  inline def create(tagName: "span", className: String, container: HTMLElement): HTMLSpanElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLSpanElement]
  @scala.annotation.targetName("create_textarea")
  inline def create(tagName: "textarea", className: String, container: HTMLElement): HTMLTextAreaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTextAreaElement]
  @scala.annotation.targetName("create_summary")
  inline def create(tagName: "summary", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_hr")
  inline def create(tagName: "hr", className: String, container: HTMLElement): HTMLHRElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHRElement]
  @scala.annotation.targetName("create_wbr")
  inline def create(tagName: "wbr", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_th")
  inline def create(tagName: "th", className: String, container: HTMLElement): HTMLTableCellElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCellElement]
  @scala.annotation.targetName("create_i")
  inline def create(tagName: "i", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_figcaption")
  inline def create(tagName: "figcaption", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_dl")
  inline def create(tagName: "dl", className: String, container: HTMLElement): HTMLDListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDListElement]
  @scala.annotation.targetName("create_td")
  inline def create(tagName: "td", className: String, container: HTMLElement): HTMLTableCellElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCellElement]
  @scala.annotation.targetName("create_area")
  inline def create(tagName: "area", className: String, container: HTMLElement): HTMLAreaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLAreaElement]
  @scala.annotation.targetName("create_u")
  inline def create(tagName: "u", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_h4")
  inline def create(tagName: "h4", className: String, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_audio")
  inline def create(tagName: "audio", className: String, container: HTMLElement): HTMLAudioElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLAudioElement]
  @scala.annotation.targetName("create_p")
  inline def create(tagName: "p", className: String, container: HTMLElement): HTMLParagraphElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLParagraphElement]
  @scala.annotation.targetName("create_bdi")
  inline def create(tagName: "bdi", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_noscript")
  inline def create(tagName: "noscript", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_time")
  inline def create(tagName: "time", className: String, container: HTMLElement): HTMLTimeElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTimeElement]
  @scala.annotation.targetName("create_picture")
  inline def create(tagName: "picture", className: String, container: HTMLElement): HTMLPictureElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLPictureElement]
  @scala.annotation.targetName("create_tr")
  inline def create(tagName: "tr", className: String, container: HTMLElement): HTMLTableRowElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableRowElement]
  @scala.annotation.targetName("create_abbr")
  inline def create(tagName: "abbr", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_cite")
  inline def create(tagName: "cite", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_small")
  inline def create(tagName: "small", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_ins")
  inline def create(tagName: "ins", className: String, container: HTMLElement): HTMLModElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLModElement]
  @scala.annotation.targetName("create_figure")
  inline def create(tagName: "figure", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_a")
  inline def create(tagName: "a", className: String, container: HTMLElement): HTMLAnchorElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLAnchorElement]
  @scala.annotation.targetName("create_thead")
  inline def create(tagName: "thead", className: String, container: HTMLElement): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_progress")
  inline def create(tagName: "progress", className: String, container: HTMLElement): HTMLProgressElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLProgressElement]
  @scala.annotation.targetName("create_dd")
  inline def create(tagName: "dd", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_nav")
  inline def create(tagName: "nav", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_ol")
  inline def create(tagName: "ol", className: String, container: HTMLElement): HTMLOListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLOListElement]
  @scala.annotation.targetName("create_kbd")
  inline def create(tagName: "kbd", className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_kbd")
  inline def create(tagName: "kbd", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_summary")
  inline def create(tagName: "summary", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_hr")
  inline def create(tagName: "hr", className: Unit, container: HTMLElement): HTMLHRElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHRElement]
  @scala.annotation.targetName("create_noscript")
  inline def create(tagName: "noscript", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_dfn")
  inline def create(tagName: "dfn", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_tbody")
  inline def create(tagName: "tbody", className: Unit, container: HTMLElement): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_link")
  inline def create(tagName: "link", className: Unit, container: HTMLElement): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  @scala.annotation.targetName("create_details")
  inline def create(tagName: "details", className: Unit, container: HTMLElement): HTMLDetailsElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDetailsElement]
  @scala.annotation.targetName("create_h5")
  inline def create(tagName: "h5", className: Unit, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_optgroup")
  inline def create(tagName: "optgroup", className: Unit, container: HTMLElement): HTMLOptGroupElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLOptGroupElement]
  @scala.annotation.targetName("create_s")
  inline def create(tagName: "s", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_base")
  inline def create(tagName: "base", className: Unit, container: HTMLElement): HTMLBaseElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLBaseElement]
  @scala.annotation.targetName("create_select")
  inline def create(tagName: "select", className: Unit, container: HTMLElement): HTMLSelectElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLSelectElement]
  @scala.annotation.targetName("create_object")
  inline def create(tagName: "object", className: Unit, container: HTMLElement): HTMLObjectElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLObjectElement]
  @scala.annotation.targetName("create_label")
  inline def create(tagName: "label", className: Unit, container: HTMLElement): HTMLLabelElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLLabelElement]
  @scala.annotation.targetName("create_del")
  inline def create(tagName: "del", className: Unit, container: HTMLElement): HTMLModElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLModElement]
  @scala.annotation.targetName("create_header")
  inline def create(tagName: "header", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_bdo")
  inline def create(tagName: "bdo", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_div")
  inline def create(tagName: "div", className: Unit, container: HTMLElement): HTMLDivElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDivElement]
  @scala.annotation.targetName("create_area")
  inline def create(tagName: "area", className: Unit, container: HTMLElement): HTMLAreaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLAreaElement]
  @scala.annotation.targetName("create_legend")
  inline def create(tagName: "legend", className: Unit, container: HTMLElement): HTMLLegendElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLLegendElement]
  @scala.annotation.targetName("create_script")
  inline def create(tagName: "script", className: Unit, container: HTMLElement): HTMLScriptElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLScriptElement]
  @scala.annotation.targetName("create_th")
  inline def create(tagName: "th", className: Unit, container: HTMLElement): HTMLTableCellElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCellElement]
  @scala.annotation.targetName("create_code")
  inline def create(tagName: "code", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_ins")
  inline def create(tagName: "ins", className: Unit, container: HTMLElement): HTMLModElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLModElement]
  @scala.annotation.targetName("create_td")
  inline def create(tagName: "td", className: Unit, container: HTMLElement): HTMLTableCellElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCellElement]
  @scala.annotation.targetName("create_sup")
  inline def create(tagName: "sup", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_hgroup")
  inline def create(tagName: "hgroup", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_rt")
  inline def create(tagName: "rt", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_i")
  inline def create(tagName: "i", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_h2")
  inline def create(tagName: "h2", className: Unit, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_option")
  inline def create(tagName: "option", className: Unit, container: HTMLElement): HTMLOptionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLOptionElement]
  @scala.annotation.targetName("create_source")
  inline def create(tagName: "source", className: Unit, container: HTMLElement): HTMLSourceElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLSourceElement]
  @scala.annotation.targetName("create_picture")
  inline def create(tagName: "picture", className: Unit, container: HTMLElement): HTMLPictureElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLPictureElement]
  @scala.annotation.targetName("create_pre")
  inline def create(tagName: "pre", className: Unit, container: HTMLElement): HTMLPreElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLPreElement]
  @scala.annotation.targetName("create_map")
  inline def create(tagName: "map", className: Unit, container: HTMLElement): HTMLMapElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLMapElement]
  @scala.annotation.targetName("create_dialog")
  inline def create(tagName: "dialog", className: Unit, container: HTMLElement): HTMLDialogElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDialogElement]
  @scala.annotation.targetName("create_meta")
  inline def create(tagName: "meta", className: Unit, container: HTMLElement): HTMLMetaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLMetaElement]
  @scala.annotation.targetName("create_var")
  inline def create(tagName: "var", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_canvas")
  inline def create(tagName: "canvas", className: Unit, container: HTMLElement): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  @scala.annotation.targetName("create_h3")
  inline def create(tagName: "h3", className: Unit, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_footer")
  inline def create(tagName: "footer", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_style")
  inline def create(tagName: "style", className: Unit, container: HTMLElement): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  @scala.annotation.targetName("create_menu")
  inline def create(tagName: "menu", className: Unit, container: HTMLElement): HTMLMenuElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLMenuElement]
  @scala.annotation.targetName("create_h1")
  inline def create(tagName: "h1", className: Unit, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_samp")
  inline def create(tagName: "samp", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_b")
  inline def create(tagName: "b", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_a")
  inline def create(tagName: "a", className: Unit, container: HTMLElement): HTMLAnchorElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLAnchorElement]
  @scala.annotation.targetName("create_html")
  inline def create(tagName: "html", className: Unit, container: HTMLElement): HTMLHtmlElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHtmlElement]
  @scala.annotation.targetName("create_button")
  inline def create(tagName: "button", className: Unit, container: HTMLElement): HTMLButtonElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLButtonElement]
  @scala.annotation.targetName("create_col")
  inline def create(tagName: "col", className: Unit, container: HTMLElement): HTMLTableColElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableColElement]
  @scala.annotation.targetName("create_abbr")
  inline def create(tagName: "abbr", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_title")
  inline def create(tagName: "title", className: Unit, container: HTMLElement): HTMLTitleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTitleElement]
  @scala.annotation.targetName("create_caption")
  inline def create(tagName: "caption", className: Unit, container: HTMLElement): HTMLTableCaptionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableCaptionElement]
  @scala.annotation.targetName("create_li")
  inline def create(tagName: "li", className: Unit, container: HTMLElement): HTMLLIElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLLIElement]
  @scala.annotation.targetName("create_time")
  inline def create(tagName: "time", className: Unit, container: HTMLElement): HTMLTimeElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTimeElement]
  @scala.annotation.targetName("create_tr")
  inline def create(tagName: "tr", className: Unit, container: HTMLElement): HTMLTableRowElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableRowElement]
  @scala.annotation.targetName("create_bdi")
  inline def create(tagName: "bdi", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_address")
  inline def create(tagName: "address", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_mark")
  inline def create(tagName: "mark", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_tfoot")
  inline def create(tagName: "tfoot", className: Unit, container: HTMLElement): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_video")
  inline def create(tagName: "video", className: Unit, container: HTMLElement): HTMLVideoElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLVideoElement]
  @scala.annotation.targetName("create_section")
  inline def create(tagName: "section", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_textarea")
  inline def create(tagName: "textarea", className: Unit, container: HTMLElement): HTMLTextAreaElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTextAreaElement]
  @scala.annotation.targetName("create_thead")
  inline def create(tagName: "thead", className: Unit, container: HTMLElement): HTMLTableSectionElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableSectionElement]
  @scala.annotation.targetName("create_head")
  inline def create(tagName: "head", className: Unit, container: HTMLElement): HTMLHeadElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadElement]
  @scala.annotation.targetName("create_br")
  inline def create(tagName: "br", className: Unit, container: HTMLElement): HTMLBRElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLBRElement]
  @scala.annotation.targetName("create_article")
  inline def create(tagName: "article", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_h4")
  inline def create(tagName: "h4", className: Unit, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_ol")
  inline def create(tagName: "ol", className: Unit, container: HTMLElement): HTMLOListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLOListElement]
  @scala.annotation.targetName("create_img")
  inline def create(tagName: "img", className: Unit, container: HTMLElement): HTMLImageElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLImageElement]
  @scala.annotation.targetName("create_slot")
  inline def create(tagName: "slot", className: Unit, container: HTMLElement): HTMLSlotElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLSlotElement]
  @scala.annotation.targetName("create_embed")
  inline def create(tagName: "embed", className: Unit, container: HTMLElement): HTMLEmbedElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLEmbedElement]
  @scala.annotation.targetName("create_figcaption")
  inline def create(tagName: "figcaption", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_output")
  inline def create(tagName: "output", className: Unit, container: HTMLElement): HTMLOutputElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLOutputElement]
  @scala.annotation.targetName("create_input")
  inline def create(tagName: "input", className: Unit, container: HTMLElement): HTMLInputElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLInputElement]
  @scala.annotation.targetName("create_track")
  inline def create(tagName: "track", className: Unit, container: HTMLElement): HTMLTrackElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTrackElement]
  @scala.annotation.targetName("create_nav")
  inline def create(tagName: "nav", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_iframe")
  inline def create(tagName: "iframe", className: Unit, container: HTMLElement): HTMLIFrameElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLIFrameElement]
  @scala.annotation.targetName("create_em")
  inline def create(tagName: "em", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_u")
  inline def create(tagName: "u", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_wbr")
  inline def create(tagName: "wbr", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_dt")
  inline def create(tagName: "dt", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_datalist")
  inline def create(tagName: "datalist", className: Unit, container: HTMLElement): HTMLDataListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDataListElement]
  @scala.annotation.targetName("create_dd")
  inline def create(tagName: "dd", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_table")
  inline def create(tagName: "table", className: Unit, container: HTMLElement): HTMLTableElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableElement]
  @scala.annotation.targetName("create_aside")
  inline def create(tagName: "aside", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_sub")
  inline def create(tagName: "sub", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_dl")
  inline def create(tagName: "dl", className: Unit, container: HTMLElement): HTMLDListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDListElement]
  @scala.annotation.targetName("create_ruby")
  inline def create(tagName: "ruby", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_strong")
  inline def create(tagName: "strong", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_data")
  inline def create(tagName: "data", className: Unit, container: HTMLElement): HTMLDataElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLDataElement]
  @scala.annotation.targetName("create_h6")
  inline def create(tagName: "h6", className: Unit, container: HTMLElement): HTMLHeadingElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLHeadingElement]
  @scala.annotation.targetName("create_cite")
  inline def create(tagName: "cite", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_progress")
  inline def create(tagName: "progress", className: Unit, container: HTMLElement): HTMLProgressElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLProgressElement]
  @scala.annotation.targetName("create_rp")
  inline def create(tagName: "rp", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_colgroup")
  inline def create(tagName: "colgroup", className: Unit, container: HTMLElement): HTMLTableColElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTableColElement]
  @scala.annotation.targetName("create_p")
  inline def create(tagName: "p", className: Unit, container: HTMLElement): HTMLParagraphElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLParagraphElement]
  @scala.annotation.targetName("create_body")
  inline def create(tagName: "body", className: Unit, container: HTMLElement): HTMLBodyElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLBodyElement]
  @scala.annotation.targetName("create_small")
  inline def create(tagName: "small", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_fieldset")
  inline def create(tagName: "fieldset", className: Unit, container: HTMLElement): HTMLFieldSetElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLFieldSetElement]
  @scala.annotation.targetName("create_template")
  inline def create(tagName: "template", className: Unit, container: HTMLElement): HTMLTemplateElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLTemplateElement]
  @scala.annotation.targetName("create_span")
  inline def create(tagName: "span", className: Unit, container: HTMLElement): HTMLSpanElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLSpanElement]
  @scala.annotation.targetName("create_ul")
  inline def create(tagName: "ul", className: Unit, container: HTMLElement): HTMLUListElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLUListElement]
  @scala.annotation.targetName("create_meter")
  inline def create(tagName: "meter", className: Unit, container: HTMLElement): HTMLMeterElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLMeterElement]
  @scala.annotation.targetName("create_audio")
  inline def create(tagName: "audio", className: Unit, container: HTMLElement): HTMLAudioElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLAudioElement]
  @scala.annotation.targetName("create_blockquote")
  inline def create(tagName: "blockquote", className: Unit, container: HTMLElement): HTMLQuoteElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLQuoteElement]
  @scala.annotation.targetName("create_q")
  inline def create(tagName: "q", className: Unit, container: HTMLElement): HTMLQuoteElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLQuoteElement]
  @scala.annotation.targetName("create_figure")
  inline def create(tagName: "figure", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_main")
  inline def create(tagName: "main", className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  @scala.annotation.targetName("create_form")
  inline def create(tagName: "form", className: Unit, container: HTMLElement): HTMLFormElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLFormElement]
  inline def create(tagName: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def create(tagName: String, className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def create(tagName: String, className: String, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def create(tagName: String, className: Unit, container: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  inline def disableImageDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableImageDrag")().asInstanceOf[Unit]
  
  inline def disableTextSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableTextSelection")().asInstanceOf[Unit]
  
  inline def empty(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableImageDrag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableImageDrag")().asInstanceOf[Unit]
  
  inline def enableTextSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableTextSelection")().asInstanceOf[Unit]
  
  /**
    * Get Element by its ID or with the given HTML-Element
    */
  inline def get(element: String): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  inline def get(element: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def getClass_(el: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPosition(el: HTMLElement): Point_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(el.asInstanceOf[js.Any]).asInstanceOf[Point_]
  
  inline def getScale(el: HTMLElement): BoundingClientRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(el.asInstanceOf[js.Any]).asInstanceOf[BoundingClientRect]
  
  inline def getSizedParentNode(el: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizedParentNode")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def getStyle(el: HTMLElement, styleAttrib: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(el.asInstanceOf[js.Any], styleAttrib.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def hasClass(el: HTMLElement, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def preventOutline(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventOutline")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def remove(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeClass(el: HTMLElement, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def restoreOutline(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreOutline")().asInstanceOf[Unit]
  
  inline def setClass(el: HTMLElement, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setClass")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOpacity(el: HTMLElement, opacity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOpacity")(el.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPosition(el: HTMLElement, position: Point_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(el.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTransform(el: HTMLElement, offset: Point_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTransform")(el.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTransform(el: HTMLElement, offset: Point_, scale: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTransform")(el.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testProp(props: js.Array[String]): String | false = ^.asInstanceOf[js.Dynamic].applyDynamic("testProp")(props.asInstanceOf[js.Any]).asInstanceOf[String | false]
  
  inline def toBack(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toBack")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toFront(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toFront")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
