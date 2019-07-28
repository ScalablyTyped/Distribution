package typings.istextorbinary.istextorbinaryMod

import typings.istextorbinary.istextorbinaryStrings.binary
import typings.istextorbinary.istextorbinaryStrings.utf8
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istextorbinary", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getEncoding(
    buffer: Buffer,
    opts: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = js.native
  def getEncoding(
    buffer: Buffer,
    opts: Options,
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = js.native
  def getEncodingSync(buffer: Buffer): utf8 | binary = js.native
  def getEncodingSync(buffer: Buffer, opts: Options): utf8 | binary = js.native
  def isBinary(
    filename: js.UndefOr[scala.Nothing],
    buffer: Buffer,
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  def isBinary(
    filename: String,
    buffer: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  def isBinary(filename: String, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = js.native
  def isBinarySync(filename: js.UndefOr[scala.Nothing], buffer: Buffer): Boolean = js.native
  def isBinarySync(filename: String): Boolean = js.native
  def isBinarySync(filename: String, buffer: Buffer): Boolean = js.native
  def isText(
    filename: js.UndefOr[scala.Nothing],
    buffer: Buffer,
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  def isText(
    filename: String,
    buffer: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]
  ): Unit = js.native
  def isText(filename: String, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = js.native
  def isTextSync(filename: js.UndefOr[scala.Nothing], buffer: Buffer): Boolean = js.native
  def isTextSync(filename: String): Boolean = js.native
  def isTextSync(filename: String, buffer: Buffer): Boolean = js.native
}

