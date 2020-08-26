package typings.maquette.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.maquette.anon.PartialCSSStyleDeclaratio
import typings.maquette.maquetteStrings.`HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`
import typings.std.DragEvent
import typings.std.Element
import typings.std.Event
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.MouseWheelEvent
import typings.std.TouchEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNodeProperties
  extends /**
  * Everything that is not explicitly listed (properties and attributes that are either uncommon or custom).
  */
/* index */ StringDictionary[js.Any] {
  val accessKey: js.UndefOr[String] = js.native
  val action: js.UndefOr[String] = js.native
  /**
    * Callback that is executed after this node is added to the DOM. Child nodes and properties have
    * already been applied.
    * @param element - The element that was added to the DOM.
    * @param projectionOptions - The projection options that were used, see [[createProjector]].
    * @param vnodeSelector - The selector passed to the [[h]] function.
    * @param properties - The properties passed to the [[h]] function.
    * @param children - The children that were created.
    */
  var afterCreate: js.UndefOr[
    js.Function5[
      /* element */ Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ String, 
      /* properties */ this.type, 
      /* children */ js.UndefOr[js.Array[VNode]], 
      Unit
    ]
  ] = js.native
  /**
    * Callback that is called when a node has been removed from the tree.
    * The callback is called during idle state or after a timeout (fallback).
    * {@link https://maquettejs.org/docs/dom-node-removal.html|More info}
    * @param element - The element that has been removed from the DOM.
    */
  var afterRemoved: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
  /**
    * Callback that is executed every time this node may have been updated. Child nodes and properties
    * have already been updated.
    * @param element - The element that may have been updated in the DOM.
    * @param projectionOptions - The projection options that were used, see [[createProjector]].
    * @param vnodeSelector - The selector passed to the [[h]] function.
    * @param properties - The properties passed to the [[h]] function.
    * @param children - The children for this node.
    */
  var afterUpdate: js.UndefOr[
    js.Function5[
      /* element */ Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ String, 
      /* properties */ this.type, 
      /* children */ js.UndefOr[js.Array[VNode]], 
      Unit
    ]
  ] = js.native
  val alt: js.UndefOr[String] = js.native
  val autocomplete: js.UndefOr[String] = js.native
  /**
    * When specified, the event handlers will be invoked with 'this' pointing to the value.
    * This is useful when using the prototype/class based implementation of MaquetteComponents.
    *
    * When no [[key]] is present, this object is also used to uniquely identify a DOM node.
    */
  val bind: js.UndefOr[js.Object] = js.native
  val checked: js.UndefOr[Boolean] = js.native
  val `class`: js.UndefOr[String] = js.native
  /**
    * Do not use className, use class instead
    */
  val className: js.UndefOr[
    `HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`
  ] = js.native
  /**
    * An object literal like `{important:true}` which allows css classes, like `important` to be added and removed
    * dynamically.
    */
  val classes: js.UndefOr[StringDictionary[js.UndefOr[Boolean | Null]]] = js.native
  val disabled: js.UndefOr[Boolean] = js.native
  val draggable: js.UndefOr[Boolean] = js.native
  val encoding: js.UndefOr[String] = js.native
  val enctype: js.UndefOr[String] = js.native
  /**
    * The animation to perform when this node is added to an already existing parent.
    * {@link http://maquettejs.org/docs/animations.html|More about animations}.
    * @param element - Element that was just added to the DOM.
    * @param properties - The properties object that was supplied to the [[h]] method
    */
  var enterAnimation: js.UndefOr[
    js.Function2[/* element */ Element, /* properties */ js.UndefOr[this.type], Unit]
  ] = js.native
  /**
    * The animation to perform when this node is removed while its parent remains.
    * @param element - Element that ought to be removed from to the DOM.
    * @param removeElement - Function that removes the element from the DOM.
    * This argument is provided purely for convenience.
    * You may use this function to remove the element when the animation is done.
    * @param properties - The properties object that was supplied to the [[h]] method that rendered this [[VNode]] the previous time.
    */
  var exitAnimation: js.UndefOr[
    js.Function3[
      /* element */ Element, 
      /* removeElement */ js.Function0[Unit], 
      /* properties */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  val href: js.UndefOr[String] = js.native
  val id: js.UndefOr[String] = js.native
  /**
    * Puts a non-interactive string of html inside the DOM node.
    *
    * Note: if you use innerHTML, maquette cannot protect you from XSS vulnerabilities and you must make sure that the innerHTML value is safe.
    */
  val innerHTML: js.UndefOr[String] = js.native
  /**
    * Used to uniquely identify a DOM node among siblings.
    * A key is required when there are more children with the same selector and these children are added or removed dynamically.
    * NOTE: this does not have to be a string or number, a [[MaquetteComponent]] Object for instance is also common.
    */
  val key: js.UndefOr[js.Object] = js.native
  val method: js.UndefOr[String] = js.native
  val name: js.UndefOr[String] = js.native
  var onblur: js.UndefOr[js.Function1[/* ev */ FocusEvent, Boolean | Unit]] = js.native
  var onchange: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
  var onclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var ondblclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var ondrag: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragend: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragenter: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragleave: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragover: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragstart: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondrop: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var onfocus: js.UndefOr[js.Function1[/* ev */ FocusEvent, Boolean | Unit]] = js.native
  var oninput: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
  var onkeydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.native
  var onkeypress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.native
  var onkeyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.native
  var onload: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
  var onmousedown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseenter: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseleave: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmousemove: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseout: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseup: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmousewheel: js.UndefOr[js.Function1[/* ev */ WheelEvent | MouseWheelEvent, Boolean | Unit]] = js.native
  var onscroll: js.UndefOr[js.Function1[/* ev */ UIEvent, Boolean | Unit]] = js.native
  var onsubmit: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
  var ontouchcancel: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
  var ontouchend: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
  var ontouchmove: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
  var ontouchstart: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
  val placeholder: js.UndefOr[String] = js.native
  val readOnly: js.UndefOr[Boolean] = js.native
  val rel: js.UndefOr[String] = js.native
  val spellcheck: js.UndefOr[Boolean] = js.native
  val src: js.UndefOr[String] = js.native
  val srcset: js.UndefOr[String] = js.native
  /**
    * An object literal like `{height:'100px'}` which allows styles to be changed dynamically. All values must be strings.
    */
  val styles: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  val tabIndex: js.UndefOr[Double] = js.native
  val target: js.UndefOr[String] = js.native
  val title: js.UndefOr[String] = js.native
  val `type`: js.UndefOr[String] = js.native
  /**
    * The animation to perform when the properties of this node change.
    * This also includes attributes, styles, css classes. This callback is also invoked when node contains only text and that text changes.
    * {@link http://maquettejs.org/docs/animations.html|More about animations}.
    * @param element - Element that was modified in the DOM.
    * @param properties - The last properties object that was supplied to the [[h]] method
    * @param previousProperties - The previous properties object that was supplied to the [[h]] method
    */
  var updateAnimation: js.UndefOr[
    js.Function3[
      /* element */ Element, 
      /* properties */ js.UndefOr[this.type], 
      /* previousProperties */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  val value: js.UndefOr[String] = js.native
}

object VNodeProperties {
  @scala.inline
  def apply(): VNodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VNodeProperties]
  }
  @scala.inline
  implicit class VNodePropertiesOps[Self <: VNodeProperties] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAfterCreate(
      value: (/* element */ Element, /* projectionOptions */ ProjectionOptions, /* vnodeSelector */ String, VNodeProperties, /* children */ js.UndefOr[js.Array[VNode]]) => Unit
    ): Self = this.set("afterCreate", js.Any.fromFunction5(value))
    @scala.inline
    def deleteAfterCreate: Self = this.set("afterCreate", js.undefined)
    @scala.inline
    def setAfterRemoved(value: /* element */ Element => Unit): Self = this.set("afterRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterRemoved: Self = this.set("afterRemoved", js.undefined)
    @scala.inline
    def setAfterUpdate(
      value: (/* element */ Element, /* projectionOptions */ ProjectionOptions, /* vnodeSelector */ String, VNodeProperties, /* children */ js.UndefOr[js.Array[VNode]]) => Unit
    ): Self = this.set("afterUpdate", js.Any.fromFunction5(value))
    @scala.inline
    def deleteAfterUpdate: Self = this.set("afterUpdate", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setAutocomplete(value: String): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    @scala.inline
    def setBind(value: js.Object): Self = this.set("bind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setClassName(
      value: scala.Nothing | (`HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`)
    ): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClasses(value: StringDictionary[js.UndefOr[Boolean | Null]]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEnctype(value: String): Self = this.set("enctype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnctype: Self = this.set("enctype", js.undefined)
    @scala.inline
    def setEnterAnimation(value: (/* element */ Element, /* properties */ js.UndefOr[VNodeProperties]) => Unit): Self = this.set("enterAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEnterAnimation: Self = this.set("enterAnimation", js.undefined)
    @scala.inline
    def setExitAnimation(
      value: (/* element */ Element, /* removeElement */ js.Function0[Unit], /* properties */ js.UndefOr[VNodeProperties]) => Unit
    ): Self = this.set("exitAnimation", js.Any.fromFunction3(value))
    @scala.inline
    def deleteExitAnimation: Self = this.set("exitAnimation", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerHTML: Self = this.set("innerHTML", js.undefined)
    @scala.inline
    def setKey(value: js.Object): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnblur(value: /* ev */ FocusEvent => Boolean | Unit): Self = this.set("onblur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    @scala.inline
    def setOnchange(value: /* ev */ Event => Boolean | Unit): Self = this.set("onchange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    @scala.inline
    def setOnclick(value: /* ev */ MouseEvent => Boolean | Unit): Self = this.set("onclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setOndblclick(value: /* ev */ MouseEvent => Boolean | Unit): Self = this.set("ondblclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndblclick: Self = this.set("ondblclick", js.undefined)
    @scala.inline
    def setOndrag(value: /* ev */ DragEvent => Boolean | Unit): Self = this.set("ondrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndrag: Self = this.set("ondrag", js.undefined)
    @scala.inline
    def setOndragend(value: /* ev */ DragEvent => Boolean | Unit): Self = this.set("ondragend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndragend: Self = this.set("ondragend", js.undefined)
    @scala.inline
    def setOndragenter(value: /* ev */ DragEvent => Boolean | Unit): Self = this.set("ondragenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndragenter: Self = this.set("ondragenter", js.undefined)
    @scala.inline
    def setOndragleave(value: /* ev */ DragEvent => Boolean | Unit): Self = this.set("ondragleave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndragleave: Self = this.set("ondragleave", js.undefined)
    @scala.inline
    def setOndragover(value: /* ev */ DragEvent => Boolean | Unit): Self = this.set("ondragover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndragover: Self = this.set("ondragover", js.undefined)
    @scala.inline
    def setOndragstart(value: /* ev */ DragEvent => Boolean | Unit): Self = this.set("ondragstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndragstart: Self = this.set("ondragstart", js.undefined)
    @scala.inline
    def setOndrop(value: /* ev */ DragEvent => Boolean | Unit): Self = this.set("ondrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOndrop: Self = this.set("ondrop", js.undefined)
    @scala.inline
    def setOnfocus(value: /* ev */ FocusEvent => Boolean | Unit): Self = this.set("onfocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnfocus: Self = this.set("onfocus", js.undefined)
    @scala.inline
    def setOninput(value: /* ev */ Event => Boolean | Unit): Self = this.set("oninput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOninput: Self = this.set("oninput", js.undefined)
    @scala.inline
    def setOnkeydown(value: /* ev */ KeyboardEvent => Boolean | Unit): Self = this.set("onkeydown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnkeydown: Self = this.set("onkeydown", js.undefined)
    @scala.inline
    def setOnkeypress(value: /* ev */ KeyboardEvent => Boolean | Unit): Self = this.set("onkeypress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnkeypress: Self = this.set("onkeypress", js.undefined)
    @scala.inline
    def setOnkeyup(value: /* ev */ KeyboardEvent => Boolean | Unit): Self = this.set("onkeyup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnkeyup: Self = this.set("onkeyup", js.undefined)
    @scala.inline
    def setOnload(value: /* ev */ Event => Boolean | Unit): Self = this.set("onload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    @scala.inline
    def setOnmousedown(value: /* ev */ MouseEvent => Boolean | Unit): Self = this.set("onmousedown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmousedown: Self = this.set("onmousedown", js.undefined)
    @scala.inline
    def setOnmouseenter(value: /* ev */ MouseEvent => Boolean | Unit): Self = this.set("onmouseenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmouseenter: Self = this.set("onmouseenter", js.undefined)
    @scala.inline
    def setOnmouseleave(value: /* ev */ MouseEvent => Boolean | Unit): Self = this.set("onmouseleave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmouseleave: Self = this.set("onmouseleave", js.undefined)
    @scala.inline
    def setOnmousemove(value: /* ev */ MouseEvent => Boolean | Unit): Self = this.set("onmousemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmousemove: Self = this.set("onmousemove", js.undefined)
    @scala.inline
    def setOnmouseout(value: /* ev */ MouseEvent => Boolean | Unit): Self = this.set("onmouseout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    @scala.inline
    def setOnmouseover(value: /* ev */ MouseEvent => Boolean | Unit): Self = this.set("onmouseover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    @scala.inline
    def setOnmouseup(value: /* ev */ MouseEvent => Boolean | Unit): Self = this.set("onmouseup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmouseup: Self = this.set("onmouseup", js.undefined)
    @scala.inline
    def setOnmousewheel(value: /* ev */ WheelEvent | MouseWheelEvent => Boolean | Unit): Self = this.set("onmousewheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnmousewheel: Self = this.set("onmousewheel", js.undefined)
    @scala.inline
    def setOnscroll(value: /* ev */ UIEvent => Boolean | Unit): Self = this.set("onscroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnscroll: Self = this.set("onscroll", js.undefined)
    @scala.inline
    def setOnsubmit(value: /* ev */ Event => Boolean | Unit): Self = this.set("onsubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnsubmit: Self = this.set("onsubmit", js.undefined)
    @scala.inline
    def setOntouchcancel(value: /* ev */ TouchEvent => Boolean | Unit): Self = this.set("ontouchcancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntouchcancel: Self = this.set("ontouchcancel", js.undefined)
    @scala.inline
    def setOntouchend(value: /* ev */ TouchEvent => Boolean | Unit): Self = this.set("ontouchend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntouchend: Self = this.set("ontouchend", js.undefined)
    @scala.inline
    def setOntouchmove(value: /* ev */ TouchEvent => Boolean | Unit): Self = this.set("ontouchmove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntouchmove: Self = this.set("ontouchmove", js.undefined)
    @scala.inline
    def setOntouchstart(value: /* ev */ TouchEvent => Boolean | Unit): Self = this.set("ontouchstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOntouchstart: Self = this.set("ontouchstart", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setSrcset(value: String): Self = this.set("srcset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcset: Self = this.set("srcset", js.undefined)
    @scala.inline
    def setStyles(value: PartialCSSStyleDeclaratio): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
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
    def setUpdateAnimation(
      value: (/* element */ Element, /* properties */ js.UndefOr[VNodeProperties], /* previousProperties */ js.UndefOr[VNodeProperties]) => Unit
    ): Self = this.set("updateAnimation", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUpdateAnimation: Self = this.set("updateAnimation", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

