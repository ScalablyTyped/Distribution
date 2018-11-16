package typings
package logformLib.logformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logform", "format")
@js.native
object formatNs extends js.Object {
  def align(): logformLib.logformMod.Format = js.native
  def align(opts: js.Object): logformLib.logformMod.Format = js.native
  def cli(): logformLib.logformMod.Format = js.native
  def cli(opts: js.Object): logformLib.logformMod.Format = js.native
  def colorize(): logformLib.logformMod.Colorizer = js.native
  def colorize(opts: js.Object): logformLib.logformMod.Colorizer = js.native
  def combine(formats: logformLib.logformMod.Format*): logformLib.logformMod.Format = js.native
  def json(): logformLib.logformMod.Format = js.native
  def json(opts: js.Object): logformLib.logformMod.Format = js.native
  def label(): logformLib.logformMod.Format = js.native
  def label(opts: js.Object): logformLib.logformMod.Format = js.native
  def logstash(): logformLib.logformMod.Format = js.native
  def logstash(opts: js.Object): logformLib.logformMod.Format = js.native
  def padLevels(): logformLib.logformMod.Format = js.native
  def padLevels(opts: js.Object): logformLib.logformMod.Format = js.native
  def prettyPrint(): logformLib.logformMod.Format = js.native
  def prettyPrint(opts: js.Object): logformLib.logformMod.Format = js.native
  def printf(
    templateFunction: js.Function1[/* info */ logformLib.logformMod.TransformableInfo, java.lang.String]
  ): logformLib.logformMod.Format = js.native
  def simple(): logformLib.logformMod.Format = js.native
  def simple(opts: js.Object): logformLib.logformMod.Format = js.native
  def splat(): logformLib.logformMod.Format = js.native
  def splat(opts: js.Object): logformLib.logformMod.Format = js.native
  def timestamp(): logformLib.logformMod.Format = js.native
  def timestamp(opts: js.Object): logformLib.logformMod.Format = js.native
  def uncolorize(): logformLib.logformMod.Format = js.native
  def uncolorize(opts: js.Object): logformLib.logformMod.Format = js.native
}

