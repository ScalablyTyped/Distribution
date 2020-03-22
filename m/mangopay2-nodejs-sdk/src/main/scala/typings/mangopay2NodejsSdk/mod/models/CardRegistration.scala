package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.card.CardStatus
import typings.mangopay2NodejsSdk.mod.cardRegistration.CardRegistrationData
import typings.mangopay2NodejsSdk.mod.cardRegistration.CreateCardRegistration
import typings.mangopay2NodejsSdk.mod.cardRegistration.UpdateCardRegistration
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.CardRegistration")
@js.native
class CardRegistration protected ()
  extends EntityBase[CardRegistrationData]
     with CardRegistrationData {
  def this(data: CreateCardRegistration) = this()
  def this(data: UpdateCardRegistration) = this()
  /**
    * A special key to use when registering a card
    */
  /* CompleteClass */
  override var AccessKey: String = js.native
  /**
    * The ID of a card
    */
  /* CompleteClass */
  override var CardId: String = js.native
  /**
    * The URL to submit the card details form to
    */
  /* CompleteClass */
  override var CardRegistrationURL: String = js.native
  /**
    * The type of card
    */
  /* CompleteClass */
  override var CardType: typings.mangopay2NodejsSdk.mod.card.CardType = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The currency - should be ISO_4217 format
    */
  /* CompleteClass */
  override var Currency: CurrencyISO = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * A specific value to pass to the CardRegistrationURL
    */
  /* CompleteClass */
  override var PreregistrationData: String = js.native
  /**
    * Having registered a card, this confirmation hash needs to be updated to the card item
    */
  /* CompleteClass */
  override var RegistrationData: String = js.native
  /**
    * The result code
    */
  /* CompleteClass */
  override var ResultCode: String = js.native
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  override var ResultMessage: String = js.native
  /**
    * Status of the card registration
    */
  /* CompleteClass */
  override var Status: CardStatus = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  override var UserId: String = js.native
}

