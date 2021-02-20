package typings.grammarkdown

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.grammarkdownBooleans.`false`
import typings.grammarkdown.hostMod.CoreAsyncHost
import typings.grammarkdown.hostMod.CoreSyncHost
import typings.grammarkdown.hostMod.HostBase
import typings.grammarkdown.hostMod.HostBaseOptions
import typings.grammarkdown.hostMod.LegacyReadFileCallback
import typings.grammarkdown.hostMod.LegacyReadFileSyncCallback
import typings.grammarkdown.hostMod.LegacyWriteFileCallback
import typings.grammarkdown.hostMod.LegacyWriteFileSyncCallback
import typings.grammarkdown.hostMod.ReadFileCallback
import typings.grammarkdown.hostMod.ReadFileSyncCallback
import typings.grammarkdown.hostMod.WriteFileCallback
import typings.grammarkdown.hostMod.WriteFileSyncCallback
import typings.grammarkdown.nodesMod.SourceFile
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("grammarkdown/dist/hosts/node", "Host")
  @js.native
  class Host () extends HostBase {
    def this(options: HostOptions) = this()
    
    var _readFileCallback: js.Any = js.native
    
    var _readFileSyncCallback: js.Any = js.native
    
    var _writeFileCallback: js.Any = js.native
    
    var _writeFileSyncCallback: js.Any = js.native
    
    def getSourceFile(file: String): js.Promise[js.UndefOr[SourceFile]] = js.native
    def getSourceFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[SourceFile]] = js.native
    def getSourceFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[SourceFile]] = js.native
    
    var getSourceFilePossiblyAsync: js.Any = js.native
    
    def getSourceFileSync(file: String): js.UndefOr[SourceFile] = js.native
    def getSourceFileSync(file: String, cancelable: Cancelable): js.UndefOr[SourceFile] = js.native
    def getSourceFileSync(file: String, cancelable: CancellationToken): js.UndefOr[SourceFile] = js.native
    
    def readFile(file: String): js.Promise[js.UndefOr[String]] = js.native
    def readFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[String]] = js.native
    def readFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[String]] = js.native
    
    var readFilePossiblyAsync: js.Any = js.native
    
    def readFileSync(file: String): js.UndefOr[String] = js.native
    def readFileSync(file: String, cancelable: Cancelable): js.UndefOr[String] = js.native
    def readFileSync(file: String, cancelable: CancellationToken): js.UndefOr[String] = js.native
    
    def writeFile(file: String, text: String): js.Promise[Unit] = js.native
    def writeFile(file: String, text: String, cancelable: Cancelable): js.Promise[Unit] = js.native
    def writeFile(file: String, text: String, cancelable: CancellationToken): js.Promise[Unit] = js.native
    
    var writeFilePossiblyAsync: js.Any = js.native
    
    def writeFileSync(file: String, text: String): Unit = js.native
    def writeFileSync(file: String, text: String, cancelable: Cancelable): Unit = js.native
    def writeFileSync(file: String, text: String, cancelable: CancellationToken): Unit = js.native
  }
  
  @JSImport("grammarkdown/dist/hosts/node", "NodeAsyncHost")
  @js.native
  class NodeAsyncHost () extends CoreAsyncHost {
    def this(options: NodeAsyncHostOptions) = this()
  }
  
  @JSImport("grammarkdown/dist/hosts/node", "NodeSyncHost")
  @js.native
  class NodeSyncHost () extends CoreSyncHost {
    def this(options: NodeSyncHostOptions) = this()
  }
  
  @JSImport("grammarkdown/dist/hosts/node", "SingleFileHost")
  @js.native
  class SingleFileHost protected () extends Host {
    def this(content: String) = this()
    def this(content: String, file: String) = this()
    def this(content: String, file: js.UndefOr[scala.Nothing], hostFallback: Host) = this()
    def this(content: String, file: String, hostFallback: Host) = this()
    
    var _hostFallback: js.Any = js.native
    
    val content: String = js.native
    
    val file: String = js.native
  }
  
  @js.native
  trait HostOptions extends HostBaseOptions {
    
    var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback] = js.native
    
    var readFileSync: js.UndefOr[ReadFileSyncCallback | LegacyReadFileSyncCallback] = js.native
    
    var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback] = js.native
    
    var writeFileSync: js.UndefOr[WriteFileSyncCallback | LegacyWriteFileSyncCallback] = js.native
  }
  object HostOptions {
    
    @scala.inline
    def apply(): HostOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostOptions]
    }
    
    @scala.inline
    implicit class HostOptionsMutableBuilder[Self <: HostOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadFile(value: ReadFileCallback | LegacyReadFileCallback): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFileSync(value: ReadFileSyncCallback | LegacyReadFileSyncCallback): Self = StObject.set(x, "readFileSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFileSyncUndefined: Self = StObject.set(x, "readFileSync", js.undefined)
      
      @scala.inline
      def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      @scala.inline
      def setWriteFile(value: WriteFileCallback | LegacyWriteFileCallback): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteFileSync(value: WriteFileSyncCallback | LegacyWriteFileSyncCallback): Self = StObject.set(x, "writeFileSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteFileSyncUndefined: Self = StObject.set(x, "writeFileSync", js.undefined)
      
      @scala.inline
      def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
    }
  }
  
  @js.native
  trait NodeAsyncHostOptions extends HostBaseOptions {
    
    var allowUris: js.UndefOr[`false`] = js.native
    
    var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback | `false`] = js.native
    
    var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback | `false`] = js.native
  }
  object NodeAsyncHostOptions {
    
    @scala.inline
    def apply(): NodeAsyncHostOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeAsyncHostOptions]
    }
    
    @scala.inline
    implicit class NodeAsyncHostOptionsMutableBuilder[Self <: NodeAsyncHostOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUris(value: `false`): Self = StObject.set(x, "allowUris", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUrisUndefined: Self = StObject.set(x, "allowUris", js.undefined)
      
      @scala.inline
      def setReadFile(value: ReadFileCallback | LegacyReadFileCallback | `false`): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      @scala.inline
      def setWriteFile(value: WriteFileCallback | LegacyWriteFileCallback | `false`): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
    }
  }
  
  @js.native
  trait NodeSyncHostOptions extends HostBaseOptions {
    
    var allowUris: js.UndefOr[`false`] = js.native
    
    var readFileSync: js.UndefOr[LegacyReadFileSyncCallback | ReadFileSyncCallback | `false`] = js.native
    
    var writeFileSync: js.UndefOr[LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false`] = js.native
  }
  object NodeSyncHostOptions {
    
    @scala.inline
    def apply(): NodeSyncHostOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeSyncHostOptions]
    }
    
    @scala.inline
    implicit class NodeSyncHostOptionsMutableBuilder[Self <: NodeSyncHostOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUris(value: `false`): Self = StObject.set(x, "allowUris", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUrisUndefined: Self = StObject.set(x, "allowUris", js.undefined)
      
      @scala.inline
      def setReadFileSync(value: LegacyReadFileSyncCallback | ReadFileSyncCallback | `false`): Self = StObject.set(x, "readFileSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFileSyncUndefined: Self = StObject.set(x, "readFileSync", js.undefined)
      
      @scala.inline
      def setWriteFileSync(value: LegacyWriteFileSyncCallback | WriteFileSyncCallback | `false`): Self = StObject.set(x, "writeFileSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteFileSyncUndefined: Self = StObject.set(x, "writeFileSync", js.undefined)
    }
  }
}
