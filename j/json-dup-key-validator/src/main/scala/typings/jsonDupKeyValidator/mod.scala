package typings.jsonDupKeyValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-dup-key-validator", "parse")
  @js.native
  def parse(jsonString: String): js.Object = js.native
  @JSImport("json-dup-key-validator", "parse")
  @js.native
  def parse(jsonString: String, allowDuplicatedKeys: Boolean): js.Object = js.native
  
  @JSImport("json-dup-key-validator", "validate")
  @js.native
  def validate(jsonString: String): js.UndefOr[String] = js.native
  @JSImport("json-dup-key-validator", "validate")
  @js.native
  def validate(jsonString: String, allowDuplicatedKeys: Boolean): js.UndefOr[String] = js.native
}
