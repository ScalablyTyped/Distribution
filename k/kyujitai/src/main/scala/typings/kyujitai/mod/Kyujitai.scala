package typings.kyujitai.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Utility collections for making Japanese text old-fashioned.
  */
@js.native
trait Kyujitai extends js.Object {
  
  /**
    * Decode string from kyujitai to shinjitai.
    */
  def decode(str: String): String = js.native
  def decode(str: String, options: DecodeOptions): String = js.native
  
  /**
    * Encode string from shinjitai to kyujitai.
    * @param str Input string
    * @param [options]
    */
  def encode(str: String): String = js.native
  def encode(str: String, options: EncodeOptions): String = js.native
}
