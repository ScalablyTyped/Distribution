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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiveMod {
  
  object tar {
    
    @JSImport("ionic/lib/utils/archive", "tar.Extract")
    @js.native
    def Extract_(opts: String): ParseStream = js.native
    @JSImport("ionic/lib/utils/archive", "tar.Extract")
    @js.native
    def Extract_(opts: ExtractOptions): ParseStream = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.Pack")
    @js.native
    def Pack(): PackStream = js.native
    @JSImport("ionic/lib/utils/archive", "tar.Pack")
    @js.native
    def Pack(props: HeaderProperties): PackStream = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.Parse")
    @js.native
    def Parse(): ParseStream = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.blockSize")
    @js.native
    val blockSize: Double = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.c")
    @js.native
    def c(options: CreateOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.c")
    @js.native
    def c(
      options: CreateOptions with FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.c")
    @js.native
    def c(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.c")
    @js.native
    def c_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.c")
    @js.native
    def c_Readable(
      options: CreateOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Readable = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.create")
    @js.native
    def create(options: CreateOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.create")
    @js.native
    def create(
      options: CreateOptions with FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.create")
    @js.native
    def create(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.create")
    @js.native
    def create_Readable(options: CreateOptions, fileList: js.Array[String]): Readable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.create")
    @js.native
    def create_Readable(
      options: CreateOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Readable = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract(options: ExtractOptions with FileOptions): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract(
      options: ExtractOptions with FileOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract(options: ExtractOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract(
      options: ExtractOptions with FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract(options: ExtractOptionsFileOptions): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract_Writable(options: ExtractOptions): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract_Writable(
      options: ExtractOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract_Writable(options: ExtractOptions, fileList: js.Array[String]): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.extract")
    @js.native
    def extract_Writable(
      options: ExtractOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    
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
    
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(options: ListOptions with FileOptions): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(
      options: ListOptions with FileOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(options: ListOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(
      options: ListOptions with FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(
      options: js.UndefOr[scala.Nothing],
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(options: js.UndefOr[scala.Nothing], fileList: js.Array[String]): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(
      options: js.UndefOr[scala.Nothing],
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(options: ListOptionsFileOptionssyn): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list(options: ListOptionsFileOptionssyn, fileList: js.Array[String]): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list_Writable(options: ListOptions with FileOptions): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.list")
    @js.native
    def list_Writable(options: ListOptions with FileOptions, fileList: js.Array[String]): Writable = js.native
    
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
    
    @JSImport("ionic/lib/utils/archive", "tar.r")
    @js.native
    def r(options: ReplaceOptions): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.r")
    @js.native
    def r(
      options: ReplaceOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.r")
    @js.native
    def r(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.r")
    @js.native
    def r(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.replace")
    @js.native
    def replace(options: ReplaceOptions): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.replace")
    @js.native
    def replace(
      options: ReplaceOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.replace")
    @js.native
    def replace(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.replace")
    @js.native
    def replace(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(options: ListOptions with FileOptions): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(
      options: ListOptions with FileOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(options: ListOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(
      options: ListOptions with FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(
      options: js.UndefOr[scala.Nothing],
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(options: js.UndefOr[scala.Nothing], fileList: js.Array[String]): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(
      options: js.UndefOr[scala.Nothing],
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(options: ListOptionsFileOptionssyn): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t(options: ListOptionsFileOptionssyn, fileList: js.Array[String]): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t_Writable(options: ListOptions with FileOptions): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.t")
    @js.native
    def t_Writable(options: ListOptions with FileOptions, fileList: js.Array[String]): Writable = js.native
    
    object types {
      
      @JSImport("ionic/lib/utils/archive", "tar.types")
      @js.native
      val ^ : js.Any = js.native
      
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
    }
    
    @JSImport("ionic/lib/utils/archive", "tar.u")
    @js.native
    def u(options: ReplaceOptions): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.u")
    @js.native
    def u(
      options: ReplaceOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.u")
    @js.native
    def u(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.u")
    @js.native
    def u(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.update")
    @js.native
    def update(options: ReplaceOptions): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.update")
    @js.native
    def update(
      options: ReplaceOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.update")
    @js.native
    def update(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.update")
    @js.native
    def update(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x(options: ExtractOptions with FileOptions): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x(
      options: ExtractOptions with FileOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x(options: ExtractOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x(
      options: ExtractOptions with FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x(options: ExtractOptionsFileOptions): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x(options: ExtractOptionsFileOptions, fileList: js.Array[String]): Unit = js.native
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x_Writable(options: ExtractOptions): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x_Writable(
      options: ExtractOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x_Writable(options: ExtractOptions, fileList: js.Array[String]): Writable = js.native
    @JSImport("ionic/lib/utils/archive", "tar.x")
    @js.native
    def x_Writable(
      options: ExtractOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
  }
}
