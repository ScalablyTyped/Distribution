package typings.jsonBigint.mod

import typings.jsonBigint.jsonBigintStrings.error
import typings.jsonBigint.jsonBigintStrings.ignore
import typings.jsonBigint.jsonBigintStrings.preserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * @default false
    */
  var alwaysParseAsBig: js.UndefOr[Boolean] = js.native
  
  /**
    * @default 'error'
    */
  var constructorAction: js.UndefOr[error | ignore | preserve] = js.native
  
  /**
    * @default 'error'
    */
  var protoAction: js.UndefOr[error | ignore | preserve] = js.native
  
  /**
    * @default false
    */
  var storeAsString: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var useNativeBigInt: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAlwaysParseAsBig(value: Boolean): Self = this.set("alwaysParseAsBig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysParseAsBig: Self = this.set("alwaysParseAsBig", js.undefined)
    
    @scala.inline
    def setConstructorAction(value: error | ignore | preserve): Self = this.set("constructorAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstructorAction: Self = this.set("constructorAction", js.undefined)
    
    @scala.inline
    def setProtoAction(value: error | ignore | preserve): Self = this.set("protoAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtoAction: Self = this.set("protoAction", js.undefined)
    
    @scala.inline
    def setStoreAsString(value: Boolean): Self = this.set("storeAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreAsString: Self = this.set("storeAsString", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setUseNativeBigInt(value: Boolean): Self = this.set("useNativeBigInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeBigInt: Self = this.set("useNativeBigInt", js.undefined)
  }
}
