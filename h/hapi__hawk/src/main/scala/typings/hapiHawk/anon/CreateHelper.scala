package typings.hapiHawk.anon

import typings.cryptoJs.mod.HasherHelper
import typings.cryptoJs.mod.HasherStatic
import typings.cryptoJs.mod.HmacHasherHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHelper extends js.Object {
  
  /**
    * Creates a shortcut function to a hasher's object interface.
    *
    * @param hasher The hasher to create a helper for.
    *
    * @return The shortcut function.
    *
    * @example
    *
    *     var SHA256 = CryptoJS.lib.Hasher._createHelper(CryptoJS.algo.SHA256);
    */
  def _createHelper(hasher: HasherStatic): HasherHelper = js.native
  
  /**
    * Creates a shortcut function to the HMAC's object interface.
    *
    * @param hasher The hasher to use in this HMAC helper.
    *
    * @return The shortcut function.
    *
    * @example
    *
    *     var HmacSHA256 = CryptoJS.lib.Hasher._createHmacHelper(CryptoJS.algo.SHA256);
    */
  def _createHmacHelper(hasher: HasherStatic): HmacHasherHelper = js.native
}
object CreateHelper {
  
  @scala.inline
  def apply(_createHelper: HasherStatic => HasherHelper, _createHmacHelper: HasherStatic => HmacHasherHelper): CreateHelper = {
    val __obj = js.Dynamic.literal(_createHelper = js.Any.fromFunction1(_createHelper), _createHmacHelper = js.Any.fromFunction1(_createHmacHelper))
    __obj.asInstanceOf[CreateHelper]
  }
  
  @scala.inline
  implicit class CreateHelperOps[Self <: CreateHelper] (val x: Self) extends AnyVal {
    
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
    def set_createHelper(value: HasherStatic => HasherHelper): Self = this.set("_createHelper", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_createHmacHelper(value: HasherStatic => HmacHasherHelper): Self = this.set("_createHmacHelper", js.Any.fromFunction1(value))
  }
}
