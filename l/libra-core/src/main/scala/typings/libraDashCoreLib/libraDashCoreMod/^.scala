package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def LibraSignedTransaction(transaction: LibraTransaction, publicKey: stdLib.Uint8Array, signature: stdLib.Uint8Array): scala.Unit = js.native
  def LibraSignedTransactionWithProof(signedTransaction: LibraSignedTransaction): scala.Unit = js.native
  def LibraSignedTransactionWithProof(signedTransaction: LibraSignedTransaction, proof: js.Object): scala.Unit = js.native
  def LibraSignedTransactionWithProof(
    signedTransaction: LibraSignedTransaction,
    proof: js.Object,
    events: js.Array[LibraTransactionEvent]
  ): scala.Unit = js.native
  def LibraTransaction(
    program: LibraProgram,
    gasConstraint: LibraGasConstraint,
    expirationTime: bignumberDotJsLib.bignumberDotJsMod.default,
    sendersAddress: stdLib.Uint8Array,
    sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default
  ): scala.Unit = js.native
  def LibraTransactionEvent(data: stdLib.Uint8Array, sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default): scala.Unit = js.native
  def LibraTransactionEvent(
    data: stdLib.Uint8Array,
    sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default,
    address: AccountAddress
  ): scala.Unit = js.native
  def LibraTransactionEvent(
    data: stdLib.Uint8Array,
    sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default,
    address: AccountAddress,
    path: stdLib.Uint8Array
  ): scala.Unit = js.native
  def LibraTransactionResponse(signedTransaction: LibraSignedTransaction, validatorId: stdLib.Uint8Array): scala.Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: LibraAdmissionControlStatus
  ): scala.Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: LibraMempoolTransactionStatus
  ): scala.Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: LibraMempoolTransactionStatus,
    vmStatus: LibraVMStatusError
  ): scala.Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: scala.Double
  ): scala.Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: LibraAdmissionControlStatus,
    mempoolStatus: scala.Double,
    vmStatus: LibraVMStatusError
  ): scala.Unit = js.native
  def LibraTransactionResponse(signedTransaction: LibraSignedTransaction, validatorId: stdLib.Uint8Array, acStatus: scala.Double): scala.Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: scala.Double,
    mempoolStatus: LibraMempoolTransactionStatus
  ): scala.Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: scala.Double,
    mempoolStatus: LibraMempoolTransactionStatus,
    vmStatus: LibraVMStatusError
  ): scala.Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: scala.Double,
    mempoolStatus: scala.Double
  ): scala.Unit = js.native
  def LibraTransactionResponse(
    signedTransaction: LibraSignedTransaction,
    validatorId: stdLib.Uint8Array,
    acStatus: scala.Double,
    mempoolStatus: scala.Double,
    vmStatus: LibraVMStatusError
  ): scala.Unit = js.native
  def LibraVMStatusError(errorType: LibraErrorType): scala.Unit = js.native
  def LibraVMStatusError(errorType: LibraErrorType, validationStatus: LibraValidationStatusError): scala.Unit = js.native
  def LibraVMStatusError(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError]
  ): scala.Unit = js.native
  def LibraVMStatusError(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError
  ): scala.Unit = js.native
  def LibraVMStatusError(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError
  ): scala.Unit = js.native
  def LibraVMStatusError(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError,
    executionError: LibraExecutionError
  ): scala.Unit = js.native
  def LibraVMStatusError(errorType: scala.Double): scala.Unit = js.native
  def LibraVMStatusError(errorType: scala.Double, validationStatus: LibraValidationStatusError): scala.Unit = js.native
  def LibraVMStatusError(
    errorType: scala.Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError]
  ): scala.Unit = js.native
  def LibraVMStatusError(
    errorType: scala.Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError
  ): scala.Unit = js.native
  def LibraVMStatusError(
    errorType: scala.Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError
  ): scala.Unit = js.native
  def LibraVMStatusError(
    errorType: scala.Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError,
    executionError: LibraExecutionError
  ): scala.Unit = js.native
  def LibraVerificationStatusError(
    status: LibraVerificationStatusKind,
    moduleIndex: scala.Double,
    error: LibraVerificationError,
    message: java.lang.String
  ): scala.Unit = js.native
  def Seed(data: stdLib.Uint8Array): scala.Unit = js.native
}

