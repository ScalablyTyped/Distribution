package typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.added
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.fileType
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.modelFactory
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.removed
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.widgetExtension
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.widgetFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  */
trait IChangedArgs extends js.Object {
  /**
    * Whether the item was added or removed.
    */
  val change: added | removed
  /**
    * The name of the item or the widget factory being extended.
    */
  val name: String
  /**
    * The type of the changed item.
    */
  val `type`: widgetFactory | modelFactory | widgetExtension | fileType
}

object IChangedArgs {
  @scala.inline
  def apply(
    change: added | removed,
    name: String,
    `type`: widgetFactory | modelFactory | widgetExtension | fileType
  ): IChangedArgs = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs]
  }
}

