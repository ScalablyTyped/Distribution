package typings.logform.logformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logform", "Format")
@js.native
class Format () extends js.Object {
  def this(opts: js.Object) = this()
  var options: js.UndefOr[js.Object] = js.native
  @JSName("transform")
  var transform_Original: TransformFunction = js.native
  def transform(info: TransformableInfo): TransformableInfo | Boolean = js.native
  def transform(info: TransformableInfo, opts: js.Any): TransformableInfo | Boolean = js.native
}

@JSImport("logform", "format")
@js.native
object format extends js.Object {
  def apply(transform: TransformFunction): FormatWrap = js.native
  def align(): Format = js.native
  def cli(): Format = js.native
  def cli(opts: CliOptions): Format = js.native
  def colorize(): Colorizer = js.native
  def colorize(opts: ColorizeOptions): Colorizer = js.native
  def combine(formats: Format*): Format = js.native
  def errors(): Format = js.native
  def errors(opts: js.Object): Format = js.native
  def json(): Format = js.native
  def json(opts: JsonOptions): Format = js.native
  def label(): Format = js.native
  def label(opts: LabelOptions): Format = js.native
  def logstash(): Format = js.native
  def metadata(): Format = js.native
  def metadata(opts: MetadataOptions): Format = js.native
  def ms(): Format = js.native
  def padLevels(): Format = js.native
  def padLevels(opts: PadLevelsOptions): Format = js.native
  def prettyPrint(): Format = js.native
  def prettyPrint(opts: PrettyPrintOptions): Format = js.native
  def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): Format = js.native
  def simple(): Format = js.native
  def splat(): Format = js.native
  def timestamp(): Format = js.native
  def timestamp(opts: TimestampOptions): Format = js.native
  def uncolorize(): Format = js.native
  def uncolorize(opts: UncolorizeOptions): Format = js.native
}

