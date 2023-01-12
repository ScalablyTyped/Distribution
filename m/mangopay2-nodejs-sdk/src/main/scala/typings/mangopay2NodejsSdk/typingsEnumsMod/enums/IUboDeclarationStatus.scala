package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INCOMPLETE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUboDeclarationStatus extends StObject {
  
  /**
    * When the UBO declaration was created
    */
  var Created: CREATED
  
  /**
    * When the UBO declaration was incomplete
    */
  var Incomplete: INCOMPLETE
  
  /**
    * When the UBO declaration was refused
    */
  var Refused: REFUSED
  
  /**
    * When the UBO declaration was validated
    */
  var Validated: VALIDATED
  
  /**
    * When validation has been requested for the UBO declaration
    */
  var ValidationAsked: VALIDATION_ASKED
}
object IUboDeclarationStatus {
  
  inline def apply(): IUboDeclarationStatus = {
    val __obj = js.Dynamic.literal(Created = "CREATED", Incomplete = "INCOMPLETE", Refused = "REFUSED", Validated = "VALIDATED", ValidationAsked = "VALIDATION_ASKED")
    __obj.asInstanceOf[IUboDeclarationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUboDeclarationStatus] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: CREATED): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setIncomplete(value: INCOMPLETE): Self = StObject.set(x, "Incomplete", value.asInstanceOf[js.Any])
    
    inline def setRefused(value: REFUSED): Self = StObject.set(x, "Refused", value.asInstanceOf[js.Any])
    
    inline def setValidated(value: VALIDATED): Self = StObject.set(x, "Validated", value.asInstanceOf[js.Any])
    
    inline def setValidationAsked(value: VALIDATION_ASKED): Self = StObject.set(x, "ValidationAsked", value.asInstanceOf[js.Any])
  }
}
