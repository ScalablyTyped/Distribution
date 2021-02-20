package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MixinOptions extends StObject {
  
  /**
    * @see _.chain
    */
  var chain: js.UndefOr[Boolean] = js.native
}
object MixinOptions {
  
  @scala.inline
  def apply(): MixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixinOptions]
  }
  
  @scala.inline
  implicit class MixinOptionsMutableBuilder[Self <: MixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChain(value: Boolean): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
  }
}
