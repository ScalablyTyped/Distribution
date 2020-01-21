package typings.jestDocblock

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-docblock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def extract(code: String): String = js.native
  def parse(docblock: String): StringDictionary[String] = js.native
}

