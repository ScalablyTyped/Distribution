package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.typingsModelsCardMod.card.CardStatus
import typings.mangopay2NodejsSdk.typingsModelsCardRegistrationMod.cardRegistration.CardRegistrationData
import typings.mangopay2NodejsSdk.typingsModelsCardRegistrationMod.cardRegistration.CreateCardRegistration
import typings.mangopay2NodejsSdk.typingsModelsCardRegistrationMod.cardRegistration.UpdateCardRegistration
import typings.mangopay2NodejsSdk.typingsTypesMod.CurrencyISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.CardRegistration")
@js.native
open class CardRegistration protected ()
  extends EntityBase[CardRegistrationData]
     with CardRegistrationData {
  def this(data: CreateCardRegistration) = this()
  def this(data: UpdateCardRegistration) = this()
  
  /**
    * A special key to use when registering a card
    */
  /* CompleteClass */
  var AccessKey: String = js.native
  
  /**
    * The ID of a card
    */
  /* CompleteClass */
  var CardId: String = js.native
  
  /**
    * The URL to submit the card details form to
    */
  /* CompleteClass */
  var CardRegistrationURL: String = js.native
  
  /**
    * The type of card
    */
  /* CompleteClass */
  var CardType: typings.mangopay2NodejsSdk.typingsModelsCardMod.card.CardType = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The currency - should be ISO_4217 format
    */
  /* CompleteClass */
  var Currency: CurrencyISO = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * A specific value to pass to the CardRegistrationURL
    */
  /* CompleteClass */
  var PreregistrationData: String = js.native
  
  /**
    * Having registered a card, this confirmation hash needs to be updated to the card item
    */
  /* CompleteClass */
  var RegistrationData: String = js.native
  
  /**
    * The result code
    */
  /* CompleteClass */
  var ResultCode: String = js.native
  
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  var ResultMessage: String = js.native
  
  /**
    * Status of the card registration
    */
  /* CompleteClass */
  var Status: CardStatus = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  var UserId: String = js.native
}
