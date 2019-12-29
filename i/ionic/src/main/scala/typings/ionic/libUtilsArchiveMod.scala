package typings.ionic

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import typings.tar.Anon_Sync
import typings.tar.tarMod.CreateOptions
import typings.tar.tarMod.ExtractOptions
import typings.tar.tarMod.FileOptions
import typings.tar.tarMod.HeaderProperties
import typings.tar.tarMod.ListOptions
import typings.tar.tarMod.PackStream
import typings.tar.tarMod.ParseStream
import typings.tar.tarMod.ReplaceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/archive", JSImport.Namespace)
@js.native
object libUtilsArchiveMod extends js.Object {
  @js.native
  object tar extends js.Object {
    val blockSize: Double = js.native
    val fieldEnds: js.Array[Double] = js.native
    val fieldOffs: js.Array[Double] = js.native
    val fieldSize: js.Array[Double] = js.native
    val headerSize: Double = js.native
    def Extract(opts: String): ParseStream = js.native
    def Extract(opts: ExtractOptions): ParseStream = js.native
    def Pack(): PackStream = js.native
    def Pack(props: HeaderProperties): PackStream = js.native
    def Parse(): ParseStream = js.native
    def create(options: CreateOptions, fileList: js.Array[String]): Readable = js.native
    def create(
      options: CreateOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Readable = js.native
    @JSName("create")
    def create_Promise(options: CreateOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSName("create")
    def create_Unit(options: CreateOptions with FileOptions with Anon_Sync, fileList: js.Array[String]): Unit = js.native
    @JSName("create")
    def create_Unit(
      options: CreateOptions with FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def extract(
      options: ExtractOptions with FileOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def extract(options: ExtractOptions): Writable = js.native
    def extract(options: ExtractOptions, fileList: js.Array[String]): Writable = js.native
    def extract(
      options: ExtractOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSName("extract")
    def extract_Promise(options: ExtractOptions with FileOptions): js.Promise[Unit] = js.native
    @JSName("extract")
    def extract_Promise(options: ExtractOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSName("extract")
    def extract_Unit(options: ExtractOptions with FileOptions with Anon_Sync): Unit = js.native
    @JSName("extract")
    def extract_Unit(options: ExtractOptions with FileOptions with Anon_Sync, fileList: js.Array[String]): Unit = js.native
    @JSName("extract")
    def extract_Unit(
      options: ExtractOptions with FileOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    def list(): Writable = js.native
    def list(options: ListOptions): Writable = js.native
    def list(options: ListOptions, fileList: js.Array[String]): Writable = js.native
    def list(
      options: ListOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): Writable = js.native
    @JSName("list")
    def list_Promise(options: ListOptions with FileOptions): js.Promise[Unit] = js.native
    @JSName("list")
    def list_Promise(options: ListOptions with FileOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    @JSName("list")
    def list_Unit(options: ListOptions with FileOptions with Anon_Sync): Unit = js.native
    @JSName("list")
    def list_Unit(options: ListOptions with FileOptions with Anon_Sync, fileList: js.Array[String]): Unit = js.native
    def replace(options: ReplaceOptions): js.Promise[Unit] = js.native
    def replace(
      options: ReplaceOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    def replace(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    def replace(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    def update(options: ReplaceOptions): js.Promise[Unit] = js.native
    def update(
      options: ReplaceOptions,
      fileList: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    def update(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
    def update(
      options: ReplaceOptions,
      fileList: js.Array[String],
      callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
    ): js.Promise[Unit] = js.native
    @js.native
    object c extends js.Object {
      def apply(options: CreateOptions, fileList: js.Array[String]): Readable = js.native
      def apply(
        options: CreateOptions,
        fileList: js.Array[String],
        callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
      ): Readable = js.native
    }
    
    @js.native
    object knownExtended extends js.Object {
      var atime: Boolean = js.native
      var charset: Boolean = js.native
      var comment: Boolean = js.native
      var ctime: Boolean = js.native
      var gid: Boolean = js.native
      var gname: Boolean = js.native
      var linkpat: Boolean = js.native
      var mtime: Boolean = js.native
      var path: Boolean = js.native
      var realtime: Boolean = js.native
      var security: Boolean = js.native
      var size: Boolean = js.native
      var uid: Boolean = js.native
      var uname: Boolean = js.native
    }
    
    @js.native
    object modes extends js.Object {
      var gexec: Double = js.native
      var gread: Double = js.native
      var gwrite: Double = js.native
      var oexec: Double = js.native
      var oread: Double = js.native
      var owrite: Double = js.native
      var sgid: Double = js.native
      var suid: Double = js.native
      var svtx: Double = js.native
      var uexec: Double = js.native
      var uread: Double = js.native
      var uwrite: Double = js.native
    }
    
    @js.native
    object numeric extends js.Object {
      var atime: Boolean = js.native
      var cksum: Boolean = js.native
      var ctime: Boolean = js.native
      var dev: Boolean = js.native
      var devmaj: Boolean = js.native
      var devmin: Boolean = js.native
      var gid: Boolean = js.native
      var ino: Boolean = js.native
      var mode: Boolean = js.native
      var mtime: Boolean = js.native
      var nlink: Boolean = js.native
      var size: Boolean = js.native
      var uid: Boolean = js.native
    }
    
    @js.native
    object r extends js.Object {
      def apply(options: ReplaceOptions): js.Promise[Unit] = js.native
      def apply(
        options: ReplaceOptions,
        fileList: js.UndefOr[scala.Nothing],
        callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
      ): js.Promise[Unit] = js.native
      def apply(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
      def apply(
        options: ReplaceOptions,
        fileList: js.Array[String],
        callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
      ): js.Promise[Unit] = js.native
    }
    
    @js.native
    object t extends js.Object {
      def apply(): Writable = js.native
      def apply(options: ListOptions): Writable = js.native
      def apply(options: ListOptions, fileList: js.Array[String]): Writable = js.native
      def apply(
        options: ListOptions,
        fileList: js.Array[String],
        callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
      ): Writable = js.native
    }
    
    @js.native
    object types extends js.Object {
      var `0`: String = js.native
      var `1`: String = js.native
      var `2`: String = js.native
      var `3`: String = js.native
      var `4`: String = js.native
      var `5`: String = js.native
      var `6`: String = js.native
      var `7`: String = js.native
      var A: String = js.native
      var BlockDevice: String = js.native
      var CharacterDevice: String = js.native
      var ContiguousFile: String = js.native
      var ContinuationFile: String = js.native
      var D: String = js.native
      var Directory: String = js.native
      var ExtendedHeader: String = js.native
      var FIFO: String = js.native
      var File: String = js.native
      var GNUDumpDir: String = js.native
      var GlobalExtendedHeader: String = js.native
      var I: String = js.native
      var INode: String = js.native
      var K: String = js.native
      var L: String = js.native
      var Link: String = js.native
      var M: String = js.native
      var N: String = js.native
      var NextFileHasLonLinkPath: String = js.native
      var NextFileHasLongPath: String = js.native
      @JSName("\u0000")
      var Null: String = js.native
      var OldExtendedHeader: String = js.native
      var OldFile: String = js.native
      var S: String = js.native
      var SolarisACL: String = js.native
      var SymbolicLick: String = js.native
      var TapeVolumeHeader: String = js.native
      var V: String = js.native
      var X: String = js.native
      @JSName("")
      var _empty: String = js.native
      var g: String = js.native
      var x: String = js.native
    }
    
    @js.native
    object u extends js.Object {
      def apply(options: ReplaceOptions): js.Promise[Unit] = js.native
      def apply(
        options: ReplaceOptions,
        fileList: js.UndefOr[scala.Nothing],
        callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
      ): js.Promise[Unit] = js.native
      def apply(options: ReplaceOptions, fileList: js.Array[String]): js.Promise[Unit] = js.native
      def apply(
        options: ReplaceOptions,
        fileList: js.Array[String],
        callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
      ): js.Promise[Unit] = js.native
    }
    
    @js.native
    object x extends js.Object {
      def apply(
        options: ExtractOptions with FileOptions,
        fileList: js.UndefOr[scala.Nothing],
        callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
      ): Unit = js.native
      def apply(options: ExtractOptions): Writable = js.native
      def apply(options: ExtractOptions, fileList: js.Array[String]): Writable = js.native
      def apply(
        options: ExtractOptions,
        fileList: js.Array[String],
        callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
      ): Writable = js.native
    }
    
  }
  
}

