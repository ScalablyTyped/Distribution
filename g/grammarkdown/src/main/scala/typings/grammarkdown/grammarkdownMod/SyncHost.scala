package typings.grammarkdown.grammarkdownMod

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "SyncHost")
@js.native
class SyncHost () extends HostBase {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
  
  def getSourceFileSync(file: String): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: Cancelable): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: CancellationToken): js.UndefOr[SourceFile] = js.native
  
  def readFileSync(file: String): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: Cancelable): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: CancellationToken): js.UndefOr[String] = js.native
  
  /* private */ var readFileSyncCallback: js.Any = js.native
  
  def writeFileSync(file: String, text: String): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: Cancelable): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: CancellationToken): Unit = js.native
  
  /* private */ var writeFileSyncCallback: js.Any = js.native
}
/* static members */
object SyncHost {
  
  @JSImport("grammarkdown/dist/grammarkdown", "SyncHost")
  @js.native
  val ^ : js.Any = js.native
  
  inline def forFile(content: String): SyncSingleFileHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[SyncSingleFileHost]
  inline def forFile(content: String, file: String): SyncSingleFileHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[SyncSingleFileHost]
  inline def forFile(content: String, file: String, hostFallback: SyncHost): SyncSingleFileHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[SyncSingleFileHost]
  inline def forFile(content: String, file: Unit, hostFallback: SyncHost): SyncSingleFileHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[SyncSingleFileHost]
}
