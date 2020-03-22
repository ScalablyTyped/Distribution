package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserNaturalCapacity extends js.Object {
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
  @scala.inline
  def apply(Declarative: DECLARATIVE, Normal: NORMAL): IUserNaturalCapacity = {
    val __obj = js.Dynamic.literal(Declarative = Declarative.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUserNaturalCapacity]
  }
}

