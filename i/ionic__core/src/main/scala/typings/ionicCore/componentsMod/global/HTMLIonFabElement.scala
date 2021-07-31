package typings.ionicCore.componentsMod.global

import typings.ionicCore.componentsMod.Components.IonFab
import typings.std.AddEventListenerOptions
import typings.std.DocumentAndElementEventHandlers
import typings.std.Element
import typings.std.ElementCSSInlineStyle
import typings.std.ElementContentEditable
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.GlobalEventHandlers
import typings.std.HTMLOrSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typings.std.HTMLElement because Inheritance from two classes. Inlined accessKeyLabel, offsetWidth, accessKey, spellcheck, offsetTop, innerText, offsetLeft, offsetParent, lang, translate, autocapitalize, dir, draggable, hidden, title, offsetHeight, click, addEventListener, addEventListener, removeEventListener, removeEventListener, addEventListener, removeEventListener
- typings.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement because Inheritance from two classes. Inlined componentOnReady */ @js.native
trait HTMLIonFabElement
  extends StObject
     with IonFab
     with Element
     with DocumentAndElementEventHandlers
     with ElementCSSInlineStyle
     with ElementContentEditable
     with GlobalEventHandlers
     with HTMLOrSVGElement {
  
  var accessKey: String = js.native
  
  val accessKeyLabel: String = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  var autocapitalize: String = js.native
  
  def click(): Unit = js.native
  
  def componentOnReady(): js.Promise[this.type] = js.native
  
  var dir: String = js.native
  
  var draggable: Boolean = js.native
  
  var hidden: Boolean = js.native
  
  var innerText: String = js.native
  
  var lang: String = js.native
  
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
  
  var spellcheck: Boolean = js.native
  
  var title: String = js.native
  
  var translate: Boolean = js.native
}
