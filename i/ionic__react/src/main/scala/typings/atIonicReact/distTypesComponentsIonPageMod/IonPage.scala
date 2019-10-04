package typings.atIonicReact.distTypesComponentsIonPageMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.atIonicReact.Anon_CallbackComponentDidMountContext
import typings.atIonicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typings.atIonicReact.distTypesContextsNavContextMod.NavContextState
import typings.react.reactMod.Context
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonPage", "IonPage")
@js.native
class IonPage protected () extends Anon_CallbackComponentDidMountContext {
  def this(props: HTMLAttributes[HTMLElement] with IonicReactProps) = this()
  def this(props: HTMLAttributes[HTMLElement] with IonicReactProps, context: js.Any) = this()
}

@JSImport("@ionic/react/dist/types/components/IonPage", "IonPage")
@js.native
object IonPage
  extends Instantiable2[
      /* props */ HTMLAttributes[HTMLElement] with IonicReactProps, 
      /* context */ js.Any, 
      Anon_CallbackComponentDidMountContext
    ]
     with Instantiable1[
      /* props */ HTMLAttributes[HTMLElement] with IonicReactProps, 
      Anon_CallbackComponentDidMountContext
    ] {
  val contextType: Context[NavContextState] = js.native
  val displayName: String = js.native
}

