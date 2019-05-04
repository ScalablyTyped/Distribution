package typings
package atJupyterlabObservablesLib.libModeldbMod.ModelDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory interface for creating `IModelDB` objects.
  */
trait IFactory extends js.Object {
  /**
    * Create a new `IModelDB` instance.
    */
  def createNew(path: java.lang.String): atJupyterlabObservablesLib.libModeldbMod.IModelDB
}

object IFactory {
  @scala.inline
  def apply(createNew: java.lang.String => atJupyterlabObservablesLib.libModeldbMod.IModelDB): IFactory = {
    val __obj = js.Dynamic.literal(createNew = js.Any.fromFunction1(createNew))
  
    __obj.asInstanceOf[IFactory]
  }
}

