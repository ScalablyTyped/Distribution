package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @OutputOnly The app type the restriction applies to for mobile device.
  */
@js.native
trait SchemaAppContext extends js.Object {
  
  /**
    * The app types this restriction applies to.
    */
  var appTypes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAppContext {
  
  @scala.inline
  def apply(): SchemaAppContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppContext]
  }
  
  @scala.inline
  implicit class SchemaAppContextOps[Self <: SchemaAppContext] (val x: Self) extends AnyVal {
    
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
    def setAppTypesVarargs(value: String*): Self = this.set("appTypes", js.Array(value :_*))
    
    @scala.inline
    def setAppTypes(value: js.Array[String]): Self = this.set("appTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppTypes: Self = this.set("appTypes", js.undefined)
  }
}
