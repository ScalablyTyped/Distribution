package typings.jsonMl

import typings.cheerio.cheerio.Cheerio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json_ml", "parse")
  @js.native
  def parse(xml: String): js.Array[Node] = js.native
  @JSImport("json_ml", "parse")
  @js.native
  def parse(xml: String, trim: Boolean): js.Array[Node] = js.native
  
  @JSImport("json_ml", "stringify")
  @js.native
  def stringify(`object`: js.Array[Node]): String = js.native
  @JSImport("json_ml", "stringify")
  @js.native
  def stringify(`object`: js.Array[Node], replacer: js.UndefOr[scala.Nothing], indent: Double): String = js.native
  @JSImport("json_ml", "stringify")
  @js.native
  def stringify(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio, _]): String = js.native
  @JSImport("json_ml", "stringify")
  @js.native
  def stringify(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio, _], indent: Double): String = js.native
  @JSImport("json_ml", "stringify")
  @js.native
  def stringify(`object`: js.Array[Node], replacer: Null, indent: Double): String = js.native
  
  type Node = String | (Array[String | js.Any])
}
