package typings.ionicReact.mod

import typings.ionicReact.ionTabsMod.Props
import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react", "IonTabs")
@js.native
class IonTabs protected ()
  extends typings.ionicReact.componentsMod.IonTabs {
  def this(props: Props) = this()
}

/* static members */
@JSImport("@ionic/react", "IonTabs")
@js.native
object IonTabs extends js.Object {
  def contextType: Context[NavContextState] = js.native
}

