package typings.luminoVirtualdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementSpecialAttrs extends js.Object {
  
  /**
    * The JS-safe name for the HTML `class` attribute.
    */
  val className: js.UndefOr[String] = js.native
  
  /**
    * The dataset for the rendered DOM element.
    */
  val dataset: js.UndefOr[ElementDataset] = js.native
  
  /**
    * The JS-safe name for the HTML `for` attribute.
    */
  val htmlFor: js.UndefOr[String] = js.native
  
  /**
    * The key id for the virtual element node.
    *
    * If a node is given a key id, the generated DOM node will not be
    * recreated during a rendering update if it only moves among its
    * siblings in the render tree.
    *
    * In general, reordering child nodes will cause the nodes to be
    * completely re-rendered. Keys allow this to be optimized away.
    *
    * If a key is provided, it must be unique among sibling nodes.
    */
  val key: js.UndefOr[String] = js.native
  
  /**
    * The inline style for the rendered DOM element.
    */
  val style: js.UndefOr[ElementInlineStyle] = js.native
}
object ElementSpecialAttrs {
  
  @scala.inline
  def apply(): ElementSpecialAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementSpecialAttrs]
  }
  
  @scala.inline
  implicit class ElementSpecialAttrsOps[Self <: ElementSpecialAttrs] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: ElementDataset): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setStyle(value: ElementInlineStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
