package typings.lineReader

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineReader extends js.Object {
  
  def close(cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  def eachLine(): js.Function = js.native
  def eachLine(
    file: String,
    cb: js.Function3[
      /* line */ String, 
      /* last */ js.UndefOr[Boolean], 
      /* cb */ js.UndefOr[js.Function], 
      Unit
    ]
  ): LineReader = js.native
  def eachLine(
    file: String,
    options: LineReaderOptions,
    cb: js.Function3[
      /* line */ String, 
      /* last */ js.UndefOr[Boolean], 
      /* cb */ js.UndefOr[js.Function], 
      Unit
    ]
  ): LineReader = js.native
  def eachLine(
    file: ReadableStream,
    cb: js.Function3[
      /* line */ String, 
      /* last */ js.UndefOr[Boolean], 
      /* cb */ js.UndefOr[js.Function], 
      Unit
    ]
  ): LineReader = js.native
  def eachLine(
    file: ReadableStream,
    options: LineReaderOptions,
    cb: js.Function3[
      /* line */ String, 
      /* last */ js.UndefOr[Boolean], 
      /* cb */ js.UndefOr[js.Function], 
      Unit
    ]
  ): LineReader = js.native
  
  def hasNextLine(): Boolean = js.native
  
  def nextLine(cb: js.Function2[/* err */ Error, /* line */ String, Unit]): Unit = js.native
  
   // For Promise.promisify;
  def open(): js.Function = js.native
  def open(file: String, cb: js.Function2[/* err */ Error, /* reader */ this.type, Unit]): Unit = js.native
  def open(
    file: String,
    options: LineReaderOptions,
    cb: js.Function2[/* err */ Error, /* reader */ this.type, Unit]
  ): Unit = js.native
  def open(file: ReadableStream, cb: js.Function2[/* err */ Error, /* reader */ this.type, Unit]): Unit = js.native
  def open(
    file: ReadableStream,
    options: LineReaderOptions,
    cb: js.Function2[/* err */ Error, /* reader */ this.type, Unit]
  ): Unit = js.native
}
