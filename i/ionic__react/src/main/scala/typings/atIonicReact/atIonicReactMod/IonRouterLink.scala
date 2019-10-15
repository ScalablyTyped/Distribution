package typings.atIonicReact.atIonicReactMod

import org.scalablytyped.runtime.TopLevel
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonRouterLinkElement
import typings.atIonicReact.Anon_Back
import typings.atIonicReact.atIonicReactStrings.color
import typings.atIonicReact.atIonicReactStrings.href
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

@JSImport("@ionic/react", "IonRouterLink")
@js.native
object IonRouterLink
  extends TopLevel[
      ForwardRefExoticComponent[
        (Pick[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonRouterLink */ _, 
          color | href | rel | target
        ]) with Anon_Back with (Pick[
          HTMLAttributes[HTMLIonRouterLinkElement], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 252 */ js.Any
        ]) with IonicReactProps with RefAttributes[HTMLIonRouterLinkElement]
      ]
    ]

