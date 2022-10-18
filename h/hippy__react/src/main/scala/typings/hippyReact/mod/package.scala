package typings.hippyReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hippyReact.anon.AnimationId
import typings.hippyReact.hippyReactBooleans.`true`
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationCallback = js.Function0[Unit]

//
// Hippy React Module
// ----------------------------------------------------------------------
type AnimationValue = Double | AnimationId | String

type Attributes = StringDictionary[js.UndefOr[String | Double | `true`]]

type DataItem = Any

type EventListener = js.Function0[Unit]

type EventListeners = StringDictionary[HippyEventListener]

// interface RecursiveArray<T> extends Array<T | ReadonlyArray<T> | RecursiveArray<T>> {}
type GenericStyleProp[T] = T | js.Array[T]

type HippyEventRevoker = EventEmitterRevoker

type Image = Component[ImageProps, js.Object, Any]

type Modal = Component[ModalProps, js.Object, Any]

type Navigator = Component[NavigatorProps, js.Object, Any]

type NetworkChangeEventData = Any

type NetworkInfoCallback = js.Function1[/* data */ NetworkChangeEventData, Unit]

//
// Hippy Style
// ----------------------------------------------------------------------
type StyleObj = StringDictionary[Style]

type Text = Component[TextProps, js.Object, Any]

type TextStyleProp = GenericStyleProp[TextStyle]

type View = Component[ViewProps, js.Object, Any]

type ViewStyleProp = GenericStyleProp[ViewStyle]

type WebView = Component[WebViewProps, js.Object, Any]
