package typings.jupyterlabObservables.modeldbMod.ModelDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating a `ModelDB` object.
  */
@js.native
trait ICreateOptions extends js.Object {
  
  /**
    * A ModelDB to use as the store for this
    * ModelDB. If none is given, it uses its own store.
    */
  var baseDB: js.UndefOr[typings.jupyterlabObservables.modeldbMod.ModelDB] = js.native
  
  /**
    * The base path to prepend to all the path arguments.
    */
  var basePath: js.UndefOr[String] = js.native
}
object ICreateOptions {
  
  @scala.inline
  def apply(): ICreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateOptions]
  }
  
  @scala.inline
  implicit class ICreateOptionsOps[Self <: ICreateOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseDB(value: typings.jupyterlabObservables.modeldbMod.ModelDB): Self = this.set("baseDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseDB: Self = this.set("baseDB", js.undefined)
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
  }
}
