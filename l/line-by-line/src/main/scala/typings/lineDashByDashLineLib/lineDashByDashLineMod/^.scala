package typings
package lineDashByDashLineLib.lineDashByDashLineMod

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
  def this(filePath: java.lang.String) = this()
  /**
    * Constructs a new `LineByLineReader` from a readable stream.
    * @param stream The stream to read.
    * @param options Optional. The options used when constructing the new `LineByLineReader` object.
    */
  def this(stream: nodeLib.streamMod.Readable) = this()
  def this(filePath: java.lang.String, options: LineByLineReaderFileOptions) = this()
  def this(stream: nodeLib.streamMod.Readable, options: LineByLineReaderOptions) = this()
}

