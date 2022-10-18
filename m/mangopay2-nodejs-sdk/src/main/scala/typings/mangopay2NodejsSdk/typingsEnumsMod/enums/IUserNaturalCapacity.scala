package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserNaturalCapacity extends StObject {
  
  /**
    * User used only for declaration purpose
    */
  var Declarative: DECLARATIVE
  
  /**
    * Real customer
    */
  var Normal: NORMAL
}
object IUserNaturalCapacity {
  
  inline def apply(): IUserNaturalCapacity = {
    val __obj = js.Dynamic.literal(Declarative = "DECLARATIVE", Normal = "NORMAL")
    __obj.asInstanceOf[IUserNaturalCapacity]
  }
  
  extension [Self <: IUserNaturalCapacity](x: Self) {
    
    inline def setDeclarative(value: DECLARATIVE): Self = StObject.set(x, "Declarative", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: NORMAL): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
  }
}
