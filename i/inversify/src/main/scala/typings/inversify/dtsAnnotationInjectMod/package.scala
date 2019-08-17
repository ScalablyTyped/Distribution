package typings.inversify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dtsAnnotationInjectMod {
  import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier

  type ServiceIdentifierOrFunc = ServiceIdentifier[js.Any] | LazyServiceIdentifer[js.Any]
}
