package typings.hlsJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hlsJs.anon.Height
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "AttrList")
@js.native
open class AttrList protected ()
  extends StObject
     with /* key */ StringDictionary[Any] {
  def this(attrs: String) = this()
  def this(attrs: Record[String, Any]) = this()
  
  def bool(attrName: String): Boolean = js.native
  
  def decimalFloatingPoint(attrName: String): Double = js.native
  
  def decimalInteger(attrName: String): Double = js.native
  
  def decimalResolution(attrName: String): js.UndefOr[Height] = js.native
  
  def enumeratedString(attrName: String): js.UndefOr[String] = js.native
  
  def hexadecimalInteger(attrName: String): js.typedarray.Uint8Array | Null = js.native
  
  def hexadecimalIntegerAsNumber(attrName: String): Double = js.native
  
  def optionalFloat(attrName: String, defaultValue: Double): Double = js.native
}
/* static members */
object AttrList {
  
  @JSImport("hls.js", "AttrList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseAttrList(input: String): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAttrList")(input.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
}
