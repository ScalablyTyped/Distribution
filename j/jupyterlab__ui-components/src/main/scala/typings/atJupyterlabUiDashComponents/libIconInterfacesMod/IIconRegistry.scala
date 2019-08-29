package typings.atJupyterlabUiDashComponents.libIconInterfacesMod

import typings.atJupyterlabUiDashComponents.Anon_ContainerHTMLElement
import typings.atJupyterlabUiDashComponents.Anon_Div
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IconNs.IModel
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IconNs.INodeOptions
import typings.react.reactMod.ReactElement
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
  def icon(props: INodeOptions with Anon_ContainerHTMLElement): HTMLElement | Null
  /**
    * Get the icon as a ReactElement of tag <tag><svg><svg/><tag/>
    */
  def iconReact(props: INodeOptions with Anon_Div): ReactElement
}

object IIconRegistry {
  @scala.inline
  def apply(
    addIcon: /* repeated */ IModel => Unit,
    contains: String => Boolean,
    icon: INodeOptions with Anon_ContainerHTMLElement => HTMLElement | Null,
    iconReact: INodeOptions with Anon_Div => ReactElement
  ): IIconRegistry = {
    val __obj = js.Dynamic.literal(addIcon = js.Any.fromFunction1(addIcon), contains = js.Any.fromFunction1(contains), icon = js.Any.fromFunction1(icon), iconReact = js.Any.fromFunction1(iconReact))
  
    __obj.asInstanceOf[IIconRegistry]
  }
}

