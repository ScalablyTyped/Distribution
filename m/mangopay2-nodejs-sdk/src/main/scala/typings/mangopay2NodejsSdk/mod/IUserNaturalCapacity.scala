package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUserNaturalCapacity extends StObject {
  
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
  implicit class IUserNaturalCapacityMutableBuilder[Self <: IUserNaturalCapacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclarative(value: DECLARATIVE): Self = StObject.set(x, "Declarative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: NORMAL): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
  }
}
