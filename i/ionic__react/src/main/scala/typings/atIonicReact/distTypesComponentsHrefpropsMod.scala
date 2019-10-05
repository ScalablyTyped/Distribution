package typings.atIonicReact

import typings.atIonicReact.atIonicReactStrings.routerDirection
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/hrefprops", JSImport.Namespace)
@js.native
object distTypesComponentsHrefpropsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atIonicReact.atIonicReactStrings.forward
    - typings.atIonicReact.atIonicReactStrings.back
    - typings.atIonicReact.atIonicReactStrings.none
  */
  trait RouterDirection extends js.Object
  
  type HrefProps[T] = (Omit[T, routerDirection]) with Anon_RouterDirection
}

