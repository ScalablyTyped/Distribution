package typings.makeDir.anon

import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrealpath extends StObject {
  
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: EncodingOption,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  
  def native(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronous [`realpath(3)`](http://man7.org/linux/man-pages/man3/realpath.3.html).
    *
    * The `callback` gets two arguments `(err, resolvedPath)`.
    *
    * Only paths that can be converted to UTF8 strings are supported.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the path passed to the callback. If the `encoding` is set to `'buffer'`,
    * the path returned will be passed as a `Buffer` object.
    *
    * On Linux, when Node.js is linked against musl libc, the procfs file system must
    * be mounted on `/proc` in order for this function to work. Glibc does not have
    * this restriction.
    * @since v9.2.0
    */
  def native(
    path: PathLike,
    options: EncodingOption,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
}
