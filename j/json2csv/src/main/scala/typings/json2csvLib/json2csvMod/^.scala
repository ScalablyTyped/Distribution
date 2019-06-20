package typings
package json2csvLib.json2csvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse[T](data: T): java.lang.String = js.native
  def parse[T](data: T, opts: json2csvLib.jSON2CSVBaseMod.json2csvNs.Options[T]): java.lang.String = js.native
  def parse[T](data: js.Array[T]): java.lang.String = js.native
  def parse[T](data: js.Array[T], opts: json2csvLib.jSON2CSVBaseMod.json2csvNs.Options[T]): java.lang.String = js.native
  def parseAsync[T](data: T): js.Promise[java.lang.String] = js.native
  def parseAsync[T](data: T, opts: json2csvLib.jSON2CSVBaseMod.json2csvNs.Options[T]): js.Promise[java.lang.String] = js.native
  def parseAsync[T](
    data: T,
    opts: json2csvLib.jSON2CSVBaseMod.json2csvNs.Options[T],
    transformOpts: nodeLib.streamMod.TransformOptions
  ): js.Promise[java.lang.String] = js.native
  def parseAsync[T](data: js.Array[T]): js.Promise[java.lang.String] = js.native
  def parseAsync[T](data: js.Array[T], opts: json2csvLib.jSON2CSVBaseMod.json2csvNs.Options[T]): js.Promise[java.lang.String] = js.native
  def parseAsync[T](
    data: js.Array[T],
    opts: json2csvLib.jSON2CSVBaseMod.json2csvNs.Options[T],
    transformOpts: nodeLib.streamMod.TransformOptions
  ): js.Promise[java.lang.String] = js.native
  def parseAsync[T](data: nodeLib.streamMod.Readable): js.Promise[java.lang.String] = js.native
  def parseAsync[T](data: nodeLib.streamMod.Readable, opts: json2csvLib.jSON2CSVBaseMod.json2csvNs.Options[T]): js.Promise[java.lang.String] = js.native
  def parseAsync[T](
    data: nodeLib.streamMod.Readable,
    opts: json2csvLib.jSON2CSVBaseMod.json2csvNs.Options[T],
    transformOpts: nodeLib.streamMod.TransformOptions
  ): js.Promise[java.lang.String] = js.native
}

