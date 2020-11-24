package typings.jupyterlabStatedb.statedbMod.StateDB

import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The instantiation options for a state database.
  */
@js.native
trait IOptions[T /* <: ReadonlyPartialJSONValue */] extends js.Object {
  
  /**
    * Optional string key/value connector. Defaults to in-memory connector.
    */
  var connector: js.UndefOr[IDataConnector[String, String, String, String]] = js.native
  
  /**
    * An optional promise that resolves with a data transformation that is
    * applied to the database contents before the database begins resolving
    * client requests.
    */
  var transform: js.UndefOr[js.Promise[DataTransform[T]]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T /* <: ReadonlyPartialJSONValue */](): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T /* <: ReadonlyPartialJSONValue */] (val x: Self with IOptions[T]) extends AnyVal {
    
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
    def setConnector(value: IDataConnector[String, String, String, String]): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Promise[DataTransform[T]]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
