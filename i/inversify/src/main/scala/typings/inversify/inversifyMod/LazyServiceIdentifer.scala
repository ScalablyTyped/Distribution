package typings.inversify.inversifyMod

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify", "LazyServiceIdentifer")
@js.native
class LazyServiceIdentifer[T] protected ()
  extends typings.inversify.dtsAnnotationInjectMod.LazyServiceIdentifer[T] {
  def this(cb: js.Function0[ServiceIdentifier[T]]) = this()
}

