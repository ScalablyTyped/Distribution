package typings.imapflow.mod

import typings.imapflow.anon.ChangedSince
import typings.imapflow.anon.ChunkSize
import typings.imapflow.anon.HighestModseq
import typings.imapflow.anon.ReadOnly_
import typings.imapflow.anon.Readonly
import typings.imapflow.anon.Uid
import typings.imapflow.anon.UnchangedSince
import typings.node.bufferMod.global.Buffer
import typings.std.AsyncGenerator
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter * / any */ @JSImport("imapflow", "ImapFlow")
@js.native
open class ImapFlow protected () extends StObject {
  def this(options: ImapFlowOptions) = this()
  
  def append(path: String, content: String): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: String, flags: js.Array[String]): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: String, flags: js.Array[String], idate: String): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: String, flags: js.Array[String], idate: js.Date): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: String, flags: Unit, idate: String): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: String, flags: Unit, idate: js.Date): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: Buffer): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: Buffer, flags: js.Array[String]): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: Buffer, flags: js.Array[String], idate: String): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: Buffer, flags: js.Array[String], idate: js.Date): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: Buffer, flags: Unit, idate: String): js.Promise[AppendResonseObject] = js.native
  def append(path: String, content: Buffer, flags: Unit, idate: js.Date): js.Promise[AppendResonseObject] = js.native
  
  var authenticated: String | Boolean = js.native
  
  var capabilities: Map[String, Boolean | Double] = js.native
  
  def close(): Unit = js.native
  
  def connect(): js.Promise[Unit] = js.native
  
  def download(range: SequenceString): js.Promise[DownloadObject] = js.native
  def download(range: SequenceString, part: String): js.Promise[DownloadObject] = js.native
  def download(range: SequenceString, part: String, options: ChunkSize): js.Promise[DownloadObject] = js.native
  def download(range: SequenceString, part: Unit, options: ChunkSize): js.Promise[DownloadObject] = js.native
  
  var emitLogs: Boolean = js.native
  
  var enabled: Set[String] = js.native
  
  def fetch(range: js.Array[Double], query: FetchQueryObject): AsyncGenerator[FetchMessageObject, scala.Nothing, Unit] = js.native
  def fetch(range: js.Array[Double], query: FetchQueryObject, options: ChangedSince): AsyncGenerator[FetchMessageObject, scala.Nothing, Unit] = js.native
  def fetch(range: SearchObject, query: FetchQueryObject): AsyncGenerator[FetchMessageObject, scala.Nothing, Unit] = js.native
  def fetch(range: SearchObject, query: FetchQueryObject, options: ChangedSince): AsyncGenerator[FetchMessageObject, scala.Nothing, Unit] = js.native
  def fetch(range: SequenceString, query: FetchQueryObject): AsyncGenerator[FetchMessageObject, scala.Nothing, Unit] = js.native
  def fetch(range: SequenceString, query: FetchQueryObject, options: ChangedSince): AsyncGenerator[FetchMessageObject, scala.Nothing, Unit] = js.native
  
  def fetchOne(seq: SequenceString, query: FetchQueryObject): js.Promise[FetchMessageObject] = js.native
  def fetchOne(seq: SequenceString, query: FetchQueryObject, options: Uid): js.Promise[FetchMessageObject] = js.native
  
  def getMailboxLock(path: String): js.Promise[MailboxLockObject] = js.native
  def getMailboxLock(path: String, options: Readonly): js.Promise[MailboxLockObject] = js.native
  
  def getQuota(path: String): js.Promise[QuotaResponse | Boolean] = js.native
  
  var id: String = js.native
  
  def idle(): js.Promise[Boolean] = js.native
  
  var idling: Boolean = js.native
  
  /**
    * @see {@link https://imapflow.com/module-imapflow-ImapFlow.html#list}
    */
  def list(): js.Promise[js.Array[ListResponse]] = js.native
  def list(options: typings.imapflow.anon.SpecialUseHints): js.Promise[js.Array[ListResponse]] = js.native
  
  def listTree(): js.Promise[ListTreeResponse] = js.native
  
  def logout(): js.Promise[Unit] = js.native
  
  var mailbox: MailboxObject | Boolean = js.native
  
  def mailboxClose(): js.Promise[Boolean] = js.native
  
  def mailboxCreate(path: String): js.Promise[MailboxCreateResponse] = js.native
  def mailboxCreate(path: js.Array[Any]): js.Promise[MailboxCreateResponse] = js.native
  
  def mailboxDelete(path: String): js.Promise[MailboxDeleteResponse] = js.native
  def mailboxDelete(path: js.Array[Any]): js.Promise[MailboxDeleteResponse] = js.native
  
  def mailboxOpen(path: String): js.Promise[MailboxObject] = js.native
  def mailboxOpen(path: String, options: ReadOnly_): js.Promise[MailboxObject] = js.native
  def mailboxOpen(path: js.Array[Any]): js.Promise[MailboxObject] = js.native
  def mailboxOpen(path: js.Array[Any], options: ReadOnly_): js.Promise[MailboxObject] = js.native
  
  def mailboxRename(path: String, newPath: String): js.Promise[MailboxRenameResponse] = js.native
  def mailboxRename(path: String, newPath: js.Array[Any]): js.Promise[MailboxRenameResponse] = js.native
  def mailboxRename(path: js.Array[Any], newPath: String): js.Promise[MailboxRenameResponse] = js.native
  def mailboxRename(path: js.Array[Any], newPath: js.Array[Any]): js.Promise[MailboxRenameResponse] = js.native
  
  def mailboxSubscribe(path: String): js.Promise[Boolean] = js.native
  def mailboxSubscribe(path: js.Array[Any]): js.Promise[Boolean] = js.native
  
  def mailboxUnsubscribe(path: String): js.Promise[Boolean] = js.native
  def mailboxUnsubscribe(path: js.Array[Any]): js.Promise[Boolean] = js.native
  
  def messageCopy(range: js.Array[Double], destination: String): js.Promise[CopyResponseObject] = js.native
  def messageCopy(range: js.Array[Double], destination: String, options: Uid): js.Promise[CopyResponseObject] = js.native
  def messageCopy(range: SearchObject, destination: String): js.Promise[CopyResponseObject] = js.native
  def messageCopy(range: SearchObject, destination: String, options: Uid): js.Promise[CopyResponseObject] = js.native
  def messageCopy(range: SequenceString, destination: String): js.Promise[CopyResponseObject] = js.native
  def messageCopy(range: SequenceString, destination: String, options: Uid): js.Promise[CopyResponseObject] = js.native
  
  def messageDelete(range: js.Array[Double]): js.Promise[Boolean] = js.native
  def messageDelete(range: js.Array[Double], options: Uid): js.Promise[Boolean] = js.native
  def messageDelete(range: SearchObject): js.Promise[Boolean] = js.native
  def messageDelete(range: SearchObject, options: Uid): js.Promise[Boolean] = js.native
  def messageDelete(range: SequenceString): js.Promise[Boolean] = js.native
  def messageDelete(range: SequenceString, options: Uid): js.Promise[Boolean] = js.native
  
  def messageFlagsAdd(range: js.Array[Double], Array: js.Array[String]): js.Promise[Boolean] = js.native
  def messageFlagsAdd(range: js.Array[Double], Array: js.Array[String], options: UnchangedSince): js.Promise[Boolean] = js.native
  def messageFlagsAdd(range: SearchObject, Array: js.Array[String]): js.Promise[Boolean] = js.native
  def messageFlagsAdd(range: SearchObject, Array: js.Array[String], options: UnchangedSince): js.Promise[Boolean] = js.native
  def messageFlagsAdd(range: SequenceString, Array: js.Array[String]): js.Promise[Boolean] = js.native
  def messageFlagsAdd(range: SequenceString, Array: js.Array[String], options: UnchangedSince): js.Promise[Boolean] = js.native
  
  def messageFlagsRemove(range: js.Array[Double], Array: js.Array[String]): js.Promise[Boolean] = js.native
  def messageFlagsRemove(range: js.Array[Double], Array: js.Array[String], options: UnchangedSince): js.Promise[Boolean] = js.native
  def messageFlagsRemove(range: SearchObject, Array: js.Array[String]): js.Promise[Boolean] = js.native
  def messageFlagsRemove(range: SearchObject, Array: js.Array[String], options: UnchangedSince): js.Promise[Boolean] = js.native
  def messageFlagsRemove(range: SequenceString, Array: js.Array[String]): js.Promise[Boolean] = js.native
  def messageFlagsRemove(range: SequenceString, Array: js.Array[String], options: UnchangedSince): js.Promise[Boolean] = js.native
  
  def messageFlagsSet(range: js.Array[Double], Array: js.Array[String]): js.Promise[Boolean] = js.native
  def messageFlagsSet(range: js.Array[Double], Array: js.Array[String], options: UnchangedSince): js.Promise[Boolean] = js.native
  def messageFlagsSet(range: SearchObject, Array: js.Array[String]): js.Promise[Boolean] = js.native
  def messageFlagsSet(range: SearchObject, Array: js.Array[String], options: UnchangedSince): js.Promise[Boolean] = js.native
  def messageFlagsSet(range: SequenceString, Array: js.Array[String]): js.Promise[Boolean] = js.native
  def messageFlagsSet(range: SequenceString, Array: js.Array[String], options: UnchangedSince): js.Promise[Boolean] = js.native
  
  def messageMove(range: js.Array[Double], destination: String): js.Promise[CopyResponseObject] = js.native
  def messageMove(range: js.Array[Double], destination: String, options: Uid): js.Promise[CopyResponseObject] = js.native
  def messageMove(range: SearchObject, destination: String): js.Promise[CopyResponseObject] = js.native
  def messageMove(range: SearchObject, destination: String, options: Uid): js.Promise[CopyResponseObject] = js.native
  def messageMove(range: SequenceString, destination: String): js.Promise[CopyResponseObject] = js.native
  def messageMove(range: SequenceString, destination: String, options: Uid): js.Promise[CopyResponseObject] = js.native
  
  def noop(): js.Promise[Unit] = js.native
  
  def search(query: SearchObject): js.Promise[js.Array[Double]] = js.native
  def search(query: SearchObject, options: Uid): js.Promise[js.Array[Double]] = js.native
  
  var secureConnection: Boolean = js.native
  
  var serverInfo: IdInfoObject = js.native
  
  def status(path: String, query: HighestModseq): js.Promise[StatusObject] = js.native
  
  var usable: Boolean = js.native
}
