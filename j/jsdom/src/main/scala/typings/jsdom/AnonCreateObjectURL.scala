package typings.jsdom

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateObjectURL
  extends Instantiable1[/* url */ String, URL]
     with Instantiable2[/* url */ String, (/* base */ String) | (/* base */ URL), URL] {
  def createObjectURL(`object`: js.Any): String = js.native
  def revokeObjectURL(url: String): Unit = js.native
}

