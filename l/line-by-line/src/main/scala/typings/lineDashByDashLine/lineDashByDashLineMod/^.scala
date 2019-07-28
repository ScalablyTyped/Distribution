package typings.lineDashByDashLine.lineDashByDashLineMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("line-by-line", JSImport.Namespace)
@js.native
class ^ protected () extends LineByLineReader {
  /**
    * Constructs a new `LineByLineReader` from a path to a file.
    * @param filePath The path to the file to read.
    * @param options Optional. The options used when constructing the new `LineByLineReader` object.
    */
  def this(filePath: String) = this()
  /**
    * Constructs a new `LineByLineReader` from a readable stream.
    * @param stream The stream to read.
    * @param options Optional. The options used when constructing the new `LineByLineReader` object.
    */
  def this(stream: Readable) = this()
  def this(filePath: String, options: LineByLineReaderFileOptions) = this()
  def this(stream: Readable, options: LineByLineReaderOptions) = this()
}

