package typings.inversifyRestifyUtils.anon

import typings.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
import typings.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  options :std.Object,   path :inversify-restify-utils.inversify-restify-utils/dts/interfaces.interfaces.StrOrRegex} & std.Object */
@js.native
trait optionsObjectpathStrOrReg extends _RouteOptions {
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  var constructor: js.Function = js.native
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  def hasOwnProperty(v: PropertyKey): Boolean = js.native
  
  var options: js.Object = js.native
  
  var path: StrOrRegex = js.native
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
}
object optionsObjectpathStrOrReg {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    options: js.Object,
    path: StrOrRegex,
    propertyIsEnumerable: PropertyKey => Boolean
  ): optionsObjectpathStrOrReg = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[optionsObjectpathStrOrReg]
  }
  
  @scala.inline
  implicit class optionsObjectpathStrOrRegOps[Self <: optionsObjectpathStrOrReg] (val x: Self) extends AnyVal {
    
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
    def setConstructor(value: js.Function): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasOwnProperty(value: PropertyKey => Boolean): Self = this.set("hasOwnProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: StrOrRegex): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyIsEnumerable(value: PropertyKey => Boolean): Self = this.set("propertyIsEnumerable", js.Any.fromFunction1(value))
  }
}
