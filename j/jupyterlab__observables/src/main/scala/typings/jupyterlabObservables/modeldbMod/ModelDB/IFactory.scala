package typings.jupyterlabObservables.modeldbMod.ModelDB

import typings.jupyterlabObservables.modeldbMod.IModelDB
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
  def createNew(path: String): IModelDB
}

object IFactory {
  @scala.inline
  def apply(createNew: String => IModelDB): IFactory = {
    val __obj = js.Dynamic.literal(createNew = js.Any.fromFunction1(createNew))
    __obj.asInstanceOf[IFactory]
  }
}

