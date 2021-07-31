package typings.ionic

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import typings.tar.anon.CreateOptionsFileOptionss
import typings.tar.anon.ExtractOptionsFileOptions
import typings.tar.anon.ListOptionsFileOptionssyn
import typings.tar.mod.CreateOptions
import typings.tar.mod.ExtractOptions
import typings.tar.mod.FileOptions
import typings.tar.mod.HeaderProperties
import typings.tar.mod.ListOptions
import typings.tar.mod.PackStream
import typings.tar.mod.ParseStream
import typings.tar.mod.ReplaceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiveMod {
  
  object tar {
    
    @JSImport("ionic/lib/utils/archive", "tar")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def Extract_(opts: String): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(opts.asInstanceOf[js.Any]).asInstanceOf[ParseStream]
    @scala.inline
    def Extract_(opts: ExtractOptions): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(opts.asInstanceOf[js.Any]).asInstanceOf[ParseStream]
    
    @scala.inline
    def Pack(): PackStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Pack")().asInstanceOf[PackStream]
    @scala.inline
    def Pack(props: HeaderProperties): PackStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Pack")(props.asInstanceOf[js.Any]).asInstanceOf[PackStream]
    
    @scala.inline
    def Parse(): ParseStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")().asInstanceOf[ParseStream]
    
    @JSImport("ionic/lib/utils/archive", "tar.blockSize")
    @js.native
    val blockSize: Double = js.native
    
    @scala.inline
    def c(options: CreateOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def c(
      options: CreateOptions & FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def c(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def c_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Readable]
    @scala.inline
    def c_Readable(
      options: CreateOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("c")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
    @scala.inline
    def create(options: CreateOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def create(
      options: CreateOptions & FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def create(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def create_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Readable]
    @scala.inline
    def create_Readable(
      options: CreateOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
    @scala.inline
    def extract(options: ExtractOptions & FileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def extract(options: ExtractOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def extract(
      options: ExtractOptions & FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def extract(
      options: ExtractOptions & FileOptions,
      fileList: Unit,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def extract(options: ExtractOptionsFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def extract(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def extract_Writable(options: ExtractOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
    @scala.inline
    def extract_Writable(options: ExtractOptions, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def extract_Writable(
      options: ExtractOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def extract_Writable(options: ExtractOptions, fileList: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    
    @JSImport("ionic/lib/utils/archive", "tar.fieldEnds")
    @js.native
    val fieldEnds: js.Array[Double] = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.fieldOffs")
    @js.native
    val fieldOffs: js.Array[Double] = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.fieldSize")
    @js.native
    val fieldSize: js.Array[Double] = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.headerSize")
    @js.native
    val headerSize: Double = js.native
    
    object knownExtended {
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.atime")
      @js.native
      def atime: Boolean = js.native
      @scala.inline
      def atime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atime")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.charset")
      @js.native
      def charset: Boolean = js.native
      @scala.inline
      def charset_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charset")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.comment")
      @js.native
      def comment: Boolean = js.native
      @scala.inline
      def comment_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.ctime")
      @js.native
      def ctime: Boolean = js.native
      @scala.inline
      def ctime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ctime")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.gid")
      @js.native
      def gid: Boolean = js.native
      @scala.inline
      def gid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.gname")
      @js.native
      def gname: Boolean = js.native
      @scala.inline
      def gname_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gname")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.linkpat")
      @js.native
      def linkpat: Boolean = js.native
      @scala.inline
      def linkpat_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkpat")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.mtime")
      @js.native
      def mtime: Boolean = js.native
      @scala.inline
      def mtime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.path")
      @js.native
      def path: Boolean = js.native
      @scala.inline
      def path_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.realtime")
      @js.native
      def realtime: Boolean = js.native
      @scala.inline
      def realtime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("realtime")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.security")
      @js.native
      def security: Boolean = js.native
      @scala.inline
      def security_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("security")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.size")
      @js.native
      def size: Boolean = js.native
      @scala.inline
      def size_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.uid")
      @js.native
      def uid: Boolean = js.native
      @scala.inline
      def uid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.knownExtended.uname")
      @js.native
      def uname: Boolean = js.native
      @scala.inline
      def uname_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uname")(x.asInstanceOf[js.Any])
    }
    
    @scala.inline
    def list(): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[Writable]
    @scala.inline
    def list(options: ListOptions & FileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def list(options: ListOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def list(
      options: ListOptions & FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def list(
      options: ListOptions & FileOptions,
      fileList: Unit,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def list(options: Unit, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def list(
      options: Unit,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def list(options: Unit, fileList: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def list(options: ListOptionsFileOptionssyn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def list(options: ListOptionsFileOptionssyn, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def list_Writable(options: ListOptions & FileOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
    @scala.inline
    def list_Writable(options: ListOptions & FileOptions, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
    
    object modes {
      
      @JSImport("ionic/lib/utils/archive", "tar.modes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.gexec")
      @js.native
      def gexec: Double = js.native
      @scala.inline
      def gexec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gexec")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.gread")
      @js.native
      def gread: Double = js.native
      @scala.inline
      def gread_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gread")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.gwrite")
      @js.native
      def gwrite: Double = js.native
      @scala.inline
      def gwrite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gwrite")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.oexec")
      @js.native
      def oexec: Double = js.native
      @scala.inline
      def oexec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oexec")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.oread")
      @js.native
      def oread: Double = js.native
      @scala.inline
      def oread_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oread")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.owrite")
      @js.native
      def owrite: Double = js.native
      @scala.inline
      def owrite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("owrite")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.sgid")
      @js.native
      def sgid: Double = js.native
      @scala.inline
      def sgid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sgid")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.suid")
      @js.native
      def suid: Double = js.native
      @scala.inline
      def suid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suid")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.svtx")
      @js.native
      def svtx: Double = js.native
      @scala.inline
      def svtx_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svtx")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.uexec")
      @js.native
      def uexec: Double = js.native
      @scala.inline
      def uexec_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uexec")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.uread")
      @js.native
      def uread: Double = js.native
      @scala.inline
      def uread_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uread")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.modes.uwrite")
      @js.native
      def uwrite: Double = js.native
      @scala.inline
      def uwrite_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uwrite")(x.asInstanceOf[js.Any])
    }
    
    object numeric {
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.atime")
      @js.native
      def atime: Boolean = js.native
      @scala.inline
      def atime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atime")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.cksum")
      @js.native
      def cksum: Boolean = js.native
      @scala.inline
      def cksum_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cksum")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.ctime")
      @js.native
      def ctime: Boolean = js.native
      @scala.inline
      def ctime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ctime")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.dev")
      @js.native
      def dev: Boolean = js.native
      @scala.inline
      def dev_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dev")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.devmaj")
      @js.native
      def devmaj: Boolean = js.native
      @scala.inline
      def devmaj_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("devmaj")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.devmin")
      @js.native
      def devmin: Boolean = js.native
      @scala.inline
      def devmin_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("devmin")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.gid")
      @js.native
      def gid: Boolean = js.native
      @scala.inline
      def gid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.ino")
      @js.native
      def ino: Boolean = js.native
      @scala.inline
      def ino_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ino")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.mode")
      @js.native
      def mode: Boolean = js.native
      @scala.inline
      def mode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.mtime")
      @js.native
      def mtime: Boolean = js.native
      @scala.inline
      def mtime_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mtime")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.nlink")
      @js.native
      def nlink: Boolean = js.native
      @scala.inline
      def nlink_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nlink")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.size")
      @js.native
      def size: Boolean = js.native
      @scala.inline
      def size_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.numeric.uid")
      @js.native
      def uid: Boolean = js.native
      @scala.inline
      def uid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
    }
    
    @scala.inline
    def r(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def r(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def r(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def r(options: ReplaceOptions, fileList: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("r")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def replace(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def replace(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def replace(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def replace(options: ReplaceOptions, fileList: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def t(): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("t")().asInstanceOf[Writable]
    @scala.inline
    def t(options: ListOptions & FileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def t(options: ListOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def t(
      options: ListOptions & FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def t(
      options: ListOptions & FileOptions,
      fileList: Unit,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def t(options: Unit, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def t(
      options: Unit,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def t(options: Unit, fileList: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def t(options: ListOptionsFileOptionssyn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def t(options: ListOptionsFileOptionssyn, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def t_Writable(options: ListOptions & FileOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
    @scala.inline
    def t_Writable(options: ListOptions & FileOptions, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
    
    object types {
      
      @JSImport("ionic/lib/utils/archive", "tar.types")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.0")
      @js.native
      val `0`: String = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.1")
      @js.native
      val `1`: String = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.2")
      @js.native
      val `2`: String = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.3")
      @js.native
      val `3`: String = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.4")
      @js.native
      val `4`: String = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.5")
      @js.native
      val `5`: String = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.6")
      @js.native
      val `6`: String = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.7")
      @js.native
      val `7`: String = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.A")
      @js.native
      def A: String = js.native
      @scala.inline
      def A_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("A")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.BlockDevice")
      @js.native
      def BlockDevice: String = js.native
      @scala.inline
      def BlockDevice_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockDevice")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.CharacterDevice")
      @js.native
      def CharacterDevice: String = js.native
      @scala.inline
      def CharacterDevice_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CharacterDevice")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.ContiguousFile")
      @js.native
      def ContiguousFile: String = js.native
      @scala.inline
      def ContiguousFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContiguousFile")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.ContinuationFile")
      @js.native
      def ContinuationFile: String = js.native
      @scala.inline
      def ContinuationFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContinuationFile")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.D")
      @js.native
      def D: String = js.native
      @scala.inline
      def D_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("D")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.Directory")
      @js.native
      def Directory: String = js.native
      @scala.inline
      def Directory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Directory")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.ExtendedHeader")
      @js.native
      def ExtendedHeader: String = js.native
      @scala.inline
      def ExtendedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtendedHeader")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.FIFO")
      @js.native
      def FIFO: String = js.native
      @scala.inline
      def FIFO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIFO")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.File")
      @js.native
      def File: String = js.native
      @scala.inline
      def File_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.GNUDumpDir")
      @js.native
      def GNUDumpDir: String = js.native
      @scala.inline
      def GNUDumpDir_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GNUDumpDir")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.GlobalExtendedHeader")
      @js.native
      def GlobalExtendedHeader: String = js.native
      @scala.inline
      def GlobalExtendedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalExtendedHeader")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.I")
      @js.native
      def I: String = js.native
      
      @JSImport("ionic/lib/utils/archive", "tar.types.INode")
      @js.native
      def INode: String = js.native
      @scala.inline
      def INode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INode")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def I_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.K")
      @js.native
      def K: String = js.native
      @scala.inline
      def K_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("K")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.L")
      @js.native
      def L: String = js.native
      @scala.inline
      def L_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("L")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.Link")
      @js.native
      def Link: String = js.native
      @scala.inline
      def Link_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.M")
      @js.native
      def M: String = js.native
      @scala.inline
      def M_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.N")
      @js.native
      def N: String = js.native
      @scala.inline
      def N_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("N")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.NextFileHasLonLinkPath")
      @js.native
      def NextFileHasLonLinkPath: String = js.native
      @scala.inline
      def NextFileHasLonLinkPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NextFileHasLonLinkPath")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.NextFileHasLongPath")
      @js.native
      def NextFileHasLongPath: String = js.native
      @scala.inline
      def NextFileHasLongPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NextFileHasLongPath")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.\u0000")
      @js.native
      def Null: String = js.native
      
      @scala.inline
      def Null_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0000")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.OldExtendedHeader")
      @js.native
      def OldExtendedHeader: String = js.native
      @scala.inline
      def OldExtendedHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OldExtendedHeader")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.OldFile")
      @js.native
      def OldFile: String = js.native
      @scala.inline
      def OldFile_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OldFile")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.S")
      @js.native
      def S: String = js.native
      @scala.inline
      def S_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.SolarisACL")
      @js.native
      def SolarisACL: String = js.native
      @scala.inline
      def SolarisACL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SolarisACL")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.SymbolicLick")
      @js.native
      def SymbolicLick: String = js.native
      @scala.inline
      def SymbolicLick_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SymbolicLick")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.TapeVolumeHeader")
      @js.native
      def TapeVolumeHeader: String = js.native
      @scala.inline
      def TapeVolumeHeader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TapeVolumeHeader")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.V")
      @js.native
      def V: String = js.native
      @scala.inline
      def V_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.X")
      @js.native
      def X_ : String = js.native
      
      @scala.inline
      def X__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.")
      @js.native
      def _empty: String = js.native
      
      @scala.inline
      def _empty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.g")
      @js.native
      def g: String = js.native
      @scala.inline
      def g_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g")(x.asInstanceOf[js.Any])
      
      @JSImport("ionic/lib/utils/archive", "tar.types.x")
      @js.native
      def x: String = js.native
      @scala.inline
      def x_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
    }
    
    @scala.inline
    def u(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def u(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def u(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def u(options: ReplaceOptions, fileList: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("u")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def update(options: ReplaceOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def update(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def update(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def update(options: ReplaceOptions, fileList: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def x(options: ExtractOptions & FileOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def x(options: ExtractOptions & FileOptions, fileList: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def x(
      options: ExtractOptions & FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def x(
      options: ExtractOptions & FileOptions,
      fileList: Unit,
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def x(options: ExtractOptionsFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def x(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def x_Writable(options: ExtractOptions): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any]).asInstanceOf[Writable]
    @scala.inline
    def x_Writable(options: ExtractOptions, fileList: js.Array[String]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def x_Writable(
      options: ExtractOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
    @scala.inline
    def x_Writable(options: ExtractOptions, fileList: Unit, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(options.asInstanceOf[js.Any], fileList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Writable]
  }
}
