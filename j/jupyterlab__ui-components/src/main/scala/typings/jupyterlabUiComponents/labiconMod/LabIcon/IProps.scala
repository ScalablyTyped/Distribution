package typings.jupyterlabUiComponents.labiconMod.LabIcon

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.div
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.span
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The input props for creating a new LabIcon
  */
@js.native
trait IProps
  extends typings.jupyterlabUiComponents.styleIconMod.LabIconStyle.IProps {
  
  /**
    * Extra classNames. Used in addition to the typestyle className to
    * set the className of the icon's outermost container node
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * The icon's outermost node, which acts as a container for the actual
    * svg node. If container is not supplied, it will be created
    */
  var container: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Optional text label that will be added as a sibling to the icon's
    * svg node
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * HTML element tag used to create the icon's outermost container node,
    * if no container is passed in
    */
  var tag: js.UndefOr[div | span] = js.native
  
  /**
    * Optional title that will be set on the icon's outermost container node
    */
  var title: js.UndefOr[String] = js.native
}
object IProps {
  
  @scala.inline
  def apply(): IProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProps]
  }
  
  @scala.inline
  implicit class IPropsOps[Self <: IProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setTag(value: div | span): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
