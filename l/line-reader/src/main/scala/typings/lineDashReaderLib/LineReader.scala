package typings
package lineDashReaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineReader extends js.Object {
  def close(cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def eachLine(): js.Function = js.native
  def eachLine(
    file: java.lang.String,
    cb: js.Function3[
      /* line */ java.lang.String, 
      /* last */ js.UndefOr[scala.Boolean], 
      /* cb */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): LineReader = js.native
  def eachLine(
    file: java.lang.String,
    options: LineReaderOptions,
    cb: js.Function3[
      /* line */ java.lang.String, 
      /* last */ js.UndefOr[scala.Boolean], 
      /* cb */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): LineReader = js.native
  def hasNextLine(): scala.Boolean = js.native
  def nextLine(cb: js.Function2[/* err */ stdLib.Error, /* line */ java.lang.String, scala.Unit]): scala.Unit = js.native
   // For Promise.promisify;
  def open(): js.Function = js.native
  def open(
    file: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* reader */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def open(
    file: java.lang.String,
    options: LineReaderOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* reader */ this.type, scala.Unit]
  ): scala.Unit = js.native
}

