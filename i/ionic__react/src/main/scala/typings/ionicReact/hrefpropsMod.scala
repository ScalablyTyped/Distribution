package typings.ionicReact

import typings.ionicReact.anon.RouterAnimation
import typings.ionicReact.ionicReactStrings.routerDirection
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/components/hrefprops", JSImport.Namespace)
@js.native
object hrefpropsMod extends js.Object {
  
  type HrefProps[T] = (Omit[T, routerDirection]) with RouterAnimation
}
