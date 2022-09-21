package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.anon.PartialDisputeDocumentDat
import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOptionWithoutResponse
import typings.mangopay2NodejsSdk.baseMod.base.MethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.NoArgMethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.ThreeArgsMethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.TwoArgsMethodOverload
import typings.mangopay2NodejsSdk.baseMod.base.WithResponse
import typings.mangopay2NodejsSdk.disputeDocumentMod.disputeDocument.CreateDisputeDocument
import typings.mangopay2NodejsSdk.disputeDocumentMod.disputeDocument.CreateDisputeDocumentPage
import typings.mangopay2NodejsSdk.disputeDocumentMod.disputeDocument.DisputeDocumentData
import typings.mangopay2NodejsSdk.disputeMod.dispute.DisputeData
import typings.mangopay2NodejsSdk.disputeMod.dispute.UpdateDispute
import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.repudiationMod.repudiation.RepudiationData
import typings.mangopay2NodejsSdk.settlementTransferMod.settlementTransfer.CreateSettlementTransfer
import typings.mangopay2NodejsSdk.settlementTransferMod.settlementTransfer.SettlementTransferData
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disputesMod {
  
  @JSImport("mangopay2-nodejs-sdk/typings/services/Disputes", "Disputes")
  @js.native
  open class Disputes () extends StObject {
    
    /**
      * Close dispute
      * @param disputeId
      * @param options
      */
    def closeDispute(data: String): js.Promise[DisputeData] = js.native
    /**
      * Close dispute
      * @param disputeId
      * @param options
      */
    def closeDispute(data: String, callback: js.Function1[/* data */ DisputeData, Unit]): Unit = js.native
    /**
      * Close dispute
      * @param disputeId
      * @param options
      */
    def closeDispute(
      data: String,
      callback: js.Function1[/* data */ WithResponse[DisputeData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def closeDispute(
      data: String,
      callback: js.Function1[/* data */ DisputeData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Close dispute
      * @param disputeId
      * @param options
      */
    def closeDispute(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeData]] = js.native
    def closeDispute(data: String, options: MethodOptionWithoutResponse): js.Promise[DisputeData] = js.native
    /**
      * Close dispute
      * @param disputeId
      * @param options
      */
    @JSName("closeDispute")
    var closeDispute_Original: MethodOverload[String, DisputeData] = js.native
    
    /**
      * Contest dispute
      * @param disputeId
      * @param contestedFunds
      * @param options
      */
    def contestDispute(data: String, extra: MoneyData): js.Promise[DisputeData] = js.native
    /**
      * Contest dispute
      * @param disputeId
      * @param contestedFunds
      * @param options
      */
    def contestDispute(
      data: String,
      extra: MoneyData,
      callback: js.Function1[(/* data */ DisputeData) | (/* data */ WithResponse[DisputeData]), Unit]
    ): Unit = js.native
    def contestDispute(
      data: String,
      extra: MoneyData,
      callback: js.Function1[/* data */ WithResponse[DisputeData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def contestDispute(
      data: String,
      extra: MoneyData,
      callback: js.Function1[/* data */ DisputeData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Contest dispute
      * @param disputeId
      * @param contestedFunds
      * @param options
      */
    def contestDispute(data: String, extra: MoneyData, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeData]] = js.native
    def contestDispute(data: String, extra: MoneyData, options: MethodOptionWithoutResponse): js.Promise[DisputeData] = js.native
    /**
      * Contest dispute
      * @param disputeId
      * @param contestedFunds
      * @param options
      */
    @JSName("contestDispute")
    var contestDispute_Original: TwoArgsMethodOverload[String, MoneyData, DisputeData] = js.native
    
    /**
      * Creates document for dispute
      * @param disputeId
      * @param disputeDocument
      * @param options
      */
    def createDisputeDocument(data: String, extra: CreateDisputeDocument): js.Promise[DisputeDocumentData] = js.native
    /**
      * Creates document for dispute
      * @param disputeId
      * @param disputeDocument
      * @param options
      */
    def createDisputeDocument(
      data: String,
      extra: CreateDisputeDocument,
      callback: js.Function1[
          (/* data */ DisputeDocumentData) | (/* data */ WithResponse[DisputeDocumentData]), 
          Unit
        ]
    ): Unit = js.native
    def createDisputeDocument(
      data: String,
      extra: CreateDisputeDocument,
      callback: js.Function1[/* data */ WithResponse[DisputeDocumentData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createDisputeDocument(
      data: String,
      extra: CreateDisputeDocument,
      callback: js.Function1[/* data */ DisputeDocumentData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Creates document for dispute
      * @param disputeId
      * @param disputeDocument
      * @param options
      */
    def createDisputeDocument(data: String, extra: CreateDisputeDocument, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeDocumentData]] = js.native
    def createDisputeDocument(data: String, extra: CreateDisputeDocument, options: MethodOptionWithoutResponse): js.Promise[DisputeDocumentData] = js.native
    
    /**
      * Creates document's page for dispute
      * @param disputeId
      * @param disputeDocumentId
      * @param disputeDocumentPage
      * @param options
      */
    def createDisputeDocumentPage(data: String, extra: String, lastArg: CreateDisputeDocumentPage): js.Promise[DisputeDocumentData] = js.native
    /**
      * Creates document's page for dispute
      * @param disputeId
      * @param disputeDocumentId
      * @param disputeDocumentPage
      * @param options
      */
    def createDisputeDocumentPage(
      data: String,
      extra: String,
      lastArg: CreateDisputeDocumentPage,
      callback: js.Function1[
          (/* data */ DisputeDocumentData) | (/* data */ WithResponse[DisputeDocumentData]), 
          Unit
        ]
    ): Unit = js.native
    def createDisputeDocumentPage(
      data: String,
      extra: String,
      lastArg: CreateDisputeDocumentPage,
      callback: js.Function1[/* data */ WithResponse[DisputeDocumentData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createDisputeDocumentPage(
      data: String,
      extra: String,
      lastArg: CreateDisputeDocumentPage,
      callback: js.Function1[/* data */ DisputeDocumentData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Creates document's page for dispute
      * @param disputeId
      * @param disputeDocumentId
      * @param disputeDocumentPage
      * @param options
      */
    def createDisputeDocumentPage(data: String, extra: String, lastArg: CreateDisputeDocumentPage, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeDocumentData]] = js.native
    def createDisputeDocumentPage(
      data: String,
      extra: String,
      lastArg: CreateDisputeDocumentPage,
      options: MethodOptionWithoutResponse
    ): js.Promise[DisputeDocumentData] = js.native
    
    /**
      * Creates document's page for dispute from file
      * @param disputeId
      * @param disputeDocumentId
      * @param file
      * @param options
      */
    def createDisputeDocumentPageFromFile(data: String, extra: String, lastArg: String): js.Promise[DisputeDocumentData] = js.native
    /**
      * Creates document's page for dispute from file
      * @param disputeId
      * @param disputeDocumentId
      * @param file
      * @param options
      */
    def createDisputeDocumentPageFromFile(
      data: String,
      extra: String,
      lastArg: String,
      callback: js.Function1[
          (/* data */ DisputeDocumentData) | (/* data */ WithResponse[DisputeDocumentData]), 
          Unit
        ]
    ): Unit = js.native
    def createDisputeDocumentPageFromFile(
      data: String,
      extra: String,
      lastArg: String,
      callback: js.Function1[/* data */ WithResponse[DisputeDocumentData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createDisputeDocumentPageFromFile(
      data: String,
      extra: String,
      lastArg: String,
      callback: js.Function1[/* data */ DisputeDocumentData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Creates document's page for dispute from file
      * @param disputeId
      * @param disputeDocumentId
      * @param file
      * @param options
      */
    def createDisputeDocumentPageFromFile(data: String, extra: String, lastArg: String, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeDocumentData]] = js.native
    def createDisputeDocumentPageFromFile(data: String, extra: String, lastArg: String, options: MethodOptionWithoutResponse): js.Promise[DisputeDocumentData] = js.native
    /**
      * Creates document's page for dispute from file
      * @param disputeId
      * @param disputeDocumentId
      * @param file
      * @param options
      */
    @JSName("createDisputeDocumentPageFromFile")
    var createDisputeDocumentPageFromFile_Original: ThreeArgsMethodOverload[String, String, String, DisputeDocumentData] = js.native
    
    /**
      * Creates document's page for dispute
      * @param disputeId
      * @param disputeDocumentId
      * @param disputeDocumentPage
      * @param options
      */
    @JSName("createDisputeDocumentPage")
    var createDisputeDocumentPage_Original: ThreeArgsMethodOverload[String, String, CreateDisputeDocumentPage, DisputeDocumentData] = js.native
    
    /**
      * Creates document for dispute
      * @param disputeId
      * @param disputeDocument
      * @param options
      */
    @JSName("createDisputeDocument")
    var createDisputeDocument_Original: TwoArgsMethodOverload[String, CreateDisputeDocument, DisputeDocumentData] = js.native
    
    /**
      * Creates settlement transfer
      * @param settlementTransfer
      * @param repudiationId
      * @param options
      */
    def createSettlementTransfer(data: CreateSettlementTransfer, extra: String): js.Promise[SettlementTransferData] = js.native
    /**
      * Creates settlement transfer
      * @param settlementTransfer
      * @param repudiationId
      * @param options
      */
    def createSettlementTransfer(
      data: CreateSettlementTransfer,
      extra: String,
      callback: js.Function1[
          (/* data */ SettlementTransferData) | (/* data */ WithResponse[SettlementTransferData]), 
          Unit
        ]
    ): Unit = js.native
    def createSettlementTransfer(
      data: CreateSettlementTransfer,
      extra: String,
      callback: js.Function1[/* data */ WithResponse[SettlementTransferData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def createSettlementTransfer(
      data: CreateSettlementTransfer,
      extra: String,
      callback: js.Function1[/* data */ SettlementTransferData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Creates settlement transfer
      * @param settlementTransfer
      * @param repudiationId
      * @param options
      */
    def createSettlementTransfer(data: CreateSettlementTransfer, extra: String, options: MethodOptionWithResponse): js.Promise[WithResponse[SettlementTransferData]] = js.native
    def createSettlementTransfer(data: CreateSettlementTransfer, extra: String, options: MethodOptionWithoutResponse): js.Promise[SettlementTransferData] = js.native
    /**
      * Creates settlement transfer
      * @param settlementTransfer
      * @param repudiationId
      * @param options
      */
    @JSName("createSettlementTransfer")
    var createSettlementTransfer_Original: TwoArgsMethodOverload[CreateSettlementTransfer, String, SettlementTransferData] = js.native
    
    /**
      * Get dispute
      * @param disputeId
      * @param options
      */
    def get(data: String): js.Promise[DisputeData] = js.native
    /**
      * Get dispute
      * @param disputeId
      * @param options
      */
    def get(data: String, callback: js.Function1[/* data */ DisputeData, Unit]): Unit = js.native
    /**
      * Get dispute
      * @param disputeId
      * @param options
      */
    def get(
      data: String,
      callback: js.Function1[/* data */ WithResponse[DisputeData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def get(
      data: String,
      callback: js.Function1[/* data */ DisputeData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get dispute
      * @param disputeId
      * @param options
      */
    def get(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeData]] = js.native
    def get(data: String, options: MethodOptionWithoutResponse): js.Promise[DisputeData] = js.native
    
    /**
      * Get all disputes
      * @param options
      */
    def getAll(): js.Promise[js.Array[DisputeData]] = js.native
    /**
      * Get all disputes
      * @param options
      */
    def getAll(
      callback: js.Function1[
          (/* data */ js.Array[DisputeData]) | (/* data */ WithResponse[js.Array[DisputeData]]), 
          Unit
        ]
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ WithResponse[js.Array[DisputeData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getAll(
      callback: js.Function1[/* data */ js.Array[DisputeData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Get all disputes
      * @param options
      */
    def getAll(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[DisputeData]]] = js.native
    def getAll(options: MethodOptionWithoutResponse): js.Promise[js.Array[DisputeData]] = js.native
    /**
      * Get all disputes
      * @param options
      */
    @JSName("getAll")
    var getAll_Original: NoArgMethodOverload[js.Array[DisputeData]] = js.native
    
    /**
      * Gets user's disputes
      * @param userId
      * @param options
      */
    def getDisputesForUser(data: String): js.Promise[js.Array[DisputeData]] = js.native
    /**
      * Gets user's disputes
      * @param userId
      * @param options
      */
    def getDisputesForUser(data: String, callback: js.Function1[/* data */ js.Array[DisputeData], Unit]): Unit = js.native
    /**
      * Gets user's disputes
      * @param userId
      * @param options
      */
    def getDisputesForUser(
      data: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[DisputeData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getDisputesForUser(
      data: String,
      callback: js.Function1[/* data */ js.Array[DisputeData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Gets user's disputes
      * @param userId
      * @param options
      */
    def getDisputesForUser(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[DisputeData]]] = js.native
    def getDisputesForUser(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[DisputeData]] = js.native
    /**
      * Gets user's disputes
      * @param userId
      * @param options
      */
    @JSName("getDisputesForUser")
    var getDisputesForUser_Original: MethodOverload[String, js.Array[DisputeData]] = js.native
    
    /**
      * Gets dispute's documents for wallet
      * @param walletId
      * @param options
      */
    def getDisputesForWallet(data: String): js.Promise[js.Array[DisputeData]] = js.native
    /**
      * Gets dispute's documents for wallet
      * @param walletId
      * @param options
      */
    def getDisputesForWallet(data: String, callback: js.Function1[/* data */ js.Array[DisputeData], Unit]): Unit = js.native
    /**
      * Gets dispute's documents for wallet
      * @param walletId
      * @param options
      */
    def getDisputesForWallet(
      data: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[DisputeData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getDisputesForWallet(
      data: String,
      callback: js.Function1[/* data */ js.Array[DisputeData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Gets dispute's documents for wallet
      * @param walletId
      * @param options
      */
    def getDisputesForWallet(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[DisputeData]]] = js.native
    def getDisputesForWallet(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[DisputeData]] = js.native
    /**
      * Gets dispute's documents for wallet
      * @param walletId
      * @param options
      */
    @JSName("getDisputesForWallet")
    var getDisputesForWallet_Original: MethodOverload[String, js.Array[DisputeData]] = js.native
    
    /**
      * Gets documents for dispute
      * @param disputeId
      * @param options
      */
    def getDocumentsForDispute(data: String): js.Promise[js.Array[DisputeDocumentData]] = js.native
    /**
      * Gets documents for dispute
      * @param disputeId
      * @param options
      */
    def getDocumentsForDispute(data: String, callback: js.Function1[/* data */ js.Array[DisputeDocumentData], Unit]): Unit = js.native
    /**
      * Gets documents for dispute
      * @param disputeId
      * @param options
      */
    def getDocumentsForDispute(
      data: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[DisputeDocumentData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getDocumentsForDispute(
      data: String,
      callback: js.Function1[/* data */ js.Array[DisputeDocumentData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Gets documents for dispute
      * @param disputeId
      * @param options
      */
    def getDocumentsForDispute(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[DisputeDocumentData]]] = js.native
    def getDocumentsForDispute(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[DisputeDocumentData]] = js.native
    /**
      * Gets documents for dispute
      * @param disputeId
      * @param options
      */
    @JSName("getDocumentsForDispute")
    var getDocumentsForDispute_Original: MethodOverload[String, js.Array[DisputeDocumentData]] = js.native
    
    /**
      * Retrieve a list of Disputes pending settlement
      * @param options
      */
    def getPendingSettlement(): js.Promise[js.Array[DisputeData]] = js.native
    /**
      * Retrieve a list of Disputes pending settlement
      * @param options
      */
    def getPendingSettlement(
      callback: js.Function1[
          (/* data */ js.Array[DisputeData]) | (/* data */ WithResponse[js.Array[DisputeData]]), 
          Unit
        ]
    ): Unit = js.native
    def getPendingSettlement(
      callback: js.Function1[/* data */ WithResponse[js.Array[DisputeData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getPendingSettlement(
      callback: js.Function1[/* data */ js.Array[DisputeData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Retrieve a list of Disputes pending settlement
      * @param options
      */
    def getPendingSettlement(options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[DisputeData]]] = js.native
    def getPendingSettlement(options: MethodOptionWithoutResponse): js.Promise[js.Array[DisputeData]] = js.native
    /**
      * Retrieve a list of Disputes pending settlement
      * @param options
      */
    @JSName("getPendingSettlement")
    var getPendingSettlement_Original: NoArgMethodOverload[js.Array[DisputeData]] = js.native
    
    /**
      * Gets repudiation
      * @param repudiationId
      * @param options
      */
    def getRepudiation(data: String): js.Promise[js.Array[RepudiationData]] = js.native
    /**
      * Gets repudiation
      * @param repudiationId
      * @param options
      */
    def getRepudiation(data: String, callback: js.Function1[/* data */ js.Array[RepudiationData], Unit]): Unit = js.native
    /**
      * Gets repudiation
      * @param repudiationId
      * @param options
      */
    def getRepudiation(
      data: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[RepudiationData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getRepudiation(
      data: String,
      callback: js.Function1[/* data */ js.Array[RepudiationData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Gets repudiation
      * @param repudiationId
      * @param options
      */
    def getRepudiation(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[RepudiationData]]] = js.native
    def getRepudiation(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[RepudiationData]] = js.native
    /**
      * Gets repudiation
      * @param repudiationId
      * @param options
      */
    @JSName("getRepudiation")
    var getRepudiation_Original: MethodOverload[String, js.Array[RepudiationData]] = js.native
    
    /**
      * Gets settlement transfer
      * @param settlementTransferId
      * @param options
      */
    def getSettlementTransfer(data: String): js.Promise[SettlementTransferData] = js.native
    /**
      * Gets settlement transfer
      * @param settlementTransferId
      * @param options
      */
    def getSettlementTransfer(data: String, callback: js.Function1[/* data */ SettlementTransferData, Unit]): Unit = js.native
    /**
      * Gets settlement transfer
      * @param settlementTransferId
      * @param options
      */
    def getSettlementTransfer(
      data: String,
      callback: js.Function1[/* data */ WithResponse[SettlementTransferData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getSettlementTransfer(
      data: String,
      callback: js.Function1[/* data */ SettlementTransferData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Gets settlement transfer
      * @param settlementTransferId
      * @param options
      */
    def getSettlementTransfer(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[SettlementTransferData]] = js.native
    def getSettlementTransfer(data: String, options: MethodOptionWithoutResponse): js.Promise[SettlementTransferData] = js.native
    /**
      * Gets settlement transfer
      * @param settlementTransferId
      * @param options
      */
    @JSName("getSettlementTransfer")
    var getSettlementTransfer_Original: MethodOverload[String, SettlementTransferData] = js.native
    
    /**
      * Gets dispute's transactions
      * @param disputeId
      * @param options
      */
    def getTransactions(data: String): js.Promise[js.Array[TransactionData]] = js.native
    /**
      * Gets dispute's transactions
      * @param disputeId
      * @param options
      */
    def getTransactions(data: String, callback: js.Function1[/* data */ js.Array[TransactionData], Unit]): Unit = js.native
    /**
      * Gets dispute's transactions
      * @param disputeId
      * @param options
      */
    def getTransactions(
      data: String,
      callback: js.Function1[/* data */ WithResponse[js.Array[TransactionData]], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def getTransactions(
      data: String,
      callback: js.Function1[/* data */ js.Array[TransactionData], Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Gets dispute's transactions
      * @param disputeId
      * @param options
      */
    def getTransactions(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[js.Array[TransactionData]]] = js.native
    def getTransactions(data: String, options: MethodOptionWithoutResponse): js.Promise[js.Array[TransactionData]] = js.native
    /**
      * Gets dispute's transactions
      * @param disputeId
      * @param options
      */
    @JSName("getTransactions")
    var getTransactions_Original: MethodOverload[String, js.Array[TransactionData]] = js.native
    
    /**
      * Get dispute
      * @param disputeId
      * @param options
      */
    @JSName("get")
    var get_Original: MethodOverload[String, DisputeData] = js.native
    
    /**
      * This method is used to resubmit a Dispute if it is reopened requiring more docs
      * @param disputeId
      * @param options
      */
    def resubmitDispute(data: String): js.Promise[DisputeData] = js.native
    /**
      * This method is used to resubmit a Dispute if it is reopened requiring more docs
      * @param disputeId
      * @param options
      */
    def resubmitDispute(data: String, callback: js.Function1[/* data */ DisputeData, Unit]): Unit = js.native
    /**
      * This method is used to resubmit a Dispute if it is reopened requiring more docs
      * @param disputeId
      * @param options
      */
    def resubmitDispute(
      data: String,
      callback: js.Function1[/* data */ WithResponse[DisputeData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def resubmitDispute(
      data: String,
      callback: js.Function1[/* data */ DisputeData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * This method is used to resubmit a Dispute if it is reopened requiring more docs
      * @param disputeId
      * @param options
      */
    def resubmitDispute(data: String, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeData]] = js.native
    def resubmitDispute(data: String, options: MethodOptionWithoutResponse): js.Promise[DisputeData] = js.native
    /**
      * This method is used to resubmit a Dispute if it is reopened requiring more docs
      * @param disputeId
      * @param options
      */
    @JSName("resubmitDispute")
    var resubmitDispute_Original: MethodOverload[String, DisputeData] = js.native
    
    /**
      * Update dispute's tag
      * @param dispute
      * @param options
      */
    def update(data: UpdateDispute): js.Promise[DisputeData] = js.native
    /**
      * Update dispute's tag
      * @param dispute
      * @param options
      */
    def update(data: UpdateDispute, callback: js.Function1[/* data */ DisputeData, Unit]): Unit = js.native
    /**
      * Update dispute's tag
      * @param dispute
      * @param options
      */
    def update(
      data: UpdateDispute,
      callback: js.Function1[/* data */ WithResponse[DisputeData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def update(
      data: UpdateDispute,
      callback: js.Function1[/* data */ DisputeData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Update dispute's tag
      * @param dispute
      * @param options
      */
    def update(data: UpdateDispute, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeData]] = js.native
    def update(data: UpdateDispute, options: MethodOptionWithoutResponse): js.Promise[DisputeData] = js.native
    
    /**
      * Update dispute document
      * @param disputeId
      * @param disputeDocument
      * @param options
      */
    def updateDisputeDocument(data: String, extra: PartialDisputeDocumentDat): js.Promise[DisputeDocumentData] = js.native
    /**
      * Update dispute document
      * @param disputeId
      * @param disputeDocument
      * @param options
      */
    def updateDisputeDocument(
      data: String,
      extra: PartialDisputeDocumentDat,
      callback: js.Function1[
          (/* data */ DisputeDocumentData) | (/* data */ WithResponse[DisputeDocumentData]), 
          Unit
        ]
    ): Unit = js.native
    def updateDisputeDocument(
      data: String,
      extra: PartialDisputeDocumentDat,
      callback: js.Function1[/* data */ WithResponse[DisputeDocumentData], Unit],
      options: MethodOptionWithResponse
    ): Unit = js.native
    def updateDisputeDocument(
      data: String,
      extra: PartialDisputeDocumentDat,
      callback: js.Function1[/* data */ DisputeDocumentData, Unit],
      options: MethodOptionWithoutResponse
    ): Unit = js.native
    /**
      * Update dispute document
      * @param disputeId
      * @param disputeDocument
      * @param options
      */
    def updateDisputeDocument(data: String, extra: PartialDisputeDocumentDat, options: MethodOptionWithResponse): js.Promise[WithResponse[DisputeDocumentData]] = js.native
    def updateDisputeDocument(data: String, extra: PartialDisputeDocumentDat, options: MethodOptionWithoutResponse): js.Promise[DisputeDocumentData] = js.native
    /**
      * Update dispute document
      * @param disputeId
      * @param disputeDocument
      * @param options
      */
    @JSName("updateDisputeDocument")
    var updateDisputeDocument_Original: TwoArgsMethodOverload[String, PartialDisputeDocumentDat, DisputeDocumentData] = js.native
    
    /**
      * Update dispute's tag
      * @param dispute
      * @param options
      */
    @JSName("update")
    var update_Original: MethodOverload[UpdateDispute, DisputeData] = js.native
  }
}
