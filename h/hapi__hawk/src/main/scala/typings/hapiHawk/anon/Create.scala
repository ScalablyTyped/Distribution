package typings.hapiHawk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create extends js.Object {
  
  /**
    * Extends this object and runs the init method.
    * Arguments to create() will be passed to init().
    *
    * @return The new object.
    *
    * @example
    *
    *     var instance = MyType.create();
    */
  def create(args: js.Any*): js.Any = js.native
  
  /**
    * Creates a new object that inherits from this object.
    *
    * @param overrides Properties to copy into the new object.
    *
    * @return The new object.
    *
    * @example
    *
    *     var MyType = CryptoJS.lib.Base.extend({
    *         field: 'value',
    *
    *         method: function () {
    *         }
    *     });
    */
  def extend(overrides: js.Object): js.Any = js.native
  
  /**
    * Copies properties into this object.
    *
    * @param properties The properties to mix in.
    *
    * @example
    *
    *     MyType.mixIn({
    *         field: 'value'
    *     });
    */
  def mixIn(properties: js.Object): js.Any = js.native
}
object Create {
  
  @scala.inline
  def apply(create: /* repeated */ js.Any => js.Any, extend: js.Object => js.Any, mixIn: js.Object => js.Any): Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), mixIn = js.Any.fromFunction1(mixIn))
    __obj.asInstanceOf[Create]
  }
  
  @scala.inline
  implicit class CreateOps[Self <: Create] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: /* repeated */ js.Any => js.Any): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: js.Object => js.Any): Self = this.set("extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMixIn(value: js.Object => js.Any): Self = this.set("mixIn", js.Any.fromFunction1(value))
  }
}
