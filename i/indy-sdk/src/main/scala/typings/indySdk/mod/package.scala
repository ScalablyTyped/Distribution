package typings.indySdk.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.buffer.mod.Buffer
import typings.indySdk.anon.Issuancetype
import typings.indySdk.indySdkInts.`0`
import typings.indySdk.indySdkStrings.CL_ACCUM
import typings.indySdk.indySdkStrings.CONFIG
import typings.indySdk.indySdkStrings.DOMAIN
import typings.indySdk.indySdkStrings.POOL
import typings.indySdk.indySdkStrings.debug
import typings.indySdk.indySdkStrings.info
import typings.indySdk.indySdkStrings.trace
import typings.indySdk.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def abbreviateVerkey(did: Did, fullVerkey: Verkey): js.Promise[Verkey] = (^.asInstanceOf[js.Dynamic].applyDynamic("abbreviateVerkey")(did.asInstanceOf[js.Any], fullVerkey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Verkey]]

inline def addWalletRecord(wh: WalletHandle, `type`: String, id: String, value: String, tags: Tags): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addWalletRecord")(wh.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def addWalletRecordTags(wh: WalletHandle, `type`: String, id: String, tags: Tags): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addWalletRecordTags")(wh.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def appendTxnAuthorAgreementAcceptanceToRequest(
  request: LedgerRequest,
  text: String,
  version: String,
  digest: String,
  accMechType: String,
  timeOfAcceptance: Double
): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTxnAuthorAgreementAcceptanceToRequest")(request.asInstanceOf[js.Any], text.asInstanceOf[js.Any], version.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], accMechType.asInstanceOf[js.Any], timeOfAcceptance.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildAttribRequest(submitterDid: Did, targetDid: Did): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildAttribRequest(submitterDid: Did, targetDid: Did, hash: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildAttribRequest(submitterDid: Did, targetDid: Did, hash: String, raw: Null, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildAttribRequest(submitterDid: Did, targetDid: Did, hash: String, raw: Record[String, Any]): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildAttribRequest(submitterDid: Did, targetDid: Did, hash: String, raw: Record[String, Any], enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildAttribRequest(submitterDid: Did, targetDid: Did, hash: Null, raw: Null, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildAttribRequest(submitterDid: Did, targetDid: Did, hash: Null, raw: Record[String, Any]): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildAttribRequest(submitterDid: Did, targetDid: Did, hash: Null, raw: Record[String, Any], enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildCredDefRequest(submitterDid: Did, credDef: CredDef): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCredDefRequest")(submitterDid.asInstanceOf[js.Any], credDef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetAcceptanceMechanismsRequest(): js.Promise[LedgerRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAcceptanceMechanismsRequest")().asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAcceptanceMechanismsRequest(submitterDid: Did): js.Promise[LedgerRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAcceptanceMechanismsRequest")(submitterDid.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetAttribRequest(submitterDid: Null, targetDid: Did): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Null, targetDid: Did, raw: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Null, targetDid: Did, raw: String, hash: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Null, targetDid: Did, raw: String, hash: String, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Null, targetDid: Did, raw: String, hash: Null, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Null, targetDid: Did, raw: Null, hash: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Null, targetDid: Did, raw: Null, hash: String, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Null, targetDid: Did, raw: Null, hash: Null, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Did, targetDid: Did): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Did, targetDid: Did, raw: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Did, targetDid: Did, raw: String, hash: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Did, targetDid: Did, raw: String, hash: String, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Did, targetDid: Did, raw: String, hash: Null, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Did, targetDid: Did, raw: Null, hash: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Did, targetDid: Did, raw: Null, hash: String, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetAttribRequest(submitterDid: Did, targetDid: Did, raw: Null, hash: Null, enc: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetAttribRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetCredDefRequest(submitterDid: Null, credDefId: CredDefId): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetCredDefRequest")(submitterDid.asInstanceOf[js.Any], credDefId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetCredDefRequest(submitterDid: Did, credDefId: CredDefId): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetCredDefRequest")(submitterDid.asInstanceOf[js.Any], credDefId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetNymRequest(submitterDid: Null, targetDid: Did): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetNymRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetNymRequest(submitterDid: Did, targetDid: Did): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetNymRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetRevocRegDefRequest(submitterDid: Null, revRegId: RevRegId): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetRevocRegDefRequest")(submitterDid.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetRevocRegDefRequest(submitterDid: Did, revRegId: RevRegId): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetRevocRegDefRequest")(submitterDid.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetRevocRegDeltaRequest(submitterDid: Null, revRegId: RevRegId, from: Double, to: Double): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetRevocRegDeltaRequest")(submitterDid.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetRevocRegDeltaRequest(submitterDid: Null, revRegId: RevRegId, from: Null, to: Double): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetRevocRegDeltaRequest")(submitterDid.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetRevocRegDeltaRequest(submitterDid: Did, revRegId: RevRegId, from: Double, to: Double): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetRevocRegDeltaRequest")(submitterDid.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetRevocRegDeltaRequest(submitterDid: Did, revRegId: RevRegId, from: Null, to: Double): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetRevocRegDeltaRequest")(submitterDid.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetRevocRegRequest(submitterDid: Null, revRegId: RevRegId, timestamp: Double): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetRevocRegRequest")(submitterDid.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetRevocRegRequest(submitterDid: Did, revRegId: RevRegId, timestamp: Double): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetRevocRegRequest")(submitterDid.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetSchemaRequest(submitterDid: Null, schemaId: SchemaId): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetSchemaRequest")(submitterDid.asInstanceOf[js.Any], schemaId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetSchemaRequest(submitterDid: Did, schemaId: SchemaId): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetSchemaRequest")(submitterDid.asInstanceOf[js.Any], schemaId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetTxnAuthorAgreementRequest(): js.Promise[LedgerRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildGetTxnAuthorAgreementRequest")().asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetTxnAuthorAgreementRequest(submitterDid: Did): js.Promise[LedgerRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildGetTxnAuthorAgreementRequest")(submitterDid.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildGetTxnRequest(submitterDid: Null, ledgerType: DOMAIN | POOL | CONFIG, seqNo: Double): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetTxnRequest")(submitterDid.asInstanceOf[js.Any], ledgerType.asInstanceOf[js.Any], seqNo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildGetTxnRequest(submitterDid: Did, ledgerType: DOMAIN | POOL | CONFIG, seqNo: Double): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGetTxnRequest")(submitterDid.asInstanceOf[js.Any], ledgerType.asInstanceOf[js.Any], seqNo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildNymRequest(submitterDid: Did, targetDid: Did, verkey: String, alias: String): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNymRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], verkey.asInstanceOf[js.Any], alias.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]
inline def buildNymRequest(submitterDid: Did, targetDid: Did, verkey: String, alias: String, role: NymRole): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNymRequest")(submitterDid.asInstanceOf[js.Any], targetDid.asInstanceOf[js.Any], verkey.asInstanceOf[js.Any], alias.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildRevocRegDefRequest(submitterDid: Did, data: RevocRegDef): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRevocRegDefRequest")(submitterDid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildRevocRegEntryRequest_CLACCUM(submitterDid: Did, revRegId: RevRegId, revDefType: CL_ACCUM, value: RevocRegDelta): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRevocRegEntryRequest")(submitterDid.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], revDefType.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def buildSchemaRequest(submitterDid: Did, schema: Schema): js.Promise[LedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSchemaRequest")(submitterDid.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerRequest]]

inline def closePoolLedger(poolHandle: PoolHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closePoolLedger")(poolHandle.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def closeWallet(wh: WalletHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeWallet")(wh.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def closeWalletSearch(sh: SearchHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeWalletSearch")(sh.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def createAndStoreMyDid(wh: WalletHandle, did: DidConfig): js.Promise[js.Tuple2[Did, Verkey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAndStoreMyDid")(wh.asInstanceOf[js.Any], did.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Did, Verkey]]]

inline def createKey(wh: WalletHandle, key: KeyConfig): js.Promise[Verkey] = (^.asInstanceOf[js.Dynamic].applyDynamic("createKey")(wh.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Verkey]]

inline def createPoolLedgerConfig(configName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPoolLedgerConfig")(configName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def createPoolLedgerConfig(configName: String, config: PoolConfig): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPoolLedgerConfig")(configName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def createRevocationState(
  blobStorageReaderHandle: BlobReaderHandle,
  revRegDef: RevocRegDef,
  revRegDelta: RevocRegDelta,
  timestamp: Double,
  credRevId: CredRevocId
): js.Promise[RevState] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRevocationState")(blobStorageReaderHandle.asInstanceOf[js.Any], revRegDef.asInstanceOf[js.Any], revRegDelta.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], credRevId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RevState]]

inline def createWallet(config: WalletConfig, credentials: WalletCredentials): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWallet")(config.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def cryptoAnonCrypt(recipientVk: Verkey, messageRaw: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("cryptoAnonCrypt")(recipientVk.asInstanceOf[js.Any], messageRaw.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]

inline def cryptoSign(wh: WalletHandle, signerVk: Verkey, messageRaw: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("cryptoSign")(wh.asInstanceOf[js.Any], signerVk.asInstanceOf[js.Any], messageRaw.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]

inline def cryptoVerify(signerVk: Verkey, messageRaw: Buffer, signatureRaw: Buffer): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("cryptoVerify")(signerVk.asInstanceOf[js.Any], messageRaw.asInstanceOf[js.Any], signatureRaw.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]

inline def deletePoolLedgerConfig(configName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deletePoolLedgerConfig")(configName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def deleteWallet(config: WalletConfig, credentials: WalletCredentials): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteWallet")(config.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def deleteWalletRecord(wh: WalletHandle, `type`: String, id: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteWalletRecord")(wh.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def exportWallet(wh: WalletHandle, exportConfig: WalletExportImportConfig): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportWallet")(wh.asInstanceOf[js.Any], exportConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def fetchWalletSearchNextRecords(wh: WalletHandle, searchHandle: SearchHandle, count: Double): js.Promise[WalletRecordSearch] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchWalletSearchNextRecords")(wh.asInstanceOf[js.Any], searchHandle.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WalletRecordSearch]]

inline def generateNonce(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNonce")().asInstanceOf[js.Promise[String]]

inline def generateWalletKey(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateWalletKey")().asInstanceOf[js.Promise[String]]
inline def generateWalletKey(config: GenerateWalletKeyConfig): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateWalletKey")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]

inline def getWalletRecord(wh: WalletHandle, `type`: String, id: String, options: WalletRecordOptions): js.Promise[WalletRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWalletRecord")(wh.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WalletRecord]]

inline def importWallet(config: WalletConfig, credentials: WalletCredentials, importConfig: WalletExportImportConfig): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("importWallet")(config.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], importConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def issuerCreateAndStoreCredentialDef(wh: WalletHandle, issuerDid: Did, schema: Schema, tag: String, signatureType: String): js.Promise[js.Tuple2[CredDefId, CredDef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateAndStoreCredentialDef")(wh.asInstanceOf[js.Any], issuerDid.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], signatureType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[CredDefId, CredDef]]]
inline def issuerCreateAndStoreCredentialDef(
  wh: WalletHandle,
  issuerDid: Did,
  schema: Schema,
  tag: String,
  signatureType: String,
  config: CredDefConfig
): js.Promise[js.Tuple2[CredDefId, CredDef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateAndStoreCredentialDef")(wh.asInstanceOf[js.Any], issuerDid.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], signatureType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[CredDefId, CredDef]]]

inline def issuerCreateAndStoreRevocReg(
  wh: WalletHandle,
  issuerDid: Did,
  revocDefType: Null,
  tag: String,
  credDefId: CredDefId,
  config: Issuancetype,
  tailsWriterHandle: BlobWriterHandle
): js.Promise[js.Tuple3[RevRegId, RevocRegDef, RevocRegDelta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateAndStoreRevocReg")(wh.asInstanceOf[js.Any], issuerDid.asInstanceOf[js.Any], revocDefType.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], credDefId.asInstanceOf[js.Any], config.asInstanceOf[js.Any], tailsWriterHandle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple3[RevRegId, RevocRegDef, RevocRegDelta]]]

inline def issuerCreateAndStoreRevocReg_CLACCUM(
  wh: WalletHandle,
  issuerDid: Did,
  revocDefType: CL_ACCUM,
  tag: String,
  credDefId: CredDefId,
  config: Issuancetype,
  tailsWriterHandle: BlobWriterHandle
): js.Promise[js.Tuple3[RevRegId, RevocRegDef, RevocRegDelta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateAndStoreRevocReg")(wh.asInstanceOf[js.Any], issuerDid.asInstanceOf[js.Any], revocDefType.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], credDefId.asInstanceOf[js.Any], config.asInstanceOf[js.Any], tailsWriterHandle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple3[RevRegId, RevocRegDef, RevocRegDelta]]]

inline def issuerCreateCredential(
  wh: WalletHandle,
  credOffer: CredOffer,
  credReq: CredReq,
  credValues: CredValues,
  revRegId: Null,
  blobStorageReaderHandle: BlobStorageReaderHandle
): js.Promise[js.Tuple3[Cred, CredRevocId, RevocRegDelta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateCredential")(wh.asInstanceOf[js.Any], credOffer.asInstanceOf[js.Any], credReq.asInstanceOf[js.Any], credValues.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], blobStorageReaderHandle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple3[Cred, CredRevocId, RevocRegDelta]]]
inline def issuerCreateCredential(
  wh: WalletHandle,
  credOffer: CredOffer,
  credReq: CredReq,
  credValues: CredValues,
  revRegId: RevRegId,
  blobStorageReaderHandle: BlobStorageReaderHandle
): js.Promise[js.Tuple3[Cred, CredRevocId, RevocRegDelta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateCredential")(wh.asInstanceOf[js.Any], credOffer.asInstanceOf[js.Any], credReq.asInstanceOf[js.Any], credValues.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], blobStorageReaderHandle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple3[Cred, CredRevocId, RevocRegDelta]]]

inline def issuerCreateCredentialOffer(wh: WalletHandle, credDefId: CredDefId): js.Promise[CredOffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateCredentialOffer")(wh.asInstanceOf[js.Any], credDefId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CredOffer]]

inline def issuerCreateCredential_0(
  wh: WalletHandle,
  credOffer: CredOffer,
  credReq: CredReq,
  credValues: CredValues,
  revRegId: Null,
  blobStorageReaderHandle: `0`
): js.Promise[js.Tuple3[Cred, CredRevocId, RevocRegDelta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateCredential")(wh.asInstanceOf[js.Any], credOffer.asInstanceOf[js.Any], credReq.asInstanceOf[js.Any], credValues.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], blobStorageReaderHandle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple3[Cred, CredRevocId, RevocRegDelta]]]
inline def issuerCreateCredential_0(
  wh: WalletHandle,
  credOffer: CredOffer,
  credReq: CredReq,
  credValues: CredValues,
  revRegId: RevRegId,
  blobStorageReaderHandle: `0`
): js.Promise[js.Tuple3[Cred, CredRevocId, RevocRegDelta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateCredential")(wh.asInstanceOf[js.Any], credOffer.asInstanceOf[js.Any], credReq.asInstanceOf[js.Any], credValues.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], blobStorageReaderHandle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple3[Cred, CredRevocId, RevocRegDelta]]]

inline def issuerCreateSchema(issuerDid: Did, name: String, version: String, attributes: js.Array[String]): js.Promise[js.Tuple2[SchemaId, Schema]] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerCreateSchema")(issuerDid.asInstanceOf[js.Any], name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[SchemaId, Schema]]]

inline def issuerMergeRevocationRegistryDeltas(revRegDelta: RevocRegDelta, otherRevRegDelta: RevocRegDelta): js.Promise[RevocRegDelta] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerMergeRevocationRegistryDeltas")(revRegDelta.asInstanceOf[js.Any], otherRevRegDelta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RevocRegDelta]]

inline def issuerRevokeCredential(
  wh: WalletHandle,
  blobStorageReaderHandle: BlobStorageReaderHandle,
  revRegId: RevRegId,
  credRevocId: CredRevocId
): js.Promise[RevocRegDelta] = (^.asInstanceOf[js.Dynamic].applyDynamic("issuerRevokeCredential")(wh.asInstanceOf[js.Any], blobStorageReaderHandle.asInstanceOf[js.Any], revRegId.asInstanceOf[js.Any], credRevocId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RevocRegDelta]]

inline def keyForLocalDid(wh: WalletHandle, did: Did): js.Promise[Verkey] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyForLocalDid")(wh.asInstanceOf[js.Any], did.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Verkey]]

inline def listMyDidsWithMeta(wh: WalletHandle): js.Promise[js.Array[DidWithMeta]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listMyDidsWithMeta")(wh.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DidWithMeta]]]

inline def openBlobStorageReader(`type`: String, tailsReaderConfig: TailsReaderConfig): js.Promise[BlobReaderHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("openBlobStorageReader")(`type`.asInstanceOf[js.Any], tailsReaderConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BlobReaderHandle]]

inline def openBlobStorageWriter(`type`: String, tailsWriterConfig: TailsWriterConfig): js.Promise[BlobWriterHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("openBlobStorageWriter")(`type`.asInstanceOf[js.Any], tailsWriterConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BlobWriterHandle]]

inline def openPoolLedger(configName: String): js.Promise[PoolHandle] = ^.asInstanceOf[js.Dynamic].applyDynamic("openPoolLedger")(configName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PoolHandle]]
inline def openPoolLedger(configName: String, config: RuntimePoolConfig): js.Promise[PoolHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("openPoolLedger")(configName.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PoolHandle]]

inline def openWallet(config: WalletConfig, credentials: OpenWalletCredentials): js.Promise[WalletHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("openWallet")(config.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WalletHandle]]

inline def openWalletSearch(wh: WalletHandle, `type`: String, query: WalletQuery, options: WalletSearchOptions): js.Promise[SearchHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("openWalletSearch")(wh.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchHandle]]

inline def packMessage(wh: WalletHandle, message: Buffer, receiverKeys: js.Array[Verkey]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("packMessage")(wh.asInstanceOf[js.Any], message.asInstanceOf[js.Any], receiverKeys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
inline def packMessage(wh: WalletHandle, message: Buffer, receiverKeys: js.Array[Verkey], senderVk: Verkey): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("packMessage")(wh.asInstanceOf[js.Any], message.asInstanceOf[js.Any], receiverKeys.asInstanceOf[js.Any], senderVk.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]

inline def parseGetCredDefResponse(response: LedgerResponse): js.Promise[js.Tuple2[CredDefId, CredDef]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGetCredDefResponse")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[CredDefId, CredDef]]]

inline def parseGetNymResponse(response: LedgerResponse): js.Promise[GetNymResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGetNymResponse")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetNymResponse]]

inline def parseGetRevocRegDefResponse(response: LedgerResponse): js.Promise[js.Tuple2[RevRegId, RevocRegDef]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGetRevocRegDefResponse")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[RevRegId, RevocRegDef]]]

inline def parseGetRevocRegDeltaResponse(response: LedgerResponse): js.Promise[js.Tuple3[RevRegId, RevocRegDelta, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGetRevocRegDeltaResponse")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple3[RevRegId, RevocRegDelta, Double]]]

inline def parseGetRevocRegResponse(response: LedgerResponse): js.Promise[js.Tuple3[RevRegId, RevocReg, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGetRevocRegResponse")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple3[RevRegId, RevocReg, Double]]]

inline def parseGetSchemaResponse(response: LedgerResponse): js.Promise[js.Tuple2[SchemaId, Schema]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGetSchemaResponse")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[SchemaId, Schema]]]

inline def proverCloseCredentialsSearchForProofReq(sh: SearchHandle): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("proverCloseCredentialsSearchForProofReq")(sh.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def proverCreateCredentialReq(wh: WalletHandle, proverDid: Did, credOffer: CredOffer, credDef: CredDef, masterSecretId: String): js.Promise[js.Tuple2[CredReq, CredReqMetadata]] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverCreateCredentialReq")(wh.asInstanceOf[js.Any], proverDid.asInstanceOf[js.Any], credOffer.asInstanceOf[js.Any], credDef.asInstanceOf[js.Any], masterSecretId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[CredReq, CredReqMetadata]]]

inline def proverCreateMasterSecret(wh: WalletHandle, masterSecretId: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverCreateMasterSecret")(wh.asInstanceOf[js.Any], masterSecretId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def proverCreateProof(
  wh: WalletHandle,
  proofRequest: IndyProofRequest,
  requestedCredentials: IndyRequestedCredentials,
  masterSecretName: String,
  schemas: Schemas,
  credentialDefs: CredentialDefs,
  revStates: RevStates
): js.Promise[IndyProof] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverCreateProof")(wh.asInstanceOf[js.Any], proofRequest.asInstanceOf[js.Any], requestedCredentials.asInstanceOf[js.Any], masterSecretName.asInstanceOf[js.Any], schemas.asInstanceOf[js.Any], credentialDefs.asInstanceOf[js.Any], revStates.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IndyProof]]

inline def proverDeleteCredential(wh: WalletHandle, credId: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverDeleteCredential")(wh.asInstanceOf[js.Any], credId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def proverFetchCredentialsForProofReq(sh: SearchHandle, itemReferent: String, count: Double): js.Promise[js.Array[IndyCredential]] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverFetchCredentialsForProofReq")(sh.asInstanceOf[js.Any], itemReferent.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[IndyCredential]]]

inline def proverGetCredential(wh: WalletHandle, credId: String): js.Promise[IndyCredentialInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverGetCredential")(wh.asInstanceOf[js.Any], credId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IndyCredentialInfo]]

inline def proverGetCredentials(wh: WalletHandle, filter: GetCredentialsFilter): js.Promise[js.Array[IndyCredentialInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverGetCredentials")(wh.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[IndyCredentialInfo]]]

inline def proverGetCredentialsForProofReq(wh: WalletHandle, proofRequest: IndyProofRequest): js.Promise[ProofCred] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverGetCredentialsForProofReq")(wh.asInstanceOf[js.Any], proofRequest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProofCred]]

inline def proverSearchCredentialsForProofReq(wh: WalletHandle, proofRequest: IndyProofRequest): js.Promise[SearchHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverSearchCredentialsForProofReq")(wh.asInstanceOf[js.Any], proofRequest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchHandle]]
inline def proverSearchCredentialsForProofReq(wh: WalletHandle, proofRequest: IndyProofRequest, extraQuery: ReferentWalletQuery): js.Promise[SearchHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverSearchCredentialsForProofReq")(wh.asInstanceOf[js.Any], proofRequest.asInstanceOf[js.Any], extraQuery.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchHandle]]

inline def proverStoreCredential(
  wh: WalletHandle,
  credentialId: Null,
  credReqMetadata: CredReqMetadata,
  cred: Cred,
  credDef: CredDef
): js.Promise[CredentialId] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverStoreCredential")(wh.asInstanceOf[js.Any], credentialId.asInstanceOf[js.Any], credReqMetadata.asInstanceOf[js.Any], cred.asInstanceOf[js.Any], credDef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CredentialId]]
inline def proverStoreCredential(
  wh: WalletHandle,
  credentialId: Null,
  credReqMetadata: CredReqMetadata,
  cred: Cred,
  credDef: CredDef,
  revRegDef: RevocRegDef
): js.Promise[CredentialId] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverStoreCredential")(wh.asInstanceOf[js.Any], credentialId.asInstanceOf[js.Any], credReqMetadata.asInstanceOf[js.Any], cred.asInstanceOf[js.Any], credDef.asInstanceOf[js.Any], revRegDef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CredentialId]]
inline def proverStoreCredential(
  wh: WalletHandle,
  credentialId: CredentialId,
  credReqMetadata: CredReqMetadata,
  cred: Cred,
  credDef: CredDef
): js.Promise[CredentialId] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverStoreCredential")(wh.asInstanceOf[js.Any], credentialId.asInstanceOf[js.Any], credReqMetadata.asInstanceOf[js.Any], cred.asInstanceOf[js.Any], credDef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CredentialId]]
inline def proverStoreCredential(
  wh: WalletHandle,
  credentialId: CredentialId,
  credReqMetadata: CredReqMetadata,
  cred: Cred,
  credDef: CredDef,
  revRegDef: RevocRegDef
): js.Promise[CredentialId] = (^.asInstanceOf[js.Dynamic].applyDynamic("proverStoreCredential")(wh.asInstanceOf[js.Any], credentialId.asInstanceOf[js.Any], credReqMetadata.asInstanceOf[js.Any], cred.asInstanceOf[js.Any], credDef.asInstanceOf[js.Any], revRegDef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CredentialId]]

inline def setDefaultLogger(pattern: trace | info | debug): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultLogger")(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setLogger(
  logFn: js.Function6[
  /* level */ Double, 
  /* target */ String, 
  /* message */ String, 
  /* modulePath */ String, 
  /* file */ String, 
  /* line */ Double, 
  Unit
]
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logFn.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setProtocolVersion(version: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setProtocolVersion")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def signAndSubmitRequest(poolHandle: PoolHandle, walletHandle: WalletHandle, submitterDid: Did, request: LedgerRequest): js.Promise[LedgerResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("signAndSubmitRequest")(poolHandle.asInstanceOf[js.Any], walletHandle.asInstanceOf[js.Any], submitterDid.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerResponse]]

inline def signRequest(wh: WalletHandle, submitterDid: Did, request: LedgerRequest): js.Promise[SignedLedgerRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("signRequest")(wh.asInstanceOf[js.Any], submitterDid.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignedLedgerRequest]]

inline def submitRequest(poolHandle: PoolHandle, request: LedgerRequest): js.Promise[LedgerResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("submitRequest")(poolHandle.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LedgerResponse]]

inline def unpackMessage(wh: WalletHandle, jwe: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackMessage")(wh.asInstanceOf[js.Any], jwe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]

inline def updateWalletRecordTags(wh: WalletHandle, `type`: String, id: String, tags: Tags): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateWalletRecordTags")(wh.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def updateWalletRecordValue(wh: WalletHandle, `type`: String, id: String, value: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateWalletRecordValue")(wh.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def verifierVerifyProof(
  proofRequest: IndyProofRequest,
  proof: IndyProof,
  schemas: Schemas,
  credentialDefs: CredentialDefs,
  revRegDefs: RevocRegDefs,
  revRegs: RevRegs
): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifierVerifyProof")(proofRequest.asInstanceOf[js.Any], proof.asInstanceOf[js.Any], schemas.asInstanceOf[js.Any], credentialDefs.asInstanceOf[js.Any], revRegDefs.asInstanceOf[js.Any], revRegs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]

type BlobReaderHandle = Double

type BlobStorageReaderHandle = Double

type BlobWriterHandle = Double

type ByteArray = js.Array[Double]

type CredDefId = String

type CredReqMetadata = Record[String, Any]

type CredRevocId = String

type CredValues = Record[String, CredValue]

type CredentialDefs = StringDictionary[CredDef]

type CredentialId = String

type Did = String

type PoolHandle = Double

type ReferentWalletQuery = StringDictionary[WalletQuery]

type RevRegId = String

type RevRegs = StringDictionary[NumberDictionary[RevocReg]]

type RevStates = StringDictionary[NumberDictionary[RevState]]

type RevocRegDefs = StringDictionary[RevocRegDef]

type SchemaId = String

type Schemas = StringDictionary[Schema]

type SearchHandle = Double

type Tags = Record[String, js.UndefOr[String]]

type Verkey = String

type WalletHandle = Double

type WalletQuery = Record[String, Any]

type Witness = StringDictionary[Any]
