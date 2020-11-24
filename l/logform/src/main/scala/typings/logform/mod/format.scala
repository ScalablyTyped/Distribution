package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logform", "format")
@js.native
object format extends js.Object {
  
  def apply(transform: TransformFunction): FormatWrap = js.native
  
  def align(): Format_ = js.native
  
  def cli(): Format_ = js.native
  def cli(opts: CliOptions): Format_ = js.native
  
  def colorize(): Colorizer = js.native
  def colorize(opts: ColorizeOptions): Colorizer = js.native
  
  def combine(formats: Format_ *): Format_ = js.native
  
  def errors(): Format_ = js.native
  def errors(opts: js.Object): Format_ = js.native
  
  def json(): Format_ = js.native
  def json(opts: JsonOptions): Format_ = js.native
  
  def label(): Format_ = js.native
  def label(opts: LabelOptions): Format_ = js.native
  
  def logstash(): Format_ = js.native
  
  def metadata(): Format_ = js.native
  def metadata(opts: MetadataOptions): Format_ = js.native
  
  def ms(): Format_ = js.native
  
  def padLevels(): Format_ = js.native
  def padLevels(opts: PadLevelsOptions): Format_ = js.native
  
  def prettyPrint(): Format_ = js.native
  def prettyPrint(opts: PrettyPrintOptions): Format_ = js.native
  
  def printf(templateFunction: js.Function1[/* info */ TransformableInfo, String]): Format_ = js.native
  
  def simple(): Format_ = js.native
  
  def splat(): Format_ = js.native
  
  def timestamp(): Format_ = js.native
  def timestamp(opts: TimestampOptions): Format_ = js.native
  
  def uncolorize(): Format_ = js.native
  def uncolorize(opts: UncolorizeOptions): Format_ = js.native
}
