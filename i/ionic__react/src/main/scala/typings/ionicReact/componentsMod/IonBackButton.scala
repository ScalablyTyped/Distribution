package typings.ionicReact.componentsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.ionicReact.AnonClickButton
import typings.ionicReact.ReadonlyProps
import typings.ionicReact.ionBackButtonMod.Props
import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components", "IonBackButton")
@js.native
class IonBackButton protected () extends AnonClickButton {
  def this(props: ReadonlyProps) = this()
  def this(props: Props) = this()
  def this(props: Props, context: js.Any) = this()
}

@JSImport("@ionic/react/dist/types/components", "IonBackButton")
@js.native
object IonBackButton
  extends Instantiable1[(/* props */ Props) | (/* props */ ReadonlyProps), AnonClickButton]
     with Instantiable2[/* props */ Props, /* context */ js.Any, AnonClickButton] {
  val contextType: Context[NavContextState] = js.native
  val displayName: String = js.native
}

