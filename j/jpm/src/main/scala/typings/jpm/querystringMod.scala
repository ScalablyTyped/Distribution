package typings.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object querystringMod {
  
  @JSImport("sdk/querystring", "escape")
  @js.native
  def escape(query: String): String = js.native
  
  @JSImport("sdk/querystring", "parse")
  @js.native
  def parse(querystring: String): js.Object = js.native
  @JSImport("sdk/querystring", "parse")
  @js.native
  def parse(querystring: String, separator: js.UndefOr[scala.Nothing], assignment: String): js.Object = js.native
  @JSImport("sdk/querystring", "parse")
  @js.native
  def parse(querystring: String, separator: String): js.Object = js.native
  @JSImport("sdk/querystring", "parse")
  @js.native
  def parse(querystring: String, separator: String, assignment: String): js.Object = js.native
  
  @JSImport("sdk/querystring", "stringify")
  @js.native
  def stringify(`object`: js.Object): String = js.native
  @JSImport("sdk/querystring", "stringify")
  @js.native
  def stringify(`object`: js.Object, separator: js.UndefOr[scala.Nothing], assignment: String): String = js.native
  @JSImport("sdk/querystring", "stringify")
  @js.native
  def stringify(`object`: js.Object, separator: String): String = js.native
  @JSImport("sdk/querystring", "stringify")
  @js.native
  def stringify(`object`: js.Object, separator: String, assignment: String): String = js.native
  
  @JSImport("sdk/querystring", "unescape")
  @js.native
  def unescape(query: String): String = js.native
}
