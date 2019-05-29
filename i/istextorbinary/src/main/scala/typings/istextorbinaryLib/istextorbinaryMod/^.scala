package typings
package istextorbinaryLib.istextorbinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istextorbinary", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getEncoding(
    buffer: nodeLib.Buffer,
    opts: js.UndefOr[scala.Nothing],
    next: js.Function2[
      /* err */ scala.Null, 
      /* result */ istextorbinaryLib.istextorbinaryLibStrings.utf8 | istextorbinaryLib.istextorbinaryLibStrings.binary, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getEncoding(
    buffer: nodeLib.Buffer,
    opts: Options,
    next: js.Function2[
      /* err */ scala.Null, 
      /* result */ istextorbinaryLib.istextorbinaryLibStrings.utf8 | istextorbinaryLib.istextorbinaryLibStrings.binary, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getEncodingSync(buffer: nodeLib.Buffer): istextorbinaryLib.istextorbinaryLibStrings.utf8 | istextorbinaryLib.istextorbinaryLibStrings.binary = js.native
  def getEncodingSync(buffer: nodeLib.Buffer, opts: Options): istextorbinaryLib.istextorbinaryLibStrings.utf8 | istextorbinaryLib.istextorbinaryLibStrings.binary = js.native
  def isBinary(
    filename: js.UndefOr[scala.Nothing],
    buffer: nodeLib.Buffer,
    next: js.Function2[/* err */ scala.Null, /* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def isBinary(
    filename: java.lang.String,
    buffer: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ scala.Null, /* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def isBinary(
    filename: java.lang.String,
    buffer: nodeLib.Buffer,
    next: js.Function2[/* err */ scala.Null, /* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def isBinarySync(filename: js.UndefOr[scala.Nothing], buffer: nodeLib.Buffer): scala.Boolean = js.native
  def isBinarySync(filename: java.lang.String): scala.Boolean = js.native
  def isBinarySync(filename: java.lang.String, buffer: nodeLib.Buffer): scala.Boolean = js.native
  def isText(
    filename: js.UndefOr[scala.Nothing],
    buffer: nodeLib.Buffer,
    next: js.Function2[/* err */ scala.Null, /* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def isText(
    filename: java.lang.String,
    buffer: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ scala.Null, /* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def isText(
    filename: java.lang.String,
    buffer: nodeLib.Buffer,
    next: js.Function2[/* err */ scala.Null, /* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def isTextSync(filename: js.UndefOr[scala.Nothing], buffer: nodeLib.Buffer): scala.Boolean = js.native
  def isTextSync(filename: java.lang.String): scala.Boolean = js.native
  def isTextSync(filename: java.lang.String, buffer: nodeLib.Buffer): scala.Boolean = js.native
}

