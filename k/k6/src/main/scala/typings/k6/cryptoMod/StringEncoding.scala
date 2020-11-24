package typings.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.k6.k6Strings.hex
  - typings.k6.k6Strings.base64
  - typings.k6.k6Strings.base64url
  - typings.k6.k6Strings.base64rawurl
*/
trait StringEncoding extends js.Object
object StringEncoding {
  
  @scala.inline
  def base64: typings.k6.k6Strings.base64 = "base64".asInstanceOf[typings.k6.k6Strings.base64]
  
  @scala.inline
  def base64rawurl: typings.k6.k6Strings.base64rawurl = "base64rawurl".asInstanceOf[typings.k6.k6Strings.base64rawurl]
  
  @scala.inline
  def base64url: typings.k6.k6Strings.base64url = "base64url".asInstanceOf[typings.k6.k6Strings.base64url]
  
  @scala.inline
  def hex: typings.k6.k6Strings.hex = "hex".asInstanceOf[typings.k6.k6Strings.hex]
}
