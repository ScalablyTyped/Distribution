package typings.jsdevtoolsOno

import org.scalablytyped.runtime.TopLevel
import typings.jsdevtoolsOno.typesMod.ErrorLike
import typings.jsdevtoolsOno.typesMod.ErrorLikeConstructor
import typings.jsdevtoolsOno.typesMod.OnoConstructor
import typings.jsdevtoolsOno.typesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jsdevtools/ono/esm/constructor", JSImport.Namespace)
@js.native
object constructorMod extends js.Object {
  
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typings.jsdevtoolsOno.typesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  @js.native
  object Ono extends TopLevel[OnoConstructor]
}
