package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropOptions extends js.Object {
  
  /** @deprecated: "attr" has been deprecated, please use "attribute" instead. */
  var attr: js.UndefOr[String] = js.native
  
  /**
    * The name of the associated DOM attribute.
    * Stencil uses different heuristics to determine the default name of the attribute,
    * but using this property, you can override the default behaviour.
    */
  var attribute: js.UndefOr[String | Null] = js.native
  
  /** @deprecated "connect" has been deprecated, please use ES modules and/or dynamic imports instead. */
  var connect: js.UndefOr[String] = js.native
  
  /** @deprecated "context" has been deprecated. */
  var context: js.UndefOr[String] = js.native
  
  /**
    * A Prop is _by default_ immutable from inside the component logic.
    * Once a value is set by a user, the component cannot update it internally.
    * However, it's possible to explicitly allow a Prop to be mutated from inside the component,
    * by setting this `mutable` option to `true`.
    */
  var mutable: js.UndefOr[Boolean] = js.native
  
  /**
    * In some cases it may be useful to keep a Prop in sync with an attribute.
    * In this case you can set the `reflect` option to `true`, since it defaults to `false`:
    */
  var reflect: js.UndefOr[Boolean] = js.native
  
  /** @deprecated "reflectToAttr" has been deprecated, please use "reflect" instead. */
  var reflectToAttr: js.UndefOr[Boolean] = js.native
}
object PropOptions {
  
  @scala.inline
  def apply(): PropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropOptions]
  }
  
  @scala.inline
  implicit class PropOptionsOps[Self <: PropOptions] (val x: Self) extends AnyVal {
    
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
    def setAttr(value: String): Self = this.set("attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttr: Self = this.set("attr", js.undefined)
    
    @scala.inline
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setAttributeNull: Self = this.set("attribute", null)
    
    @scala.inline
    def setConnect(value: String): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setMutable(value: Boolean): Self = this.set("mutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutable: Self = this.set("mutable", js.undefined)
    
    @scala.inline
    def setReflect(value: Boolean): Self = this.set("reflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReflect: Self = this.set("reflect", js.undefined)
    
    @scala.inline
    def setReflectToAttr(value: Boolean): Self = this.set("reflectToAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReflectToAttr: Self = this.set("reflectToAttr", js.undefined)
  }
}
