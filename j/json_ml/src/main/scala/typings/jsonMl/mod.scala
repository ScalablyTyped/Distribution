package typings.jsonMl

import typings.cheerio.cheerio.Cheerio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json_ml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(xml: String): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  @scala.inline
  def parse(xml: String, trim: Boolean): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any], trim.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  @scala.inline
  def stringify(`object`: js.Array[Node]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(`object`: js.Array[Node], replacer: js.Function1[/* node */ Cheerio, js.Any], indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(`object`: js.Array[Node], replacer: Null, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(`object`: js.Array[Node], replacer: Unit, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Node = String | (Array[String | js.Any])
}
