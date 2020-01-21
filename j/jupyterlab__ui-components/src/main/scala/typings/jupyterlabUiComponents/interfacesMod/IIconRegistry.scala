package typings.jupyterlabUiComponents.interfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabUiComponents.AnonContainerHTMLElement
import typings.jupyterlabUiComponents.AnonDiv
import typings.jupyterlabUiComponents.interfacesMod.Icon.IModel
import typings.jupyterlabUiComponents.interfacesMod.Icon.INodeOptions
import typings.phosphorCoreutils.mod.Token
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconRegistry extends js.Object {
  /**
    * Add the raw text representation of an svg icon to this registry
    */
  def addIcon(icons: IModel*): Unit
  /**
    * Check if any icon of name `name` has been registered.
    * Exact matches only
    */
  def contains(name: String): Boolean
  /**
    * Get the icon as an HTMLElement of tag <svg><svg/>
    */
  def icon(props: INodeOptions with AnonContainerHTMLElement): HTMLElement | Null
  /**
    * Get the icon as a ReactElement of tag <tag><svg><svg/><tag/>
    */
  def iconReact(props: INodeOptions with AnonDiv): ReactElement
}

@JSImport("@jupyterlab/ui-components/lib/icon/interfaces", "IIconRegistry")
@js.native
object IIconRegistry extends TopLevel[Token[IIconRegistry]]

