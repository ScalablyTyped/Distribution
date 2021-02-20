package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPersonType extends StObject {
  
  var Legal: LEGAL = js.native
  
  var Natural: NATURAL = js.native
  
  var NotSpecified: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified = js.native
}
object IPersonType {
  
  @scala.inline
  def apply(Legal: LEGAL, Natural: NATURAL, NotSpecified: NotSpecified): IPersonType = {
    val __obj = js.Dynamic.literal(Legal = Legal.asInstanceOf[js.Any], Natural = Natural.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonType]
  }
  
  @scala.inline
  implicit class IPersonTypeMutableBuilder[Self <: IPersonType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegal(value: LEGAL): Self = StObject.set(x, "Legal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatural(value: NATURAL): Self = StObject.set(x, "Natural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSpecified(value: NotSpecified): Self = StObject.set(x, "NotSpecified", value.asInstanceOf[js.Any])
  }
}
