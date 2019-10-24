package typings.atIonicReact.atIonicReactMod

import org.scalablytyped.runtime.TopLevel
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonCardElement
import typings.atIonicReact.Anon_Back
import typings.atIonicReact.atIonicReactStrings.`type`
import typings.atIonicReact.atIonicReactStrings.button
import typings.atIonicReact.atIonicReactStrings.color
import typings.atIonicReact.atIonicReactStrings.disabled
import typings.atIonicReact.atIonicReactStrings.download
import typings.atIonicReact.atIonicReactStrings.href
import typings.atIonicReact.atIonicReactStrings.mode
import typings.atIonicReact.atIonicReactStrings.rel
import typings.atIonicReact.atIonicReactStrings.target
import typings.atIonicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.RefAttributes
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "IonCard")
@js.native
object IonCard
  extends TopLevel[
      ForwardRefExoticComponent[
        (Pick[
          typings.atIonicCore.distTypesComponentsMod.LocalJSX.IonCard, 
          disabled | button | color | mode | href | download | rel | target | `type`
        ]) with Anon_Back with (Pick[
          HTMLAttributes[HTMLIonCardElement], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 252 */ js.Any
        ]) with IonicReactProps with RefAttributes[HTMLIonCardElement]
      ]
    ]

