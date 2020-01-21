package typings.javascriptObfuscator.icryptutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICryptUtils extends js.Object {
  /**
    * @param string
    */
  def btoa(string: String): String
  /**
    * @param str
    * @param length
    * @returns {[string, string]}
    */
  def hideString(str: String, length: Double): js.Tuple2[String, String]
  /**
    * @param key
    * @param string
    * @returns {string}
    */
  /* tslint:disable */
  def rc4(string: String, key: String): String
}

object ICryptUtils {
  @scala.inline
  def apply(
    btoa: String => String,
    hideString: (String, Double) => js.Tuple2[String, String],
    rc4: (String, String) => String
  ): ICryptUtils = {
    val __obj = js.Dynamic.literal(btoa = js.Any.fromFunction1(btoa), hideString = js.Any.fromFunction2(hideString), rc4 = js.Any.fromFunction2(rc4))
  
    __obj.asInstanceOf[ICryptUtils]
  }
}

