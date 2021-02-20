package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.typesMod.ErrorLike
import typings.jsdevtoolsOno.typesMod.ErrorLikeConstructor
import typings.jsdevtoolsOno.typesMod.OnoConstructor
import typings.jsdevtoolsOno.typesMod.OnoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constructorMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@jsdevtools/ono/esm/constructor", "Ono")
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typings.jsdevtoolsOno.typesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  @JSImport("@jsdevtools/ono/esm/constructor", "Ono")
  @js.native
  val Ono: OnoConstructor = js.native
}
