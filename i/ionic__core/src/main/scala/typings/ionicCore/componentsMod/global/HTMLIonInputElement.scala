package typings.ionicCore.componentsMod.global

import typings.ionicCore.componentsMod.Components.IonInput
import typings.std.AddEventListenerOptions
import typings.std.DOMStringMap
import typings.std.DocumentAndElementEventHandlers
import typings.std.Element
import typings.std.ElementCSSInlineStyle
import typings.std.ElementContentEditable
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.FocusOptions
import typings.std.GlobalEventHandlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- typings.std.HTMLOrSVGElement because var conflicts: autofocus. Inlined dataset, nonce, tabIndex, blur, focus, focus
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typings.std.HTMLElement because Inheritance from two classes. Inlined accessKeyLabel, offsetWidth, accessKey, offsetTop, innerText, offsetLeft, offsetParent, lang, translate, dir, draggable, hidden, title, offsetHeight, click, addEventListener, addEventListener, removeEventListener, removeEventListener, addEventListener, removeEventListener
- typings.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement because Inheritance from two classes. Inlined componentOnReady */ @js.native
trait HTMLIonInputElement
  extends StObject
     with IonInput
     with Element
     with DocumentAndElementEventHandlers
     with ElementCSSInlineStyle
     with ElementContentEditable
     with GlobalEventHandlers {
  
  var accessKey: String = js.native
  
  val accessKeyLabel: String = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  def blur(): Unit = js.native
  
  def click(): Unit = js.native
  
  def componentOnReady(): js.Promise[this.type] = js.native
  
  val dataset: DOMStringMap = js.native
  
  var dir: String = js.native
  
  var draggable: Boolean = js.native
  
  def focus(): Unit = js.native
  def focus(options: FocusOptions): Unit = js.native
  
  var hidden: Boolean = js.native
  
  var innerText: String = js.native
  
  var lang: String = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  val offsetHeight: Double = js.native
  
  val offsetLeft: Double = js.native
  
  val offsetParent: Element | Null = js.native
  
  val offsetTop: Double = js.native
  
  val offsetWidth: Double = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  var tabIndex: Double = js.native
  
  var title: String = js.native
  
  var translate: Boolean = js.native
}
