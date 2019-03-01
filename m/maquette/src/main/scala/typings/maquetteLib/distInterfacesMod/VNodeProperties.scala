package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeProperties
  extends /**
  * Everything that is not explicitly listed (properties and attributes that are either uncommon or custom).
  */
/* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  val accessKey: js.UndefOr[java.lang.String] = js.undefined
  val action: js.UndefOr[java.lang.String] = js.undefined
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
      /* element */ stdLib.Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ java.lang.String, 
      /* properties */ this.type, 
      /* children */ js.Array[VNode], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback that is called when a node has been removed from the tree.
    * The callback is called during idle state or after a timeout (fallback).
    * {@link https://maquettejs.org/docs/dom-node-removal.html|More info}
    * @param element - The element that has been removed from the DOM.
    */
  var afterRemoved: js.UndefOr[js.Function1[/* element */ stdLib.Element, scala.Unit]] = js.undefined
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
      /* element */ stdLib.Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ java.lang.String, 
      /* properties */ this.type, 
      /* children */ js.Array[VNode], 
      scala.Unit
    ]
  ] = js.undefined
  val alt: js.UndefOr[java.lang.String] = js.undefined
  val autocomplete: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When specified, the event handlers will be invoked with 'this' pointing to the value.
    * This is useful when using the prototype/class based implementation of MaquetteComponents.
    *
    * When no [[key]] is present, this object is also used to uniquely identify a DOM node.
    */
  val bind: js.UndefOr[js.Object] = js.undefined
  val checked: js.UndefOr[scala.Boolean] = js.undefined
  val `class`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Do not use className, use class instead
    */
  val className: js.UndefOr[
    scala.Nothing | (maquetteLib.maquetteLibStrings.`Hint: do not use BACKTICKclassNameBACKTICK, use BACKTICKclassBACKTICK instead`)
  ] = js.undefined
  /**
    * An object literal like `{important:true}` which allows css classes, like `important` to be added and removed
    * dynamically.
    */
  val classes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean | scala.Null]]
  ] = js.undefined
  val disabled: js.UndefOr[scala.Boolean] = js.undefined
  val draggable: js.UndefOr[scala.Boolean] = js.undefined
  val encoding: js.UndefOr[java.lang.String] = js.undefined
  val enctype: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The animation to perform when this node is added to an already existing parent.
    * {@link http://maquettejs.org/docs/animations.html|More about animations}.
    * @param element - Element that was just added to the DOM.
    * @param properties - The properties object that was supplied to the [[h]] method
    */
  var enterAnimation: js.UndefOr[
    js.Function2[
      /* element */ stdLib.Element, 
      /* properties */ js.UndefOr[VNodeProperties], 
      scala.Unit
    ]
  ] = js.undefined
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
      /* element */ stdLib.Element, 
      /* removeElement */ js.Function0[scala.Unit], 
      /* properties */ js.UndefOr[this.type], 
      scala.Unit
    ]
  ] = js.undefined
  val href: js.UndefOr[java.lang.String] = js.undefined
  val id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Puts a non-interactive string of html inside the DOM node.
    *
    * Note: if you use innerHTML, maquette cannot protect you from XSS vulnerabilities and you must make sure that the innerHTML value is safe.
    */
  val innerHTML: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to uniquely identify a DOM node among siblings.
    * A key is required when there are more children with the same selector and these children are added or removed dynamically.
    * NOTE: this does not have to be a string or number, a [[MaquetteComponent]] Object for instance is also common.
    */
  val key: js.UndefOr[js.Object] = js.undefined
  val method: js.UndefOr[java.lang.String] = js.undefined
  val name: js.UndefOr[java.lang.String] = js.undefined
  var onblur: js.UndefOr[js.Function1[/* ev */ stdLib.FocusEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onchange: js.UndefOr[js.Function1[/* ev */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
  var onclick: js.UndefOr[js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ondrag: js.UndefOr[js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ondragend: js.UndefOr[js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ondragenter: js.UndefOr[js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ondragleave: js.UndefOr[js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ondragover: js.UndefOr[js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ondragstart: js.UndefOr[js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ondrop: js.UndefOr[js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onfocus: js.UndefOr[js.Function1[/* ev */ stdLib.FocusEvent, scala.Boolean | scala.Unit]] = js.undefined
  var oninput: js.UndefOr[js.Function1[/* ev */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
  var onkeydown: js.UndefOr[js.Function1[/* ev */ stdLib.KeyboardEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onkeypress: js.UndefOr[js.Function1[/* ev */ stdLib.KeyboardEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onkeyup: js.UndefOr[js.Function1[/* ev */ stdLib.KeyboardEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* ev */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
  var onmousedown: js.UndefOr[js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onmouseenter: js.UndefOr[js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onmouseleave: js.UndefOr[js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onmousemove: js.UndefOr[js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onmouseup: js.UndefOr[js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onmousewheel: js.UndefOr[
    js.Function1[/* ev */ stdLib.WheelEvent | stdLib.MouseWheelEvent, scala.Boolean | scala.Unit]
  ] = js.undefined
  var onscroll: js.UndefOr[js.Function1[/* ev */ stdLib.UIEvent, scala.Boolean | scala.Unit]] = js.undefined
  var onsubmit: js.UndefOr[js.Function1[/* ev */ stdLib.Event, scala.Boolean | scala.Unit]] = js.undefined
  var ontouchcancel: js.UndefOr[js.Function1[/* ev */ stdLib.TouchEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ontouchend: js.UndefOr[js.Function1[/* ev */ stdLib.TouchEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ontouchmove: js.UndefOr[js.Function1[/* ev */ stdLib.TouchEvent, scala.Boolean | scala.Unit]] = js.undefined
  var ontouchstart: js.UndefOr[js.Function1[/* ev */ stdLib.TouchEvent, scala.Boolean | scala.Unit]] = js.undefined
  val placeholder: js.UndefOr[java.lang.String] = js.undefined
  val readOnly: js.UndefOr[scala.Boolean] = js.undefined
  val rel: js.UndefOr[java.lang.String] = js.undefined
  val spellcheck: js.UndefOr[scala.Boolean] = js.undefined
  val src: js.UndefOr[java.lang.String] = js.undefined
  val srcset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object literal like `{height:'100px'}` which allows styles to be changed dynamically. All values must be strings.
    */
  val styles: js.UndefOr[stdLib.Partial[stdLib.CSSStyleDeclaration]] = js.undefined
  val tabIndex: js.UndefOr[scala.Double] = js.undefined
  val target: js.UndefOr[java.lang.String] = js.undefined
  val title: js.UndefOr[java.lang.String] = js.undefined
  val `type`: js.UndefOr[java.lang.String] = js.undefined
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
      /* element */ stdLib.Element, 
      /* properties */ js.UndefOr[this.type], 
      /* previousProperties */ js.UndefOr[this.type], 
      scala.Unit
    ]
  ] = js.undefined
  val value: js.UndefOr[java.lang.String] = js.undefined
}

object VNodeProperties {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Everything that is not explicitly listed (properties and attributes that are either uncommon or custom).
    */
  /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    accessKey: java.lang.String = null,
    action: java.lang.String = null,
    afterCreate: js.Function5[
      /* element */ stdLib.Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ java.lang.String, 
      VNodeProperties, 
      /* children */ js.Array[VNode], 
      scala.Unit
    ] = null,
    afterRemoved: js.Function1[/* element */ stdLib.Element, scala.Unit] = null,
    afterUpdate: js.Function5[
      /* element */ stdLib.Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ java.lang.String, 
      VNodeProperties, 
      /* children */ js.Array[VNode], 
      scala.Unit
    ] = null,
    alt: java.lang.String = null,
    autocomplete: java.lang.String = null,
    bind: js.Object = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    `class`: java.lang.String = null,
    className: scala.Nothing | (maquetteLib.maquetteLibStrings.`Hint: do not use BACKTICKclassNameBACKTICK, use BACKTICKclassBACKTICK instead`) = null,
    classes: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean | scala.Null]] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    enctype: java.lang.String = null,
    enterAnimation: js.Function2[
      /* element */ stdLib.Element, 
      /* properties */ js.UndefOr[VNodeProperties], 
      scala.Unit
    ] = null,
    exitAnimation: js.Function3[
      /* element */ stdLib.Element, 
      /* removeElement */ js.Function0[scala.Unit], 
      /* properties */ js.UndefOr[VNodeProperties], 
      scala.Unit
    ] = null,
    href: java.lang.String = null,
    id: java.lang.String = null,
    innerHTML: java.lang.String = null,
    key: js.Object = null,
    method: java.lang.String = null,
    name: java.lang.String = null,
    onblur: js.Function1[/* ev */ stdLib.FocusEvent, scala.Boolean | scala.Unit] = null,
    onchange: js.Function1[/* ev */ stdLib.Event, scala.Boolean | scala.Unit] = null,
    onclick: js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit] = null,
    ondblclick: js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit] = null,
    ondrag: js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit] = null,
    ondragend: js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit] = null,
    ondragenter: js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit] = null,
    ondragleave: js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit] = null,
    ondragover: js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit] = null,
    ondragstart: js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit] = null,
    ondrop: js.Function1[/* ev */ stdLib.DragEvent, scala.Boolean | scala.Unit] = null,
    onfocus: js.Function1[/* ev */ stdLib.FocusEvent, scala.Boolean | scala.Unit] = null,
    oninput: js.Function1[/* ev */ stdLib.Event, scala.Boolean | scala.Unit] = null,
    onkeydown: js.Function1[/* ev */ stdLib.KeyboardEvent, scala.Boolean | scala.Unit] = null,
    onkeypress: js.Function1[/* ev */ stdLib.KeyboardEvent, scala.Boolean | scala.Unit] = null,
    onkeyup: js.Function1[/* ev */ stdLib.KeyboardEvent, scala.Boolean | scala.Unit] = null,
    onload: js.Function1[/* ev */ stdLib.Event, scala.Boolean | scala.Unit] = null,
    onmousedown: js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit] = null,
    onmouseenter: js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit] = null,
    onmouseleave: js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit] = null,
    onmousemove: js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit] = null,
    onmouseout: js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit] = null,
    onmouseover: js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit] = null,
    onmouseup: js.Function1[/* ev */ stdLib.MouseEvent, scala.Boolean | scala.Unit] = null,
    onmousewheel: js.Function1[/* ev */ stdLib.WheelEvent | stdLib.MouseWheelEvent, scala.Boolean | scala.Unit] = null,
    onscroll: js.Function1[/* ev */ stdLib.UIEvent, scala.Boolean | scala.Unit] = null,
    onsubmit: js.Function1[/* ev */ stdLib.Event, scala.Boolean | scala.Unit] = null,
    ontouchcancel: js.Function1[/* ev */ stdLib.TouchEvent, scala.Boolean | scala.Unit] = null,
    ontouchend: js.Function1[/* ev */ stdLib.TouchEvent, scala.Boolean | scala.Unit] = null,
    ontouchmove: js.Function1[/* ev */ stdLib.TouchEvent, scala.Boolean | scala.Unit] = null,
    ontouchstart: js.Function1[/* ev */ stdLib.TouchEvent, scala.Boolean | scala.Unit] = null,
    placeholder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    rel: java.lang.String = null,
    spellcheck: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    srcset: java.lang.String = null,
    styles: stdLib.Partial[stdLib.CSSStyleDeclaration] = null,
    tabIndex: scala.Int | scala.Double = null,
    target: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    updateAnimation: js.Function3[
      /* element */ stdLib.Element, 
      /* properties */ js.UndefOr[VNodeProperties], 
      /* previousProperties */ js.UndefOr[VNodeProperties], 
      scala.Unit
    ] = null,
    value: java.lang.String = null
  ): VNodeProperties = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (action != null) __obj.updateDynamic("action")(action)
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(afterCreate)
    if (afterRemoved != null) __obj.updateDynamic("afterRemoved")(afterRemoved)
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(afterUpdate)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete)
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (enctype != null) __obj.updateDynamic("enctype")(enctype)
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (exitAnimation != null) __obj.updateDynamic("exitAnimation")(exitAnimation)
    if (href != null) __obj.updateDynamic("href")(href)
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML)
    if (key != null) __obj.updateDynamic("key")(key)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onblur != null) __obj.updateDynamic("onblur")(onblur)
    if (onchange != null) __obj.updateDynamic("onchange")(onchange)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick)
    if (ondrag != null) __obj.updateDynamic("ondrag")(ondrag)
    if (ondragend != null) __obj.updateDynamic("ondragend")(ondragend)
    if (ondragenter != null) __obj.updateDynamic("ondragenter")(ondragenter)
    if (ondragleave != null) __obj.updateDynamic("ondragleave")(ondragleave)
    if (ondragover != null) __obj.updateDynamic("ondragover")(ondragover)
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(ondragstart)
    if (ondrop != null) __obj.updateDynamic("ondrop")(ondrop)
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus)
    if (oninput != null) __obj.updateDynamic("oninput")(oninput)
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(onkeydown)
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(onkeypress)
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup)
    if (onload != null) __obj.updateDynamic("onload")(onload)
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown)
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(onmouseenter)
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(onmouseleave)
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(onmousemove)
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout)
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover)
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(onmouseup)
    if (onmousewheel != null) __obj.updateDynamic("onmousewheel")(onmousewheel)
    if (onscroll != null) __obj.updateDynamic("onscroll")(onscroll)
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(onsubmit)
    if (ontouchcancel != null) __obj.updateDynamic("ontouchcancel")(ontouchcancel)
    if (ontouchend != null) __obj.updateDynamic("ontouchend")(ontouchend)
    if (ontouchmove != null) __obj.updateDynamic("ontouchmove")(ontouchmove)
    if (ontouchstart != null) __obj.updateDynamic("ontouchstart")(ontouchstart)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcset != null) __obj.updateDynamic("srcset")(srcset)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updateAnimation != null) __obj.updateDynamic("updateAnimation")(updateAnimation)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[VNodeProperties]
  }
}

