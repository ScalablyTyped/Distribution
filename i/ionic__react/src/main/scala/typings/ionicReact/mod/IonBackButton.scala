package typings.ionicReact.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.ionicReact.anon.ClickButton
import typings.ionicReact.anon.ReadonlyProps
import typings.ionicReact.ionBackButtonMod.Props
import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "IonBackButton")
@js.native
class IonBackButton protected () extends ClickButton {
  def this(props: ReadonlyProps) = this()
  def this(props: Props) = this()
  def this(props: Props, context: js.Any) = this()
}

@JSImport("@ionic/react", "IonBackButton")
@js.native
object IonBackButton
  extends Instantiable1[(/* props */ Props) | (/* props */ ReadonlyProps), ClickButton]
     with Instantiable2[/* props */ Props, /* context */ js.Any, ClickButton] {
  val contextType: Context[NavContextState] = js.native
  val displayName: String = js.native
}

