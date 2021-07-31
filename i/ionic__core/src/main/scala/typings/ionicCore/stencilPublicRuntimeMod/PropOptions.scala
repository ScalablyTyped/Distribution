package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropOptions extends StObject {
  
  /**
    * The name of the associated DOM attribute.
    * Stencil uses different heuristics to determine the default name of the attribute,
    * but using this property, you can override the default behaviour.
    */
  var attribute: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Prop is _by default_ immutable from inside the component logic.
    * Once a value is set by a user, the component cannot update it internally.
    * However, it's possible to explicitly allow a Prop to be mutated from inside the component,
    * by setting this `mutable` option to `true`.
    */
  var mutable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In some cases it may be useful to keep a Prop in sync with an attribute.
    * In this case you can set the `reflect` option to `true`, since it defaults to `false`:
    */
  var reflect: js.UndefOr[Boolean] = js.undefined
}
object PropOptions {
  
  @scala.inline
  def apply(): PropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropOptions]
  }
  
  @scala.inline
  implicit class PropOptionsMutableBuilder[Self <: PropOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNull: Self = StObject.set(x, "attribute", null)
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    @scala.inline
    def setMutable(value: Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
    
    @scala.inline
    def setReflect(value: Boolean): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
  }
}
