package typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsMod

import typings.atJupyterlabUiDashComponents.Anon_DivSpan
import typings.atJupyterlabUiDashComponents.libBlueprintMod.IButtonProps
import typings.atJupyterlabUiDashComponents.libBlueprintMod.IInputGroupProps
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IconNs.INodeOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.react.reactMod.DOMAttributes
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IIconRegistry: Token[typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry] = js.native
  val defaultIconRegistry: typings.atJupyterlabUiDashComponents.libIconIconregistryMod.IconRegistry = js.native
  def Button(props: IButtonProps with DOMAttributes[_]): Element = js.native
  def Collapse(
    props: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ICollapseProps */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def DefaultIconReact(props: INodeOptions with Anon_DivSpan): ReactElement = js.native
  def HTMLSelect(
    props: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IHTMLSelectProps */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def InputGroup(props: IInputGroupProps with DOMAttributes[_]): Element = js.native
  def Select(
    props: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISelectProps<any> */ js.Any) with DOMAttributes[_]
  ): Element = js.native
  def combineClasses(classNames: js.UndefOr[String]*): String = js.native
}

