package typings.ionicUtilsFs.mod

import typings.fsExtra.mod.FsSymlinkType
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "symlink")
@js.native
object symlink extends js.Object {
  def apply(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  def apply(srcpath: String, dstpath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(
    srcpath: String,
    dstpath: String,
    `type`: js.UndefOr[FsSymlinkType],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: String, dstpath: String, `type`: FsSymlinkType): js.Promise[Unit] = js.native
  def apply(srcpath: String, dstpath: Buffer): js.Promise[Unit] = js.native
  def apply(srcpath: String, dstpath: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(
    srcpath: String,
    dstpath: Buffer,
    `type`: js.UndefOr[FsSymlinkType],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: String, dstpath: Buffer, `type`: FsSymlinkType): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: String): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(
    srcpath: Buffer,
    dstpath: String,
    `type`: js.UndefOr[FsSymlinkType],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: Buffer, dstpath: String, `type`: FsSymlinkType): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: Buffer): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(
    srcpath: Buffer,
    dstpath: Buffer,
    `type`: js.UndefOr[FsSymlinkType],
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(srcpath: Buffer, dstpath: Buffer, `type`: FsSymlinkType): js.Promise[Unit] = js.native
}

