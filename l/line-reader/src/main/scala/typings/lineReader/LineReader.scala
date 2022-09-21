package typings.lineReader

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineReader extends StObject {
  
  def eachLine(): js.Function = js.native
  def eachLine(
    file: String,
    cb: js.Function3[/* line */ String, /* last */ Boolean, /* continueCb */ js.UndefOr[js.Function], Unit]
  ): LineReader = js.native
  def eachLine(
    file: String,
    cb: js.Function3[/* line */ String, /* last */ Boolean, /* continueCb */ js.UndefOr[js.Function], Unit],
    errCb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): LineReader = js.native
  // For Promise.promisify;
  def eachLine(
    file: String,
    options: LineReaderOptions,
    cb: js.Function3[/* line */ String, /* last */ Boolean, /* continueCb */ js.UndefOr[js.Function], Unit]
  ): LineReader = js.native
  def eachLine(
    file: String,
    options: LineReaderOptions,
    cb: js.Function3[/* line */ String, /* last */ Boolean, /* continueCb */ js.UndefOr[js.Function], Unit],
    errCb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): LineReader = js.native
  def eachLine(
    file: ReadableStream[Any],
    cb: js.Function3[/* line */ String, /* last */ Boolean, /* continueCb */ js.UndefOr[js.Function], Unit]
  ): LineReader = js.native
  def eachLine(
    file: ReadableStream[Any],
    cb: js.Function3[/* line */ String, /* last */ Boolean, /* continueCb */ js.UndefOr[js.Function], Unit],
    errCb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): LineReader = js.native
  def eachLine(
    file: ReadableStream[Any],
    options: LineReaderOptions,
    cb: js.Function3[/* line */ String, /* last */ Boolean, /* continueCb */ js.UndefOr[js.Function], Unit]
  ): LineReader = js.native
  def eachLine(
    file: ReadableStream[Any],
    options: LineReaderOptions,
    cb: js.Function3[/* line */ String, /* last */ Boolean, /* continueCb */ js.UndefOr[js.Function], Unit],
    errCb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): LineReader = js.native
  
  def open(): js.Function = js.native
  def open(file: String, cb: js.Function2[/* err */ js.Error, /* reader */ Reader, Unit]): Unit = js.native
  def open(
    file: String,
    options: LineReaderOptions,
    cb: js.Function2[/* err */ js.Error, /* reader */ Reader, Unit]
  ): Unit = js.native
  def open(file: ReadableStream[Any], cb: js.Function2[/* err */ js.Error, /* reader */ Reader, Unit]): Unit = js.native
  def open(
    file: ReadableStream[Any],
    options: LineReaderOptions,
    cb: js.Function2[/* err */ js.Error, /* reader */ Reader, Unit]
  ): Unit = js.native
}
