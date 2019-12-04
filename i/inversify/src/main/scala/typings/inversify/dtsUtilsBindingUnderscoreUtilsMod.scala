package typings.inversify

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Abstract
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Container
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Newable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/utils/binding_utils", JSImport.Namespace)
@js.native
object dtsUtilsBindingUnderscoreUtilsMod extends js.Object {
  def multiBindToService(container: Container): js.Function1[
    /* service */ String | js.Symbol | Newable[_] | Abstract[_], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[_] | Abstract[_], Unit]
  ] = js.native
}

