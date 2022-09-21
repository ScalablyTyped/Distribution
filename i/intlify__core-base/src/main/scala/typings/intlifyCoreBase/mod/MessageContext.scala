package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageContext[T] extends StObject {
  
  def interpolate(`val`: Any): MessageType[T] = js.native
  @JSName("interpolate")
  var interpolate_Original: MessageInterpolate[T] = js.native
  
  def linked(key: Path): MessageType[T] = js.native
  def linked(key: Path, modifier: String): MessageType[T] = js.native
  def linked(key: Path, modifier: String, `type`: String): MessageType[T] = js.native
  def linked(key: Path, modifier: Unit, `type`: String): MessageType[T] = js.native
  def linked(key: Path, optoins: LinkedOptions): MessageType[T] = js.native
  
  def list(index: Double): Any = js.native
  
  def message(key: Path): MessageFunction[T] = js.native
  
  def named(key: String): Any = js.native
  
  def normalize(values: js.Array[MessageType[String | T]]): MessageType[T | js.Array[T]] = js.native
  @JSName("normalize")
  var normalize_Original: MessageNormalize[T] = js.native
  
  def plural(messages: js.Array[T]): T = js.native
  
  var `type`: String = js.native
}
