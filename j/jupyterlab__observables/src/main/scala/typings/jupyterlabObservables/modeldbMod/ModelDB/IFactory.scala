package typings.jupyterlabObservables.modeldbMod.ModelDB

import typings.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A factory interface for creating `IModelDB` objects.
  */
@js.native
trait IFactory extends js.Object {
  
  /**
    * Create a new `IModelDB` instance.
    */
  def createNew(path: String): IModelDB = js.native
}
object IFactory {
  
  @scala.inline
  def apply(createNew: String => IModelDB): IFactory = {
    val __obj = js.Dynamic.literal(createNew = js.Any.fromFunction1(createNew))
    __obj.asInstanceOf[IFactory]
  }
  
  @scala.inline
  implicit class IFactoryOps[Self <: IFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateNew(value: String => IModelDB): Self = this.set("createNew", js.Any.fromFunction1(value))
  }
}
