package typings.libraDashCore.libraDashCoreMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def LibraSignedTransaction(transaction: LibraTransaction, publicKey: Uint8Array, signature: Uint8Array): Unit = js.native
  def LibraSignedTransactionWithProof(signedTransaction: LibraSignedTransaction): Unit = js.native
  def LibraSignedTransactionWithProof(signedTransaction: LibraSignedTransaction, proof: js.Object): Unit = js.native
  def LibraSignedTransactionWithProof(
    signedTransaction: LibraSignedTransaction,
    proof: js.Object,
    events: js.Array[LibraTransactionEvent]
  ): Unit = js.native
  def LibraTransaction(
    program: LibraProgram,
    gasConstraint: LibraGasConstraint,
    expirationTime: default,
    sendersAddress: Uint8Array,
    sequenceNumber: default
  ): Unit = js.native
  def LibraTransactionEvent(data: Uint8Array, sequenceNumber: default): Unit = js.native
  def LibraTransactionEvent(data: Uint8Array, sequenceNumber: default, address: AccountAddress): Unit = js.native
  def LibraTransactionEvent(data: Uint8Array, sequenceNumber: default, address: AccountAddress, path: Uint8Array): Unit = js.native
  def LibraTransactionResponse(signedTransaction: LibraSignedTransaction, validatorId: Uint8Array): Unit = js.native
  def LibraTransactionResponse(signedTransaction: LibraSignedTransaction, validatorId: Uint8Array, acStatus: Double): Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: Double,
    mempoolStatus: Double
  ): Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: Double,
    mempoolStatus: Double,
    vmStatus: LibraVMStatusError
  ): Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: Double,
    mempoolStatus: LibraMempoolTransactionStatus
  ): Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: Double,
    mempoolStatus: LibraMempoolTransactionStatus,
    vmStatus: LibraVMStatusError
  ): Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus
  ): Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: Double
  ): Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: Double,
    vmStatus: LibraVMStatusError
  ): Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: LibraMempoolTransactionStatus
  ): Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: LibraMempoolTransactionStatus,
    vmStatus: LibraVMStatusError
  ): Unit = js.native
  def LibraVMStatusError(errorType: Double): Unit = js.native
  def LibraVMStatusError(errorType: Double, validationStatus: LibraValidationStatusError): Unit = js.native
  def LibraVMStatusError(
    errorType: Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError]
  ): Unit = js.native
  def LibraVMStatusError(
    errorType: Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError
  ): Unit = js.native
  def LibraVMStatusError(
    errorType: Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError
  ): Unit = js.native
  def LibraVMStatusError(
    errorType: Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError,
    executionError: LibraExecutionError
  ): Unit = js.native
  def LibraVMStatusError(errorType: LibraErrorType): Unit = js.native
  def LibraVMStatusError(errorType: LibraErrorType, validationStatus: LibraValidationStatusError): Unit = js.native
  def LibraVMStatusError(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError]
  ): Unit = js.native
  def LibraVMStatusError(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError
  ): Unit = js.native
  def LibraVMStatusError(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError
  ): Unit = js.native
  def LibraVMStatusError(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError,
    executionError: LibraExecutionError
  ): Unit = js.native
  def LibraVerificationStatusError(
    status: LibraVerificationStatusKind,
    moduleIndex: Double,
    error: LibraVerificationError,
    message: String
  ): Unit = js.native
  def Seed(data: Uint8Array): Unit = js.native
}

