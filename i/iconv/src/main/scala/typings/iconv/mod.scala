package typings.iconv

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.iconv.anon.End
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("iconv", JSImport.Namespace)
  @js.native
  class ^ protected () extends Iconv {
    def this(fromEncoding: String, toEncoding: String) = this()
  }
  @JSImport("iconv", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  @js.native
  trait Iconv extends WritableStream {
    
    def convert(input: String): Buffer = js.native
    def convert(input: String, encoding: String): Buffer = js.native
    def convert(input: Buffer): Buffer = js.native
    def convert(input: Buffer, encoding: String): Buffer = js.native
    
    def end(buffer: Buffer, cb: js.Function): Unit = js.native
    def end(input: js.UndefOr[scala.Nothing], encoding: String): Unit = js.native
    def end(input: String, encoding: String): Unit = js.native
    def end(input: Buffer): Unit = js.native
    def end(input: Buffer, encoding: String): Unit = js.native
    def end(str: String, cb: js.Function): Unit = js.native
    def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
    def end(str: String, encoding: String, cb: js.Function): Unit = js.native
    
    // copy from stream.Stream
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def write(buffer: String, cb: js.Function): Boolean = js.native
    def write(buffer: Buffer, cb: js.Function): Boolean = js.native
    def write(input: String, encoding: String): Boolean = js.native
    // copy from NodeJS.WritableStream for compatibility
    def write(input: Buffer): Boolean = js.native
    def write(input: Buffer, encoding: String): Boolean = js.native
    def write(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Boolean = js.native
    def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
  }
  
  @js.native
  trait Static extends Instantiable2[/* fromEncoding */ String, /* toEncoding */ String, Iconv] {
    
    def apply(fromEncoding: String, toEncoding: String): Iconv = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
