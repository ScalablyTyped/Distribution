package typings.inferno.distCoreTypesMod

import typings.inferno.distCoreTypesMod.Inferno.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardRef[P, T]
  extends StObject
     with StatelessComponent[P] {
  
  def ref(): Any = js.native
  def ref(instance: T): Any = js.native
  @JSName("ref")
  var ref_Original: Ref[T] = js.native
}
