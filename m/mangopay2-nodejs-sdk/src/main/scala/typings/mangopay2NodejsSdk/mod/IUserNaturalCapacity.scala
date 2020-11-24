package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUserNaturalCapacity extends js.Object {
  
  /**
    * User used only for declaration purpose
    */
  var Declarative: DECLARATIVE = js.native
  
  /**
    * Real customer
    */
  var Normal: NORMAL = js.native
}
object IUserNaturalCapacity {
  
  @scala.inline
  def apply(Declarative: DECLARATIVE, Normal: NORMAL): IUserNaturalCapacity = {
    val __obj = js.Dynamic.literal(Declarative = Declarative.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserNaturalCapacity]
  }
  
  @scala.inline
  implicit class IUserNaturalCapacityOps[Self <: IUserNaturalCapacity] (val x: Self) extends AnyVal {
    
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
    def setDeclarative(value: DECLARATIVE): Self = this.set("Declarative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: NORMAL): Self = this.set("Normal", value.asInstanceOf[js.Any])
  }
}
