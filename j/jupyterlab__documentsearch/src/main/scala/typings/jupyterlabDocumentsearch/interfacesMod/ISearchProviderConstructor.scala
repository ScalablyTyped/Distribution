package typings.jupyterlabDocumentsearch.interfacesMod

import org.scalablytyped.runtime.Instantiable0
import typings.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchProviderConstructor[T /* <: Widget */] extends Instantiable0[ISearchProvider[T]] {
  /**
    * Report whether or not this provider has the ability to search on the
    * given object. The function is a type guard, meaning that it returns
    * a boolean, but has a type predicate (`x is T`) for its return signature.
    */
  def canSearchOn(domain: Widget): /* is T */ Boolean = js.native
}

