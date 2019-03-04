package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BufferCallback extends js.Object {
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike): js.Promise[java.lang.String] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncoding): js.Promise[nodeLib.Buffer] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncoding): js.Promise[java.lang.String] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingNull): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Promise[java.lang.String] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(path: nodeLib.fsMod.PathLike, options: graspLib.graspLibStrings.buffer): js.Promise[nodeLib.Buffer] = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* resolvedPath */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_BufferEncoding,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingBufferEncoding,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.BufferEncoding,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* resolvedPath */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("native")
  def native_buffer(
    path: nodeLib.fsMod.PathLike,
    options: graspLib.graspLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

