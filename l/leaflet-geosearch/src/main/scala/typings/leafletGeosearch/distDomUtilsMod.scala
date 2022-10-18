package typings.leafletGeosearch

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomUtilsMod {
  
  @JSImport("leaflet-geosearch/dist/domUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClassName(element: Null, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addClassName(element: Null, className: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addClassName(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addClassName(element: Element, className: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createElement[T /* <: HTMLElement */](element: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](element: String, className: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    element: String,
    className: String,
    parent: Null,
    attributes: StringDictionary[String | (js.Function1[/* event */ Any, Unit])]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    element: String,
    className: String,
    parent: Unit,
    attributes: StringDictionary[String | (js.Function1[/* event */ Any, Unit])]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](element: String, className: String, parent: Element): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    element: String,
    className: String,
    parent: Element,
    attributes: StringDictionary[String | (js.Function1[/* event */ Any, Unit])]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    element: String,
    className: Null,
    parent: Null,
    attributes: StringDictionary[String | (js.Function1[/* event */ Any, Unit])]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    element: String,
    className: Null,
    parent: Unit,
    attributes: StringDictionary[String | (js.Function1[/* event */ Any, Unit])]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](element: String, className: Null, parent: Element): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    element: String,
    className: Null,
    parent: Element,
    attributes: StringDictionary[String | (js.Function1[/* event */ Any, Unit])]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    element: String,
    className: Unit,
    parent: Null,
    attributes: StringDictionary[String | (js.Function1[/* event */ Any, Unit])]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    element: String,
    className: Unit,
    parent: Unit,
    attributes: StringDictionary[String | (js.Function1[/* event */ Any, Unit])]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](element: String, className: Unit, parent: Element): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    element: String,
    className: Unit,
    parent: Element,
    attributes: StringDictionary[String | (js.Function1[/* event */ Any, Unit])]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def createScriptElement[T](url: String, cb: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createScriptElement")(url.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def cx(classNames: js.UndefOr[String]*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cx")(classNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def removeClassName(element: Null, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeClassName(element: Null, className: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeClassName(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeClassName(element: Element, className: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceClassName(element: Element, find: String, replace: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceClassName")(element.asInstanceOf[js.Any], find.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stopPropagation(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPropagation")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
