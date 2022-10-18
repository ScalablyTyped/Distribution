package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.esmTypesMod.ErrorLike
import typings.jsdevtoolsOno.esmTypesMod.ErrorLikeConstructor
import typings.jsdevtoolsOno.esmTypesMod.OnoConstructor
import typings.jsdevtoolsOno.esmTypesMod.OnoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmConstructorMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@jsdevtools/ono/esm/constructor", "Ono")
  @js.native
  open class Ono[T /* <: ErrorLike */] protected ()
    extends StObject
       with typings.jsdevtoolsOno.esmTypesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  @JSImport("@jsdevtools/ono/esm/constructor", "Ono")
  @js.native
  val Ono: OnoConstructor = js.native
}
