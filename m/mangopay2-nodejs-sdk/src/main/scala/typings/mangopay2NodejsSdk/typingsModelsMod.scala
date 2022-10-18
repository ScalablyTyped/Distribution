package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.anon.MakeKeysRequiredPartialUs
import typings.mangopay2NodejsSdk.anon.MakeKeysRequiredPartialUsAddress
import typings.mangopay2NodejsSdk.anon.PartialAddressData
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typings.mangopay2NodejsSdk.mod.models.EntityBase
import typings.mangopay2NodejsSdk.mod.models.ModelMethods
import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressData
import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address._AddressType
import typings.mangopay2NodejsSdk.typingsModelsUserMod.user.PersonType
import typings.mangopay2NodejsSdk.typingsModelsUserMod.user.UserLegalData
import typings.mangopay2NodejsSdk.typingsModelsUserMod.user.UserNaturalData
import typings.mangopay2NodejsSdk.typingsModelsWalletMod.wallet.CreateWallet
import typings.mangopay2NodejsSdk.typingsModelsWalletMod.wallet.UpdateWallet
import typings.mangopay2NodejsSdk.typingsModelsWalletMod.wallet.WalletData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsMod {
  
  object Models {
    
    @JSImport("mangopay2-nodejs-sdk/typings/models", "Models.Address")
    @js.native
    open class Address protected ()
      extends EntityBase[AddressData]
         with _AddressType {
      def this(data: PartialAddressData) = this()
    }
    
    @JSImport("mangopay2-nodejs-sdk/typings/models", "Models.BankAccountDetails")
    @js.native
    open class BankAccountDetails protected () extends StObject {
      def this(data: Any) = this()
    }
    
    @JSImport("mangopay2-nodejs-sdk/typings/models", "Models.Model")
    @js.native
    open class Model[T /* <: js.Object */] protected ()
      extends StObject
         with ModelMethods[T] {
      def this(data: T) = this()
      
      def setData(attribute: Any, value: Any): this.type = js.native
    }
    
    @JSImport("mangopay2-nodejs-sdk/typings/models", "Models.UserLegal")
    @js.native
    open class UserLegal protected () extends EntityBase[UserLegalData] {
      def this(data: MakeKeysRequiredPartialUs) = this()
      
      var PersonType: LEGAL = js.native
      
      /**
        * Sets the person type for the model
        * @param personType
        */
      def setPersonType(`type`: PersonType): Unit = js.native
    }
    
    @JSImport("mangopay2-nodejs-sdk/typings/models", "Models.UserNatural")
    @js.native
    open class UserNatural protected () extends EntityBase[UserNaturalData] {
      def this(data: MakeKeysRequiredPartialUsAddress) = this()
      
      var PersonType: NATURAL = js.native
      
      /**
        * Sets the person type for the model
        * @param personType
        */
      def setPersonType(`type`: PersonType): Unit = js.native
    }
    
    @JSImport("mangopay2-nodejs-sdk/typings/models", "Models.Wallet")
    @js.native
    open class Wallet protected () extends EntityBase[WalletData] {
      def this(data: CreateWallet) = this()
      def this(data: UpdateWallet) = this()
    }
  }
}
