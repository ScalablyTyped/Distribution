package typings
package markedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Escapes
  extends org.scalablytyped.runtime.Instantiable1[/* links */ js.Array[java.lang.String], markedLib.markedMod.markedNs.InlineLexer]
     with org.scalablytyped.runtime.Instantiable2[
      /* links */ js.Array[java.lang.String], 
      /* options */ markedLib.markedMod.markedNs.MarkedOptions, 
      markedLib.markedMod.markedNs.InlineLexer
    ] {
  var rules: markedLib.markedMod.markedNs.Rules = js.native
  def escapes(text: java.lang.String): java.lang.String = js.native
  def output(src: java.lang.String, links: js.Array[java.lang.String]): java.lang.String = js.native
  def output(
    src: java.lang.String,
    links: js.Array[java.lang.String],
    options: markedLib.markedMod.markedNs.MarkedOptions
  ): java.lang.String = js.native
}

