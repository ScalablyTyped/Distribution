package typings.listr2.anon

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(buffer: String): Boolean = js.native
  def apply(buffer: String, cb: js.Function1[js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def apply(buffer: js.typedarray.Uint8Array): Boolean = js.native
  def apply(buffer: js.typedarray.Uint8Array, cb: js.Function1[js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def apply(chunk: Any): Boolean = js.native
  def apply(chunk: Any, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def apply(chunk: Any, encoding: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def apply(chunk: Any, encoding: BufferEncoding): Boolean = js.native
  def apply(
    chunk: Any,
    encoding: BufferEncoding,
    cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Boolean = js.native
  def apply(str: String, encoding: Unit, cb: js.Function1[js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def apply(str: String, encoding: BufferEncoding): Boolean = js.native
  def apply(str: String, encoding: BufferEncoding, cb: js.Function1[js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def apply(
    str: js.typedarray.Uint8Array,
    encoding: Unit,
    cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Boolean = js.native
  def apply(str: js.typedarray.Uint8Array, encoding: BufferEncoding): Boolean = js.native
  def apply(
    str: js.typedarray.Uint8Array,
    encoding: BufferEncoding,
    cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Boolean = js.native
}
