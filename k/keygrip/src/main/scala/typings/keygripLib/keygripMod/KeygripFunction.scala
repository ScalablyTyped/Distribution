package typings
package keygripLib.keygripMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeygripFunction
  extends org.scalablytyped.runtime.Instantiable1[/* keys */ js.Array[java.lang.String], Keygrip]
     with org.scalablytyped.runtime.Instantiable2[/* keys */ js.Array[java.lang.String], /* algorithm */ java.lang.String, Keygrip]
     with org.scalablytyped.runtime.Instantiable3[
      /* keys */ js.Array[java.lang.String], 
      /* algorithm */ java.lang.String, 
      /* encoding */ java.lang.String, 
      Keygrip
    ] {
  def apply(keys: js.Array[java.lang.String]): Keygrip = js.native
  def apply(keys: js.Array[java.lang.String], algorithm: java.lang.String): Keygrip = js.native
  def apply(keys: js.Array[java.lang.String], algorithm: java.lang.String, encoding: java.lang.String): Keygrip = js.native
}

