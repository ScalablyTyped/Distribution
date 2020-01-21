package typings.ionicReact.ionIconMod

import org.scalablytyped.runtime.TopLevel
import typings.ionicReact.ionicReactPropsMod.IonicReactProps
import typings.ionicons.componentsMod._Global_.HTMLIonIconElement
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonIcon", "IonIcon")
@js.native
object IonIcon
  extends TopLevel[
      ForwardRefExoticComponent[
        IonIconProps with IonicReactProps with (Pick[
          HTMLAttributes[HTMLIonIconElement], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 253 */ js.Any
        ]) with RefAttributes[HTMLIonIconElement]
      ]
    ]

