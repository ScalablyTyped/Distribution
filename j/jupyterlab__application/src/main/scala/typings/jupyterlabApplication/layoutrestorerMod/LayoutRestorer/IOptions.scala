package typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer

import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration options for layout restorer instantiation.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The data connector used for layout saving and fetching.
    */
  var connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String] = js.native
  
  /**
    * The initial promise that has to be resolved before restoration.
    *
    * #### Notes
    * This promise should equal the JupyterLab application `started` notifier.
    */
  var first: js.Promise[_] = js.native
  
  /**
    * The application command registry.
    */
  var registry: CommandRegistry = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String],
    first: js.Promise[_],
    registry: CommandRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setConnector(value: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String]): Self = this.set("connector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: js.Promise[_]): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistry(value: CommandRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
  }
}
